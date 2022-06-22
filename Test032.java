
//조건 연산자 == 삼항 연산자

//사용자로부터 임의의 연도를 입력받아
//입력받은 연도가 윤년인지 평년인지 판별하여
//그 결과를 출력하는 프로그램을 구현한다.
//단, 입력은 BufferedReade의 readLine을 활용하고
//조건 연산자를 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2021 > 윤년 / 2022년 > 평년

// 2월이 28일까지 있는 해 > 평년
// 2월이 29일까지 있는 해 > 윤년
// 윤년의 판별 조건
// 연도가 4의 배수이면서 100의 배수가 아니거나
// 400의 배수이면 윤년이다. 
// 그렇지 않은 나머지는 평년이다

// 연도가 4의 배수입니까 ? (응)윤년 : (아니)(100의 배수입니까 ? 윤년 : (아니) 400의 배수 ? 응(윤년) : (아니) 평년)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 임의의 숫자를 입력
		int temp;
		String result; //결과값이 문자열이다.

		// 연산하기
		// 연도가 4의 배수이면서 100의 배수가 아닙니까 ? (응) 윤년 : (아니) 400의 배수입니까 ? (응) 윤년 : (아니) 평년
		// 연도가 4의 배수입니까 ? (응)윤년 : (아니)(100의 배수입니까 ? 윤년 : (아니) 400의 배수 ? 응(윤년) : (아니) 평년)
		// 4의 배수이면서 100의 배수가 아닌 것 
		// 4의 배수 temp%4==0 && temp%%100!=0 || tmep%400==0
		// result = (temp%4==0) ? "윤년" : (temp%%100||0) ? "윤년" : (temp%%400==0) ? "윤년" : "평년";
		// 연도가 4의 배수이면서 100의 배수가 아니고 400의 배수입니까 ? 
		// 출력하기

		System.out.print("임의의 연도 입력 : "); // 임의의 연도를 입력하세요

		temp = Integer.parseInt(br.readLine()); // 외부로부터 값을 받아야겠죠?

		//연도가 4의 배수이면서 100의 배수가 아니거나 400의 배수이면 윤년이고. 아니면 평년이다.
		//(temp%4==4) && (temp%100!==0) ? "윤년" : (temp%400==400) ? "윤년 : "평년";

		result = (temp%4==0) && (temp%100!=0) || (temp%400==0) ? "윤년" : "평년"; //연산을 해야겠죠?

		System.out.printf("%d → %s",temp,result);


		// 런타임 에러 떴다...
		// 런타임 에러 뜬 이유는 %d를 d%로 바꿔써서 그럼 시팔



	}
}