/*========================
Ŭ������ �ν��Ͻ�
=========================*/

/*
�޼ҵ� �����ε��� ����
�޼ҵ� �����ε�(Overloading)�̶� �޼ҵ尡 ó���ϴ� ����� ����
�޼ҵ� ��ȣ �ӿ� ���� �μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�
�ڷ���(data type)�� �ٸ� ���
�޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
���������� ����ϰ� �Ǵµ�
�̸� �޼ҵ� �����ε��̶� �Ѵ�. 
*/

public class Test105
{
	public static void main(String[] args)
	{
		/*
		Test105 ob = new Test105();
			ob.drawLine();
		*/	
		drawLine();
		//--==>> ========================	
		drawLine('-');
		//--==>> --------------------
		drawLine('<');
		//--==>> <<<<<<<<<<<<<<<<<<<<
		drawLine('*',30);
		//--==>> ******************************
		drawLine('/',50);
		//--==>> //////////////////////////////////////////////////
	}
	
	//���� �׸��� �޼ҵ� ����(����ƽ�޼ҵ�) = �ڷ����� ���ƾ� �����·� �θ� �� �ֳ�?
	//public void drawLine()
	public static void drawLine()			//���� �ڷ����� ������?
	{
		System.out.println("========================");
	}

	//���� ���¸� �ٲپ� �׸��� �޼ҵ� ���� 
		public static void drawLine(char c)			//���� �ڷ����� ������?
	{
		for (int i=0;i<20;i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}

	public static void drawLine(char c, int n)
	{
		for (int i=0;i<n;i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}

}