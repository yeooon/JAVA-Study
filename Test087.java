/*===============
 �ڡڡڹ迭�ڡڡ�
 ================*/
 //�迭�� �⺻�� Ȱ��
 //�迭�� �迭(2���� �迭)

public class Test087
{
	public static void main(String[] args)
	{
		//�迭�� �迭 ����� �ʱ�ȭ
		//��� 1.
		//int[] arr1 = new int[3];
		//int[][] arr = new int[3][3];

		//arr1[0] = 1;
		/*
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		*/

		//��� 2.
		//int[] arr2 = {1,2,3};
		//int[][] arr2 = {{1,2,3},{4,5,6}{7,8,9}};//arr2�� length �� 3�̴�, 0��° ���� length�� 3
		
		//��� 3. = ��Ƴ��� �ݺ���
		int[][] arr3 = new int[3][3];
		int n=1;
		for (int i=0 ; i<arr3.length ;i++ ) // ��~~~	0       1       2
		{
			for (int j=0;j<arr3[i].length;j++)//��~��~��  0  1  2  0  1  2
			{
				//�׽�Ʈ
				//System.out.println("i : "+ i + "j : "+ j );

				arr3[i][j] = n;
				n++;
			}
		}
		//�迭�� �迭 ��� ��ü ���
		for (int i=0;i<arr3.length;i++)
		{
			for (int j=0;j<arr3[i].length;j++)
			{
				System.out.printf("%2d",arr3[i][j]);
			}
		System.out.println();
		}

			
	}
}