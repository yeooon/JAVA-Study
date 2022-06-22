

// 자바의 기본 입출력 : System.in.read()

/*
System.in.read() 메소드는 한 문자만 가져온다
단, 입력받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
아스키 코드 값으로 반환한다.
*/

//실행 예
//한 문자 입력 : A
//한 자리 정수 입력 : 8

// 입력한 문자 : A
// 입력한 정수 : 8
// 계속하려면 아무 키나...

import java.io.IOException;

public class Test017
{
	public static void main(String [] args) throws IOException

	{
		//주요 변수 선언
		char ch;
		int num;

		//추가 변수 선언
		//char temp;


		//사용자에게 안내 메세지 출력
		System.out.print("문자 하나 입력하세요 : ");  //A
		
		ch = (char)System.in.read();				//자동 형변환 법칙에 위배

		//입력 대기열에 남아있는 \r과 \n을 스킵해라(=엔터 건너 뛰어라)

		System.in.skip(2);

		//매개변수 2에 의해 두 글자를 읽지 않고 건너뛴다. 

		System.out.print("숫자 하나 입력하세요 : ");

		num = System.in.read();		//이렇게 진행하면 숫자 코드값으로 출력

		//입력받은 n을 48만큼 감소시켜라
		//규칙을 찾아내고 이용하는게 알고리즘
		num -= 48;  //num을 48만큼 감소시켜라.
		//숫자로 안해도 되고, 글자로 해버려도 괜찮. temp

			// 결과 출력

			System.out.println("  ");

			System.out.println("입력한 문자 : " + ch);

			System.out.println("입력한 숫자 : " + num);

			/*

			System.out.printf("입력한 문자 : d%", ch);

			System.out.printf("입력한 숫자 : d%", num);
			
			*/

/*
문자 하나 입력하세요 : f
숫자 하나 입력하세요 : 4


입력한 문자 : f
입력한 숫자 : 4
계속하려면 아무 키나 누르십시오 . . .

*/


	}
}