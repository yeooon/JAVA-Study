
//반복문 while 실습

//1부터 100까지의 정수 중에서
//짝수들의 합을 계산하여 결과값을 출력하는 프로그램을 구현한다.
//단, 조건문을 사용하지 않도록 하며, while 반복문을 활용하여 작성할 수 있도록 한다.

//1부터 100까지의 수 중 짝수의 합 : xxxx

public class Test047
{
	public static void main(String[] args)
	{
		int a=2; //주요 변수 및 초기화
		int result=0; //누적 합
		//연산 및 처리(반복연산)
			while (a<=100) 
			{
				result+=a; //결과값을 2만큼 증가
				a+=2; //a값을 2만큼 증가 = 4
			}
				System.out.print("1부터 100까지의 수 중 짝수의 합 : " + result);
	}

}