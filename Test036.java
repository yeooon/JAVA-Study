
//����ڷκ��� ������ ������ �Է¹޾�
//������ ���� �Ǻ� ����� ����ϴ� ���α׷��� �����Ѵ�

//2�� ��� / 3�� ��� / 2�� 3�� ��� / 2�� 3�� ��� �ƴ�
//���� ��)
//������ ���� �Է� : 4
//4�� 2�� ���
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 9
//9�� 3�� ���
//����Ϸ��� �ƹ� Ű��...

//������ ���� �Է� : 6
//6�� 2�� 3�� ���

//������ ���� �Է� : 17
//17�� 2�� 3�� ����� �ƴ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//������ ���� 
		int a;
		String b;

		//���
		System.out.print("������ ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
		
		//����
		if (a%2==0 && a%3==0) 
		{
			b="2�� 3�� ���";
		}
		else if (a%3==0)
		{
			b="3�� ���";
		}
		else if (a%2==0)  //6���� �ȳ��´�... 
		{
			b="2�� ���";
		}
		else
		{
			b="2�� 3�� ����� �ƴ�";
		}
		
		System.out.println(a+"��"+b);
	}
}