
//if문
//if ~ else 문 실습

// 정수를 입력받아 홀수/짝수 판별하는 프로그램을 구현한다.
// 단, 단일 if 구문을 사용한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수
		int a;

		System.out.print("정수를 입력하시오 : ");

		a = Integer.parseInt(br.readLine());

			if (a%2==0)
			{
				System.out.printf("%d는 짝수입니다", a);
			}
			if (a%2!=0)
			{
				System.out.printf("%d는 홀수입니다", a);
			}


/*
		int a; //
		double A; //나눈 값
			
		A = a/2;
			
			if (A=0)
			{
				A = "짝수";
			}
			else 
			{
				A = "홀수";
			}

		System.out.print("정수를 입력하시오 : ");
			a = Integer.parseInt(br.readLine());

		System.out.printf("결과 : %s", A);
*/			
	}
}