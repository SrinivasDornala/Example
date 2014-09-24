package com.d;

class Account {
    private Integer number = 0;
    public synchronized void setNumber() {
        number++;
        System.out.println(number);
    }
    public synchronized Integer getNumber() {
        return number;
    }
}

class Client extends Thread {
    Account account;
    public Client(Account account) {
        this.account = account;
    }
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.setNumber();
            
        }
    }
}

public class Run {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
 
        Client one = new Client(account);
        Client two = new Client(account );
        one.start();
        two.start();
        one.join();
        two.join();
        
        // here
    }
}