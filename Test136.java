

/*=================================
�ڡڡ��ڹ��� �ֿ�(�߿�) Ŭ�����ڡڡ�
==================================*/

// Wrapper Ŭ����


public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		//--==> 3
		//--==> 256

		print(b2);
		print(i2);

		// Byte Ŭ������ byteValue()�޼ҵ� ȣ��
		byte b3 = b2.byteValue();		//��ڽ�

		// Integer Ŭ������ intValue()�޼ҵ� ȣ��
		int i3 = i2.intValue();		//��ڽ�


		System.out.println(b3);
		System.out.println(i3);

		// check~!!
		System.out.println(b4);
		System.out.println(i4);
	}

	/*
	static void print(Byte b)
	{	
	}

	static void print(Integer i)
	{	
	}
	*/

	// java.lang.Number Ŭ����(�߻� Ŭ����)��
	// ��� ������ Wrapper Ŭ�������� �θ� Ŭ����
	//(����Ŭ����, ���� Ŭ����)�̴�.
	//b2,i2�ڷ����� Number�� �Ѿ���鼭
	// �� ĳ������ �Ͼ�� �ȴ�.
	// Auto-Boxing  �� �Ͼ�� �ȴ�.
	static void print(Number n)//�� 3
	{	
		System.out.println(n);	
	}
	// �� �� �� �� ��  �� �̤ФФФФ�

}