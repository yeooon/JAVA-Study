
/*=====================
�ڡڡ�Ŭ���� ��ޡڡڡ�
======================*/

// �������̽�(Interface)


// �������̽�
interface Demo
{
	public void write();
	public void print();
}


// �������̽��� �����ϴ� �߻� Ŭ����
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �żҵ� ������...");
	}
	
	//	public void print();
}


// �߻� Ŭ������ ��ӹ޴� �߻� Ŭ����
// abstract class DemoImpl implements Demo
//		��
// �߻� Ŭ������ ��ӹ޴� Ŭ����
class DemoImlsub extends DemoImpl		// �� �������̽� ���Ǹ� ������ �Ϸ��߱� ������ 
{
	/*
	public void write()
	{
		System.out.println("write() �żҵ� ������...");
	}
	*/
	@Override
	public void print()
	{
		System.out.println("print() �żҵ� ������...");		
	}
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//-- �ν��Ͻ� ���� �Ұ� �� �������̽�

		//DemoImpl ob2 = new DemoImpl()
		//-- �ν��Ͻ� ���� �Ұ� �� �߻� Ŭ����

		DemoImlsub ob3 = new DemoImlsub();

		ob3.write();
		ob3.print();
		//-- write() �żҵ� ������...
		//-- print() �żҵ� ������...

	}
}