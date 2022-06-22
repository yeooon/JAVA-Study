
/*==========================================
  ■■■ 자바의 기본 입출력(I/O) 처리 ■■■
============================================*/

// Reader 실습

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test176
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.im : 자바 표준 입력 스트림 → 바이트 기반 스트림
		// InputStreamReader :  바이트를 문자로 바꿔주는 역할 수행
		// Reader : 문자 기반 스트림 객체

		Reader rd = new InputStreamReader(System.in);

		System.out.println("문자열 입력(종료:ctrl+z)");

		while ((data = rd.read()) != -1)
		{
			ch = (char)data;

			//System.out.print(ch);
			/*
			문자열 입력(종료:ctrl+z)
			asdf
			asdf
			1234
			1234
			가나다라
			가나다라
			*/

			System.out.write(ch);
			/*
			문자열 입력(종료:ctrl+z)
			asdf
			asdf
			1234
			1234
			가나다라
			 섆|
			*/
		}
	}
}