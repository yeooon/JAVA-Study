
//산술 연산자
//BufferedReader
//printf()

//사용자로부터 임의의 정수를 두 번 입력받아
//사칙연산 및 나머지 연산을 수행하여
//그 결과를 출력하는 프로그램을 구현한다.
//단, 입력받는 과정은 BufferedReader를 활용할 수 있도록 한다.
//출력하는 과정은 printf() 메소트를 활용할 수 있도록 한다.
//또한 나눗셈 연산은 편의상 정수 기반으로 처리한다.

// 실행 예)
// 첫 번째 정수 입력 :
// 두 번째 정수 입력 :

//===[결과]===
//10 + 2 = 12
//10 - 2 = 8
//10 * 2 = 20
//10 / 2 = 5
//10 % 2 = 0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test023
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 변수입력

		int a, b;
		int A, B, C, D, E;  

		// 출력
	System.out.print("\n첫 번째 정수 입력 : "); //계산할 일 없는건 걍 print로 해도 됨
		a = Integer.parseInt(br.readLine()); //Integer(메소드).parseInt(숫자 변환기)

	System.out.print("\n두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		// 연산 과정

		A = a+b;
		B = a-b;
		C = a*b;
		D = a/b;
		E = a%b;

	//System.out.println("===[결과]===");

	System.out.printf("\n===[결과]===\n");

	System.out.printf("%d + %d = %d\n", a, b, A);  //정수는 %d!!!

	System.out.printf("%d - %d = %d\n", a, b, B);  //실수는 %s!!! 

	System.out.printf("%d * %d = %d\n", a, b, C);

	System.out.printf("%d / %d = %d\n", a, b, D);

	System.out.printf("%d %% %d = %d\n", a, b, E); //%% >> %

	System.out.printf("============\n");

/*
		int a, b;
		double A, B, C, D, E;  

		// 출력
	System.out.print("\n첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

	System.out.print("\n두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		// 연산 과정

		A = a+b;
		B = a-b;
		C = a*b;
		D = a/b; //이 경우에는 '정확하게' 하라고 명시함
		E = a%b;

	System.out.println("===[결과]===");

	System.out.printf("\n%d + %d = %s", a, b, A);  //정수는 %d!!!

	System.out.printf("\n%d - %d = %s", a, b, B);  //실수는 %s!!! 

	System.out.printf("\n%d * %d = %s", a, b, C);

	System.out.printf("\n%d / %d = %s", a, b, D);

	System.out.printf("\n%d %% %d = %s\n", a, b, E);

	// 오류 수집 // Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
	// d != java.lang.Double 라는 뜻. 자바는 더블이 아니래.
	// 더블은 실수형인데, %d(정수)로 적어서 타입 오류가 난 것 

*/

		}
}