
//삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
//이 삼각형의 넓이를 구현하는 프로그램을 구현한다.
//실행 예
// ★삼각형의 넓이 구하기★
// - 삼각형의 밑변 입력 :
//(엔터) - 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxx
// 계속 하려면 아무 키나...

// ※문제 인식 및 분석
// 삼각형의 넓이 = 밑변 * 높이 / 2
// 사용자로부터 데이터를 입력받아 처리 > BufferedReader 활용

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*; (자바 상자 안에 있는 모든 것)
//모든 거라서 비효율적일 수 있다.

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		//키보드 장착
		//버퍼리더 불러올거야 = 새로운 버퍼리더를 불러올거야(새로운 번역기도(시스템 안에서)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//주요 변수 선언
		int r;
		int l;
		double a; //이건 대략 식 적어넣는 걸로 사용중

		//결과 출력
		System.out.println("★삼각형의 넓이 구하기★");
		System.out.print("-삼각형의 밑변 입력 : ");
		r = Integer.parseInt(br.readLine()); //외부로부터 값을 받음 
		System.out.print("-삼각형의 높이 입력 : ");
		l = Integer.parseInt(br.readLine()); //외부로부터 값을 받음 
		
		//넓이 구하는 연산 
		
		//a = (r * l) / 2;
		a = r * l / 2.0; // 실수로 된 결과값을 보려면 식 중 아무거나라도 실수가 있어야 함
		// 나눗셈 연산이 있다면 여러 각도로 고민해야 함
		// 정수 기반의 연산은 몫을 취하고 나머지를 버리게 될 수 있음
		System.out.println(); // = 요 밑에 \n으로 시작해도 됨)
		System.out.printf(">> 밑변이 %d, 높이가 %d 인 삼각형의 넓이 : %.2f\n", r, l, a);

		//System.out.printf(">> 밑변이 %, 높이가 % 인 삼각형의 넓이 : ", a);


// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxx


/*
어질어질하다 왜 안됨
Test015.java:16: error: <identifier> expected
import.java.io.BufferedReader;

해결됨 개같은 . 붙어있어서 그랬음 
*/		

/*
Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = ','
        at java.util.Formatter.checkText(Formatter.java:2579)
        at java.util.Formatter.parse(Formatter.java:2565)
        at java.util.Formatter.format(Formatter.java:2501)
        at java.io.PrintStream.format(PrintStream.java:970)
        at java.io.PrintStream.printf(PrintStream.java:871)
        at Test015.main(Test015.java:44)
*/

/*
에러 났는데 순서 오류로 이니셜라이즈를 못해서 난 오류였음
*/

	}


}