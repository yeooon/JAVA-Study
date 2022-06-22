
//반복문(for문) 실습
//다중 for문(반복문의 중첩)을 활용한 별찍기 실습

//과제
//다음과 같은 내용이 출력될 수 있도록 반복문의 중첩 구문을 작성하여 
//프로그램을 구현한다.

//실행 예
/*
*********
 *******
  *****
   ***
    *
*/
/*
1행 공백 0개 별 9개 라인증가→공백증가→별감소
2행 공백 1개 별 7개
3행 공백 2개 별 5개
4행 공백 3개 별 3개
5행 공백 4개 별 1개


//======[기본 반복문]========
for (줄 1부터 시작;줄이 5가 될 때까지;라인이 증가)
{
	for (공백 0개;공백이 4가 될때까지;공백 증가 )
	{
		System.out.print(" ");
	}
	for (별 9개;별이 1개가 될 때까지;별 감소 )
	{
		System.out.print("*");
	}
	System.out.println();
}
*/
public class Test065
{
	public static void main(String[] args) //행표시
	{

	for (int line = 0; line < 5 ; line++) //라인은 4까지
	{
	for (int vo=0 ; vo<=line; vo++) //라인이 늘어나면서 공백이 늘어나네(공백 4까지 늘어남)
	{
		System.out.print(" ");
	}
	for (int star=10;star>(1+2*line);star--) //라인이 늘어나면서 별은 줄어들지(2개씩 감소)
	{
		System.out.print("*");
	}
	System.out.println();
	}
	}
}


