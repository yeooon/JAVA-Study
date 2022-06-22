/*===============
 ★★★배열★★★
 ================*/
 //배열의 기본적 활용
 //배열의 배열(2차원 배열)

public class Test087
{
	public static void main(String[] args)
	{
		//배열의 배열 선언과 초기화
		//방법 1.
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

		//방법 2.
		//int[] arr2 = {1,2,3};
		//int[][] arr2 = {{1,2,3},{4,5,6}{7,8,9}};//arr2의 length 는 3이다, 0번째 방의 length는 3
		
		//방법 3. = 담아내는 반복문
		int[][] arr3 = new int[3][3];
		int n=1;
		for (int i=0 ; i<arr3.length ;i++ ) // 웅~~~	0       1       2
		{
			for (int j=0;j<arr3[i].length;j++)//숑~숑~숑  0  1  2  0  1  2
			{
				//테스트
				//System.out.println("i : "+ i + "j : "+ j );

				arr3[i][j] = n;
				n++;
			}
		}
		//배열의 배열 요소 전체 출력
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