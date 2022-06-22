//배열의 배열

//과제

//배열의 배열(다차원 배열)을 활용하여
//다음고 ㅏ같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
A
B C
D E F
G H I J
K L M N O

ij
00 
10 11 
20 21 22
30 31 32 33
40 41 42 43 44

*/


public class Test095
{
	public static void main(String[] args)
	{
		char ch='A';
		//배열 구성
		char[][] arr = new char[5][5];

		for (int i=0;i<5;i++) //i가 증가할 동안 j도 i만큼만 증가한다
		{
			for (int j=0;j<=i;j++)
			{
				arr[i][j]+=ch++;
			}
		}

		for (int i=0;i<5;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.printf("%c",arr[i][j]);
			}
		System.out.println();
		}
	}
}

/*
A
BC
DEF
GHIJ
KLMNO
계속하려면 아무 키나 누르십시오 . . .
*/