
//�迭�� �迭

//�迭�� �迭�� Ȱ���Ͽ�
//������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
/*
 1 2 3 4 5 i=0
 2 3 4 5 6 i=1
 3 4 5 6 7 i=2
 4 5 6 7 8 i=3
 5 6 7 8 9 i=4

 00 01 02 03 04  i=0
 10 11 12 13 14
 20 21 22 23 24
 30 31 32 33 34
 40 41 42 43 44
 
 ��Ģ�� �߰��ؾ� �Ѵ�
*/


public class Test089
{
	public static void main(String[] args)
	{
		//��Ƴ��� �ݺ���
		
		int[][] num = new int[5][5]; //���� ����
		int n; //���� n��
		for (int i=0;i<num.length;i++) //��~
		{
			n=1+i;

			for (int j=0;j<num[i].length;j++) //������
			{
				num[i][j]=n;
				n++;
			}
		}

		//���

		for (int i=0;i<num.length;i++)
		{
			for (int j=0;j<num[i].length;j++)
			{
				System.out.printf("%2d",num[i][j]);
			}
			System.out.println();
		}

	}
}