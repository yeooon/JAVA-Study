/*=======================================
�ڡڡ�����(Sort) �˰���ڡ�
========================================*/

// ����

// ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
// ������ ���� �л����� ���� ������ ����� �ο��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1, ���� ����) : �̾Ƹ� 90
// �̸� ���� �Է�(2, ���� ����) : ������ 80
// �̸� ���� �Է�(3, ���� ����) : ������ 80
//					:
/*
------------------
1�� ��μ� 95
2�� �̾Ƹ� 90
	  :
------------------
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

public class Test112
{
	public static void main(String[] args)
	{
//�ο� �� �Է�
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο� �� �Է� : ");	

		int inwon = sc.nextInt();

			String name[] = new String[inwon];		//�̸� - �ο� ����� �迭�� �����
			int jumsu[] = new int[inwon];		//���� - �ο� ����� �迭�� �����
			int grade[] = new int[inwon];

//�̸��� ���� �Է�		
			for (int i=0;i<inwon;i++)
			{
				System.out.printf("�̸� ���� �Է�(%d, ���� ����) : ",i+1);		//num ����� �̸�, ���� �Է� �ݺ�
				name[i] = sc.next();
				jumsu[i] = sc.nextInt();
			}
/*
			do
			{
				System.out.printf("�̸� ���� �Է�(%d, ���� ����) : ",a);		//num ����� �̸�, ���� �Է� �ݺ�
				name[n-1] = sc.next();
				jumsu[n-1] = sc.nextInt();

			}
			while (n++<inwon); 
*/

			//System.out.printf("%3s",name[0]); �� �ȳ����µ�

//���� �� > �� ������ ����
//������ �̸��� �Բ� �ٲ� ��� ��
			String temp;		//temp�� int ���� ��������.
			int a;
			boolean flag;
			int n=0;		
			
			do
			{
				n++;
				flag = false;	//�÷��״� ����Ʈ�� false

					for (int i=0;i<inwon-n;i++)
					{
						if (jumsu[i]<jumsu[i+1])
						{
						a = jumsu[i];
						jumsu[i]=jumsu[i+1];
						jumsu[i+1]=a;

						temp = name[i];
						name[i]=name[i+1];
						name[i+1]=temp;

						flag=true;
						}
					}	
			}
			while (flag);

/* �Ϲ� ����δ� ����� ������ �ʴ´�.(�̻��ϰ� ����)

			for (int i=1;i<inwon;i++)
			{
				for (int j=0;j<inwon-i;j++)
				{
					a = jumsu[j];
					jumsu[j]=jumsu[j+1];
					jumsu[j+1]=a;

					temp = name[j];
					name[j]=name[j+1];
					name[j+1]=temp;
				}
			}
*/

			for (int i=0;i<inwon;i++)
			{
				System.out.printf("%n%d�� %s,%d",i+1,name[i],jumsu[i]);
			}

			System.out.println();
		
		// 1. ���� �л��� ���� �����͸� �Է¹ޱ�.
		// 2. ���� ��>�� ������ ����
		// 3. ��� �ο�
	
	}
}