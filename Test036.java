
//사용자로부터 임의의 정수를 입력받아
//다음과 같은 판별 결과를 출력하는 프로그램을 구현한다

//2의 배수 / 3의 배수 / 2와 3의 배수 / 2와 3의 배수 아님
//실행 예)
//임의의 정수 입력 : 4
//4는 2의 배수
//계속하려면 아무 키나 누르세요...

//임의의 정수 입력 : 9
//9는 3의 배수
//계속하려면 아무 키나...

//임의의 정수 입력 : 6
//6은 2와 3의 배수

//임의의 정수 입력 : 17
//17은 2와 3의 배수가 아님

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//임의의 변수 
		int a;
		String b;

		//출력
		System.out.print("임의의 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
		
		//조건
		if (a%2==0 && a%3==0) 
		{
			b="2와 3의 배수";
		}
		else if (a%3==0)
		{
			b="3의 배수";
		}
		else if (a%2==0)  //6값이 안나온다... 
		{
			b="2의 배수";
		}
		else
		{
			b="2와 3의 배수가 아님";
		}
		
		System.out.println(a+"는"+b);
	}
}