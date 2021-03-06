
//과제 if ~ else
//사용자로부터 임의의 알파벳 한 문자를 입력받아
//이를 반별하여 입력받은 알파벳이 모음일 경우만
//결과를 출력하는 프로그램을 구현한다.
//단 대소문자를 모두 적용할 수 있도록 처리한다.
//또한, 알파벳 이외의 문자가 입력되었을 경우
//입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

//실행 예)
//임의의 알파벳 한 문자 입력 : A
//>>모음 ok~!
//계속하려면 아무 키나...

//임의의 알파벳 한 문자 입력 : e
//>>모음 ok~!
//계속하려면 아무 키나...

//모음을 제외한 임의의 한 문자 입력 : 1
//>> 입력 오류~~!!

import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		char ch;

		System.out.print("임의의 알파벳 한 문자를 입력하라 : ");
		ch = (char)System.in.read();

		if (ch==65||ch==69||ch==73||ch==79||ch==85||ch==87||ch==89) //대문자 모음을 읽어들임
		// 알파벳 중 모음이라면(AEIOUYW 65, 69, 73, 79, 85, 87, 89)
		System.out.printf(">>%s → 모음~!\n", ch);

		else if (ch==97||ch==101||ch==105||ch==111||ch==117||ch==119||ch==121) //소문자 모음을 읽어들임
		//소문자 모음은 (aeiouyw 97, 101, 105, 111, 117, 119, 121)
		System.out.printf(">>%s → 모음~!\n", ch);

		else
		System.out.println("입력 오류~~!");
	}
}
/*
임의의 알파벳 한 문자를 입력하라 : r
입력 오류~~!
계속하려면 아무 키나 누르십시오 . . .

임의의 알파벳 한 문자를 입력하라 : u
>>u → 모음~!
계속하려면 아무 키나 누르십시오 . . .
*/