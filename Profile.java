package com.d;

public class Profile {
	 Profile(int w) { // line 1
		 
		this("sd");
		System.out.println(w);
		
	}
	public static  void Profile(int w){
	 
		System.out.println("profile1");
	}
	public Profile(String w) { // line 1
		System.out.println(w);
	}
 
	/*public Profile() { // line 5
		System.out.println(10);
	}*/
	public static void main(String args[]) {
		Profile obj = new Profile(50);
	 
}
}
