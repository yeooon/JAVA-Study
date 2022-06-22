
//사용자로부터 임의의 두 정수와 연산자를 입력받아
//해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
//단, if 조건문을 활용하여 처리할 수 있도록 하며,
//연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.

//실행 예)
//첫 번째 정수 입력 : 2
//두 번째 정수 입력 : 4
//연산자 입력[+,-,*,/] : +
// >> 10 + 3 = 13

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//변수 설정
		int a,b;
		char c;

		System.out.print("첫 번째 정수 입력 : ");
			a=Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
			b=Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+,-,*,/] : ");
			c = (char)System.in.read(); //br.readLine()은 문자열! 이기 때문에 String이 먹혔다.
			// System.in.read()는 int를 읽어오는 거기때문에 형변환 

		if (c=='+') //만약 연산자가 +일때 
		{
			System.out.printf("\n%d + %d = %d",a,b,(a+b)); //맨 마지막을 몰랐어...
		}
			else if (c=='-')
		{
			System.out.printf("\n%d - %d = %d",a,b,(a-b));
		}
			else if (c=='*')
		{
			System.out.printf("\n%d * %d = %d",a,b,(a*b));
		}
			else if (c=='/')
		{
			System.out.printf("\n%d / %d = %d",a,b,(a/b));
		}
			else
				System.out.println("\n판정불가");

			/*
			int a, b, result=0로 초기화 시킨 다음에 결과값을 입력하는 형식도 있다. 

			*/

			//돌아는 가는데 내가 원하는 방향이 아니야...

// 연산자가 char인 경우엔 (char)System.in.read(); 로 형 변환
// char 이면 '' 인데(문자)
// String 이면 "" 이야(문자열)

	}
}


