/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Calender Ŭ����


//�� �ǽ� ����
// ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// �� ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ� Ȱ��
//	  �� ��ü.add(Calendar.DATE, �� ��);

//���� ��)
//���� ��¥ : 2022-2-3 �����
//�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

//==========[Ȯ�� ���]============
//200�� �� : xxxx-xx-xx x����
//=================================
//����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Calendar;
import java.util.Scanner;

public class Test146
{
	public static void main(String[] args)
	{
		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar rigthNow = Calendar.getInstance();

		// �ֿ� ���� ����
		int num;			//-- ����ڷκ��� �Է¹��� �� �� 


		// ������ ��, ��, ��, ���� Ȯ��(�������� : get())
		int y = rigthNow.get(Calendar.YEAR);
		int m = rigthNow.get(Calendar.MONTH)+1;		//��+1�� check~!!!
		int d = rigthNow.get(Calendar.DATE);
		int weekname = rigthNow.get(Calendar.DAY_OF_WEEK);


		String week = "";

		switch (weekname)
		{
		case 1 : week = "�Ͽ���"; break;
		case 2 : week = "������"; break;
		case 3 : week = "ȭ����"; break;
		case 4 : week = "������"; break;
		case 5 : week = "�����"; break;
		case 6 : week = "�ݿ���"; break;
		case 7 : week = "�����"; break;		
		}


		// ������ ��¥ ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + "-" + week);



		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			num = sc.nextInt();
		}
		while (num<1);


		// ���ϱ� �޼ҵ�
		// rigthNow.���ϱ� �޼ҵ�(�Ű����� ��¥, �Է��� ��);
		rigthNow.add(Calendar.DATE, num);

		y = rigthNow.get(Calendar.YEAR);
		m = rigthNow.get(Calendar.MONTH)+1;
		d = rigthNow.get(Calendar.DATE);
		weekname = rigthNow.get(Calendar.DAY_OF_WEEK);

		switch (weekname)
		{
		case 1 : week = "�Ͽ���"; break;
		case 2 : week = "������"; break;
		case 3 : week = "ȭ����"; break;
		case 4 : week = "������"; break;
		case 5 : week = "�����"; break;
		case 6 : week = "�ݿ���"; break;
		case 7 : week = "�����"; break;		
		}

		// ���

		System.out.println("==========[Ȯ�� ���]============");
		System.out.printf("%d�� �� : %d-%d-%d %s\n", num,y,m,d,week);
		System.out.println("=================================");
	}
}