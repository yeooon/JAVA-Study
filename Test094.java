//�迭�� �迭

//����

//�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//������ ������ �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
/*
A B C D E 
F G H I J
K L M N O
P Q R S T
U V W X Y

00 01 02 03 04
10 11 12 13 14


*/


public class Test094
{
	public static void main(String[] args)
	{
		//�迭 ����
		char[][] alpabet = new char[5][5];
		//���� ����
		char ch = 'A';
			//����
			for (char i = 0;i<alpabet.length;i++)
			{
				for (char j = 0;j<alpabet[i].length;j++)
				{
					//�ȿ��� char ������ ����־�� �Ѵ�
					alpabet[i][j]=ch++;
				}
			}
			for (char i = 0;i<alpabet.length;i++)
			{
				for (char j = 0;j<alpabet[i].length;j++)
				{
				System.out.printf("%2c",alpabet[i][j]);
				}
				System.out.println();
			}
	}
}

/*
 A B C D E
 F G H I J
 K L M N O
 P Q R S T
 U V W X Y
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/