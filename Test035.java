

// Ȧ��, ¦��, ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

// Ʋ�� �ڵ��̴�
/*
	System.out.print("������ ���� �Է� : ");
	a = Integer.parseInt(br.readLine());

	if(a%2==0)
		{
			System.out.println(a + "�� ���̴�");
		}
	else if(a%2!=0)
		{
		System.out.printf("%d�� Ȧ��",a);
		}
	else
		{
			System.out.printf("%d�� ¦��",a);
		}
*/
	int a;
	String result;
		if(a==0)
		{
			result = "��";
		}
		else if (a%2==0)
		{
			result = "¦��";
		}
		else if (a%2!=0)
		{
			result = "Ȧ��";
		}
		else
		{
			result = "���� �Ұ�";
		}
		System.out.println(a+ " > " + result);

// ���ǹ��� ������ ������ �׻� ������ ���� ������ �����ؾ� �Ѵ�.

// ���ǹ� ���� �������� �̿��� ����(else)�� 
// ������ ���Ե� �������� ó���ϴ� ���� �ٶ������� ���� ��찡 �ִ�.
// �Ұ����� ���� ��¿ �� ������
// �������̸� ������ ���Ե��� �ʴ� ������
// �̿��� ����(else)���� ó���� �� �ֵ��� ����.

//if ~ else ������ ��ø ������
//�ݵ�� else�� ������ �ϴ� ���� �ƴϴ�.
//�ٸ� ����ؾ��� ������ ó���ϴ� ��������
//������ �߻����� �ʴ� �������� �ۼ��ؾ� �Ѵ�.

//else �϶� System.out.println("Ȯ�� �ʿ�");
	}
}