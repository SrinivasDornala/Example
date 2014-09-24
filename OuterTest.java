package com.d;

import com.d.Airplane.BlackBox;

public class OuterTest {
	public static void main(String args[]) {
		Airplane airplane = new Airplane(); //line 5
		Airplane.BlackBox box = airplane.new BlackBox(); // line 6
		box.printVariables();
		Airplane.BlackBox box1 = new Airplane().new BlackBox(); // line 1
		box1.printVariables();
		
		Airplane airplane3 = new Airplane();
		BlackBox box3 = airplane3.new BlackBox();
		box3.printVariables();
		 
	}
}
class Airplane {
	String code = "11";
	class BlackBox {
		String code = "22";
		public void printVariables() {
			System.out.print(code); // line 19
		 System.out.print(Airplane.this.code); // line 20
		}
	}
}
