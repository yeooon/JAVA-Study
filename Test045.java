
//switch�� �ǽ�
//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, switch���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
//���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
//ù ��° ���� �Է� : 3
//�� ��° ���� �Է� : 17
//������ �Է�[+ - * /] : -
//3-17 = -14

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test045
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,result; // C�� ������ / ������� ������ ���� ���� �� �� �ܼ�����. 

		System.out.print("ù ��° ���� �Է� : ");
			a= Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
			b= Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		c = System.in.read();

		//�������·� �޾�����... 
		// + > c:43 , - 45, * 42, / 47
		// ����ġ ���̽��� ��� ���� ���ڿ��� �鰨
/*
switch (c)
{
case 43 : result = a + b;break;
case 45 : result = a - b;break;
case 42 : result = a*b;break;
case 47 : result = a/b;break;
default : return;
}
System.out.println("");
System.out.printf(">> %d %c %d = %d%n", a, c, b, result);
*/

		int a,b,result
		char c //������
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		c = (char)System.in.read();

		switch (c)
		{
		case '+': result = a+b; break;
		case '-': result = a-b; break;
		case '*': result = a*b; break;
		case '/': result = a/b; break;
		default : return;
		System.out.println("");
		System.out.printf(">> %d %c %d = %d%n", a, c, b, result);

		}
	}
}


//default : return; //1.���� ��ȯ return(�̰���ȯ) 
				  //2.�޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����