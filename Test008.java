// 변수와 자료형
//형 변환
//접미사 활용



public class Test008

{
	public static void main(String[] args)
	{
	int a;
	a = 10;
	System.out.println("a의 결과 : " + a);

	int b = 20;
	System.out.println("b의 결과 : " + b);

/*
	short c;
	c = a;
	System.out.println("c의 결과 : " + c);
	>> 에러 발생 (컴파일 에러)
*/

	short c;

// 연산 처리 및 처리(대입 연산)
// c = a;
// 에러 발생(컴파일 에러)
// 기본적으로는 자료형이 작은 것에 큰 것을 담지 못한다.(자동 형 변환 규칙 위반)

//명시적인 형 변환 (강제 형 변환)

	c = (short)a;

// 00000000 000000000 00000000 00001010 > int 형 a 변수 10
// 형 변환
// 00000000 00001010 > short 형으로 변환된 결과

// 결과

	System.out.println("C의 결과 : " + c);
// C 대문자로 썼다가 에러남 //error: cannot find symbol

//변수 선언 및 초기화
	long d = 10000000000L; // 백억
//incompatible types: possible lossy conversion from long to int // 인트로 하면 이런 에러 뜸
// 인트에서 롱으로 바꾸라는 에러

//=대입 연산자를 기준으로 우측의 상수 표현이 먼저인데, imt형 메모리에 해당 상수를 할당할 수 없기 때문에 접미사  L이 중요하다
// long형은 숫자(상수) 뒤에 L 또는 l을 붙여 상수를 표현해야 한다.
//****즉, 약 21억 이상 되는 상수에는 데이터 뒤에 접미사를 꼭 붙여 줄 수 있도록 한다

	System.out.println("d의 결과 : " + d);

	long d2 = 10;
	long d3 = 100;
	System.out.println("d2의 결과 : " + d2);
	System.out.println("d3의 결과 : " + d3);

	long d4 = 2099999999L; // 백억
	System.out.println("d4의 결과 : " + d4);
// 딱 21억이상인가봐...

	int e = 030;
	System.out.println("e의 결과 : " + e);
	//e의 결과 24
	//접두어로 0을 붙이면 8진수로 나타난다.
	
	//변수 선언 및 ㅗ기화
	int f = 0xa6;

	//결과 출력
	System.out.println("f의 결과 : " +f);
	// > f의 결과 : 166
	// 접두어 0x > 16진수

	// 0 1 2 3 4 5 6 7 8 9 a b c d e f

	//변수 선언 및 초기화
	//float g = 0.0;  //실수는 기본적으로 더블로 데이터타입이 잡힘
	float g = 0.0f;
	//결과 출력
	System.out.println("g의 결과 : " + g);


/*
a의 결과 : 10
b의 결과 : 20
C의 결과 : 10
d의 결과 : 10000000000
d2의 결과 : 10
d3의 결과 : 100
d4의 결과 : 2099999999
e의 결과 : 24
f의 결과 : 166
g의 결과 : 0.0
계속하려면 아무 키나 누르십시오 . . .
*/
	}
}