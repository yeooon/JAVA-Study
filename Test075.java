/*================================
★★★클래스와 인스턴스★★★
================================*/

//사용자로부터 임의의 두 정수와 연산자를 입력받아
//해당 연산을 수행하는 프로그램을 구현한다.
//단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

//임의의 두 정수 입력(공백 구분) : 10 5
//임의의 연산자 입력(+ - * /) : +
//>>10 + 5 = 15
//계속 하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	//변수 지정
	int a,b;
	char ch;

	//데이터를 입력받기 (기능 : 입력)
	//변수와 연산자를 입력받아야 함
	
	void Input() throws IOException
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
	System.out.print("임의의 연산자 입력(+ - * /) : ");
		//char ch = sc.next().charAt(0); 이게 먹통이었던 거였네 이제 됐네 
		ch=(char)System.in.read();
	}

	//합 및 연산 처리=================계속 여기서 문제가 생기네...
	
	int cal()

	{
		int result=0; //결과 초기화는 왜 하는 걸까...

	if (ch=='+')
		result = a + b;
	if (ch=='-')
		result = a - b;
	if (ch=='*')
		result = a * b;
	if (ch=='/')
		result = a / b;

	/*
	switch (ch)
		{	
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
		}
	*/

	return result;
	}

	//프린트 해야함
	
	void print(int I)
	{
		System.out.printf("%d %c %d = %d%n",a,ch,b,I); //I값은 넘겨받는다. 위에 변수 지정이 안 되어 있기 때문. 
	}
}


public class Test075
{
	public static void main(String[] args) throws IOException
	{
	Calculate ob = new Calculate();

	//인풋 호출
	ob.Input();

	//연산자 호출
	int s = ob.cal();

	//프린트 호출
	ob.print(s);
	}

}
/*
임의의 두 정수 입력(공백 구분) : 250
50
임의의 연산자 입력(+ - * /) : -
250 - 50 = 200계속하려면 아무 키나 누르십시오 . . .
*/