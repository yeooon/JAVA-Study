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

ij
00 
11 10 (10 11) 
20 21 22
33 32 31 30 (30 31 32 33)
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
				if (i%2==0) //¦���� ���� �״��
				{
					arr[i][j]+=ch++;
				}
				else if (i%2!=0) //Ȧ���� �� �Ųٷ�
				{
					arr[i][i-j]+=ch++;
				}
			}
		}
		//3���� j�� ���� b���� 11 10�� ��� �ȵǴ� ������ �ִ�.
		//

		for (int i=0;i<5;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.printf("%c",arr[i][j]);
			}
		System.out.println();
		}
	}
}

/*
A
CB
DEF
JIHG
KLMNO
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/