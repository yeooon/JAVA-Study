/*========================
�ڡڸ���޷¡ڡ�
=========================*/

//������ ���� ����� ���α׷��� �����Ѵ�.

//���� ��)
//���������� �Է��ϼ��� : 2022
//�������� �Է��ϼ��� : 6
/*
[2020�� 6��]
�� �� ȭ �� �� �� ��
=====================
		 1  2   3   4
5  6  7  8  9  10  11
12  13  14  15  16  17  18
��¼��...
=====================
*/


import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		//�迭 ���� �� �ʱ�ȭ
		//-- �� ���� ��� �ִ� ������ ��¥(�� ���� �ִ� ��¥)
		int[] days = {31,28,31,30,31,30,1,31,30,31,30,31};
		//�׽�Ʈ
		//System.out.println(days,length);
		//--==>> 12

		//�ֿ� ���� ����
		int nalsu, y, m, w;

		do
		{
		System.out.print("���������� �Է��ϼ��� : ");
		y = sc.nextInt();
		}
		while (y<1);

		do
		{
		System.out.print("�������� �Է��ϼ��� : ");
		m = sc.nextInt();
		}
		while (m<1||m>12);
		//-- �Է¹��� ���� 1���� �۰ų� 12���� ũ�� �ٽ� �Է¹ޱ�~!!

		//---------------------������� �����ϸ� ��ȿ�� ������ ���� �Է��� ����

		//�Է¹��� ������ �ش��ϴ� 2���� ������ ���� ���

		if ((y%4==0 && y%100!=0) || y%400==0)// �����̶��
		{
			days[1] = 29;
		}
		// else ������ ���� days �迭�� 1��° ���(2)�� 28�� �����Ǿ� �ִ� ���±� ������ ������ ������ ������ �ȴ�.

		// 1�� 1�� 1�� ~ �Է¹��� ������ �����⵵ 12�� 31�ϱ����� �� �� ���

		nalsu = (y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;

		// �Է¹��� ����(�ش翬��) 1�� 1�� ~ �Է��� ���� ���� �������� �� �� ���� ����
		for (int i=0;i<(m-1);i++)
		{
			nalsu+=days[i];
		}

		//�Է¹��� ���� 1���� �� �� ���� ����

		nalsu+=1;	//++nalsu

		//----------������� �����ϸ� ��� �� ���� ���� ���� ó�� �Ϸ�

		//���� Ȯ��
		//-- �Է¹��� ������ �Է¹��� ���� 1���� ���� �������� Ȯ���ϱ� ���� ����

		w = nalsu % 7;
		// w:0 �� �Ͽ���
		// w:1 �� ������
		// w:2 �� ȭ����
		// w:3 �� ������
		// w:4 �� �����
		// w:5 �� �ݿ���

		//�׽�Ʈ
		//System.out.println(w); 
		//2022�� 1�� 1���� �����(6)�̶�� �ǹ�

		//--------------------------------------������� �����ϸ� �ش� ���� �ش� �� 1���� ���� �������� Ȯ�� �Ϸ�


		//��� : �޷� �׸���
		System.out.println(); 
		System.out.printf("\t[%d�� %d��]\n",y,m);
		System.out.println(); 
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");

		//Ư�� ���Ϻ��� 1���� ��� �� �� �ֵ��� ���� �߻�(����)
		for (int i=1;i<=w;i++)
		{
			System.out.print("    "); 
		}

		//�׽�Ʈ
		//System.out.printf("%4d",1);
		//====��==== ���� ���κ��� ���� �̻��� ���� //���� 4�� �߻�(���� 2���� 4�� ���̿��� �� ���̾���)

		for (int i=1;i<=days[m-1];i++) //days�迭�� m-1��°���� �ݺ��ϱ�
		{
			System.out.printf("%4d",i);				//-- 1 2 3 4 5 6 7 8 9 ...30
			w++;									//	 3 4 5 6 7 8 9 ...
			//--��¥�� ó���ϴ� ��ŭ ���ϵ� �Բ� ����

			//�Ͽ����� �����Ϸ��� ���...(�̹��� ����ϰ��� �ϴ� ��¥�� �Ͽ����� ���)

			if (w%7==0)
			{
				System.out.println(); 
			}
		}
		//���� ������ ��¥�� ��� ������ ��� ä���� ���(����ϱ��� ���� ��ü ���)
		//�̹� �Ͽ��� ������ �̷������ ������
		//�� ��쿡�� �߰� ���� ó���� ���ش�
		if (w%7!=0) //�Ͽ����� �ƴ� ��� 
		{
		System.out.println(); 
		}
		System.out.println("============================");
	}
}

//?? ���� ������ �߸��� �� ������... 1���� ������ �� ������?

//�ƾ� ���� �м� ����~

/*
import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{
		int year, month; 
		int yearDay = 0, monthDay = 0, totalDay = 0; //(�� ���� ����, �� ���� ����, ���� ����)
		int startDay; //�����ϴ� ����
		int firstDay = 1; //�����ϴ� ��¥

		// 1 ~ 12�� �迭
		int[] montharr = {31,0,31,30,31,30,1,31,30,31,30,31};
		int[] week = {0, 1, 2, 3, 4, 5, 6}; //�� �� ���� �迭
		String[] weekname = {"��","��","ȭ","��","��","��","��"};

		Scanner sc = new Scanner(System.in);

		System.out.print("���������� �Է��ϼ��� : ");
		year = sc.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		month = sc.nextInt();


		//������ ���� �ϼ� ���� ���
		for (int i=1;i<year;i++)
		{
			//������ - �� �κ��� 0 ä���ִ� ����
			if (year%4==0 && year%100!=0 && year%400==0) //������ ���
			{
				yearDay += 366;
			}
			else
			{
				yearDay += 365;
			}
		}

		//���� ���� �� �� ����
		for (int i=1;i<month;i++)
		{
			monthDay += montharr[i-1]; //�� ���� ������ �迭 -1(ex. 3�� �Է½� �迭�� 0,1,2�� ���� ���� ���)
		}

		System.out.println(); 
		System.out.printf("[%d�� %d��]",year,month);
		System.out.println(); 
		System.out.println("==========================");

		//�� ��� �� ���� ���
		startDay = (yearDay+monthDay+1)%7; //�����ϴ� ���� = ( �� ���� ���� + �� ���� ���� + 1 )%7

		for (int i=0;i<week[startDay];i++)
		{
			System.out.print("  ");
		}
		
		for (int i=week[startDay];i<week.length;i++)
		{
			System.out.print(firstDay);
				firstDay++;
		}
		System.out.println();

		int j=0;

		for (int i=firstDay;i<=montharr[month-1];i++) //��¥ ���
		{
			System.out.printf("%3d",firstDay);
			firstDay++;
			j++;
			if (j%7==0)
			{
				System.out.println(); //����
			}
		}

		System.out.println(); 
		System.out.println("==========================");

	}
}


*/

/*
public class Test107
{
	public static void main(String[] args)
	{
		int year, month; 
		int yearDay = 0, monthDay = 0, totalDay = 0; //(�� ���� ����, �� ���� ����, ���� ����)
		int startDay; //�����ϴ� ����
		int firstDay = 1; //�����ϴ� ��¥

		// 1 ~ 12�� �迭
		int[] montharr = {31,0,31,30,31,30,1,31,30,31,30,31};
		int[] week = {0, 1, 2, 3, 4, 5, 6}; //�� �� ���� �迭
		String[] weekname = {"��","��","ȭ","��","��","��","��"};

		Scanner sc = new Scanner(System.in);

		System.out.print("���������� �Է��ϼ��� : ");
		year = sc.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		month = sc.nextInt();


		//������ ���� �ϼ� ���� ���
		for (int i=1;i<year;i++)
		{
			//������ - �� �κ��� 0 ä���ִ� ����
			if (year%4==0 && year%100!=0 && year%400==0) //������ ���
			{
				yearDay += 366;
			}
			else
			{
				yearDay += 365;
			}
		}


		for (int i=0;i<year;i++)
		{
			//������ - �� �κ��� 0 ä���ִ� ����
			if (year%4==0 && year%100!=0 && year%400==0) //������ ���
				montharr[1] = 29;
			else if (year%4!=0 && year%100==0 && year%400!=0)
				montharr[1] = 28;
		}


		//���� ���� �� �� ����
		for (int i=1;i<month;i++)
		{
			monthDay += montharr[i-1]; //�� ���� ������ �迭 -1(ex. 3�� �Է½� �迭�� 0,1,2�� ���� ���� ���)
		}

		System.out.println(); 
		System.out.printf("[%d�� %d��]",year,month);
		System.out.println(); 
		System.out.println("==========================");

		//�� ��� �� ���� ���
		startDay = (yearDay+monthDay+1)%7; //�����ϴ� ���� = ( �� ���� ���� + �� ���� ���� + 1 )%7

		for (int i=0;i<week[startDay];i++)
		{
			System.out.print("  ");
		}
		
		for (int i=week[startDay];i<week.length;i++)
		{
			System.out.print(firstDay);
				firstDay++;
		}
		System.out.println();

		int j=0;

		for (int i=firstDay;i<=montharr[month-1];i++) //��¥ ���
		{
			System.out.printf("%3d",firstDay);
			firstDay++;
			j++;
			if (j%7==0)
			{
				System.out.println(); //����
			}
		}

		System.out.println(); 
		System.out.println("==========================");

	}
}	
*/














/*
		//���� �Է�
		int year, month;
		int nal, day;
		//����ڰ� �Է��� �� �ֵ��� ������
		Scanner sc = new Scanner(System.in);

		System.out.print("���������� �Է��ϼ��� : ");
		year = sc.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		month = sc.nextInt();

		//�����϶�

		int month[] = {30,0,30,31,31,30,31,31,30,31,30,31};	//�� �迭 ����

		//���� �迭 ���� - ���� �ʿ� ���� �ʳ�?
		String weekname[] = {"��","��","ȭ","��","��","��","��"}

		//������ - �� �κ��� 0 ä���ִ� ����
		if (year%4==0 && year%100!=0 && year%400==0) //������ ���
		{
			month[1] = 29;
		}
		else if (year%4!=0 && year%100==0 && year%400!=0)
		{
			month[1] = 2;
		}
		
		//���� ���
		nal = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;

		//1�� ���
		for (int i=0;i<(month-1);i++)
		{
			nal+=month[i]; //���� = ���� �迭
		}

		nal++; //������ ����ؼ� �����Ѵ�. = �������

		//�� ���
		nal%7=week;

		//���� ���

		//�信�� ������ �Ǿ���� �� �� ������?? > �׷��� ��� ��¥�� ��������� ����� �ϴ� �� �ƴѰ�?

		//����Ʈ�� ����϶�

		System.out.printf("[%d�� %d��]",year,month);
		System.out.println(yoil);
		System.out.println("==========================");
		System.out.println(); 
		System.out.println("==========================");

*/