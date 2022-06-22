//==========================
//실행 흐름의 컨트롤(제어문)
//==========================
// 과제 실화인가?
// → 카페

// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지 평년인지 판별하여
// 단, 입력은 버퍼드리더로 받고, 리드라인을 활용하고,
// if 조건문을 활용하여 연산을 수행할 수 있도록 한다.

// 풀이한 내용은 본문으로 업로드, 첨부파일로도 업로드.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		//사용자로부터 임의의 연도를 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int yea;

		System.out.print("연도를 입력하시오 : ");

		yea = Integer.parseInt(br.readLine());
		
		// 윤년인가요? 아니면 평년인가요?
		// 연도가 4의 배수이면서 100의 배수가 아니고, 400의 배수이면 윤년이다

/*
		if (yea%4==0)
		{
			System.out.printf("d% → 윤년\n", yea);
		}
		else if (yea%100!=0)
		{
			System.out.printf("d% → 윤년\n", yea);
		}
		else if (yea%400==0)
		{
		System.out.printf("d% → 윤년\n", yea);
		}
		else
			System.out.print("값을 다시 확인하세요.");
*/
// 런타임 에러
// 오류 원인 : %d를 d%로 바꿔 썼다. 컴파일에선 안 알려 줬다.

		if (yea%4==0 && yea%100!=0 || yea%400==0) // (연도가 4의 배수이면서, 100의 배수가 아니고, 400의 배수)
		{
			System.out.printf("%d → 윤년\n", yea);
		}
		else if (yea%4!=0 && yea%100==0 || yea%400!=0) // (연도가 4의 배수가 아니면서, 100의 배수이고, 400의 배수가 아닌 것)
		{
			System.out.printf("%d → 평년\n", yea);
		}
			else
			System.out.print("값을 다시 확인하세요.");
	}
}

//(yea%4==0 && yea%100!=0 || yea%400==0) 이 식을 (yea%4==0) && (yea%100!=0) || (yea%400==0) 이렇게 바꾸어 썼을 때 컴파일 오류가 났다. 왜 그럴까?