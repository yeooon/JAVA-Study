
// ����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
// �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �̿� ���� �ȳ��� �� �� ���α׷��� ������ �� �ֵ��� ó���Ѵ�.

// ���ϴ� ��(������) �Է� : 7
// 7 * 1 = 7
// 7 * 2 = 14
//   :
// 7 * 9 = 63

//���ϴ� ��(������) �Է� : 11


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n; //����

		System.out.print("���ϴ� ��(������) �Է� : ");
		n = Integer.parseInt(br.readLine()); // n�� �Է��ϸ� 

		if(n<1 || n>9) //���Ǻ���. 1���� �۰ų� Ȥ�� 9���� ū �� ���� 
		{
			System.out.println("�����帱 �� ����ϴ�");
			return; //(�״�� ����ȴٴ� ���̿���.
		}

		int a = 0;

		//�ݺ� ���

		while (a<9)
		{
			a++;
			System.out.printf("%d * %d = %d%n",n,a,(n*a));
		}
	}
}

//�ѽ�.