package com.d;

import java.sql.SQLException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.zip.ZipError;

import javax.crypto.NullCipher;
import javax.management.modelmbean.XMLParseException;
import javax.xml.bind.DataBindingException;
import javax.xml.soap.Text;

 


public class Ex  {

 
public static void main(String[] args) {
		 
			/*List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");
	 
		System.out.println("\nExample 1 - Count 'a' with frequency");
		System.out.println("a : " + Collections.frequency(list, "a"));
	 
		System.out.println("\nExample 2 - Count all with frequency");
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(list, temp));
		}
	 
		System.out.println("\nExample 3 - Count all with Map");
		Map<String, Integer> map = new HashMap<String, Integer>();
	 
		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		printMap(map);
	 
		System.out.println("\nSorted Map");
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		printMap(treeMap);
	 
	  }
	 
	  public static void printMap(Map<String, Integer> map){
	 
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
				+ entry.getValue());
		}
	 
	  }*/
	
	
	/*==============================================================================
	try{
		
		System.exit(2);
		System.out.println("fd");
		System.out.println("dfgd");
		}
		catch(Exception e)
		{
		System.out.println("Catch");
		e.printStackTrace();
		}
		finally{
		System.out.println("Finally");
		}
		System.out.println("End");
       }*/
/*============================================================


	StringBuffer  s = new StringBuffer("hjhj");
	s.append("jfd");
	System.out.println(s);
	
	String  s = new String("hjhj");
	
	System.out.println(s);

		StringBuffer sb = new StringBuffer("javachamp");
		String s = new String("javachamp");
		boolean stmt1 = s.equals(sb) ;
		boolean stmt2 = sb.equals(s) ;
		boolean stmt3 = sb.toString() == s ;
		boolean stmt4 = sb.toString().equals(s) ;
		boolean stmt5 = s.equals(sb.toString()) ;
		
		System.out.println(stmt1 + " "+stmt2 + " "+stmt3 +" "+stmt4);
	
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner("javachamp 2009, ddd 23d9");
	while (sc.hasNext()) {
		if (sc.hasNextBoolean())
			System.out.print("Boolean");
		if (sc.hasNextInt())
			System.out.print("Int");
		sc.next();
	}
	
	String s1 = null;

String s2 = null;

if (s1 == s2)

System.out.println("A");

if (s1.equals(s2))

System.out.print("B");*/
/*
	Object obj = new int[] { 1, 2, 3 }; // line 12
	int[] someArray = (int[])obj; // line 13
	for (int i : someArray) System.out.print(i + " "); // line 14
	
//	Pattern p = Pattern.compile("a{3}b?c*");
//	Matcher m = p.matcher("b");
//	boolean b = m.matches();
//	System.out.println(b);
	System.out.print("" + 7 + 2 + " ");
	System.out.print(7 + 2 + " ");
	byte b=10;
	b+=10;
	System.out.println(b);
	*/
	/*Integer x = 1000;
	long y = 1000;
	Integer z = 1000;
	System.out.println(x==y);
	System.out.println(x==z);
	System.out.print("4" + 5);
	System.out.print(4 + 5);
	System.out.print(4 + 5 + "9");
	*/
	/*Number x = 12; // Line 5
	 Number y = (Long) x; // Line 6
	 System.out.print(x+""+y); // Line 
	 
	*/
	/*Integer[][] arr1 = { { 1, 2 }, { 3, 4 } };
	Number[] arr2 = arr1[0];
	int x = 1;
	System.out.print(arr1[0][0] == 1);
	System.out.print(arr2[0] == x);
	System.out.print(x instanceof Integer);
	System.out.print(arr1[1][0] > (Integer) arr2[0]);
	
	TreeSet<Integer> map = new TreeSet<Integer>();
	map.add(1);
	map.add(2);
	map.add(4);
	map.add(7);
	SortedSet<Integer> smap = map.subSet(2,7);
	map.add(5);
	map.add(9);
	System.out.println(smap);
	*/
	/*int index;

	Integer[] e = {1,2,3,4,5,6, null,7,8 };
	for (int i = 0; i < e .length; i++) {
	    if (e[i] != null) {
	        index = i;
	        System.out.println(index);
	        break;
	    }
	}
	Integer s = new Integer(null);
	System.out.println(s instanceof Object);
	

	try
	{
	int i=0;
	i=i++;
	System.out.println("i="+i);

	}
	catch(Exception ex)
	{
	ex.printStackTrace();
	}
	int i=10;
	while(i++<=10)
	{
 i++;
	}
	System.out.println(i);
	int j = 0;
	for(int i = 0; i <100; i++)
	j = j++;

	System.out.println(j);*/
	
	
	/*ArrayList list1 =new ArrayList();
	list1.add("abc");
	list1.add(124);
	list1.add(true);
	list1.add("abc1");
	list1.add("hello");
	System.out.println(list1);
	
	System.out.println("-----");
	for (int i = 0; i <list1.size(); i++)
	{
	System.out.println(list1.get(i));
	}
	
	System.out.println("-----");
	for (Object obj : list1)
	{
	System.out.println(obj);
	}
	
	System.out.println("-----");
	Iterator it =list1.iterator();
	while(it.hasNext())
	{
	System.out.println(it.next());
	}
	System.out.println("-----");
	
	ListIterator lit =list1.listIterator();
	while(lit.hasNext())
	{
	System.out.println(lit.next());
	}
	
	System.out.println("-----");
	Object x[] =list1.toArray();
	System.out.println(Arrays.toString(x));
	*/
	/* float START = 2000000000;
	int count = 0;
	for (float f = START; f < START + 50; f++)
	{

	count++;

	}
	System.out.println(count);
	
	float f = 4.99999998f;
	float f1=4.89999998f;
	int t=(int)f;
	int u=(int)f1;
	System.out.println(t+u);
	*/
	/*Object obj = new int[] { 1, 2, 3 };
	 int[] someArray = (int[])obj;
	 for (int i : someArray) System.out.print(i + " ");
	 
	 Integer a =10;
	 Integer b =10;
	 Integer c =a+b;
	 System.out.println(c);
	 
	 Byte b1=new Byte("127");
	 System.out.println(b1.toString()==b1.toString());
	
	 String s1=b1.toString();
	 System.out.println(s1.toString()==s1.toString());
	 System.out.println(s1.toString());*/
	
/*    String s1 ="d";
	s1 = s1 +"h";
	System.out.println(s1.concat("jd"));
	
	String A = new String("Venugopal");
	String B = A;
	Integer j = new Integer(56);
	Integer i = j;
	j = j + new Integer(55);
	A = A + new String("mitul");
	 A.concat(new String("df"));
	System.out.println("j is " + j);
	System.out.println("i is " + i);
	System.out.println("A is " + A);
	System.out.println("B is " + B);

	StringBuffer SA = new StringBuffer("Venugopal");
	StringBuffer SB = SA;
	//SA = SA + new StringBuffer("dfdfd");
	SA = SA.append("mitul");

	System.out.println("SA is " + SA);
	System.out.println("SB is " + SB);
	   StringBuilder g = new StringBuilder("hjhd");
	    StringBuilder h = g;
	    g = g.append("jkdf");
	    System.out.println("g is " + g);
		System.out.println("h is " + h);
	
	String str = "Hello";
    System.out.println("Before String Concat: "+str);
    str.concat("World");
    System.out.println("After String Concat: "+str);
    StringBuffer sb = new StringBuffer("Hello");
    System.out.println("Before StringBuffer Append: "+sb);
    sb.append("World");
    System.out.println("After StringBuffer Append: "+sb);
	*/
/* 	 int i = 0;
	 int j;
	 Character a[] = {'5','2','3','4','d',null  };
 try{
 
	  //j = 11/i;
	 for(int k = 0 ; k<7; k++){
		 System.out.println(a[k]);
		// j = a[k]/i;
	 }
	return;
 
	 
 }catch ( ArithmeticException   |ArrayIndexOutOfBoundsException |NullPointerException f) {
	 System.out.println("45");
}
  
 finally{
	 System.out.println("dygu");
 } 
 
 String s = new String("B");
		 System.out.println(s.hashCode());*/
	/*int i =0,j=0;
 for(b("a");  i<2 ;b("c")){
	 i++;
	 b("d");
 } */
    
	
	/*String st = "abc";
	StringBuffer st1 = new StringBuffer("abc");
	//System.out.println(st==st1);
	System.out.println(st.equals(st1));*/
	
/*	String s="hello welcome to java world";
	char[] c=s.toCharArray();
	int i=0,j=0,k=0;
	for(i=0;i<c.length;i++)
	{
	if(c[i]==' ')
	{
	char[] d=new char[c.length+3];
	for(j=0;j<i;j++)
	d[j]=c[j];
	d[j]='T';d[++j]='H';d[++j]='E';
	for(k=i+1;k<c.length;k++)
	d[++j]=c[k];
	c=d;
	}
	}
	System.out.println(new String(c));*/
	/*String arr="1-2";
	String a[]=arr.split("-");
	String b1=a[0];
	String b2=a[1];
	System.out.println(b1);*/
	 HashSet<Cat> hm = new HashSet<Cat>();  
	  Cat c1 = new Cat("abc");  
	  Cat c2 = new Cat("abcd");  
	  Cat c3 = new Cat("xyz"); 
 
	  System.out.println("Adding c1");  
	  System.out.println(hm.add(c1));  
	  System.out.println("Adding c2");  
	  System.out.println(hm.add(c2));  
	  System.out.println("Adding c3");  
	  System.out.println(hm.add(c3));  
	  }  
	 }  
	 class Cat{  
	  private String name;  
	  Cat(String title){  
	  this.name=title;  
	  }  
	  public String getName(){  
	  return name;  
	  }  
	  public boolean equals(Object obj){  
	  System.out.println("equals is called");  
	  Cat c = (Cat)obj;  
	  return name.equals(c.getName());  
	  }  
	  public int hashCode(){  
	  System.out.println("hashcode is called");  
	  return name.length();  
     }
  static void b(String a){
	System.out.println(a);
}
  public static void main(String a){
	  System.out.println("main");
  }

}
  

	


















