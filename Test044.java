
//switch�� �ǽ�

//����ڷκ��� 1 ���� 3���� ���� �߿��� �ϳ��� �Է¹޾�
//�Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
//��, �ΰ��� ������� ������ �� �ֵ��� �Ѵ�.

// switch���� �Ϲ� ���� ����Ѵ�.
// switch���� �⺻ ���� ����ϵ�, 
// break�� �� �� ���� ����� �� �ֵ��� �����Ѵ�.

//���� ��
//������ ���� �Է� (1~3) : 3
//�ڡڡ�
//����Ϸ��� �ƹ�Ű��...

//������ ���� �Է� (1~3) : 1
//��

//������ ���� �Է� (1~3) : a
//�Է� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test044
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���� ����
		String star;
		int A;
	
		System.out.print("������ ���� �Է�(1~3) : ");
		A = Integer.parseInt(br.readLine());

		switch(A) // �Ƥо��
		{
			case 3 : System.out.print("��");
			case 2 : System.out.print("��");
			case 1 : System.out.print("��"); break;
			default : System.out.print("�Է¿���")
		}
	}
}

//�̷����� ���� �غ���
/*
// �⺻��
		switch(A*1) // �Ƥо�� ���� �Ѵٵƴ�
		{
			case 3 : System.out.print("��");
			case 2 : System.out.print("��");
			case 1 : System.out.print("��"); break;
			default : star = "�Է� ����";
//�Ϲݸ�
		switch(A) // �Ƥо��
		{
			case 3 : System.out.print("�ڡڡ�"); break;
			case 2 : System.out.print("�ڡ�"); break;
			case 1 : System.out.print("��"); break;
			default : System.out.print("�Է¿���") break;
		}


*/

/*
		switch(A*1) // �Ƥо��
		{
			case 3 : System.out.print("��");
			case 2 : System.out.print("��");
			case 1 : System.out.print("��"); 
			default : star = "�Է� ����";
		}
			case 3 : System.out.print("��");
			case 2 : System.out.print("��");
			case 1 : System.out.print("��"); break;
			default : star = "�Է� ����"; 


			case 3 : System.out.print("�ڡڡ�");
			case 2 : System.out.print("�ڡ�");
			case 1 : System.out.print("��");
			default : star = "�Է� ����"; break; ��??? �� �� �ݺ��Ǵ�???? 

		switch(A)
		{
			case 3 : star = "�ڡڡ�"; break;
			case 2 : star = "�ڡ�"; break;
			case 1 : star = "��"; break;
			default : star = "�Է� ����"; break;
		}
*/