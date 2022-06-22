
//반복문(for문) 실습
//다중 for문(반복문의 중첩)을 활용한 별찍기 실습

//과제
//다음과 같은 내용이 출력될 수 있도록 반복문의 중첩 구문을 작성하여 
//프로그램을 구현한다.

//실행 예
/*
	*			5행에 별 1개 공백 4개..
   ***			4행에 별 3개 공백 3개
  *****			3행에 별 5개 공백 2개
 *******		2행에 별 7개 공백 1개
*********		1행에 별 9개 공백 0개
*/
//내 눈에는 산처럼 보이지만 '공백'이라는게 출력되어 있는 상태
/*
public class Test064
{
	public static void main(String[] args)

	{
		for (int line=5;0<line;line--)
		{
			for (int star=1;star<=5;star++)
			{
				if (star<line)
				{
					System.out.print(" ");
				}
				else
					System.out.print("★"); //별을 두개씩?)
			}
		System.out.println();
		}
	}
}
*/
/*=====결과========
    ★
   ★★
  ★★★
 ★★★★
★★★★★
===================*/
//별 갯수를 바꿔야 한다.

/*
	*			1행에 공백 4개 별 1개..
   ***			2행에 공백 3개 별 3개
  *****			3행에 공백 2개 별 5개
 *******		4행에 공백 1개 별 7개
*********		5행에 공백 0개 별 9개
*/
//내 눈에는 산처럼 보이지만 '공백'이라는게 출력되어 있는 상태
//행 1번째, 공백 4개, 별 1개, 줄바꿈
//행 2번째, 


/*
public class Test064
{
	public static void main(String[] args)

	{
		for (int line=0;line<5;line++) // 행 5번 반복
		{
			for (int vo=0;vo<4;vo++) 
			// 공백 4번 반복(0,1,2,3) → 여기에 공백이 1씩 감소(줄이 증가하며) =vo<4-line
			{
			System.out.printf(" ");
			}
			for (int star=0;star<1;star++) 
			//별 1개 반복(0) → 여기에 별이 2개씩 증가(줄이 증가하며)=star<1*(2*line+1) 
			//라인이 0일때 별이 1개 있어야하기 때문에 +1
			{
			System.out.printf("*");
			}
			System.out.println();	
		}
	}
}

*/

//=====최종========

public class Test064
{
	public static void main(String[] args)

	{
		for (int line=0;line<5;line++)
		{
			for (int vo=0;vo<4-line;vo++)
			{
			System.out.printf(" ");
			}
			for (int star=0;star<1*(2*line+1);star++)
			{
			System.out.printf("*");
			}
			System.out.println();	
		}
	}
}

/*
		for (int line=0;line<=4;line++) // 행 5개 행이 0부터 시작, 행이 4보다 작을 때(4~1),행이 증가
		{
			for (int vo=0;vo<=3-line;vo++) 공백이 0부터 시작, 공백이 3-line보다 작거나 같을 때, 공백 증가 /0행의 경우 반복으로 공백이 4까지 증가
			{
				System.out.print("  ");
			}
			for (int star=0;star<1+2*line;star++ ) 별이 0부터 시작, 별이 1+2*행보다 작을 때, 별 증가 / 0행의 경우 별은 1개부터 시작
			{
				System.out.print("★");
			}
			System.out.println(); 끝나면 개행
		}
	}
}

for (줄이 0부터 시작해서;5보다 작을 동안 ;반복된다 )
{
}
첫번째 행 출력 → 5번 반복
공백 출력
for (공백 0개 ;공백 4번보다 작은 동안;공백 증가)
{
System.out.printf(" ");
}

별 출력
for (별 0개;별이 1보다 작은 동안 ;별을 증가 )
{
System.out.printf("*");
}
System.out.println()

이렇게 출력하면
    *
	*
	*
	*
	*
이렇게 나온다. 
이제 행이 반복되면서 적용되는 규칙
공백 4번, 별 1번
공백 3번, 별 3번
공백 2번, 별 5번,

공백 -1, 별 +2

for (줄이 0부터 시작해서;5보다 작을 동안 ;반복된다 )
{
}
첫번째 행 출력 → 5번 반복
공백 출력
for (공백 0개 ;공백 4번보다 작은 동안-line;공백 증가) 라인이 하나 늘어날 때마다 하나씩 줄어드니까
{              //항상 4번 반복
System.out.printf(" ");
}

별 출력
for (별 0개;별이 1보다 작은 동안2*line+1;별을 증가 )
{			//항상 1번 반복
System.out.printf("*");
}
System.out.println()


*/
