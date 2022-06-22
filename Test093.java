//배열의 배열

//배열의 배열을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
 1  2  3  4  10 i=0 1+2+3+4 = 10
 5  6  7  8  26 i=1
 9  10 11 12 42 i=2
 13 14 15 16 58 i=3
 28 32 36 40 136

00 01 02 03 04
10 11 12 13 14
20 21 22 23 24

*/


public class Test093
{
	public static void main(String[] args)
	{
		//배열
		int n = 0;

		int[][] num = new int[5][5]; //

		for (int i = 0;i<5;i++)
		{
			int sum = 0; //가로 누적합
			int vem = 0; //세로 누적합

			for (int j = 0 ; j<5 ; j++)
			{
				if (j<4)
				{
					n++;
					num[i][j]=n;
					sum+=n; //썸값을 계속 누적하라고...
					vem+=n;
				}
				//i가 4일때 벰을 넣어라
				else if (i>3)
				{
					num[i][j]=vem;
				}

				else //j가 4인 경우에는 썸을 넣어라 
				{
					num[i][j]=sum;
				}
			}
		}
	
		for (int i = 0;i<4;i++)
		{
			for (int j = 0;j<5;j++)
			{
				System.out.printf("%3d",num[i][j]);
			}
		System.out.println();
		}
	}
}

//i를 4로 바꾸면 행이 한 개가 사라지고, j를 4로 바꾸면 열이 한 개 사라진다 