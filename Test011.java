// ������ �ڷ���
// ������ �ڷ��� �ǽ� �� �׽�Ʈ : double
// ������ ���� �ǽ�

public class Test011
{
	public static void main (String[] args)
	{
		// ������ ������ ������
		double a = 1 / 2;
		//double a = 0;
		//�� ������δ� 1������2�� 0.5�ε� ������ �������̶� 0�� ����
		System.out.println("double a : " + a);
		//double a = 0.0;
		double b = 1/2 + 1/2;
		System.out.println("double b : " + b);
		//double b = 0.0;

		// �� �����ڷ� �Ǽ��� ���ԵǾ� �ִ� ������ ������
		// �Ǽ��� ���ԵǾ� �ִ� ���꿡�� �Ǽ� ������� ��������
		// �ű��ϳ�. ������ ������ ��������, �Ǽ��� ���ԵǾ� ������ �Ǽ�����
		double c = 1 / 2.0;
		System.out.println("double c : " + c);

		double d = 3/2 + 1/2;
		System.out.println("double d : " + d);

		double e = 3/2 + 1/2.0;
		System.out.println("double e : " + e);


	}
}

/*
double a : 0.0
double b : 0.0
double c : 0.5
double d : 1.0
double e : 1.5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/