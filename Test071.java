/*================================
�ڡڡ����������� ���������ڡڡ�
================================*/

// ���� ������ �ʱ�ȭ �׽�Ʈ

//Test070.java�� ��~~!!

public class Test071
{
	// Ŭ������ ����
	// ���� ���� a ����
	int a; 	
	boolean b;
	char c;
	double d;
	//-- �ڵ����� 0���� �ʱ�ȭ ����

	public static void main(String[] args)
	{
		//�޼ҵ��� ����
		//System.out.println("a : " + a);
		//--==>>���� �߻�(������ ����)
		//non-static variable a cannot be referenced from a static context
		//Test071 Ŭ������ ������� �ν���Ʈ ������
		Test071 ob = new Test071(); //�޸𸮿� ���赵�� �ö󰣰�

		System.out.println("ob.a :" + ob.a);
		//--==>> ob.a :0

		System.out.println("ob.a :" + ob.b);
		//--==>> ob.b : false

		System.out.println("ob.a :" + ob.c);
		//--==>> ob.c :

		System.out.println("ob.a :" + ob.d);
		//--==>> ob.d : 0.0
	}
}
/*

*/