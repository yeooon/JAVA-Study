/*=================================
★★★자바의 주요(중요) 클래스★★★
==================================*/

/*
Object 메소드()	면 무조건 다 가능?
{
	Object result;

	FruitSeller seller = new FruitSeller();

	result = seller; (업캐스팅)

	return (Object)result;

	-------------------------------------

		Scanner sc = new Scanner(Sytem.in);
		return sc;
}
*/

/*
○ 개요

	일반적으로 클래스는 하나만 존재하는 것이 아니라 같은 종류의 클래스를 여러개 묶어서 사용하게 되는데
	이러한 클래스나 인터페이스의 묶음을 패키지(package)라고 한다.
	Sun(Oracle)사에서는 자바 프로그램을 효율적으로 작성할 수 있도록 자바 표준 패키지를 제공하며,
	자바 표준 패키지에는 그래픽, 네트워크, 데이터베이스 등의 
	다양하고 유용한 클래스들이 포함되어 있다.

○ import 구문

	자바 표준 패키지나 사용자에 의해 외부에서 만들어진 패키지를
	사용하기 위해서는 컴파일을 수행하기에 앞서 프로그램에 포함시키는
	과정이 필요한데 이때 import문을 이용하여 패키지 또는 클래스를 프로그램에 포함시키게 된다.
	하지만 java.lang.* 패키지는 자바 프로그램에 기본적으로 import 되어 있기 때문에 이 패키지의 클래스들은
	import 하지 않고 바로 사용하는 것이 가능하다.

	import 문은 반드시 클래스 설계 구문 전에 선언되어 있어야 하며 
	형식은 다음과 같은 두 가지가 있다.

	import [static] 패키지.클래스;
	import [static] 패키지.*;

	※ JDK 1.5부터는 import 다음에 static 키워드를 붙임으로써 정적으로 패키지를 import 할 수 있는 기능을
		제공하게 되었다. 만약 패키지를 정적으로 import 한 경우라면 모든 접근 가능한 메소드와 멤버 변수들은
		접두사 (ex > ob, br, sc 처럼...) 를 붙이지 않고 사용하는 것이 가능하다

○ Object 클래스
	
	『java.lang.Object』 클래스는 자바 클래스의 최상위 클래스로
	자바 표준 패키지의 클래스나 사용자에 의해 작성된 모~~~~~~~~~~~~~~~~~~~든 클래스는
	기본적으로 이 클래스로부터 상속받는다.
	따라서 자바의 모든 클래스는 『java.lang.Object』 클래스의 메소드를 가지고 있으며, 바로 사용하는 것이 가능하다.


*/

//import java.lang.*;
//import java.lang.Object;

public class Test128	//extends Object
{
	/*
	Object 클래스로부터 상속받은 멤버들
	...
	...
	...

	toString()
	{
	}
	*/
	/*
	public Test128()
	{
	}
	*/
	public static void main(String[] args)
	{
		Test128 ob = new Test128();

		//객체.xxx();
		//--해당 객체를 생성시키는 대상 클래스의 메소드 xxx() 호출

		// Rect ob = new Rect();
		// ob.input();
		//-- ob 객체를 생성시키는 대상 클래스 → Rect
		// Rect 클래스에 정의되어 있는 input() 메소드 호출

		// 객체.yyy();
		//-- 해당 객체를 생성시키는 대상 클래스에
		// yyy() 메소드가 존재하지 않을 때...
		// → 에러 발생

		//System.out.println(ob.test());
		// → 에러 발생
		// → Test128 클래스에 test() 메소드가 
		// 존재하지 않기 때문에
		// 에러가 발생하는 상황

		System.out.println(ob.toString());	//오브젝트 클래스의 투스트링 호출
		// → Test128@15db9742
		// → 자바가 객체를 구분하기 위해 임의로 부여하는 식별번호(주소아님)
		// → Test128 클래스에 toString() 메소드가 
		// 존재하지 않는 상황임에도 불구하고
		// 에러가 발생하지 않는 상황

		System.out.println(ob);		//← 객체를 전달한거임
		// → Test128@15db9742

	}
}