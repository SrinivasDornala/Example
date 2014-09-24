package com.d;

import java.util.Scanner;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
public class M {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
		int t= scan .nextInt();
		for (int k=0;k<t ; k++){
		String bin = scan.next();
		char ch[] = bin.toCharArray();
		int a[] = new int[40];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)ch[i]-48 ;
		}
		long n = scan.nextInt();
		long cnt =100l;
		long z= 1l;
		long size=0l,m=0l;
		TreeSet s = new TreeSet();
		while(m<10000000000l){
			
			for (int j = 0; j <a.length;j++) {
				if(a[j] == 1){
				for(long i =z ; i<=cnt;i++){
					
					s.add(i*(j+1)); 
					z++;
					
					}	
				size += s.size();
				System.out.println(s + " "+cnt);
				s.clear();
				 
			}
			
				
			}
			m++;cnt+=100l;
			if(size>n){System.out.println(z);break;}
		}
		 
			
		 
		 
		} 
		 
	}

}
