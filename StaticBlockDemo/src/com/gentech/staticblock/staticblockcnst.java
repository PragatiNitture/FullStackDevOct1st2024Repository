package com.gentech.staticblock;
class Demo1{
	static
	{
		System.out.println("pragati");
	}
	Demo1()
	{
		System.out.print("jaweriya");
	}
}

public class staticblockcnst {

	public static void main(String[] args) {
		Demo1 o1 = new Demo1();

	}

}
