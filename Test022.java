
// ������ �ڷ���
// �Ǽ��� ������Ÿ���� ���е� �׽�Ʈ �ǽ�

public class Test022
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����

		float a = 0; //��Ȯ�� ����
		double b = 0; //��Ȯ���� ����

		// ���� �� ó�� >> 100000(�ʸ�)�� �ݺ�
		for (int i = 1; i<=100000; i++)
		{
			//System.out.println("���");

			a += 100000; //a�� �ʸ� ��ŭ �������Ѷ�
			b += 100000; //b�� �ʸ� ��ŭ �������Ѷ�
		}

		// ��� ���

		System.out.println("float a : " + a/100000);
		System.out.println("double b : " + b/100000);

/*

*/
	}
}