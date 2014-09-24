package com.d;

import java.io.IOException;

class Plant {
	 Plant() throws IOException {
		System.out.println("Plant created");
		throw  new IOException();
	}
}
class Tree extends Plant {
	  Tree() throws IOException{ 
		  
		  super();
		System.out.println("Tree created");
	// super();
	}
}
public class tes {
	public static void main(String args[]) {
		try {
			 new Tree();
			} catch (IOException e) {
				System.out.print("IOException is thrown in Tester");
			}
	}
}