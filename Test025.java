public class Test025
{
	public static void main(String[] args)
	{
		int a = 13, b = 7;
		int c, d, e;
		
		//��Ʈ ������ ���� �� ��Ʈ�� �ٲ㼭 ���
		//EX 11001100 00110011 �̷���

		c = a & b; // �� �� 1�̾�߸� 1�̴�,
		d = a | b; // �ϳ��� 1�̸� 1�̴�.
		e = a ^ b; // ���� �޶�߸� 1�̴�.

		System.out.printf("a & b : %d%n", c);
		System.out.printf("a | b : %d%n", d);
		System.out.printf("a ^ b : %d%n", e);

	}
}

/*
a & b : 5
a | b : 15
a ^ b : 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

