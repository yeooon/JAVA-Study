//배열의 배열

//과제

//배열의 배열(다차원 배열)을 활용하여
//다음고 ㅏ같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
A B C D E 
F G H I J
K L M N O
P Q R S T
U V W X Y

00 01 02 03 04
10 11 12 13 14


*/


public class Test094
{
	public static void main(String[] args)
	{
		//배열 구성
		char[][] alpabet = new char[5][5];
		//변수 선언
		char ch = 'A';
			//범위
			for (char i = 0;i<alpabet.length;i++)
			{
				for (char j = 0;j<alpabet[i].length;j++)
				{
					//안에다 char 관련을 집어넣어야 한다
					alpabet[i][j]=ch++;
				}
			}
			for (char i = 0;i<alpabet.length;i++)
			{
				for (char j = 0;j<alpabet[i].length;j++)
				{
				System.out.printf("%2c",alpabet[i][j]);
				}
				System.out.println();
			}
	}
}

/*
 A B C D E
 F G H I J
 K L M N O
 P Q R S T
 U V W X Y
계속하려면 아무 키나 누르십시오 . . .
*/