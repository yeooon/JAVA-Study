
/*============================
// ���� �帧�� ��Ʈ��(���)
==============================*/

// if ~ else �� �ǽ�
// ����ڷκ��� �̸�, ��������, ��������, ���������� ��¹޾�
//������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//����� ��� ������ �������� ó���Ѵ�.
//90�� ~ 100�� : A   80�� ~ 89�� : B
//70�� ~ 79�� : c 60�� ~69�� D
/*
���α׷��� �ۼ��� �� �־��� ���ǿ� ����
�б� ������ ���ϱ� ���� ����ϴ� �������
ir ��, 
*/
//��, ���۸����� ������� �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�,
//printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.
//���� ��)
// �̸� �Է� : �̿���
//�������� :
//�������� :
//�������� : 

//>> ����� �̸��� ȫ�����Դϴ�.
//>> ���� ������ 90,
// ���� ������ 80,
// ���� ������ 70,
// ������ 240�̰� ����� 80�Դϴ�.
// ����� B�Դϴ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//����
		int a,b,c,total; //����
		String name; //�̸�
		char rank; //��ũ
		Double aver; //���

		//����

			System.out.print("�̸� �Է� : "); //�Է��ϴ� ĭ�� printf�� �ִ°� �ƴϱ���!

			name = br.readLine();

			System.out.print("���� ���� �Է� : ");

			a = Integer.parseInt(br.readLine());

			System.out.print("���� ���� �Է� : ");
			
			b = Integer.parseInt(br.readLine());

			System.out.print("���� ���� �Է� : ");

			c = Integer.parseInt(br.readLine());


		total = a+b+c;
		aver = total/3.0;


		if (aver>=90)
		{
			rank = 'A';
		}
		else if (aver>=80)
		{
			rank = 'B';
		}
		else if (aver>=70)
		{	
			rank = 'C';
		}
		else if (aver>=60);
		{
			rank = 'D';
		}

			System.out.printf("\n����� �̸��� %s �Դϴ�", name);
			System.out.printf("\n���� ������ %d", a);
			System.out.printf("\n���� ������ %d", b);
			System.out.printf("\n���� ������ %d", c);
			System.out.printf("\n������ %d���̰� ����� %.2f�Դϴ�", total,aver);
			System.out.printf("\n����� %n%s", rank);


	}
}