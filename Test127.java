

/*======================
�ڡڡ�Ŭ���� ��ޡڡڡ�
======================*/

// ��ø Ŭ����

/*
�� Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)
	- awt �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
	- ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
	- Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ� 
	���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.

�� ���� �� ����

	new ����Ŭ������ ������()
	{
		�������������� �ڷ��� �޼ҵ�()
		{
			...;
		}
		//-- �����ݷ� check~!!!
	};

*/

// super Ű���带 �����ϰ� �ִ� Ŭ���� �̸� ������ extends �� �����Ŵ�. 
// Object ob = new �ƹ��ų�(); �� ����������? (������ �ȵ�)

//import java.lang.*;

class Test3	// extends Object
{
	/*
	Object Ŭ������ �����..
	..
	public String toString()
{
	..;
}
	*/
	public Object getString()
	{
		/*
		return new Object();
			   ----------- Object ��
		*/
		/*
		return new Object();{ Ư�� �޼ҵ� �籸�� };
		*/

		return new Object()				//��ü ����
		{
			@Override
			public String toString()
			{
			return "�͸��� Ŭ����...";
			}
		};			//�� �����ݷ� (�� �ۼ� �� ���� �߻�)
	}
}

public class Test127	// extends Object
{
	/*
	Object �� ���� �ִ� �����...
	*/
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		System.out.println(ob1.toString());
		//--==>>Test3@15db9742

		System.out.println(ob1.getString());
		//--==>>�͸��� Ŭ����...
	}
}