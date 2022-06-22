/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Calender Ŭ����

/*
�� Calenda Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
	(�߻� Ŭ���� : �̿ϼ��� Ŭ����)
	
	Calenda ob = new Calendar();
	�� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�


��	Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���.
	1. Calendar ob1 = Calendar.getInstance();

	2. Calendar ob2 = new GregorianCalendar();

	3. GregorianCalendar ob = GregorianCalendar();

	(�� GregorianCalendar : calendar Ŭ������ ���� Ŭ����)

*/

// ��, ��, ��, ������ Calendar ��ü�κ��� �����ͼ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test144
{
	public static void main(String[] args)
	{
		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		//Calendar ob = new Calendar();
		Calendar rightNow = Calendar.getInstance();

		// ������ �޷�(Calendar) �ν��Ͻ��� ����
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� �� ��get()��
		// ��°� get, �����ؼ� �����ϴ°� set �޼ҵ�?

		int y = rightNow.get(Calendar.YEAR);
		System.out.println(y);
		//--==>> 2022

		int m = rightNow.get(Calendar.MONTH)+1;	//--��+1�� check~!!
		System.out.println(m);
		//--==>> 2

		int d = rightNow.get(Calendar.DATE);	//--��+1�� check~!!
		System.out.println(d);
		//--==>> 3

		int w = rightNow.get(Calendar.DAY_OF_WEEK);	//--��+1�� check~!!
		System.out.println(w);
		//--==>> 5

		// �׽�Ʈ

		System.out.println(y + "-" + m + "-" + d + "-" + w);

		String week = "";
		switch (w)
		{
		/*
		System.out.println(Calendar.SUNDAY);		//--==>> 1 �� �Ͽ���
		System.out.println(Calendar.MONDAY);		//--==>> 2 �� ������
		System.out.println(Calendar.TUESDAY);		//--==>> 3 �� ȭ����
		System.out.println(Calendar.WEDNESDAY);		//--==>> 4 �� ������
		System.out.println(Calendar.THURSDAY);		//--==>> 5 �� �����
		System.out.println(Calendar.FRIDAY);		//--==>> 6 �� �ݿ���
		System.out.println(Calendar.SATURDAY);		//--==>> 7 �� �����
		*/
		case 1 : week = "�Ͽ���"; break;
		case 2 : week = "������"; break;
		case 3 : week = "ȭ����"; break;
		case 4 : week = "������"; break;
		case 5 : week = "�����"; break;
		case 6 : week = "�ݿ���"; break;
		case 7 : week = "�����"; break;		
		}

		System.out.println(y + "-" + m + "-" + d + "-" + week);

		System.out.println("/////////////////////////////////////////");

		// Calendar Ŭ���� ��� �ν��Ͻ� ����

		Calendar rigthNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};


		// �޷��� ��¥ ���� �� set() �޼ҵ� Ȱ��

		rigthNow2.set(2022, 5, 20);

		System.out.println(rigthNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 2
		System.out.println(week2[rigthNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> ������

	}
}