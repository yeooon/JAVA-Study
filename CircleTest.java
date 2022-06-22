/*================================
★★★클래스와 인스턴스★★★
================================*/

// Test 073과 세트다~~!!

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 메인 메소드에서는 서클테스트로 인스턴스 생성하면 된다.
// 반지름 입력 : xx
//>>반지름이 xx인 원의 
//>>넓이 :xxx
//>>둘레 :xxx
//계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest 
{
	int r;
	double a,b;
	final double pi = 3.141592; //(변수의 상수화)

	void Input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine()); 
	}
	double CilLength() //둘레
	{
		a = r * 2 * pi;
		return a;
	}
	double CiArea()
	{
		b = r * r * pi;
		return b;	
	}
	void print(double a, double b)
	{
		System.out.printf("반지름이 %d인 원의", r);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
	}
	
}

//런타임 에러로 public 클래스 작성하라고 해서 당황했었음
//모든 클래스 안에 main이라는 메소드가 굳이 없어도 된다. 
//내가 당해봤다...
//static이 붙은 클래스는 조금 특별하다. 