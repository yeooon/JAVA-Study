/*================================
�ڡڡ�Ŭ������ �ν��Ͻ��ڡڡ�
================================*/

//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
//��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

//������ �� ���� �Է�(���� ����) : 10 5
//������ ������ �Է�(+ - * /) : +
//>>10 + 5 = 15
//��� �Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	//���� ����
	int a,b;
	char ch;

	//�����͸� �Է¹ޱ� (��� : �Է�)
	//������ �����ڸ� �Է¹޾ƾ� ��
	
	void Input() throws IOException
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
	System.out.print("������ ������ �Է�(+ - * /) : ");
		//char ch = sc.next().charAt(0); �̰� �����̾��� �ſ��� ���� �Ƴ� 
		ch=(char)System.in.read();
	}

	//�� �� ���� ó��=================��� ���⼭ ������ �����...
	
	int cal()

	{
		int result=0; //��� �ʱ�ȭ�� �� �ϴ� �ɱ�...

	if (ch=='+')
		result = a + b;
	if (ch=='-')
		result = a - b;
	if (ch=='*')
		result = a * b;
	if (ch=='/')
		result = a / b;

	/*
	switch (ch)
		{	
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
		}
	*/

	return result;
	}

	//����Ʈ �ؾ���
	
	void print(int I)
	{
		System.out.printf("%d %c %d = %d%n",a,ch,b,I); //I���� �Ѱܹ޴´�. ���� ���� ������ �� �Ǿ� �ֱ� ����. 
	}
}


public class Test075
{
	public static void main(String[] args) throws IOException
	{
	Calculate ob = new Calculate();

	//��ǲ ȣ��
	ob.Input();

	//������ ȣ��
	int s = ob.cal();

	//����Ʈ ȣ��
	ob.print(s);
	}

}
/*
������ �� ���� �Է�(���� ����) : 250
50
������ ������ �Է�(+ - * /) : -
250 - 50 = 200����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/