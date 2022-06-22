/*=========================================
  ���� ����(Exception) ó�� ����
=========================================*/

// �ٸ� ���� �ٽ� ������

public class Test155
{
	public int getValue(int value) throws Exception					//���� ������(�Ķ� ��ź)
	{
		int a = 0;

		try
		{
			a = getData(-2);										//�鿹�� �߻�(���� ��ź)			
		}
		catch (Exception e)											//�꿹�� ��Ƴ���(���� ��ź)
		{
			//�� ���� ó��(���� ��ź)
			System.out.println("printStackTrace......");
			e.printStackTrace();

			//�� ���� �߻� (�Ķ� ��ź)
			throw new Exception("value�� �����Դϴ�.");

		}

		return a;
	}

	public int getData(int data) throws Exception					//�� ���� ������(���� ��ź)
	{
		if (data < 0)
		{
			throw new Exception("data �� 0 ���� �۽��ϴ�.");		//�� ���� �߻�(���� ��ź)
		}

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test155 ob = new Test155();

		try
		{
			int a = ob.getValue(-2);								//�� ���� �߻�(�Ķ� ��ź)	
			System.out.println("a : " + a);			
		}
		catch (Exception e)											//�� ���� ��Ƴ���(�Ķ� ��ź)	
		{
			System.out.println("printStackTrace......");
			e.printStackTrace();
		}

	}
}