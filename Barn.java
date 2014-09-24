package com.d;

public class Barn extends Thread {
 public static void main(String[] args) {
 new Barn().go(1,"hi");
 new Barn().go( 2,"hi", "world");
 }
 public void go( int x,String... y) {
 System.out.println(y[y.length - 1] + " ");
 }
 
 
 }