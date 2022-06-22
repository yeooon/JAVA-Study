/*================================
★★★지역변수와 전역변수★★★
================================*/

// 지역 변수의 초기화 테스트

//Test070.java와 비교~~!!

public class Test071
{
	// 클래스의 영역
	// 전역 변수 a 선언
	int a; 	
	boolean b;
	char c;
	double d;
	//-- 자동으로 0으로 초기화 지원

	public static void main(String[] args)
	{
		//메소드의 영역
		//System.out.println("a : " + a);
		//--==>>에러 발생(컴파일 에러)
		//non-static variable a cannot be referenced from a static context
		//Test071 클래스를 기반으로 인스턴트 생성↓
		Test071 ob = new Test071(); //메모리에 설계도가 올라간것

		System.out.println("ob.a :" + ob.a);
		//--==>> ob.a :0

		System.out.println("ob.a :" + ob.b);
		//--==>> ob.b : false

		System.out.println("ob.a :" + ob.c);
		//--==>> ob.c :

		System.out.println("ob.a :" + ob.d);
		//--==>> ob.d : 0.0
	}
}
/*

*/