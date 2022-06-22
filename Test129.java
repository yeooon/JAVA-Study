
/*=================================
★★★자바의 주요(중요) 클래스★★★
==================================*/

// Test128.java 와 비교~!!!

//import java.lang.*;

import java.util.Scanner;

public class Test129		//extends Object
{
	/*
	...
	public String toString()
	{
		...;
	}
		...
	*/

	@Override
		public String toString()
	{
		return "재정의한 ToString()";
	}


	public static void main(String[] args)
	{
		Test129 ob = new Test129();		//ob라는 이름의 Test129();인스턴스를 생성하겠다?

		Scanner sc = new Scanner(System.in);

		System.out.println(ob.toString());
		//--==>> 재정의한 ToString()...

		System.out.println(ob);
		//--==>> 재정의한 ToString()...
	}
}