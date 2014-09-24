package com.d;

import java.util.ArrayList;
import java.util.List;

class UserThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("This is a user thread.....");
    }
}
 
class DaemonThread extends Thread
{
    public DaemonThread()
    {
        setDaemon(true);
    }
 
    @Override
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("This is daemon thread....."+i);
        }
    }
}
 
public class ThreadsInJava
{
    public static void main(String[] args)
    {
        DaemonThread daemon = new DaemonThread();   //Creating the DaemonThread
 
        daemon.start();                 //Starting the daemon thread
      
        UserThread userThread = new UserThread();   //Creating the UserThread
 
        userThread.start();          //Starting the user thread
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(0, 59);
        list.add(1, 60);
        int total = list.get(1);
        System.out.println(total);
        
    }
}
 