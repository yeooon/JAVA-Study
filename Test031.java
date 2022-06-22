// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 문자를 하나 입력받아
// 대문자이면 소문자로, 소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는
// 프로그램을 구현한다

//실행 예)
// 한 문자 입력 : 
// A > a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 :
// a > A

// 한 문자 입력 : 
// 7 > 7

//모르겠다... 대소문자 변환... 모르겠어... 

import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		
		//변수 선언, 문자를 대문자를 받아들이든가, 소문자를 받아들이든가 하겠지? 그리고 숫자도?
		//한 문자 System.in.read()
		//연산값이 필요해졌지?
		//소문자를 입력했을때 대문자로, 대문자를 입력했을 때 소문자로, 그게 아닐 시 숫자로
		//연산값을 모르겠슈... 

		char ch, result;

		System.out.print("한 문자 입력 : ");

		ch = (char)System.in.read(); //데이터 받아오기

		result = (ch>='A' && ch<='Z') ? (char)(ch+32) : (ch>='a' && ch<='z' ? (char)(ch-32) : ch);
		//데이터 연산 및 처리
		// (오류)
		//ch>='a' && ch=<'z 등호 하나 틀려서 박살났다. 
		// A는 65, Z는 90,  a는 97, z는 122
		// 알파벳 대문자니 ? (응)알파벳 소문자로 변환 : (아니)(알파벳 소문자니 ? 알파벳 대문자) : (아니) 있는 그대로 처리

		System.out.println("결과 : " + result);

		/*
		int temp;

		System.out.print("한 문자 입력 : ");

		temp = System.in.read();
		
		System.out.println("입력받은 값 확인 : " +temp);
		
		String result = temp >= 65 && temp=<90 ? "대문자" : "대문자아님";
		
		System.out.println("결과 : " + result);
		*/

		//두개 이상의 조건이 등장하면 무조건 논리연산자(중요!!)
		//둘중에 하나만 만족시키면 되면 ||, 둘 다 만족시켜야 하면 &&


		//버퍼리더는 언제 쓰는 거지?
		//그냥 스캐너로 연습해버려? 
		//시스템 리드는 또 언제 쓰는 거야?
		


	}

}