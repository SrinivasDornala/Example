package com.d;

class Out {
private int i = 5; // line 1
Out(int i ){ // line 2
this.i = i; // line 3
System.out.print(++i); // line 4
}
class Inner{
Inner(){
System.out.print(","+ i++); // line 5
}
}
	public static void main(String[] args) {
int i = 6;
Out.Inner in = new Out(i).new Inner(); // line 6
}
}
