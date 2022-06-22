//배열의 배열(2차원 배열)

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열(5*5)을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예
/*
1 2 3 4 5
6 7 8 9 10
	:
21 22 23 24 25

*/


public class Test088
{
	public static void main(String[] args)
	{
		//배열의 배열 선언
		//int[][] arr;
		//배열의 배열 메모리 할당
		//arr = new int[5][5];
		//=  ↓
		int[][] arr = new int[5][5]; //범위가 왜 안맞을까...


		//변수 선언 및 초기화 (//1 2 3 4 5 6... 25)증가하는 변수가 있으면 배열 구성하기 편함
			int n = 1;

		//배열의 배열을 반복문의 중첩 구문을 활용하여 구조화
		for (int i=0 ; i<arr.length ; i++) // 0     1     2      3       4 
		{
			for (int j=0 ; j<arr[i].length ; j++) //숑숑 01234 01234 01234
			{

				//  00 01 02 03 04
				//  10 11 12 13 14
				//        :
				arr[i][j] = n;
				n++;
			}
		}

		//출력
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;i++)
			{
				System.out.printf("%3d",arr[i][j]);
			}
				System.out.println();
		}
	}
}