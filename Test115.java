//���

//������ ���� ���α׷��� �����Ѵ�.
//��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

//���� ��)
//������ �� ���� �Է�(���� ����) : 20 15
//������ �Է�(+ - * /)

//Aclass�� ��ӹ޴� Ŭ������ ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bclass extends Aclass
{
	Bclass()
	{
		
	}
	boolean input() //����ڰ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : ");

		String temp = br.readLine();

		//�� ���ڿ�.split("������");		//--�����ڡ����
		//	 ���ڿ�.split("\\s");
		//	 ex)"10 20 30 40 50".split("\\s")
		//		�� ��ȯ �� {"10", "20", "30", "40", "50"}
		//
		//	ex) "010-1234-1234".split("-");
		//		�� ��ȯ �� {"010","1234","1234"}

		String[] strArr = temp.split("\\s");

		if (strArr.length !=2)
			return false;
		//-- false�� ��ȯ�ϸ� input() �޼ҵ� ����
		// �� ������ ������ ���...
		// �Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
		// ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		if (op!='+'&&op!='-'&&op!='*'&&op!='/')
		{
			return false;
		}
/*
		if (op=='+'||op=='-'||op=='*'||op=='/')
		{
			return true;
		}

		return false;
*/
		return true;
	}//close input()

	}
	double clac()
	{
		double result=0;

		switch (op)
		{
		case : '+':result = x+y; break;
		case : '-':result = x-y; break;
		case : '*':result = x*y; break;
		case : '/':result = (double)x/y;
		
		}

		return result;
	}
}

public class Test115
{
	public static void main(String[] args) throws IOException

		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);

}