
//과제
//사용자로부터 임의의 정수를 입력받아
//1부터 입력받은 그 정수까지의 
//전체 합과, 짝수의 합과, 홀수의 합을 각각 결과값으로 출력하는 프로그램을 구현한다.

//임의의 정수 입력 : 280
//>> 1 ~ 280까지 정수의 합 : 
//>> 1 ~ 280까지 짝수의 합 : 
//>> 1 ~ 280까지 홀수의 합 : 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test055
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num; //사용자가 입력할 변수 
		int n=1; //1부터 num까지 더해질 루프값)(★중요★)
		int result = 0; //누적값
		int result2 = 0; //짝수 누적값
		int result3 = 0; //홀수 누적값

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		//누적합 값이 나올 때까지 반복한다. → while
		//누적값 
		//짝수값 → if
		//홀수값 → if


		while (n<=num)  //(루프값 <= 입력값) 루프값은 입력값보다 크지 않도록 한다
		{
			result+=n;  //num까지의 증가값

			if (n%2==0) //짝수 판별
			{
				result2+=n; //짝수까지의 증가값
			}
			else if (n%2!=0) //홀수 판별
			{
				result3+=n; //홀수까지의 증가값
			}
			else
			{
				System.out.print("판별 불가");
				return; //메소드 종료
			}
			n++; //if문을 빠져나와서 while문의 맨 끝에 위치 → 가장 무난한 기본 위치인 것 같다. 
		}
			System.out.printf("1 ~ %d까지 정수의 합 : %d%n", num, result);
			System.out.printf("1 ~ %d까지 짝수의 합 : %d%n", num, result2);
			System.out.printf("1 ~ %d까지 홀수의 합 : %d%n", num, result3);
		
	}
}

/*
*/