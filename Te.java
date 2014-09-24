package com.d;

import java.util.Collection;
import java.util.List;

public class Te  {
	static {
		int X = 3;
	}
	static int  X;
	public static void hello(Collection x) {
		System.out.println("Collection");
	}
	public static void main(String[] args) {
		Te  t = new Testing();
		List x = null;
		t.hello(x);
		 X--;
		 System.out.println(X);
	}
}
class Testing extends Te  {
	public static void hello(List x) {
		System.out.println("List");
	}
}