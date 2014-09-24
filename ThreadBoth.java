package com.d;

import java.util.List;

class ThreadBoth implements Runnable   { 

	 
public void run(){ System.out.println("hi "); } 
 
public static void main(String [] args){ 
Thread td[] =   new Thread[4];
ThreadGroup tg = new ThreadGroup("tg" );
 
ThreadBoth b = new ThreadBoth();
Thread t = new Thread(b);
t.start();
for (int i =0;i< 4;i++){
	td[i] = new Thread(new ThreadBoth( ) ) ;
	td[i].start();
	System.out.println(tg.activeCount());
}

 
} 
} 
