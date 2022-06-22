
/*==========================================
  ■■■ 자바의 기본 입출력(I/O) 처리 ■■■
============================================*/

// Reader Writer 실습

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class Test178
{
	public void process(InputStream is) //System.in
	{
		int data;

		System.out.println("문자열 입력(종료:Ctrl+z)");

		try
		{
			// 매개변수 ist 라는 바이트 기반 객체(InputStream)를
			// 문자 스트림으로 변환하여
			// (→ InputStreamReader 가 수행)
			// Reader 타입의 rd 에서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is); //문자 기반의 입력 스트림

			// 바이트 기반 스트림의 자바 기본 출력 스트림(System.out)을
			// 문자 스트림으로 변환하여
			// (→ OutputStreamWriter 가 수행)
			// Write 타입의 wt 에서 참조할 수 있도록 처리

			Writer wt = new OutputStreamWriter(System.out); //문자 기반의 출력 스트림 

			while ((data = rd.read()) != -1)
			{
				wt.write(data); //-- 내보내는 스트림 물줄기에 기록
				wt.flush();		//-- 기록한 스트림을 밀어내어 내보냄
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args)
	{
		Test178 ob = new Test178();
		ob.process(System.in);
	}
}

/*
문자열 입력(종료:Ctrl+z)
1234
1234
qewrt
qewrt
가나다라
가나다라
*/