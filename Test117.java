
//�߻� Ŭ����(Abstract)

/*
�� �߻� Ŭ������
���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������ 
���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ���� 
�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����

�� ���� �� ����
	[��������������] abstract class Ŭ������
	{
		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
	}

�� Ư¡
	Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
	�� Ŭ������ Ŭ���� �տ� abstract Ű���带 �ٿ� �߻� Ŭ������ ����ؾ� �ϸ�,
	�߻� Ŭ������ ������ ��쿡�� �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
	�߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ���������� ��ü�� ������ �� ���� ���̴�.

	��, �߻� Ŭ������ ���������� ������ �� ���� ������ ����� ���ؼ��� �����ϸ�
	�߻� Ŭ�������� ��ӹ��� ���� Ŭ���������� �ݵ�� �߻� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�.

	��abstract�� Ű�����
	Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���������� ��� �Ұ����ϴ�

	abstract�� �޼ҵ忡 ������ Ŭ������ abstract �߻� Ŭ������ ���� ��.
	abstract�� ������ �ϴ� �߻� Ŭ�����ε�
*/

//�߻� Ŭ����(�Ϲ� �޼ҵ�μ��� ������ ���� ������ �־����� �߻� �޼ҵ带 ǰ���Ƿν� �߻� Ŭ������ �ƴ�)







/*�ڡڡ� ���� Ŭ���� �ڡڡ�*/

abstract class SortInt117 //�߻� Ŭ����
{
	private int[] value; //�̰� ���°� �ǰ���?

	protected void sort(int[] value) 
	{
		this.value = value;
		sorting();
	}
	
	//�߻� �޼ҵ�
	protected abstract void sorting();	//���� �˰����� �����ϱ�, �׳� �̷� �޼ҵ尡 �ʿ��ϴ�~ ��� ����

	protected int dataLenght()
	{
		return value.length;
	}

	protected final int compare(int i, int j)
		{
			int x = value[i]; //x�� i������ ����
			int y = value[j]; //y�� j������ ����
			if (x==y)
				return 0;
			else if (x>y)
					return 1;
			else 
				return -1;
		}

		protected final void swap(int i, int j) //i�� j���� �ٲ۴ٰ�?
		{
			int temp = value[i];
			value[i] = value[j];
			value[j] = temp;
		}
}



/*�ڡڡ� �ڽ� Ŭ���� �ڡڡ�*/


public class Test117 extends SortInt117 //<<==abstract�� �߰����� �� ������ �ȳ���. 
{
		int i,j;

		static int[] data = {7, 10, 3, 8, 7};

		@Override //�������̵��ҰŴ�.
		//protected abstract void sorting(); �̰Ÿ�
		protected void sorting() //�̷��� ������ 
	{
		// �� �� ���� �뵵�� �� �𸣰ڴ�.
		//<< int num���� dataLength() �޼ҵ��°� ���ذ� �� �Ȱ���.
		// dataLength() = data �� ������ �� ���� ������?
		//�����ؾ���...

		for (i=0;i<data.length-1;i++)
		{
			for (j=i+1;j<data.length;j++)
			{
				int x = compare(i,j); //7,7�� ���� �����ϱ� ���� ��. ��� ��� ���ذ� �Ȱ�......

				if (x==1) //���࿡ ���ϰ��� 1�� ��, x>y�ϱ� �����ض�.
				{
					swap(i,j);
				}
			}
		}		
	}
	
		public static void main(String[] args)
		{
			System.out.println("Source Data : ");
			for (int n : data)
			System.out.print(n + "  ");

			System.out.println();


			//������ ��Ÿ����. 


			Test117 ob = new Test117(); //�߻� Ŭ������ new��ɾ ����� �ν��Ͻ�ȭ �� �� ����

			ob.sort(data); //SortInt117�� sort �޼ҵ带 ��ȯ�ϱ� 

			//protected abstract void sorting(); �޼ҵ� �����ε��� �ؾ��� �� ������
			//swap�� �̿��ؼ� ���� ����?


			System.out.println("Source Data : ");
			for (int n : data)
			System.out.print(n + "  ");

			System.out.println();

		}
}

/*
�߻� Ŭ���� �� �̿ϼ��� ���赵

Ŭ���� �� ���赵

��ü ���� �� ���赵 ��� �ν��Ͻ� ����

���赵 ob = new ���赵();
*/
/*
class Ŭ������
	void �޼ҵ��a()
*/