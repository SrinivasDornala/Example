package com.d;

import java.util.List;
 

public class Test  {
/*public static void main(String[] args) {
    String message = "Hello!";
    synchronized (message) {
        try {
            message.wait();
        } catch (InterruptedException e) {
        }
    }
    System.out.println(message);
}*/
		static int j ;
		private static  int counter=0;
		public static void get(){
			counter++;
		}
		public static int getInstanceCount()
		{
		return counter;
		}
		public Test()
		{
			final int i= 2;
		counter++;
		}
		public int method() {
			j++;
			return j;
	    }
	    static void method(String a) {
	    }
    
	    public static void main(String[] args) {
	        System.out.print("A ");
	        final Object test = new Object();
	        synchronized (test) {
	            test.notifyAll();
	        }
	        System.out.println("B");
	        Test tes= new Test();
 
	    }
}
