//배열의 배열

//과제

//배열의 배열(다차원 배열)을 활용하여
//다음고 ㅏ같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
A
C B
D E F
J I H G
K L M N O
거꾸로네 십팔...

00 
02 01 i가 짝수로 나뉘는 부분은 
20 21 22
33 32 31 30
40 41 42 43 44

*/


public class Test096
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
				if (i%2==0)
				{
					arr[j][i]+=ch++;
				}
				else
				{
					arr[j-3][i]+=ch++;
				}
			}
		}

		for (int i=0;i<5;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.printf("%c",arr[j][i]);
			}
		System.out.println();
		}
	}
}