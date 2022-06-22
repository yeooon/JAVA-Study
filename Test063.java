
//반복문(for문) 실습
//다중 for문(반복문의 중첩)을 활용한 별찍기 실습

//과제
//다음과 같은 내용이 출력될 수 있도록 반복문의 중첩 구문을 작성하여 
//프로그램을 구현한다.

//실행 예
/*
	* 1행 5행 빈공간 0, 별1
   ** 2행 4행 빈공간 1, 별2
  *** 3행 3행 빈공간 2, 별3
 **** 4행 2행 빈공간 3, 별4
***** 5행 1행 빈공간 4, 별5
*/
public class Test063
{
	public static void main(String[] args)

	{
		for (int line=1;5>=line;line++) //1행부터라고 정의하고 줄 증가 
		{
			for (int vo=4;vo>=line;vo--)//공백은 4부터 시작해서 감소한다. 줄의 개수만큼
			{
				System.out.print(" "); 
			}
			for (int star=1;star<=line ;star++) //별은 1개부터 시작해서 증가한다. 줄의 개수만큼
			{
				System.out.print("*"); //이다음에 별 출력
			}
		System.out.println();
		}
		
	}
}
/*
public class Test063
{
	public static void main(String[] args)

	{
		for (int line=5;0<line;line--) //5행부터라고 정의하고 줄 감소
		{
			for (int star=1;star<=5;star++)//별은 1부터라고 정의하고 별 증가
			{
				if (line>star)//줄이 별보다 클때(순서대로)
				{
					System.out.print("  "); //빈공간을 먼저 출력
				}
				else
					System.out.print("★"); //이다음에 별 출력
			}
		System.out.println();
		}
	}
}
*/
/*
public class Test063
{
	public static void main(String[] args)
	{
		for (int line=1;line<6;line++)
		{
			for (int v=0;v<5;v++)
			{
				if (line>v)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("★");
				}
			System.out.println();
			}
		}
	}
}
*/


/*
public class Test063
{
	public static void main(String[] args)
	{
	for (int line=1;line<=5;line++)
	{
		for (int star=1;star<=line;star++)
		{
			System.out.print("★");
		}
		System.out.println(); //끝나면 개행
	}
	}
}
*/
//행이 늘 때마다 별도 늘고 끝나면 개행

/*=================
★
★★
★★★
★★★★
★★★★★
==================*/
//좌우반전
//좌우반전 하는 법은 공백 출력 뿐

//행이 늘 때마다 공백은 줄고, 별은 늘고, 끝나면 개행

/*

public class Test063
{
	public static void main(String[] args) //행표시
	{
	for (int line=1;line<=5;line++) //
	{
		for (int star=1;star<=5;star++) //별표시
		{
			if (line>=star)
			{
			System.out.print(" ");
			}
			else
			System.out.print("★");
		}
		System.out.println(); //끝나면 개행
	}
	}
}
*/

/*=================
 ★★★★
  ★★★
   ★★
    ★
==================*/

//첫번째 행에는 별이 한 개 표시되고 공백이 4개 표시되어야 한다. 
//다섯 번째 행에는 별이 다섯개 표시되어야 하고 공백이 없어야 한다



//별과 공백값을 뒤바꾸면 상하반전

//행이 증가할수록 별갯수 증가하며 빈공간 감소는
//예상도)
/*=================
				★1행 (별1개, 빈공간4개)
			  ★★2행 (별2개, 빈공간4개)
			★★★3행 (별3개, 빈공간4개)
		  ★★★★4행 (별4개, 빈공간4개)
		★★★★★5헹 (별5개, 빈공간4개)
==================*/
/*
//결과
/*=================
★					1행 (별1개, 빈공간4개)
★★				2행 (별1개, 빈공간4개)
★★★				3행 (별1개, 빈공간4개)
★★★★			4행 (별1개, 빈공간4개)
★★★★★			5헹 (별1개, 빈공간4개)
==================*/
//이렇게 나온다.


//행이 감소할수록 별은 증가하도록 진행
/*
public class Test063
{
	public static void main(String[] args) 
	{
	for (int line=5;line>0;line--) //행이 감소할수록 
	{
		for (int star=1;star<=5;star++) //별이 증가해야함
		{
			if (star<line) //만약 행이 별보다 크면 별이 1개, 행이 5개라면
			{
			System.out.print("  ");
			}
			else
			System.out.print("★");
		}
		System.out.println(); //끝나면 개행
	}
	}
}
*/
