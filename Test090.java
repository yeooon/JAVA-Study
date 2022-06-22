//배열의 배열

//배열의 배열을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
 1 2 3 4 5 i=0
 5 1 2 3 4 i=1
 4 5 1 2 3 i=2
 3 4 5 1 2 i=3
 2 3 4 5 1 i=4

	<좌표>
 00 01 02 03 04  i=0
 10 11 12 13 14	(방을 이용하는 순서를 바꾼 것)
 20 21 22 23 24
 30 31 32 33 34
 40 41 42 43 44
 
 규칙을 발견해야 한다
*/


public class Test090
{
	public static void main(String[] args)
	{
		//담아내는 반복문

		int[][] num = new int[5][5]; //배열 만들었슈

		int n; //변수 

		for (int i=0;i<num.length;i++)
		{
			n=1-i;//i값을 빼고 어떻게 5로 복귀시키지?
			//만약 n이 0일시 무한루프 돌려?

			for (int j=0;j<num[i].length;j++)
			{
				num[i][j]=n;
				if (n<1) //n값이 1보다 작을때
				{
					num[i][j]+=5; //배열을 5만큼 증가
				}
				n++;
			/*
			for (int j=i, n=1;n<=5;n++) 
				
			{
				num[i][j]=n;
				j++;
				if (j==5) //n값이 1보다 작을때
				{
					j=0; //배열을 5만큼 증가
					//System.out.print(i+"-"+j+"   ");
				}

			
			*/
			
			}
		}

		
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