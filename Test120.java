
/*=====================
�ڡڡ�Ŭ���� ��ޡڡڡ�
======================*/

// �������̽�(Interface)



// �������̽�
interface ADemo
{
	public void write();
}



// �������̽�
interface BDemo
{
	public void print();
}



// �� �������̽��� 2�� �̻��� ����(implements)�� �� �ִ�
//		�� ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����.


// Ŭ����
//class DemoImpl
//class DemoImpl implements ADemo, BDemo
// �߻� Ŭ���� - �� �������̽��� ������ �߻� Ŭ����
//		��
// Ŭ���� - �� �������̽��� ������ Ŭ����
class DemoImpl implements ADemo, BDemo
{
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带
	// �������̵�(Overriding) �� ��
	// @Override ������̼�(annotation)�� ����� �� ����.
	// JDK 1.6 ���ĺ��� ���� ������ �����̴�.
	// ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵� �� ������
	// JDK 1.5������ @Override �� ������̼�(annotation) ����� �����ϴ�.
	@Override
		public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()...");		
	}

	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()...");
	}
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo();		�� �������̽�. �ν��Ͻ� ���� �Ұ�
		//BDemo ob = new BDemo();		�� �������̽�. �ν��Ͻ� ���� �Ұ�

		//ADemo, BDemo �������̽��� ����(implements)�� Ŭ���� (DemoImpl)
		//����� �ν��Ͻ� ����

		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		//--==>> ADemo �������̽� �޼ҵ� print()... 
		//--==>> BDemo �������̽� �޼ҵ� print()...
		ADemo ob2 = new DemoImpl();		//--�� ĳ����
		BDemo ob3 = new DemoImpl();		//--�� ĳ����

		//ob2.print();		�� �����߻�
		//ob3.write();		�� �����߻�

		ob2.write();		
		ob3.print(); 		

		((BDemo)ob2).print();		
		((ADemo)ob3).write(); 

		// BDemo �������̽� �޼ҵ� print()...
		// ADemo �������̽� �޼ҵ� write()...
		//-- DemoImpl Ŭ������ �� �������̽��� ��� �����߱� ������ �����ϴ�.
		// ����, DemoImpl Ŭ������ �̵� �� �� �������̽��� �����ߴٸ�
		// �� ������ ��Ÿ�� ������ �߻��ϴ� ������ �ȴ�. 

		// �ٿ� ĳ����
		((DemoImpl)ob3).write();
		// ADemo �������̽� �޼ҵ� write()...

	}
}