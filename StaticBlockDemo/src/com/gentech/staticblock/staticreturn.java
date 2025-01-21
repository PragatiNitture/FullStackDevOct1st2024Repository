package com.gentech.staticblock;
class Maths{
	
	static int Multipliction(int x,int y)
	
	{
		return(x*y);
		
	}
}

public class staticreturn {

	public static void main(String[] args) {
		int val=Maths.Multipliction(21, 22);
		System.out.println(val);

	}

}
