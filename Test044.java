
//switch문 실습

//사용자로부터 1 부터 3까지 정수 중에서 하나를 입력받아
//입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
//단, 두가지 방법으로 구현할 수 있도록 한다.

// switch문의 일반 모델을 사용한다.
// switch문의 기본 모델을 사용하되, 
// break를 딱 한 번만 사용할 수 있도록 구성한다.

//실행 예
//임의의 정수 입력 (1~3) : 3
//★★★
//계속하려면 아무키나...

//임의의 정수 입력 (1~3) : 1
//★

//임의의 정수 입력 (1~3) : a
//입력 오류

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test044
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 설정
		String star;
		int A;
	
		System.out.print("임의의 정수 입력(1~3) : ");
		A = Integer.parseInt(br.readLine());

		switch(A) // 됐ㅠ어ㅠ
		{
			case 3 : System.out.print("★");
			case 2 : System.out.print("★");
			case 1 : System.out.print("★"); break;
			default : System.out.print("입력오류")
		}
	}
}

//이런저런 실험 해보기
/*
// 기본모델
		switch(A*1) // 됐ㅠ어ㅠ 기절 둘다됐다
		{
			case 3 : System.out.print("★");
			case 2 : System.out.print("★");
			case 1 : System.out.print("★"); break;
			default : star = "입력 오류";
//일반모델
		switch(A) // 됐ㅠ어ㅠ
		{
			case 3 : System.out.print("★★★"); break;
			case 2 : System.out.print("★★"); break;
			case 1 : System.out.print("★"); break;
			default : System.out.print("입력오류") break;
		}


*/

/*
		switch(A*1) // 됐ㅠ어ㅠ
		{
			case 3 : System.out.print("★");
			case 2 : System.out.print("★");
			case 1 : System.out.print("★"); 
			default : star = "입력 오류";
		}
			case 3 : System.out.print("★");
			case 2 : System.out.print("★");
			case 1 : System.out.print("★"); break;
			default : star = "입력 오류"; 


			case 3 : System.out.print("★★★");
			case 2 : System.out.print("★★");
			case 1 : System.out.print("★");
			default : star = "입력 오류"; break; 왜??? 두 번 반복되는???? 

		switch(A)
		{
			case 3 : star = "★★★"; break;
			case 2 : star = "★★"; break;
			case 1 : star = "★"; break;
			default : star = "입력 오류"; break;
		}
*/