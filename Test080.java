/*==============================
 ★★★클래스와 인스턴스★★★
===============================*/

//생성자와 초기화 블럭(Initialized Block)
//문법적인 우위는 생성자가 취한다.

public class Test080
{
	int n;
	int m;



	// 초기화 블럭(Initialized Block) //초기화 블럭이 먼저 실행
	{
	n=100; //대입 연산 / 연산은 메소드 내부에서만 행한다(클래스에서 연산 x)
	m=200;
	System.out.println("초기화 블럭 실행...");
	//} >>{}안에 집어넣으면 된다.
	}

/*
	int n = 100; //선언과 동시에 초기화는 가능하다
	int m = 200;
*/	

//생성자 >> 생성자가 모든 것을 직접 정리하고, 최종적인 값을 정하게 된다.
//초기화 블럭이 코드를 먼저 수행했다 하더라도 최종적으로 초기화 값을 결정하게 되는 개념!
Test080()
	{
	n=100;
	m=200;
	System.out.println("생성자 실행...");
	}

Test080(int n, int m)
	{
	this.n = n;
	this.m = m;
	System.out.println("매개변수 있는 생성자 실행...");
	}

	//멤버 출력 메소드 정의

	void write()
	{
	System.out.println("n : " + n + ",m : " + m);
	}

	public static void main(String[] args)
	{
		Test080 ob1 = new Test080();
		ob1.write();

		Test080 ob2 = new Test080(1234,5678);
		ob2.write();
	}
}

/*
초기화 블럭 실행...
생성자 실행...
n : 100,m : 200
초기화 블럭 실행...
매개변수 있는 생성자 실행...
n : 1234,m : 5678
계속하려면 아무 키나 누르십시오 . . .
*/