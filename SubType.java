package com.d;

class Type {
	public Object getTypeName(){
		return "Type";
	}
	void A(final int x){
		System.out.println("final");
	}
	public long tryIt(){
		long num = 25;
		return num; // $1
	}
	public int doSum(short a,short b){ // #2
		return(a+b);
	}
}
class SubTyp  extends Type {
	public String getTypeName(){//line 8
		return "SubType";
	}
	void A(int x){
		System.out.println(x);
	}
	public long tryIt(){
		char ch = 'a';
		long num = 50;
		return ch; // $2
	}
}
public class SubType {
	public static void main(String[] args) {
		Type first = new SubTyp (); //line 16
		System.out.println(first.getTypeName()); //line 17
		first.A(3);
		System.out.println(first.tryIt());
	}
}