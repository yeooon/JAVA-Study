//배열의 배열

//배열의 배열을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
 1 8 9 16 17 i=0
 2 7 10 15 18 i=1
 3 6 11 14 19 i=2
 4 5 12 13 20 i=3


	<좌표>

원본
ji	
 00 10 20 30 40
 01 11 21 31 41
 02 12 22 32 42
 03 13 23 33 43
바뀐 좌표
 ji
 00 13 20 33 40
 01 12 21 32 41
 02 11 22 31 42
 03 10 23 30 43

 
 규칙을 발견해야 한다
*/


public class Test091
{
	public static void main(String[] args)
	{
		//배열을 만들자
		int[][] num = new int[4][5];

		int n = 0;

		for (int i=0;i<5;i++) //웅 0 1 2 3 4
		{

			for (int j=0;j<4;j++) //숑 0 1 2 3
			{
				//System.out.print(i+"-"+j+"   ");
				n++;
				if (i%2==0) // i → 0 2 4 //짝수로 끝나는 부분은 원래대로
				{
					num[j][i]=n; 
				}
				else // i → 1   3 //홀수로 끝나는 부분은 거꾸로
				{
				num[3-j][i]=n;	// 0123 → 3210 3 2 1 0
				}
			}
		}

		//출력
		for (int i=0;i<num.length;i++) 
		{
			for (int j=0;j<num[i].length;j++) 
			{
			System.out.printf("%3d",num[i][j]); //위치가 바뀌면 가로세로가 바뀐다(지금 건드리면 값 오류 뜸)
			}
			System.out.println();
		}
		//System.out.print(num);
	}
}	