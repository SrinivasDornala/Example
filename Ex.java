package com.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.attribute.standard.DateTimeAtCompleted;
 
public class Ex extends Thread implements Hj  {

 
@SuppressWarnings("null")
public static void main(String[] args) throws IOException, InterruptedException  {
		 
	/*		List<String> list = new ArrayList<String>();
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
	 

		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
         Iterator i = hm.values().iterator();
         while(i.hasNext()){
        	 
        	 System.out.println(i.next());
         }
        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }

	Map m = new HashMap();*/
	//String a[] = { "1", null, "2"};
	//int j = (Integer) null;
	
	/* String arr[] =new String[5];
	 for (int i = 0;i <args.length;i++){
		 arr[i]= args[i];
	 }for(int i =0 ;i <args.length;i++){
		 System.out.println(args[i]);
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
	/* HashSet<Cat> hm = new HashSet<Cat>();  
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
	  return name.length(); */ 
	
/*	String s1="Buggy";
    String s2="Bread";
    
    String s3="BuggyBread";
    String s4="BuggyBread";
    
    String s5 = new String("LetsDebug");
    String s6 = new String("LetsDebug");
    
    String s7 = s1+s2;
    String s8 = s5+s6;
    
    
    System.out.println(s3.equals(s7)); // Output 1
    System.out.println(s3==s4); // Output 2
    System.out.println(s5==s6); // Output 3
    System.out.println(s3==s7); // Output 4
    System.out.println("LetsDebug"==s8); // Output 5
    System.out.println(s3.hashCode()==s4.hashCode()); // Output 6
    System.out.println(s5.hashCode()==s6.hashCode()); // Output 7
    
    s7 = s5;
    
    System.out.println(s7.equals("BuggyBread")); // Output 8
    System.out.println(s7.equals("LetsDebug")); // Output 9
    System.out.println(s7 == s5);  // Output 10
    
    
    NavigableSet<Integer> set = new TreeSet<Integer>();
    set.add(1);
    set.add(2);
    set.add(4);
    //NavigableSet<Integer> sub =  set.headSet(4);
    NavigableSet<Integer> sub = set.headSet(4, true);
    
    System.out.println(sub.last());*/
    
    
   /* Set<String> set21 = new TreeSet<String>();
    set21.add(null);
    set21.add(null);
    
    System.out.println(set21.size());*/
    
   /* SortedMap<String, Integer> map = new TreeMap<String, Integer>();
    map.put("B", 1);
    System.out.println(map.put("B", 2));
    
    Queue<String> queue=new PriorityQueue<String>();
    queue.add("one");
    queue.add("two");
    queue.add("three");
    queue.add("four");
    queue.add("five");
    queue.add("FIVE");
    queue.add("Four");
    System.out.println(queue.poll());
    System.out.println(queue.peek());
    System.out.println(queue.size());*/
  
   /* for (int i = 0;  i <= 10;  i++) {
    	  if (i > 6) break;
    	  }
    System.out.println(i);*/
    /*
    Ex test = new Ex ();
    Number n = new Integer(10);
    test.print(n);*/
    
	/*  int x = 10;
    do {   x--;
    System.out.println(x);
      } while (x < 10);*/
	
    
    
 /*   
	 int l[] = new int[10]; 
    	for(int i=0 ;i<10;i++){
   		 l[i]= (i*(i+1))/2 ;
   		// System.out.println(l[i]);
    	}
    	for(int i=1 ;i<23;i++){
    		for (int j =1;j<=i;j++){
    			int k = Arrays.binarySearch(l, i);
    			//System.out.println(k);
    			if ((float)k< 0){
    				System.out.print("*");
    			}else{
    				System.out.print("-");
    			}
    		}
    		System.out.println("");
    	}*/
    		
		 
	   /*     int q=12;
	        int m2=(q/2) ;
	        int n2=(q/2) ;
	        
	        for(int i=1;i<=(q/2) ;i++)
	        {
	            for(int j=1;j<=q;j++)
	                
	            {
	                
	                if((j==m2||j==n2)&&(i<(q/2) ))
	                {
	                System.out.print("x");
	                }
	                else if((i==(q/2) )&&(j%2!=0))
	                        {
	                            System.out.print("x");
	                        }
	                else
	                {
	                    System.out.print(" ");
	                }
	            }
	            m2=m2+1;
	            n2=n2-1;
	            System.out.println();
	        }*/
	
    
/*	int z=0;
	int x[] = { 0,2 ,5,7 ,1,20,4 };
	Arrays.sort(x);
	int y = x.length;
	System.out.println(y);
	for(int i =0 ;i<x.length-1;i++){
	z= z+x[i];
	System.out.println(z);
	}
	if (z> x[y-1]){
		System.out.println("true");
	}else{
		System.out.println("false");
	}*/
	/*int c= 257;
	System.out.println(c);
	String s = "55hello4";
	char arr[] = s.toCharArray();
	for(int i = 0;i<arr.length;i++){
		//
	}
	try {
		 
		return;
		
	}catch(Exception e){
		return;
		
	}*/
	
/*	LinkedList<String> ll=new LinkedList<String>();
	ll.offerLast("Ram");
	ll.add("Kishan");
	ll.add("Pradeep");
	ll.add("Suraj");
	ll.addFirst("Karna");
	System.out.println("Size Of linke List "+ll.size());
	System.out.println("first element of the list is "+ll.peekFirst());
	System.out.println("Last element of the list is "+ll.peekLast());
	System.out.println("Last element of the list is "+ll.getLast());
	Iterator<String> itr=ll.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());*/
/*	
	int i = 0x17;
	System.out.println(i);*/
	
	/*int a = 20;
	a= 10;
	System.out.println("" + a++ + ++a);*/
	
/*	boolean a= true;
	boolean b = (Boolean) null;
	Boolean c = new Boolean(null);
	Boolean d = new Boolean("null");
	Boolean e = new Boolean("TRue");
	//Boolean h = new Boolean(TRue);
	Boolean f = new Boolean(true);
	//Boolean g = new Boolean();
*/	
	
/*	Scanner in = new Scanner("55Hello123").useDelimiter("[^0-9]+");
	int integer = in.nextInt();
	int i = in.nextInt();
	System.out.println(integer +i);*/
	
	/*List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
	for (int i = 1; i <= 5; i++) {
	List<Integer> list = new ArrayList<Integer>();
	for (int j = 10; j <= 50; j += 10) {
	list.add(j);
	}
	table.add(list);
	}
	for (List<Integer> row : table) {
	for (int i : row) {
	System.out.print(i + " ");
	}
	System.out.println();
	}*/
	 
	  
	/* Character ch;
	 String s;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     s=br.readLine();
     ch=s.charAt(0);
     if(ch.isDigit(ch)==true)
     System.out.println("This is digit");
     if(ch.isWhitespace(ch)==true)
     System.out.println("This is blank space");
     if(ch.isLetter(ch)==true)
     System.out.println("This is alphabet");
     if(ch.isUpperCase(ch)==true)
     {
         ch=ch.toLowerCase(ch);
         System.out.println(ch);
     }
     else
     {
         ch=ch.toUpperCase(ch);
         System.out.println(ch);

     }*/
	/*int arr[] = new int[5];
	for(int i = 0 ; i<5; ++i){
		arr[i] = i;
		System.out.println(arr[i]);
		i++;
	}
	int k=0;
		switch(2){
		case  1: System.out.println("2");
		case  2: System.out.println(k++); 
		case 3: System.out.println(k++);break;
		default :System.out.println(k++);
		}
 
		char ch=1;
		switch(ch)
		{
		case '1': System.out.println("one");
		case '2': System.out.println("two");
		default:System.out.println("i think, i am mad..");
		}
		
		boolean x = true;
		if(x){
			System.out.println("asd");
		}else{
			System.out.println("sa");
		}
		System.out.println(caughtSpeeding(65,true));
		double d1 = 1.0;
	    double d2 = 0.0;
	    byte b = 1;
	    d1 = d1 / d2;
	    b = (byte) d1;
	    System.out.print(d1);
	    
	    int[] a = null;
	      Object b1 = a;
	      System.out.println(b1);
	      
	      System.out.println("abcd" instanceof Object);
	      int i=10;
	      while(i++<=10)
	      {
	      i++;
	      }
	      System.out.println(i);
	      
	      new Ex().go();*/
	   /*   int j = 0;
	      for(int x = 0; x <100; x++)
	      j = j++;
	      System.out.println(j);*/
/*	boolean b2 = false;
	boolean b1= true;
	if ((b2  = true)  ){
		System.out.println(b2);
	}
	System.out.println(b2);
	for(int i=0,j=0;i<2 | j<2;System.out.println("hi"))
	{
	System.out.println(i++ + j++);
	}
	
	 
	boolean stmt1 = "champ" == "champ";
	boolean stmt2 = "champ".toString()=="champ";
	boolean stmt3 = new String("champ") == new String("champ");
	System.out.println(stmt2 );*/
	
	/*String stmt = null;
	System.out.print(null+stmt);
	System.out.print(stmt+null);*/
/*	StringBuffer buffer1 = new StringBuffer("javachamp");
	StringBuffer buffer2 = new StringBuffer(buffer1);
	if (buffer1.equals(buffer2))
		System.out.println("true");
	else
		System.out.println("false");*/
/*	
	StringBuffer sb = new StringBuffer("javachamp");
	String s = new String("javachamp");
	boolean stmt1 = s.equals(sb) ;
	boolean stmt2 = sb.equals(s) ;
	boolean stmt3 = sb.toString() == s ;
	boolean stmt4 = sb.toString().equals(s) ;
	boolean stmt5 = s.equals(sb.toString()) ;
	System.out.println(stmt1+ ""+ stmt2 + ""+stmt3+ stmt4 + stmt5);	*/
	 
	/*StringBuffer sb1 = new StringBuffer("javachamp");
	StringBuffer sb2 = new StringBuffer("javachamp");
	boolean stmt1 =sb1.equals(sb2) ;
	boolean stmt2 = sb1 == sb2;
	String s1 = new String("javachamp");
	String s2 = new String("javachamp");
	boolean stmt3 = s1.equals(s2);
	boolean stmt4 = s1 == s2;
	System.out.println(stmt1+ ""+ stmt2 + ""+stmt3+ stmt4);	*/
	
/*	String s1 = null;
	String s2 = null;
	if (s1 == s2)
		System.out.print("A");
	if (s1.equals(s2))
		System.out.print("B");*/
	
	/*String a = "javachamp";
	String b = "javachamp";
	String c = new String("javachamp");
	System.out.print(a==b);
	System.out.print(a==c);
	System.out.print(b.equals(c));
	System.out.print(b.equals(a));*/
	
	
/*	String stmt = "JavaChamp is here to help you";
	for (String token : stmt.split("//s")) {
		System.out.print(token + " ");
	}*/
	 
	/*String s = "";
	Integer x = 5;
	StringBuffer sb = new StringBuffer();
	if (x < 15)
		s.concat("javachamp");
	else
		sb.append("javachamp");
	 System.out.print(s + sb);*/
	
	/*Scanner sc = new Scanner("javachamp 2009, true 239");
	while (sc.hasNext()) {
		if (sc.hasNextBoolean())
			System.out.print("Boolean");
		if (sc.hasNextInt())
			System.out.print("Int");
		sc.next();
	}*/
/*	boolean flag = false;
	int x = 0;
	do {
		x++;
	} while (flag=!flag);
	System.out.println(x);*/
	 
	/*int x = 2;
	switch(x){		// #1
		case 1:
				System.out.println("1");
				break;
		case 2:
				System.out.println("2");
				continue;
		case 3:
				System.out.println("3");
				break;
		default:
				System.out.println("default");
				break;
	}*/
	  /*Integer i = null;
	 Scanner scan = new Scanner(System.in);
	 try {
	 	if(scan.next() == " " || scan.next() instanceof String  ){
	 		System.out.println("asf");
	 	}else{
	 		i = Integer.parseInt(scan.next());
			  System.out.println(i);

	 	}
		  	 }catch(Exception e){
		 System.out.println("not a number");
	 }
 */
/*	System.out.print("1");
	try {
		return;
	} catch (Exception e) {
		System.out.print("2");
	} finally {
		System.out.print("3");
	}
	System.out.print("4");*/
	
	/*try {
		method();
	} catch (Throwable e) {
		try {
			throw new Exception() ;
		} catch (Exception ex) {
			System.out.print("exception");
		} finally {
			System.out.print("finally");
		}
	}*/
	/*Double d = -4.0;
	try {
		d  =d/ 0;
	} catch (ArithmeticException e) {
		System.out.println("EXCEPTION!");
	} finally {
		System.out.println(d);
	}*/
	/*Object obj = new int[] { 1, 2, 3 }; // line 12
	int[] someArray = (int[]) obj; // line 13
	for (int i : someArray) System.out.print(i + " ");*/
/*	
	Ex val = null;
	//if((val!=null) & (val.code >0));//line 1
	if((val!=null) && (val.code >0));//line 2
	//if((val==null) | (val.code==0));//line 3
	if((val==null) || (val.code==0));//line 4
*/	
	
	/*int x = 0;
	int i = 1;
	for (; i > -2; i--)
		if ((++x > 0) |  (--i > 0))
		x++;
	 System.out.println(x + ""  + i);*/
	/*
	int x = 0;
	int y = 0;
	if ((true & false) | (true & false) & x++>0)
		System.out.print("stmt1 ");
	if (false || true | (++y> 0 | y++>0))
		System.out.print("stmt2 ");
		System.out.print(x+" "+y);*/

	
/*	boolean flag = true;
	int x = 5;
	int result = (8 * 2) % x;
	System.out.print(!(result > 0) ^ true ^ !(flag = false));
	System.out.print(flag);
	 
	System.out.print("4" + 5);
	System.out.print(4 + 5);
	System.out.print(4 + 5 + "9");*/
	
/*	int x = 0, y = 0;
	x = 5 + y++;
	System.out.print(x + "" + y);
	x = 0;
	y = 0;
	x = 5 + ++y;
	System.out.print(x + "" + y);*/
	
	/*int x = 1, y = 0;
	if ((y == x++) && (x < ++y)) {	}
	System.out.println(x + "" + y);
	
	int z = 1, za = 0;
	if ((za == z++) || (z < ++za)) { 	}
	System.out.println(z + "" + za);*/
	/*System.out.print(false ^ true);
	System.out.print(!false);
	System.out.print(true ^ false);
	System.out.println(!true);*/
/*	
	int k=12;
	k/=--k;
	System.out.println(k);
	k*=k++;
	System.out.println(k);
	k*=++k;
	System.out.println(k);
	
	Integer x = 1000;
	long y = 1000;
	Integer z = 1000;
	System.out.println(x==y);
	System.out.println(x==z);
	
	int i = 1;
	int[] arr = {0, 1, 2};
	int z1 = 0;
	arr[i] = z1 = ++i;
	List<int[]> li = Arrays.asList(arr);
	System.out.println(li.size() + "#" + z1);*/
	
/*	int i = 1;
	Integer[] arr = {0, 1, 2};
	int z = 0;
	arr[i] = z = ++i;
	List<Integer> li = Arrays.asList(arr);
	System.out.println(li + "#" + z);*/
/*	
	byte b=10;
	b+=10;
	System.out.println(b);
	System.out.println(true?false?"7":false?"6":false?true?"5": true?"4":"3":"2":"1");
	int x = 5, y ;
	while (++x < 7) {
		y = 2;
	}
	System.out.println(x +"" +y);*/
 
	/*Ex e = new Ex();
	e = reset(e);
	System.out.print(e.x);*/
	/*System.out.print(i);
	System.out.print( increment(i));
System.out.print(i);*/
	
/*	Integer sum1 = 125; //line 1
	int sum2 = 125; //line 2
	System.out.print(sum1.equals(sum2)); //line
	System.out.print(sum2.equals(sum1)); //line
	System.out.print(sum1==sum2); //line 5
*/	 
	/*Long var = (long) 999; // Line 3
	long x1 = var.longValue(); // Line 5
	double x2 = var.longValue(); // Line 7
	double x3 = (double) var.longValue(); // Line 9
	Double x4 = Long.valueOf("999"); // Line 11
	Number x5 = Integer.parseInt("999"); // Line 13
	Long x6 = Integer.parseInt("999");*/
	
	/*Integer[][] arr1 = { { 1, 2 }, { 3, 4 } };
	Number[] arr2 = arr1[0];
	int x = 1;
	System.out.print(arr1[0][0] == 1);
	System.out.print(arr2[0] == x);
	System.out.print(x instanceof Integer);
	System.out.print(arr1[1][0] > (Integer) arr2[0]);*/
	/* double i = Math.pow(64, 64);
	System.out.println(i);*/
	 
	/*String[] arr = { "java", "champ", "you" };
	System.out.print(Arrays.binarySearch(arr, "java"));
	System.out.print(Arrays.binarySearch(arr, "You"));*/
	
	/*Integer[] arr = { 1, 2, 3 };
	System.out.print(Arrays.binarySearch(arr, 1)); // line 1
	System.out.print(Arrays.binarySearch(arr, "javachamp")); */
	
	/*String[] a  = { "Java", "Champ", "." };
	List<String> list = (List<String>) Arrays.asList(a ); // line 1
	a [2] = ".com"; // line 2
	for (String word : list) {
		System.out.print(word);
	}*/
	/*for(  Ex.i = 0  ;Ex.i<5; Ex.i++){
		System.out.println("asd");
	}
	System.out.println(Ex.i);*/
	
/*	short s1=4; //LINE 1
	short s2 = s1+=s1; //LINE 2
	short s3= (short) (s1+s2); //LINE 3
	byte b1=(byte) ((byte)s1 +(byte)s2); //LINE 4
	byte b2=(byte)((byte)s1 +(byte)(byte)s2);
	System.out.println(s1 +""+ s2 + s3+ b1+b2);*/
 
/*	try {
		File file = new File("data.txt");// line 5
		file.createNewFile(); // line 6
		FileWriter fr = new FileWriter(file); // line 7
		BufferedWriter br = new BufferedWriter(fr); // line 8
		br.append("javachamp");
		br.flush();
		br.close(); // line 11
	} catch (IOException e) {
		e.printStackTrace();
	}*/
	
	 
	/*Runnable c = new Ex();
	Thread t = new Thread(c);
	t.run();*/
/*	Ex e = new Ex ();
	e.increment(i);
	e.start();
	Thread.sleep(1000);
	System.out.println(i);
 
	new Thread(t1).start();
	t2.start();*/
	
/*	char a = 'A';
	a++;
	System.out.print((int)a);*/
	
/*	int i = 300;
	double d = 265.43;
	byte b = (byte) i;
	byte q = (byte) d;
	System.out.println(b + " "+q);*/
/*	int a=0;
	int b=100;
	String s="";
	for(int i=1;i<=33;i++){
	a++;
	for(int j=1;j<=3;j++){
	b--;
	s+=b+" ";
	}
	s+=a+" ";
	}

	System.out.println(s);*/
/*	int i = 21;

	overloadedMethod(i);
	int a[][]= new int[2][3];
 Scanner scan = new Scanner(System.in);
 for (int k = 0 ; k<2;k++){
	 for(int l = 0 ; l<3;l++){
		 Integer m=scan.nextInt();
		 if (m instanceof Integer )
		 a[k][l] =  m;
	 }
 }
 for (int k = 0 ; k<2;k++){
	 for(int l = 0 ; l<3;l++){
		 System.out.print (a[k][l] +" ");
	 }
	 System.out.println();
 }*/
 /*String s = "5hello55";
 char c[] = s.toCharArray();
 int a =0;
 for(int x = 0 ; x<c.length-1;x++){
	 if(Character.isDigit(c[x])){
		 a = a +c[x];
		 for(int y = 1; y < c.length-x-1;y++){
			 if(Character.isDigit(c[x+y])){
				 System.out.println(c[x]);
			 } 
			
		 }
		 System.out.println(a);
		
		
	 }
 }*/
 //char c2 = null;
/*  Character c1 = null;
 String s1 = null;
 Long l = null;
 
 Float f = null;
 //int i = null;
// float f1= null;
 System.out.println(c1);
 Scanner in = new Scanner(System.in).useDelimiter("[^0-9]+") ;
  
 int inte = in.nextInt();
 System.out.println(inte);
 int i = in.nextInt();
 System.out.println(i);*/
 
 
/* int m = 4, n = 3;

 int[][] matrix = new int[m][n];
 matrix[0] = new int[] { -1, 0, -1 };
 matrix[1] = new int[] { 0, -1, -1 };
 matrix[2] = new int[] { 0, -1, -1 };
 matrix[3] = new int[] { -1, 0, -1 };

 int[][] resultMatrix = new int[m][n];

 System.out.println("Input Matrix: \n");
 for (int l = 0; l < m; l++) {
 for (int k = 0; k < n; k++) {
 System.out.print(" "+matrix[l][k]);

 TreeSet<Integer> ts = new TreeSet<Integer>();
 for (int i = 0; i < m; i++) {
 for (int j = 0; j < n; j++) {
 if (matrix[i][j] == 0) {
 System.out.print(" ");
 ts.add(Math.abs(l - i) + Math.abs(k - j));
 break;
 }
 }
 }
 resultMatrix[l][k]=ts.first();
 }
 System.out.println();
 }

 System.out.println();

 System.out.println("Result Matrix: \n");
 for (int l = 0; l < m; l++) {
 for (int k = 0; k < n; k++) {
 System.out.print(resultMatrix[l][k]+" ");
 }
 System.out.println();
 }
 */
	
/*	int i =10643645;
	String j =String.valueOf(i);
	char[] c = j.toCharArray();
	Integer.parseInt(j);
	 
	for(int k = c.length-1 ;k>=0;k--){
		System.out.print (c[k]);
	}*/
/*	Integer i = 6378;
	 
	String s1 = String.valueOf(i) ;
	String s2 = s1.charAt(0)+""+s1.charAt(1);
	String s3 = s1.charAt(2)+""+s1.charAt(3);
	 int h1 = Integer.parseInt(s3);
	 
	
	Pattern test1 = null;
	String s = "s";
	String test = "hello";
	String arr [] = test.split("l");
	String ans = "";
	String a = test.replace("d", ""); 
	 if( "S".equals(s)){
		 System.out.println("das");
	 }
	for(String t : arr)
	    ans+=t;
	System.out.println(a);*/
	
/* 	String s = "Hacker";
	String s1 = "dfgd";
	int j=s1.length();
	int cnt=0;
	for(int i =0 ; i<s.length()-j;i++){
		String s2= s.substring(i, j);
		if(s2.equalsIgnoreCase(s1)){cnt++;}
		j++;
	}
	if(cnt>0){System.out.println("yes");
	}else{System.out.println("no");} */
	
/*	 Scanner scan = new Scanner(System.in);
		int in = scan .nextInt();
		 
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		for(int i =3 ; i<10000;i++){
			int status =0;
			for(int j=2;j<i ;j++){
				if(i%j==0)break;
				else status  = status+1;
			}
			if(status == (i -2))a.add(i);
		}
		System.out.println(a.get(in-1));*/
	
	/* Scanner scan = new Scanner(System.in);
	 String s= scan .next();
	 char ch[]= s.toCharArray();
	 int k = scan.nextInt();
	 String[] ch1= new String[k];
	char ch2[]= new char[k];
	 
	 for(int i=0 ;i<k;i++){
		 ch1[i]= scan.next();
	
		 int ct=0;
		 ch2[i]= ch1[i].charAt(ct);
		 ct++;
		 
		 System.out.print (ch2[i]);
	 }
	 
		
	 ArrayList<Integer>  al = new ArrayList<Integer>();
	 Integer j[] = new Integer[ch.length];
	 for(int i=0 ; i<ch.length;i++){
		 j[i]= Character.getNumericValue(ch[i])-9;
		 al.add(j[i]);
	 }
	 Integer j1[] = new Integer[ch1.length];
	 for(int i=0 ; i<ch1.length;i++){
		 j1[i]= Character.getNumericValue(ch2[i])-9;
	 }
	 
	 HashSet<Integer> set = new HashSet<Integer>(al );
	 
	for(int i=0 ;i<j1.length;i++){
	set.remove(Integer.valueOf(j1[i]));
	}
	Iterator it = set.iterator();
	int x=0;
	while(it.hasNext()){
		  x=x+ (Integer)  it.next() ;
	}
	System.out.println(x);*/
	
 
	 
/*	Scanner scan = new Scanner(System.in);
	 String s= scan .next();
	String s1[]= s.split(":");
	Integer h = Integer.valueOf(s1[0]);
	Integer m = Integer.valueOf(s1[1]);
	int hr = h* 30;
	int min = m*6;
	float d ;
	if(hr>min){
		d= (float)(hr-min); 
		String strDouble = String.format("%.6f", d);
		System.out.println(strDouble);
	}
	else
		{
		d= (float)(min-hr); 
		String strfloat = String.format("%.6f", d);
		System.out.println( strfloat);
		}*/
	
/*	Scanner scan = new Scanner(System.in);
	 int t= scan .nextInt();
	 for (int k=0;k<t ; k++){
	String bin = scan.next();
	
	char ch[] = bin.toCharArray();
	 
	int a[] = new int[40];
	 
	for (int i = 0; i < a.length; i++) {
		a[i] = (int)ch[i]-48 ;
			
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(ch[i]);
			
	}	
	int n = scan.nextInt();
	
	TreeSet s = new TreeSet();
	 
	for (int j = 1; j <=n+1;j++) {
		
		

			for(int i =0 ; i<a.length;i++){
				if(a[i] == 1){
					s.add(j*(i+1)); 
				}	
				
			if(n==s.size())break;
	}
	}	
	List l = new ArrayList(s);
	  System.out.println(l.get(n-1));
	 System.out.println(l);

	 }*/
	/*
	 ArrayList a = new ArrayList();
	 a.add(1);
	 a.add(2);
	 a.add(1);
	 a.add(2);
	for(int i=0;i<a.size();i++){
		if(1==(int)(a.get(i))){
			a.remove(i);
		}
	}
	System.out.print(a);*/
	
  	/*	Scanner scan = new Scanner(System.in);
  		int in = scan.nextInt();
		for(int k = 0;k<in;k++){
		String s= scan.next();
		int ip= scan.nextInt();
		char ch[]= s.toCharArray();
		
		Character[] characters=new Character[ch.length];
	    for (int i = 0; i < ch.length; i++) {
	        characters[i]=ch[i];
	         
	    }
		String ch1[]= new String[ip];
		Character ch2[]= new Character[ip];
		for(int i=0 ;i<ip;i++){
			ch1[i]= scan.next();
			int ct=0;
			ch2[i]= ch1[i].charAt(ct);
			ct++;
			 
		}
		ArrayList<Character>  al = new ArrayList<Character>();
		for (int i = 0; i < ch.length; i++) {
			al.add(characters[i]);
		}
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < al.size(); j++) {
				if(ch2[i].equals( al.get(j))){
					al.remove(j);
					j--;
				}
			}
		}
	 
		 int b=0;
		for(int i=0 ; i<al.size();i++){
			b=b+ Character.getNumericValue((al.get(i)))-9;
		}
		System.out.println(b);*/
	/*	ArrayList<Integer>  al = new ArrayList<Integer>();
		Integer j[] = new Integer[ch.length];
		for(int i=0 ; i<ch.length;i++){
			j[i]= Character.getNumericValue(ch[i])-9;
			al.add(j[i]);
		}
		Integer j1[] = new Integer[ch1.length];
		for(int i=0 ; i<ch1.length;i++){
			j1[i]= Character.getNumericValue(ch2[i])-9;
		}
		HashSet<Integer> set = new HashSet<Integer>(al );
		for(int i=0 ;i<j1.length;i++){
			set.remove(Integer.valueOf(j1[i]));
		}
		Iterator it = set.iterator();
		int x=0;
		while(it.hasNext()){
	  x=x+ (Integer)  it.next() ;
		}*/
	//	System.out.println(x);
	
/*	String s = "hammingbird";
	String s1 = "hamming";
	String s2 = s.substring(3, 7);
	String s3 = s1.substring(3, 7);
	System.out.println(s2+ s3);*/
	
	/*File file = new File("E:");
    String[] fileList = file.list();
    int i = 0;
    System.out.println(file.isHidden());
    for(String name:fileList){
    	i++;
    	
        System.out.println(name);
    }
    System.out.println(i);*/
	
/*	File file = new File("E:");
    String[] files = file.list(new FilenameFilter() {
         
        @Override
        public boolean accept(File dir, String name) {
            if(name.toLowerCase().endsWith(".mp4")){
                return true;
            } else {
                return false;
            }
        }
    });
    
    for(String f:files){
        System.out.println(f);
        
    }*/
/*	   BufferedReader br = null;
       Reader r = new InputStreamReader(System.in);
       br = new BufferedReader(r);
       String str = null;
       try {
           do{
               System.out.println("Enter Input, exit to quit.");
               str = br.readLine();
               System.out.println(str);
           } while (!str.equalsIgnoreCase("exit"));
       } catch (IOException e) {
           e.printStackTrace();
       } finally{
           try{
               if(br != null) br.close();
           }catch(Exception ex){}
       }*/
	 
/*	 String str = "converting to input stream";
     byte[] content = str.getBytes();
     for (int i = 0; i < content.length; i++) {
    	 System.out.println(content[i]);
		
	}
    
     int size = content.length;
     InputStream is = null;
     byte[] b = new byte[size];
     try {
         is = new ByteArrayInputStream(content);
         is.read(b);
         System.out.println("Data Recovered: "+new String(b));
     } catch (IOException e) {
         e.printStackTrace();
     } finally {
         try{
             if(is != null) is.close();
         } catch (Exception ex){
              
         }
     }
      */
	
	/*String s = "hammingbird ha";
	String ch[] = { "a","m"};
	for(int i = 0;i<ch.length;i++){
		s= s.replace(ch[i], "");
	}
	System.out.println(s.trim());*/
	/*char c = '1';
	System.out.println((int)c);*/
	/*Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
	for(int k = 0;k<in;k++){
 
	int n= scan.nextInt();
	int  j=0;
	for(int i =1 ;i<=n;i++){
		j=j+i;
	}
	int ans = (int) Math.pow(2, n-1)*j;
	System.out.println(ans);
	}*/
	
	/*Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    for(int l=0 ;l<k;l++){
    String s = in.next().toLowerCase();
    String s1 = in.next().toLowerCase();
   	int j=s1.length();
   	System.out.println(j);
   int siz= s.length();
   System.out.println(siz);
	int cnt=0;
    }*/
	/*for(int len=2; len<=j;len++){
		int x=0;
	for(int i =0 ; i<(siz-j) ;i++){
	 
		String s2= s.substring(i, len+x);
		System.out.println(s2);
		String s3= s1.substring(i, len+x);
		System.out.println(s3);
		System.out.println(cnt);
		if(s2.equals(s3)){cnt++;break; }
		x++; 
		 
	} 
    }
	System.out.println(cnt);*/
	/*boolean b=false;
	
	for(int i =2;i<=j;i++){
		int x=0;
		for(int m=0;m<=(j-i);m++){
			b= s.contains(s1.substring(m, (i+x)));
			System.out.println(b);
			System.out.println(s1.substring(m, (i+x)));
			x++;
		}
		
	}
	
    }	*/	
	/*Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    for(int l=0 ;l<k;l++){
    int s = in.nextInt();
    int ans=1;
    for(int i=1;i<=s;i++){
    	if(i%2==0){
    		ans+=1;
    	}else ans = 2*ans;
    }
    System.out.println(ans);
    }*/
/*	Scanner in = new Scanner(System.in);
    int k = in.nextInt();
	int sec = 2;
	int arr[]= new int [k];
	for(int i=0;i<k;i++){
		arr[i]= in.nextInt();
	}
 
	int left = arr[0];
	int right = arr[1];
	for(int i =2;i<arr.length;i++)
	{
		if(arr[i]==0)
		{
			if(10 - left< 10-right){
				int j =10-left+1;
				sec+=j;
				left = arr[i];
			}else{
				int j =10-right+1;
				sec+=j;
				right = arr[i];
			}
		}else if(left == arr[i] || right ==arr[i]){
			if(left ==arr[i]){left=arr[i];sec++;}
			else {right=arr[i];sec++;}
		}
		else{
			if(left>arr[i]&&right>arr[i])
			{
			if( left-arr[i]< right-arr[i]){
				int j = left-arr[i]+1;
				sec+=j;
				left = arr[i];
			}else{
				int j =right-arr[i]+1;
				sec+=j;
				right = arr[i];
			}
			
			}
			else if(left<arr[i]&&right<arr[i])
			{
				if( arr[i]-left< arr[i]-right){
					int j = arr[i]-left+1;
					sec+=j;
					left = arr[i];
				}else{
					int j =arr[i]-right+1;
					sec+=j;
					right = arr[i];
				}
				
			}
			else if(left>arr[i]&&right<arr[i])
			{
				if(  left-arr[i]< arr[i]-right){
					int j = left-arr[i]+1;
					sec+=j;
					left = arr[i];
				}else{
					int j =arr[i]-right+1;
					sec+=j;
					right = arr[i];
				}
			}
			else  if(left<arr[i]&&right>arr[i])
			{
				if( arr[i]-left< right-arr[i]){
					int j =arr[i]-left+1;
					sec+=j;
					left = arr[i];
				}else{
				int j = right-arr[i]+1;
				sec+=j;
				right = arr[i];
				}
			}
		}
	}
	 System.out.println(sec);*/
	 /*long j=0;
	for (int i = 0; i < 1000 ; i++) {
		
		for (int l = 0; l < 10000 ; l++) {
			
			for (int m = 0; m < 10000 ; m++) {
				
				j++;
			}
		}	}
	System.out.println(j);*/
/*	Scanner in = new Scanner(System.in);
    String z = in.next();
    char ch[] = z.toCharArray();
     
	int arr[][] = new int[1][ch.length];int cnt=0,inti=0;

    for(int i= ch.length-1;i>=0;i--){
     	arr[0][i]=  ch[inti]-48;
     	//System.out.print(arr[0][i]+" ");
     	inti++;
    }
    String sz = in.next();
    char ch1[] = sz.toCharArray();
	int x[]= new int[ch1.length];
	 for(int i=0;i<ch1.length;i++){
	     	x[i]=  ch1[i]-48;
	     	//System.out.print(x[i]);
	    }
 	// System.out.println(ch.length);
	int size = ch.length +x.length-1;
	int ans[][] = new int[ch.length][size];
	int a[][] = new int[ch.length][x.length+1];
	
	for(int j=0;j<ch.length;j++){
		int temp1=0,c=0,d=0,ct=0;
		for(int k =x.length-1;k>=0;k--){
		temp1 = (int) (x[k]*arr[0][j]);
		temp1 +=ct;
		a[j][c] = (int) (temp1%10);
		ct=temp1/10;
		c++;
		}
		a[j][c]=ct;
		for(int i =(size-j-1);i>=(ch.length-j-1);i--){
		ans[j][i] = a[j][d];
		//System.out.print(ans[j][i]);
		d++;
		}//System.out.println();
		
	
	int ans[][] = new int[s.length()][size];
	for(int j=0;j<s.length();j++){
		long c = (long) ((x*arr[0][j]) );
		String sc=String.valueOf(c);
		System.out.println(c);
		for(int i =(size-j-1);i>=0;i--){
		ans[j][i] = (int) (c%10);
		c=c/10; 
		}
		
	} 
	for(int j=0;j<ch.length;j++){
	for(int i =0 ; i<size;i++){
		System.out.print(ans[j][i]);
	}
	System.out.println();
	}
	int res[] = new int[size];
	for(int i=size-1;i>=0;i--){
		int temp1=0;
		for(int j =0 ; j<ch.length;j++){
			 temp1+=ans[j][i]; 
		}
		temp1 +=cnt;
		res[i] = (int) (temp1%10);
		cnt=temp1/10;
		
	}
	for(int i =0 ;i<size;i++){
		System.out.print(res[i]);
	}
	*/
/*	String s= "heelo";
	String s1= s+",";
	System.out.println(s1);*/
/*	Scanner in = new Scanner(System.in);
	String s = in.next();
	char ch[] = s.toCharArray();
	Arrays.sort(ch);
	String s1= "";
	for (int i = 0; i < s.length(); i++) {
		s1+= ch[i];
	}
	System.out.println(s1);	*/
	
/*	for(int i=1;i<=100;i++){
		if(i%3==0&&i%5==0){
			System.out.println("FizzBuzz");
		}else if(i%3==0){
			System.out.println("Fizz");
		}else if(i%5==0){
			System.out.println("Buzz");
		}else System.out.println(i );
	}
	*/
/*	Scanner scan= new Scanner(System.in);
	String s = scan.next();
	char ch[] = s.toCharArray();
	int e[] = new int[ch.length];
	for(int i =0;i<ch.length;i++){
		e[i]= ch[i]-48;
	}
	int b[];int a[]= new int[e.length];int v=0 ;
	for (int i =  e.length-1; i >=0; i--) {
		a[v] = e[i];
		v++;
	}
	b=e;
	//System.out.println(b[0] + " "+b[1]);
	int t = scan.nextInt();
	int main[] = new int[(t*2)+2];
	int tem[]= new int[(t*2)+2];
	int len = main.length-1;
	//System.out.println(len);
	for (int i =  e.length-1; i >=0; i--) {
		main[len]= e[i];
		len--;
	}
	
	for(int i=1;i<t;i++){
		int res[][] = new int[2][(b.length*2)],ans[][]= new int[2][(b.length*2)];
		int size = b.length*2;
		//System.out.println(size);
		int cnt=0;
		for(int j=0;j<a.length;j++)
		{
			int temp1=0,c=0,d=0,ct=0;
			//System.out.println(b.length);
			for(int k =b.length-1;k>=0;k--)
			{
				temp1 = (int) (a[j]*b[k]);
				temp1 +=ct;
				res[j][c] = (int) (temp1%10);
				//System.out.print(res[j][c]);
				ct=temp1/10;
				c++;
			}
			res[j][c]=ct;
			for(int l =(size-j-1);l>=(a.length-j-1);l--){
				ans[j][l]=res[j][d];
				d++;
			}
		}
		int result[] = new int[size];
		for(int m=size-1;m>=0;m--){
			int temp1=0;
			for(int j =0 ; j<a.length;j++){
				 temp1+=ans[j][m]; 
			}
			temp1 +=cnt;
			result[m] =  (temp1%10);
			cnt=temp1/10;
		}
		result = array(result);
		int x= main.length;
		int y= result.length-1;
		for(int m=x-1;m>=x-result.length;m--){
			int temp1=0;
			temp1=result[y]+main[m] ; 
			temp1 +=cnt;
			tem[m] = (int) (temp1%10);
			cnt=temp1/10;
			y--;
		}tem[x-result.length-1]=cnt;
		for(int n=0;n<tem.length;n++){
			main[n]= tem[n];
		}
		b= result;
		
	}
	main = array(main);
	for(int r=0;r<main.length;r++){
		System.out.print(main[r]);
		}System.out.println();*/
	
	/*int a[] = {0,0,0,0,6,5,2,5,6,2,1};
	int b[] = array(a);
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]);		
	}*/

	
	Scanner scan= new Scanner(System.in);
	int z = scan.nextInt();
	for(int a=0;a<z;a++){
		int x=0;
	String s = scan.next();
	char ch[] = s.toCharArray();
	int e[] = new int[ch.length];

	for(int i =0;i<ch.length;i++){
		e[i]= ch[i]-48;
	}

	for(int i =0;i<e.length;i++){
		x+=e[i];
	}
	System.out.println(x);
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static Set<Long> primeFactors(long number) 
{
	Set<Long> primefactors = new HashSet<>(); 
	long copyOfInput = number; 
	for (long i = 2; i <= copyOfInput; i++) 
	{
		if (copyOfInput % i == 0) 
		{
			primefactors.add(i);
			copyOfInput /= i; i--; 
		}
	}
	return primefactors;
}
public static int[] array(int[] a){
	int cnt=0,c=0;int b[] = new int[a.length];
	for(int i=0;i<a.length;i++){
		if(a[i] ==0){
			cnt++;
		}else{
			b=new int[a.length-cnt];
			for(int j=cnt;j<a.length;j++){
				b[c]= a[j];
				c++;
			}
			break;
		}
	}
	return b;
	
}

public static final native void m();

static void overloadedMethod(Integer I)
{
	System.out.println("Integer Wrapper Class Type");
}

static void overloadedMethod(Number l)
{
	System.out.println("long primitive type");
}
static Runnable t1 = new Runnable() {
	public void run() {
		try {
			System.out.print("t1before");
			Thread.sleep(100);
			System.out.print("t1after");
		} catch (InterruptedException e) {
		}
	}
};
static Thread t2 = new Thread() {
	public void run() {
		try {
			System.out.print("t2before");
			synchronized (this) {
				wait();
			}
			System.out.print("t2after");
		} catch (InterruptedException e) {
		}
	}
};
 
public void run(){
	System.out.println("asfd");
	i = i+5;
}
 
class Foo {
	 
}
static int i ;
 
private static int increment(int i) {
	return  ++i;
}
int x = 12;
static Ex reset( Ex obj) {
	obj = null;
	return obj;
}
public int code;
  static void method() throws Exception {
	// TODO Auto-generated method stub
	throw  new Exception();
}
enum Color {RED,GREEN,BLUE};
public static void goLoop(int a) {
	outside: for (int i = 0; i < 3; i++) {
		inside: for (int j = 1; j < 3; j++) {
			System.out.print(j);
			if (a > 5) {
				continue outside;
			}
		}
	}
}
		public static  int c() {
			final int  i;
			 
			// TODO Auto-generated method stub
			return 5;
		}
		/*private <N extends Number> void print(N n) {
		System.out.println(((Integer) n).compareTo(10));
		} */ 
		  static void b(String a){
			System.out.println(a);
		}
		  public static int sum (List list) {
			    int sum  = 0;
			    for ( Iterator iter = list.iterator();  iter.hasNext();  ) {
			  int i = ((Integer)iter.next()).intValue();
			  sum  += i;
			   }
			   return sum ;
			   }
		@Override
		public void fg() {
			int k = 0;
			while (++k < 3) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(k);
			}
		}
		@SuppressWarnings("finally")
		@Override
		public int jkl() {
			try{
				return 0;
			}finally{
				return 1;
			}
			
		}
		@Override
		public void dgf() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public int jd() {
			// TODO Auto-generated method stub
			return 0;
		}
		 	 
		 /* public static void main(String a){
			  System.out.println("main");
		  }*/
		   
	    



public static void printMap(Map<String, Integer> map){

	for (Map.Entry<String, Integer> entry : map.entrySet()) {
		System.out.println("Key : " + entry.getKey() + " Value : "
			+ entry.getValue());
	}

}
public static int caughtSpeeding(int speed, boolean isBirthday) {
	  if(isBirthday ){
	   if(speed < 66){return 0;}
	  else if(speed>65 && speed <86){return 1;}
	  else {return 2;}
	  }else{
	  if(speed <61){return 0;}
	  else if(speed>60 && speed <81){return 1;}
	  else {return 2;}
	  }
	}
int squares= 81;
void go() {
incr(++squares);
System.out.println(squares);
}
void incr(int squares)
{ 
squares += 10;
System.out.println(squares);
}
	/*static String dntReturn()
	{
		
	for(;;){
	}
	System.out.println("Hi evry1");
	}*/
}
  

	


















