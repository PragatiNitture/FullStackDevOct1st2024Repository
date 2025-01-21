package com.gentech.staticblock;
class test1{
	void multiplication(int a, int b)
	{
		System.out.println("multipliction:"+(a*b));
	}
}
class Test2{
	static void addition(int x, int y)
	{
	  test1 o1=new test1();
	  o1.multiplication(2,3);
	  System.out.println("addition:"+(x+y));
	}
}

public class staticanthorcls {

	public static void main(String[] args) {
		Test2.addition(2,4);

	}

}

