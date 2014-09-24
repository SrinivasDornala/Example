package com.d;

class ExamDemo3{
	static{new ExamDemo3();}
	{System.out.println("Init Block");}
	ExamDemo3(){
		System.out.println("Constructor Runs");
	}
	static{System.out.println("static init 2");}
	public static void main(String... args){
		System.out.println("Inside main method");
	}
}