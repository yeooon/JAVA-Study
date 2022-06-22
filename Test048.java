
//반복문 실습
//1부터 100까지의 정수 중에서
//짝수들의 합과 홀수들의 합을 따로 구분하여 계산한다.
//그리고 결과값을 출력하는 프로그램을 구현한다.
//단, 반복문은 while문을 사용할 수 있도록 하며,
//조건 구분은 if 조건문을 사용하여 작성할 수 있도록 한다.

//1부터 100까지의 정수 중
//짝수의 합 : 2550
//홀수의 합 : 2500
//계속하려면...

public class Test048
{
	public static void main(String[] args)
	{
		int a=0; //1부터 100까지 1씩 증가할 변수
		int result = 0; //짝수 누적합
		int result2 = 0; //홀수 누적합

		//연산 및 처리
		// 반복문 안에서 조건문이 나와야 했구나!!!!

		while (a<=100)
		{	
			if (a%2==0) //짝수라는 뜻이지
			{
			result += a; 
			}
			else if (a%2!=0) //홀수라는 뜻이지
			{
			result2 += a;
			}
			else
			{
				System.out.print("판별할 수 없는 데이터");
					return;
			}
				a++;
		}
	System.out.println("1부터 100까지의 정수 중");
	System.out.println("짝수의 합 : " +result);
	System.out.println("홀수의 합 : " +result2);
	}
}