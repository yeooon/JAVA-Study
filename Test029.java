// 조건 연산자 == 삼항 연산자

/*
피연산자 ? 피연산자 : 피연산자
------------------------------
  1항		 2항		3항

1항의 연산 결과 >> true >> 2항 수행
                >> false >> 3항 수행
*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램을 구현한다.
// 단, 조건연산자(삼항연산자)를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 :
// ==[판별 결과]==
// 255 >> 홀수
//================
//계속 하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 

		int n;
		String strResult; // 홀수인지 짝수인지 판별 결과를 담게 될 변수 

		// 연산 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		//홀수인지 짝수인지 구분
		//______?______:______;
		// 수식1  수식2  수식3

		//수식 1 : 참(true) 또는 거짓(false)을 반환할 수 있는 수식 형태로 작성
		//수식 2 : 수식 1의 처리 결과가 참(true)일 경우 수행하는 영역
		//수식 3 : 수식 1의 처리 결과가 거짓(false)일 경우 수행하는 영역

		//입력받은 정수(n)가 홀수인지 짝수인지 확인하기 위한 연산
		// >> n을 2로 나누어서 나머지가 얼마인지 보면 됨.
		// 나머지가 0이면 짝수, 0이 아니면 홀수
		
		// 최종 결과 출력
		strResult = (n%2==0) ? "짝수" : "홀수";   // %은 나눗셈?
		// n을 2로 나눴을 때 0이면 짝수, 아닐시에 홀수
		System.out.println("==[판별 결과]==");
		System.out.printf("%d > %s\n",n,strResult);
		// %s\n이라고 하는 걸까? s는 실수 아닌가?

	}
}