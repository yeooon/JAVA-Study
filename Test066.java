
//반복문(for문) 실습
//다중 for문(반복문의 중첩)을 활용한 별찍기 실습

//과제
//다음과 같은 내용이 출력될 수 있도록 반복문의 중첩 구문을 작성하여 
//프로그램을 구현한다.

//실행 예
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

public class Test066
{
	public static void main(String[] args)
	{
		//==========정피라미드============
			for (int line=0;line<4;line++) //정피라미드 식에서 행을 1줄 줄임
			{
			for (int vo=0;vo<5-line;vo++)  //공백의 상한을 늘려 옆으로 밀어냄
			{
			System.out.printf(" ");
			}
			for (int star=0;star<1*(2*line+1);star++)
			{
			System.out.printf("*");
			}
			System.out.println();	
			}
		//==============역피라미드=============
			for (int line = 0; line < 5 ; line++)
			{
			for (int vo=0 ; vo<=line; vo++) //라인이 늘어나면서 공백이 늘어남(공백 4까지 늘어남)
			{
			System.out.print(" ");
			}
			for (int star=10;star>(1+2*line);star--) //라인이 늘어나면서 별은 줄어듬(2개씩 감소)
			{
			System.out.print("*");
			}
			System.out.println();
			}
	}
}