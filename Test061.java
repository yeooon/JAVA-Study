
//���� for�� �ݺ��� ��ø�� Ȱ���� ������ ��� �ǽ�
/*
for
�ݺ���
{
�ݺ���
{
}
}
/*
[2��]
2*1=2
2*2=4
 :
2*9=18

[3��]
...
9*9=81
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test061
{
	public static void main(String[] args)
	{
		int i,j; //���� ����

		for (i=2 ; i<=9 ; i++) //�� ó�� (����)
		{
			System.out.printf("\n===[%d��]===\n",i);
			
			//������
			for (j=1;j<=9;j++) //���빰 ó�� (���빰)
			{
			System.out.printf("%d * %d = %d%n", i, j, (i*j));
			}
		}
	}
}
/*
