// 변수와 자료형
// 자바의 기본 입출력 : BufferedReader 클래스

// 원의 반지름을 입력하세요 라고 뜨게 만들자!
// 입력하자! 
// Enter >> 결과가 나온다!

//import java.in.BufferedReader; // 입력기
//import java.io.InputStreamReader; // 번역기
//import java.io.IOException;  // 위기 상황 메뉴얼

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test014
{
	public static void main (String[] args) throws IOException //(동거 각서같은 거임)
	{
		//키보드 장착(생성)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//문자 입력을 읽어들이는 장치
		//-------------------------------------바이트 번역기
		//-----------------------------------------------------------바이트 입력값
		//

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
// in이라는 바이트 기반의 키보드에서 쓴 말을 인풋스트림이 번역해서 버퍼리더에게 전달
// br.readLine();


	// 주요 변수 선언
	int r;   // 반지름
	final double PI = 3.141592;  // 원주율
	double a, b; // 넓이, 둘레


	// 연산 및 처리
	//1. 사용자에게 안내 메세지 출력
	System.out.print("원의 반지름 입력 : ");
	

	//2. 사용자가 입력한 값을 받아와 반지름 변수 r에 담아내기
	//r = br.readLine(); 이건 안됨. 왜냐면 문자열로 받아들임.
	//r = "80";이렇게.

	//그래서
	//r = Integer.parseInt(br.readLine()); 이걸 이용하면
	//r = Integer.parseInt("80"); 숫자로 받아들이게 됨.
	//r = 80  // 이렇게. 다만 문자로 입력하면 안됨

	r = Integer.parseInt(br.readLine());
	// 사용자가 입력한 값을 버퍼리더의 리드라인으로 읽어옴
	// 메소드를 활용하여 문자열 형태로 읽어들인 뒤
	// 그 값을 인트저로 통해 정수 변환
	// 정수 형태의 반지름 변수 r에 담음! 완성!

	//3. 넓이 및 둘레 계산(연산)
	a = r * r * PI;
	b =	r * 2 * PI;

	// 결과 출력
	System.out.println(">> 넓이 : " + a);
	System.out.println(">> 둘레 : " + b);

	System.out.printf(">> 반지름이 %d인 원의 넓이는 %.2f이다.",r,a);  //%의 개념이 궁금함 
	System.out.printf("\n>> 반지름이 %d인 원의 둘레는 %.2f이다.",r,b);

	
	}
}

/*
원의 반지름 입력 : 45
>> 넓이 : 6361.723800000001
>> 둘레 : 282.74328
계속하려면 아무 키나 누르십시오 . . .
*/

/*
Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '인'
        at java.util.Formatter.checkText(Formatter.java:2579)
        at java.util.Formatter.parse(Formatter.java:2555)
        at java.util.Formatter.format(Formatter.java:2501)
        at java.io.PrintStream.format(PrintStream.java:970)
        at java.io.PrintStream.printf(PrintStream.java:871)
        at Test014.main(Test014.java:68)
*/

//런타임 에러 떴어...!! %이거 원인 같은데 왜 그러는 거지?