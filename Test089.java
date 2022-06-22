
//배열의 배열

//배열의 배열을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
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
 
 규칙을 발견해야 한다
*/


public class Test089
{
	public static void main(String[] args)
	{
		//담아내는 반복문
		
		int[][] num = new int[5][5]; //세로 가로
		int n; //변수 n값
		for (int i=0;i<num.length;i++) //웅~
		{
			n=1+i;

			for (int j=0;j<num[i].length;j++) //숑숑숑
			{
				num[i][j]=n;
				n++;
			}
		}

		//출력

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