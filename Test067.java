
//break 실습

//다음과 같은 처리가 이루어지는 프로그램을 구현한다.
//단 입력받는 정수는 1 ~ 100 범위 안에서만 가능하도록 작성한다.

//임의의 정수 입력 : -10

//임의의 정수 입력 : 0

//임의의 정수 입력 : 2020

//임의의 정수 입력 : 10

//>> 1~ 10까지의 합 : 55 (반복문) → 종료의사 전달까지는 프로세스 계속 진행

//계속 하시겠습니까?(Y/N) : y

//임의의 정수 입력 : 100

//>> 1 ~ 100까지의 합 : 5050

//계속 하시겠습니까?(Y/N) : n
//계속하려면 아무 키나 누르세요... → 프로그램 종료

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//변수
	//임의의 정수를 입력받음 o
	//정수 입력받을 범위를 정함 (1~100)
	//입력받은 정수까지의 더하기 식을 만듬.
	//출력함 result o
	//계속 하시겠습니까? 물어봄
	//또 입력받음
	//계속 하시겠습니까? 물어봄
	//아니라고 할시 종료

	//변수
		int num, sum; //사용자가 입력받을 값 
		int i;
		char ch;

		while (true)
		{

	//임의의 정수를 입력받음 o
	//정수 입력받을 범위를 정함 (1~100)
		do //유효성 검사라고 보면 됨
		{
		System.out.print("\n임의의 정수를 입력하시오 : ");  //입력값이 원하는 범위 밖에 있을 때 로직 반복
		num = Integer.parseInt(br.readLine());
		}
		while (num<1 || num>100); //이렇게 나오면 계속 반복 수행


		//제대로 된 정수가 입력됐다. 
									
		//이제 누적합 



		sum=0; //누적합 변수 초기화 위치 

	//입력받은 정수까지의 더하기 식을 만듬.
	//출력함 result o
		
		for (i=1 ; i<=num ; i++)
		{
			sum+=i;
		}
		System.out.printf(" 1 ~ %d 까지의 합 : %d%n", num, sum);
		System.out.print("계속하시겠습니까?(Y/N) : ");
		ch = (char)System.in.read();  //숫자로 불러오는 것 > 캐릭터로 형변환


		//계속 하시겠습니까? 물어봄
		//아니라고 할시 종료

		//그만할래 의사표현
		//Y 또는 y 입력한거 아닌게 확실?
		if(ch!='Y' && ch!='y') //만약 ch가 n이나 N이라면
		{
		// 반복문을 멈추고 빠져나갈 수 있는 코드 필요
		//위와 같은 의사 표현을 했다면
		//그동안 수행했던 반복문을 멈추고 빠져나가야 한다
		break;
		//멈춘다(그리고 빠져나간다)
		}
		System.in.skip(2);
		}

	}
}