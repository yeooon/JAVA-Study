
//����
// ���� ������ == ���� ������

// ����ڷκ��� ������ ���ڸ� �ϳ� �Է¹޾�
// �빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
// ���ĺ��� �ƴ� ��Ÿ �����̸� �Է� ���� ó���ϴ� ���α׷��� �����Ѵ�.

//���� ��)
// �� ���� �Է� : 
// A > a
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� :
// a > A

// �� ���� �Է� : 
// �Է� ����~~!!

// char ���� �����ϸ� result ���� �Բ� �����ϴ� �� ����.

import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		char ch;  //���ڸ� ����
		char result; //�������

		System.out.print("�� ���� �Է� : "); 
			ch = (char)System.in.read();  //����ڰ� ���ڸ� �Է��� �� �ֵ��� ��

		if (ch>='A'&& ch<='Z') //�빮�� ���� �о����
		{
			result = (char)(ch + 32); //�ҹ��� ġȯ
			System.out.printf("%c �� %c%n",ch,result);
		}
		else if (ch>='a' && ch<='z') //������ ���ڿ��� �ҹ��� ���� �о����
		{
			result = (char)(ch - 32);  //�빮�� ġȯ
			System.out.printf("%c �� %c%n",ch,result);
		}
		else //�������� ���� ���
		{
		System.out.println("�Է� ����~");
		}

	
	}
}

/*
�� ���� �Է� : e
e �� E
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : 4
�Է� ����~
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/