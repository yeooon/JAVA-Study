//�迭�� �迭

//�迭�� �迭�� Ȱ���Ͽ�
//������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
/*
 E J K S X
 D I N R W i=0
 C H M Q V i=1
 B G L P U i=2
 A F K O T i=3
	<����>
 00 01 02 03 04
 10 11 12 13 14
 20 21 22 23 24
 30 31 32 33 34
 40 41 42 43 44
	<��ȭ>
 ij
 04 14 24 34 44  
 03 13 23 33 43
 02 12 22 32 42
 01 11 21 31 41
 00 10 20 30 40
 */

public class Test092
{
	public static void main(String[] args)
	{
		//�迭�� ������
		char[][] alpa = new char[5][5]; //���� �迭
		char ch = 'A'; //���� ����

		for (int i=0 ; i<5 ; i++) //i�� 0���� ������ �����ϸ鼭, j�� �����Ѵ�. 
		{
			for (int j=4 ; j>=0 ;j--) //���� ���� 
			{
				alpa[i][j]=ch++; //���ι迭�� ���η� �ٲ�!!
			}
		}

		for (int i=0 ; i<5 ; i++)
		{
			for (int j=0 ; j<alpa[i].length ;j++,ch++)
			{
				System.out.printf("%3c",alpa[j][i]); //�̷��� ����ϸ� ���ι迭�� ���η� �ٲ�!!
			}
		System.out.println();
		}
	}
}

/*
incompatible types: int cannot be converted to boolean
                        for (int j=0 ; alpa[i].length ;j++,ch++)
*/