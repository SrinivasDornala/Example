package com.d;

class Job extends Thread {
    private Integer number = 0;
    public void run() {
    	synchronized (this) {
            for (int i = 1; i < 1000000; i++) {
                number++;
            }
             
        }
       /* for (int i = 1; i < 10 ; i++) {
            number++;
        }*/
    }
    public Integer getNumber() {
        return number;
    }
}

public class F {
    public static void main(String[] args) throws Exception {
        Job thread = new Job();
        thread.start();
        synchronized (thread) {

             thread.wait();
        }
        System.out.println(thread.getNumber());
    }
}