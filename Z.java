package com.d;

public class Z
{
Z() { print(); }
void print() { System.out.println("hello"); }
}
class Watchitcarefully extends Z
{
int i = Math.round(3.5f);
public static void main(String[] args) 
{
Z a = new Watchitcarefully();
a.print();

}

void print() { System.out.println(i); }
}
