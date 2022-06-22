
// ���

/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư¡

  - �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.

  - �ݵ�� ��� ���谡 �־�� �Ѵ�.

  - �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ� 
	���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	�������������ڴ¡� protected�� �Ǵ� ��public�� �̾�� �Ѵ�. 

  - ��static��, ��final��, ��private�� �޼ҵ�� �������̵� �� �� ����.
  
  -Exception�� �߰��� �Ұ����ϴ�.
	��, ���� �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	���ο� Exception�� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�. 
*/

//�θ� Ŭ����(���� Ŭ����, super class)
class SuperTest116
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super Write() �޼ҵ� : " + a + ":" + b + ":" + c);
	}
}

// �ڽ� Ŭ����(���� Ŭ����, sub class)
class subTest116 extends SuperTest116
{
	/* //private�� �������� ����

	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super Write() �޼ҵ� : " + a + ":" + b + ":" + c);
	}	
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub Write() �޼ҵ� : " + a + ":" + b + ":" + c);
		//����Ŭ�������� ����� ���� a���� ������ �� ����.
		//	�� private �����̱� ������...
		//System.out.println("Sub print() �޼ҵ� : " + b + ":" + c);
		//System.out.println("Sub print() �޼ҵ� : " + b );
		//System.out.println("Sub print() �޼ҵ� : " + this.b );
		//System.out.println("Sub print() �޼ҵ� : " + super.b );
		// ���� Ŭ�������� ����� b, ���� Ŭ�������� ����� b �Դٰ��� �������� �� �ִ�.
		//System.out.println("Sub print() �޼ҵ� : " + c );
		//System.out.println("Sub print() �޼ҵ� : " + this.c );	//�� c
		//System.out.println("Sub print() �޼ҵ� : " + super.c );	//�� c
		//-- ���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		// ���� Ŭ�������� ����� c

	}	

	@Override
	public void write()
	{
		//System.out.println("sub Write() �޼ҵ� : " + a + ":" + b + ":" + c);
		//-- ���� Ŭ�������� ����� ���� a���� ������ �� ����.
		// �� private �����̱� ������...
		System.out.println("Sub write() �޼ҵ� : " + b + ":" + c);
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test116
{
	public static void main(String[] args)
	{
		//���� Ŭ���� �ν��Ͻ� ����
		subTest116 ob = new subTest116();

		ob.print();

		ob.write();
//		--==>>Super Write() �޼ҵ� : 5:10:20
//		--==>>Sub write() �޼ҵ� : 100:20

		System.out.println("------------------- ���м�");
//		--==>> 100
		System.out.println(ob.b);
//		--==>> 10
		System.out.println(((SuperTest116)ob).b);
//		--==>> Sub write() �޼ҵ� : 100:20
		((SuperTest116)ob).write();


//������ ���� �ִ� ������, �޼ҵ�� ����� �����̶� �������̵��ϸ� ������ �ȵȴ�(�θ𲬷� �ǵ��� ���� ����)
	}
}