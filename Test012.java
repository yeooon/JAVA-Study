//퀴즈
//사전에 부여된 반지름 정보를 통해
//원의 넓이와 둘레를 구하는 프로그램을 구현하라
// 반지름 : 10
//실행 예)
// 넓이 : xxxx
// 둘레 : xxxx
// 계속하려면 아무 키나 누르세요...

public class Test012
{
	public static void main (String[] args)
	{
		//넓이 반지름 x 반지름 x 3.141592
		//둘레 둘레 x 2 x 3.141592

/*	//인트로 변수 선언해서 출력물에 공식을 적는 법
		int A = 10;
		System.out.println("넓이 : " + A * A * 3.141592);
		System.out.println("둘레 : " + A * 2 * 3.141592);

		//프린트 엔엘(공백)
		System.out.println("  ");

		//변수 자체에 공식을 적어 출력하는 법
		double B = A * A * 3.141592;
		double C = A * 2 * 3.141592;

		System.out.println("넓이 : " + B);
		System.out.println("둘레 : " + C);
*/

		//함께 풀이한 내용========================

		int r = 10;			//반지름
		double PI = 3.141592;	// 원주율
		// 변수는 시시각각 숫자가 변할 수 있기 때문에 일일이 코드 수정 안 하려면
		// 변수로 설정해두는 게 편할 것 같다.

		// ※"final" 키워드 : 변수의 상수화(변수 맨 앞에 붙이면 됨)
		// ex) final int r = 10;
		// 파이널 변수는 대문자로 쓴다(암묵적 약속이라서요)
		// final int R = 10;
		// final int rainbowcolor; > RAINBOW_COLOR;

		double area, lenght; // 원의 넓이와 변수

		area = r * r * PI;
		lenght = r * PI * 2;

		// 연산 및 처리
		// 한글로 정리한 다음 치환하는 방식으로 코딩
		// 극한까지 변수화, 정돈?

		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + lenght);

		System.out.printf("넓이 : %.2f%n", area);
		System.out.printf("둘레 : %.2f%n", lenght);

// 퍼센트 표시를 왜 하는지 복습해야함 왜냐면 기억이 안남


/*
넓이 : 314.1592
둘레 : 62.83184

넓이 : 314.1592
둘레 : 62.83184
넓이 : 314.1592
둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .
*/


	}
}