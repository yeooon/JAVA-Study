
/*=================================
�ڡڡ��ڹ��� �ֿ�(�߿�) Ŭ�����ڡڡ�
==================================*/

// Wrapper Ŭ����

import java.math.BigInteger;

public class Test134
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//System.out.print(a1);
		//long b1 = 123456789123456789;
		//long b1 = 123456789123456789L;
		//long b1 = 123456789123456789123456789L;		
		//System.out.println(b1);

		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");

		//BigInteger c = a + b;
		//System.out.println(c);

		// ���ϱ�
		BigInteger c = a.add(b);
		System.out.println("���� ��� : " + c);

		//����
		BigInteger d = a.subtract(b);
		System.out.println("���� ��� : " + d);

		//���ϱ�		
		BigInteger e = a.multiply(b);
		System.out.println("���� ��� : " + e);

		//������
		BigInteger f = a.divide(b);
		System.out.println("������ ��� : " + f);


		//������
		BigInteger c = new BigInteger("2");
		System.out.println("2�� 3�� : " + g.pow(3));

	}
}