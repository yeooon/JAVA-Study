//�迭�� �迭

//����

//�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//������ ������ �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
/*
A
B C
D E F
G H I J
K L M N O

ij
00 
10 11 
20 21 22
30 31 32 33
40 41 42 43 44

*/


public class Test095
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
				arr[i][j]+=ch++;
			}
		}

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
BC
DEF
GHIJ
KLMNO
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/