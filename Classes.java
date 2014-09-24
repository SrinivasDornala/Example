package com.d;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 

class Grandparent  {
	String name = "grandparent";
    public static abstract class A{
    	int i = 0;
    	
    	abstract void act();
    }
    public final class B{
    	int j = 0;
    }
 public  int act() {
	  	B b= new B();
	  	int k = b.j+1;
        System.out.println( name +" "+k );
		return k;
    }
 public  int act(int a , String b) {
	return 0;
		
 }
}
class Parent extends Grandparent  {
	  
	 HashMap<Integer, ArrayList<String >> number =new   HashMap<Integer, ArrayList<String >>()  ;
     ArrayList<String> aa = new ArrayList<String>();
     ArrayList<String> b = new ArrayList<String>();
 
     void  a(){
    
    	 aa.add("sdf");
    	 aa.add("sd");
    	 b.add("b");
    	 b.add("ba");
         number.put(1,aa);
         number.put(2, b);
         Scanner s= new Scanner(System.in);
         System.out.println("enter");
         Integer c = s.nextInt();
       if( c.equals(1)){
     
        	  System.out.println(number.get(c));
       }
       else{
    	    System.out.println(  "choose");
       }
	 
    	
    } 
}

class Child extends Parent {
    static Integer number;
   void a(){
    	System.out.println("hgfsdhg");
    	//return 0;
    }
}

/*class Parent extends Grandparent {
    String name = "parent";
}

class Child extends Parent {
    String name = "child";
    void act() {
        System.out.println(name);
    }
}*/

public class Classes {
	int i ;
	public static int x;
	static Classes c= new Classes();
    public static void main(String[] args) {
    	 
      Grandparent yo = new Parent();
       Grandparent.B b= new Grandparent().new B();

       int k = b.j+2;
       System.out.println(k);
       yo.act();
        ((Parent) yo).a();
      // System.out.print (Runtime.getRuntime() );
       System.out.println(c.i +" "+x);
      
    }
}
