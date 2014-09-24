package com.d;

public class Testers {
	static int i ;
	private static int increment(int i) {
		return i++;
	}
	public Testers() {
		i = 1;
	}
	public static void main(String[] args) {
		System.out.print(i);
		System.out.print(i = increment(i));
		
	}
}