//�迭�� �迭

//����

//�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//������ ������ �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
/*
A
C B
D E F
J I H G
K L M N O
�Ųٷγ� ����...

00 
02 01 i�� ¦���� ������ �κ��� 
20 21 22
33 32 31 30
40 41 42 43 44

*/


public class Test096
{
	public static void main(String[] args)
	{
		char ch='A';
		//�迭 ����
		char[][] arr = new char[5][5];

		for (int i=0;i<5;i++) //i�� ������ ���� j�� i��ŭ�� �����Ѵ�
		{
			for (int j=0;j<=i;j++)
			{
				if (i%2==0)
				{
					arr[j][i]+=ch++;
				}
				else
				{
					arr[j-3][i]+=ch++;
				}
			}
		}

		for (int i=0;i<5;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.printf("%c",arr[j][i]);
			}
		System.out.println();
		}
	}
}