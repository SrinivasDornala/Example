package com.d;

class SubClass {
	public static void main(String arg[]) {
		AA b = new BB(1000);
		AA c = new CC(1000);
		System.out.println(b==c);
		System.out.println(b.equals(c));
	}
}
class AA {
	int value;
}
class BB extends AA {
	BB(int val) {
		value = val;
	}
}
class CC extends AA {
	CC(int val) {
		value = val;
	}
}
