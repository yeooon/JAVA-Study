
//과제
// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 문자를 하나 입력받아
// 대문자이면 소문자로, 소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 입력 오류 처리하는 프로그램을 구현한다.

//실행 예)
// 한 문자 입력 : 
// A > a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 :
// a > A

// 한 문자 입력 : 
// 입력 오류~~!!

// char 값이 등장하면 result 값도 함께 등장하는 것 같음.

import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		char ch;  //문자를 받음
		char result; //결과값임

		System.out.print("한 문자 입력 : "); 
			ch = (char)System.in.read();  //사용자가 문자를 입력할 수 있도록 함

		if (ch>='A'&& ch<='Z') //대문자 값을 읽어들임
		{
			result = (char)(ch + 32); //소문자 치환
			System.out.printf("%c → %c%n",ch,result);
		}
		else if (ch>='a' && ch<='z') //나머지 문자에서 소문자 값을 읽어들임
		{
			result = (char)(ch - 32);  //대문자 치환
			System.out.printf("%c → %c%n",ch,result);
		}
		else //나머지는 오류 취급
		{
		System.out.println("입력 오류~");
		}

	
	}
}

/*
한 문자 입력 : e
e → E
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : 4
입력 오류~
계속하려면 아무 키나 누르십시오 . . .
*/