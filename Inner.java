package com.d;

public class Inner {

	
	protected static   int i= 0;
	private    int method(){
		return i;
	}
	public int c(){
		i++;
		System.out.println(hashCode());
		return i;
		
	}
	//Inner Class of Inner A
	 class A{
		 
		public int k = 1;
		public  final void  method1(){
			int j = i + k;
			i++;
			method();
			System.out.println(j);
		}
	}
	 
	 // Final Class 
	 final class C{
		 public int a(){
			 return 1;
		 }
		 String t = "";
		 C(String s){
			 System.out.println(s);
			 if(s.equals("")){
				 t= t+ i;
			 
			 }else{
				 t= t+ " ";
			 }
			  
		 }
		 
	 }
	 // Static Inner class of Inner B
	 static class B extends Inner{
		 public static int i =10;
		public  int method(){
			 i++;
			 Inner.A a = new Inner().new A();
			 a.method1();
			return i;
		 }
	 }
	 //   MAIN
	 public static void main(String args[]){
		  Inner inner = new Inner();
		 Inner.B b = new Inner.B();
		Inner.A d= inner.new A();
		 b.method();
		System.out.println( inner.c());
		System.out.println(inner.m());
		Inner.C c = inner.new C("");
		System.out.println(c.t +" "+ d);
		
		int   i = 0 ,   j = 2 ;
		do   {
		i = ++i ;  
		j-- ;
		} while ( j > 0 ) ;
		System.out.println( i ) ;
		
	 }
	 
	 // Local inner Class 
	 int m(){
		int x;
		class local{
	
			 int mm(){
				 i++;
				 return i;
			 }
		 }
		local l = new local();
		x = l.mm();
		return x;
	 }
	 
}

//Sub Class public not allowed in the same file

  class D extends Inner{
	Inner  in = new Inner();
	@Override
	public int c() {
		// TODO Auto-generated method stub
		//i++;
		return super.c();
	}
	
}