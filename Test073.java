/*================================
★★★클래스와 인스턴스★★★
================================*/

//CircleTest와 세트다~~!!

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


import java.io.IOException;

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		//CircleTest 클래스 기반 인스턴스 생성

		//CircleTest 인스턴스 생성
		//CircleTest 객체 생성

		CircleTest ob = new CircleTest();

		//입력 메소드
		ob.Input(); //ob = object라는 뜻

		//넓이 메소드
		double area = ob.CiArea();

		//둘레 메소드
		double length = ob.CilLength();

		//출력 메소드
		ob.print(area,length);


	}
}
/*

*/