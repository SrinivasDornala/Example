package com.d;

public class  Clas{
	
	// T h r e a d   c l a s s   a s   a   n e s t e d   c l a s s   o r   S t a t i c   I n n e rC l a s s   o f   t h e   u s a g e   c l a s s
	static  class  MyThread1 extends Thread{
		
		@Override
		public void run(){
			System.out.println("Keep some task here 1 ..." );
			}
		}
	// A n o t h e r   t h r e a d   c l a s s   a s   a   n e s t e d   c l a s s   o r	S t a t i c   I n n e r   C l a s s   o f   t h e   u s a g e   c l a s s
	static  class  MyThread2 implements Runnable{
		@Override
		public void run(){
			System.out.println("Keep some task here 2 ..." );
			}
		}
	 class  MyThread3 extends Thread{
		@Override
		public void run(){
			System.out.println("Keep some task here  .3.." );
			}
		}
	// A n o t h e r   t h r e a d   c l a s s   a s   a   n e s t e d   c l a s s   o r	S t a t i c   I n n e r   C l a s s   o f   t h e   u s a g e   c l a s s
	 class  MyThread4 implements Runnable{
		@Override
		public void run(){
			System.out.println("Keep some task here  ...4" );
			}
		}
	public static void main(String[]   args){
		
		// U s i n g   t h e   M y T h r e a d 1   a n d   i t ' s   t a s k	
		Clas.MyThread1 thread1 =  new MyThread1();
		thread1.start();
		
		// U s i n g   M y T h r e a d 2   a n d   i t ' s   t a s k
		MyThread2 thread2 = new MyThread2();
		Thread t =  new Thread(thread2);
		t.start() ;
		
		MyThread3 thread3 =  new Clas().new MyThread3();
		thread3.start();
		
		// U s i n g   M y T h r e a d 2   a n d   i t ' s   t a s k
		MyThread4 thread4 = new Clas().new MyThread4();
		Thread t1 =  new Thread(thread4);
		t1.start() ;
	
		new Thread(){
		@Override
		public void run()	{
		System.out.println("Keep some task	here.....5");
		}
		}.start();
		
			// T h r e a d   a s   a n   a n o n y m o u s   i n n e r   c l a s s
		new Thread(new Runnable() {	
			@Override
			public void run ()	{
				
				System.out. println("Keep some task	here....6.") ;
		}
		}).start();
	}
}