package com.d;
 class A
{
	 {
	   System.out.println(" called");
	   l= k+j;
	 }
	public static int j = 5;
	public static int k;
	public int l=0;
	static {
         k =j+ 10 ;
        /* l =1;
         A();*/
        System.out.println("static block called ");
    }
	A(){
		
	}
 
 
	public static void a(int i,String s){
	 
	j++;
	System.out.println("A class"+ i +s + (j++) + (k++));
	}
}
 
 class B extends A{		
	  B(String s){
		  
	  }
	  B(){
		 
	  }
	 
	 
	public static void a(int i){
		 System.out.println("B class" +i);
	 }
	 
	 static class C{
		 void sg(){
			 System.out.println("C");
		 }
	 }
	 public static void main(){
		 
	 }
}
 class outer extends B{
	 
	public static void main(String a[]){
	
	A.k = 5335;
	System.out.println(A.k);
	
	A a1=new A();
	System.out.println(a1);
	System.out.println(A.k);
	a1.a(54,"sgg");
 // class A method is called
	B b1=new B();
	b1.a(4);// class B method is called
	a1=b1;
	a1.a(56,"gug");
	A a2=new B();
	System.out.println(a2);
	a2.a(55, "jkd");
	a2.j = 58;
	System.out.println(a2.j);
	System.out.println(a2.k);
	B.a(569, "hn");

	a2.a(65, "hd");
	a2= b1;
	a2.a(95, "dd");
	System.out.println(a2);
	
 
	
	}
}