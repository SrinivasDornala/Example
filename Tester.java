package com.d;
public class Tester {
	static int x = 4;
	int y = 5;
	public Tester() {
		System.out.print(this.x); // line 4
		//printVariables();
	}
	static int p = test(); //line 1
	static public int test() {
		System.out.print(p); //line 4
		return 99;
	}
	/*public static void Tester() { // line 8
		System.out.print(this.x); // line 9
	}*/
	/*public static void printVariables() {
		System.out.print(x); // line 12
		System.out.print(y); // line 13
	}*/
	public static void main(String... args) { // line 12
		//new Tester();
		System.out.print(p);
	}
	}