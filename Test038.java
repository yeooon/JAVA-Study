
//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
//���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

//���� ��)
//ù ��° ���� �Է� : 2
//�� ��° ���� �Է� : 4
//������ �Է�[+,-,*,/] : +
// >> 10 + 3 = 13

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//���� ����
		int a,b;
		char c;

		System.out.print("ù ��° ���� �Է� : ");
			a=Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
			b=Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+,-,*,/] : ");
			c = (char)System.in.read(); //br.readLine()�� ���ڿ�! �̱� ������ String�� ������.
			// System.in.read()�� int�� �о���� �ű⶧���� ����ȯ 

		if (c=='+') //���� �����ڰ� +�϶� 
		{
			System.out.printf("\n%d + %d = %d",a,b,(a+b)); //�� �������� ������...
		}
			else if (c=='-')
		{
			System.out.printf("\n%d - %d = %d",a,b,(a-b));
		}
			else if (c=='*')
		{
			System.out.printf("\n%d * %d = %d",a,b,(a*b));
		}
			else if (c=='/')
		{
			System.out.printf("\n%d / %d = %d",a,b,(a/b));
		}
			else
				System.out.println("\n�����Ұ�");

			/*
			int a, b, result=0�� �ʱ�ȭ ��Ų ������ ������� �Է��ϴ� ���ĵ� �ִ�. 

			*/

			//���ƴ� ���µ� ���� ���ϴ� ������ �ƴϾ�...

// �����ڰ� char�� ��쿣 (char)System.in.read(); �� �� ��ȯ
// char �̸� '' �ε�(����)
// String �̸� "" �̾�(���ڿ�)

	}
}


