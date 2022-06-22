
//사용자로부터 임의의 정수 5개를 입력받아
//짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
//단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

//실행 예
//임의의 정수 5개 입력 : 1 2 3 4 5 
//짝수의 합은 6이고, 홀수의 합은 9입니다.
//계속 하려면 아무 키나...

import java.util.Scanner;

public class Test040
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e; //주요 변수 선언
		int A =0; //짝수합 (누적 곱은 일반적으로 1로 초기화)
		int B =0; //홀수합

		System.out.print("임의의 정수 5개 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		//짝수의 합은 , 홀수의 합은
		//짝수 홀수를 나누고 짝수끼리 더하고, 홀수끼리 더하기
		//논리연산 환-장

		//a가 짝수일 때 A값을 a만큼 증가
		//a가 홀수일 때 B값을 a만큼 증가
		//반복...

		if (a%2==0)//a가 짝수라면 2
			A+=a; //A를 a만큼 증가시켜라 2
		else //나머지라면
			B+=a; //B를 a만큼 증가시켜라
		if (b%2==0)
			A+=b;
		else
			B+=b;
		if (c%2==0)
			A+=c;
		else
			B+=c;
		if (d%2==0)
			A+=d;
		else
			B+=d;
		if (e%2==0)
			A+=e;
		else
			B+=e;		
			System.out.printf("짝수의 합은 %d이고, 홀수의 합은 %d입니다.",A,B);

	}

}