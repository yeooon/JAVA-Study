//배열의 배열

//배열의 배열을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
 E J K S X
 D I N R W i=0
 C H M Q V i=1
 B G L P U i=2
 A F K O T i=3
	<원본>
 00 01 02 03 04
 10 11 12 13 14
 20 21 22 23 24
 30 31 32 33 34
 40 41 42 43 44
	<변화>
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
		//배열을 만들자
		char[][] alpa = new char[5][5]; //문자 배열
		char ch = 'A'; //문자 변수

		for (int i=0 ; i<5 ; i++) //i는 0부터 시작해 증가하면서, j는 감소한다. 
		{
			for (int j=4 ; j>=0 ;j--) //변수 감소 
			{
				alpa[i][j]=ch++; //가로배열이 세로로 바뀜!!
			}
		}

		for (int i=0 ; i<5 ; i++)
		{
			for (int j=0 ; j<alpa[i].length ;j++,ch++)
			{
				System.out.printf("%3c",alpa[j][i]); //이렇게 출력하면 가로배열이 세로로 바뀜!!
			}
		System.out.println();
		}
	}
}

/*
incompatible types: int cannot be converted to boolean
                        for (int j=0 ; alpa[i].length ;j++,ch++)
*/