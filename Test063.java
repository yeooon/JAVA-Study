
//�ݺ���(for��) �ǽ�
//���� for��(�ݺ����� ��ø)�� Ȱ���� ����� �ǽ�

//����
//������ ���� ������ ��µ� �� �ֵ��� �ݺ����� ��ø ������ �ۼ��Ͽ� 
//���α׷��� �����Ѵ�.

//���� ��
/*
	* 1�� 5�� ����� 0, ��1
   ** 2�� 4�� ����� 1, ��2
  *** 3�� 3�� ����� 2, ��3
 **** 4�� 2�� ����� 3, ��4
***** 5�� 1�� ����� 4, ��5
*/
public class Test063
{
	public static void main(String[] args)

	{
		for (int line=1;5>=line;line++) //1����Ͷ�� �����ϰ� �� ���� 
		{
			for (int vo=4;vo>=line;vo--)//������ 4���� �����ؼ� �����Ѵ�. ���� ������ŭ
			{
				System.out.print(" "); 
			}
			for (int star=1;star<=line ;star++) //���� 1������ �����ؼ� �����Ѵ�. ���� ������ŭ
			{
				System.out.print("*"); //�̴����� �� ���
			}
		System.out.println();
		}
		
	}
}
/*
public class Test063
{
	public static void main(String[] args)

	{
		for (int line=5;0<line;line--) //5����Ͷ�� �����ϰ� �� ����
		{
			for (int star=1;star<=5;star++)//���� 1���Ͷ�� �����ϰ� �� ����
			{
				if (line>star)//���� ������ Ŭ��(�������)
				{
					System.out.print("  "); //������� ���� ���
				}
				else
					System.out.print("��"); //�̴����� �� ���
			}
		System.out.println();
		}
	}
}
*/
/*
public class Test063
{
	public static void main(String[] args)
	{
		for (int line=1;line<6;line++)
		{
			for (int v=0;v<5;v++)
			{
				if (line>v)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("��");
				}
			System.out.println();
			}
		}
	}
}
*/


/*
public class Test063
{
	public static void main(String[] args)
	{
	for (int line=1;line<=5;line++)
	{
		for (int star=1;star<=line;star++)
		{
			System.out.print("��");
		}
		System.out.println(); //������ ����
	}
	}
}
*/
//���� �� ������ ���� �ð� ������ ����

/*=================
��
�ڡ�
�ڡڡ�
�ڡڡڡ�
�ڡڡڡڡ�
==================*/
//�¿����
//�¿���� �ϴ� ���� ���� ��� ��

//���� �� ������ ������ �ٰ�, ���� �ð�, ������ ����

/*

public class Test063
{
	public static void main(String[] args) //��ǥ��
	{
	for (int line=1;line<=5;line++) //
	{
		for (int star=1;star<=5;star++) //��ǥ��
		{
			if (line>=star)
			{
			System.out.print(" ");
			}
			else
			System.out.print("��");
		}
		System.out.println(); //������ ����
	}
	}
}
*/

/*=================
 �ڡڡڡ�
  �ڡڡ�
   �ڡ�
    ��
==================*/

//ù��° �࿡�� ���� �� �� ǥ�õǰ� ������ 4�� ǥ�õǾ�� �Ѵ�. 
//�ټ� ��° �࿡�� ���� �ټ��� ǥ�õǾ�� �ϰ� ������ ����� �Ѵ�



//���� ���鰪�� �ڹٲٸ� ���Ϲ���

//���� �����Ҽ��� ������ �����ϸ� ����� ���Ҵ�
//����)
/*=================
				��1�� (��1��, �����4��)
			  �ڡ�2�� (��2��, �����4��)
			�ڡڡ�3�� (��3��, �����4��)
		  �ڡڡڡ�4�� (��4��, �����4��)
		�ڡڡڡڡ�5�� (��5��, �����4��)
==================*/
/*
//���
/*=================
��					1�� (��1��, �����4��)
�ڡ�				2�� (��1��, �����4��)
�ڡڡ�				3�� (��1��, �����4��)
�ڡڡڡ�			4�� (��1��, �����4��)
�ڡڡڡڡ�			5�� (��1��, �����4��)
==================*/
//�̷��� ���´�.


//���� �����Ҽ��� ���� �����ϵ��� ����
/*
public class Test063
{
	public static void main(String[] args) 
	{
	for (int line=5;line>0;line--) //���� �����Ҽ��� 
	{
		for (int star=1;star<=5;star++) //���� �����ؾ���
		{
			if (star<line) //���� ���� ������ ũ�� ���� 1��, ���� 5�����
			{
			System.out.print("  ");
			}
			else
			System.out.print("��");
		}
		System.out.println(); //������ ����
	}
	}
}
*/
