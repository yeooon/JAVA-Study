// ��Ʈ ���� ������
// ��Ʈ ���� ������ [xor]�����ڸ� Ȱ���Ͽ�
// �� ������ ����ִ� ����(��) �ٲٱ�

public class Test026
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int x=20, y=23;
		//int temp; // <<< �ӽ� ���� ����(����)

		// ��� ���빰 Ȯ��
		System.out.printf("x > %d, Y > %d", x, y);

		//���� �� ó��
		/*
		temp = x;
		x = y;
		y = temp;
		// ���ſ��� X�� ���, X���� Y�� ���, ���ſ� �ִ°� Y�� ���)
		*/

		x=x^y;
		y=y^x;
		x=x^y; //ó���Ÿ� �������� �ٽ� �� �� �ݺ����ֱ�

		// ��� ���빰 Ȯ��
		System.out.printf("%nx > %d, Y > %d", x, y);

	}
}