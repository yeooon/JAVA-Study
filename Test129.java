
/*=================================
�ڡڡ��ڹ��� �ֿ�(�߿�) Ŭ�����ڡڡ�
==================================*/

// Test128.java �� ��~!!!

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
		return "�������� ToString()";
	}


	public static void main(String[] args)
	{
		Test129 ob = new Test129();		//ob��� �̸��� Test129();�ν��Ͻ��� �����ϰڴ�?

		Scanner sc = new Scanner(System.in);

		System.out.println(ob.toString());
		//--==>> �������� ToString()...

		System.out.println(ob);
		//--==>> �������� ToString()...
	}
}