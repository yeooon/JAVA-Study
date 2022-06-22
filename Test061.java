
//다중 for문 반복문 중첩을 활용한 구구단 출력 실습
/*
for
반복문
{
반복문
{
}
}
/*
[2단]
2*1=2
2*2=4
 :
2*9=18

[3단]
...
9*9=81
계속하려면 아무 키나 누르세요...
*/

public class Test061
{
	public static void main(String[] args)
	{
		int i,j; //루프 변수

		for (i=2 ; i<=9 ; i++) //단 처리 (포장)
		{
			System.out.printf("\n===[%d단]===\n",i);
			
			//숑숑숑
			for (j=1;j<=9;j++) //내용물 처리 (내용물)
			{
			System.out.printf("%d * %d = %d%n", i, j, (i*j));
			}
		}
	}
}
/*
