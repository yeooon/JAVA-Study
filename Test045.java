
//switch문 실습
//사용자로부터 임의의 두 정수와 연산자를 입력받아
//해당 연산자의 처리 결과를 출력하는 프로그램을 구현한다.
//단, switch문을 활용하여 처리할 수 있도록 하며,
//연산 결과는 편의상 정수 형태로 처리할 수 있도록 한다.

// 실행 예)
//첫 번째 정수 입력 : 3
//두 번째 정수 입력 : 17
//연산자 입력[+ - * /] : -
//3-17 = -14

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test045
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,result; // C는 연산자 / 결과값도 넣으면 밑의 식이 좀 더 단순해짐. 

		System.out.print("첫 번째 정수 입력 : ");
			a= Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
			b= Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		c = System.in.read();

		//정수형태로 받았으면... 
		// + > c:43 , - 45, * 42, / 47
		// 스위치 케이스에 상수 문자 문자열도 들감
/*
switch (c)
{
case 43 : result = a + b;break;
case 45 : result = a - b;break;
case 42 : result = a*b;break;
case 47 : result = a/b;break;
default : return;
}
System.out.println("");
System.out.printf(">> %d %c %d = %d%n", a, c, b, result);
*/

		int a,b,result
		char c //연산자
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		c = (char)System.in.read();

		switch (c)
		{
		case '+': result = a+b; break;
		case '-': result = a-b; break;
		case '*': result = a*b; break;
		case '/': result = a/b; break;
		default : return;
		System.out.println("");
		System.out.printf(">> %d %c %d = %d%n", a, c, b, result);

		}
	}
}


//default : return; //1.값의 반환 return(이값반환) 
				  //2.메소드 종료 → main() 메소드 종료 → 프로그램 종료