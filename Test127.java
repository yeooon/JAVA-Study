

/*======================
★★★클래스 고급★★★
======================*/

// 중첩 클래스

/*
○ Annonymous 클래스(익명의 클래스 : 무명 클래스)
	- awt 나 안드로이드 이벤트 처리에서 일반적으로 사용
	- 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
	- 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는 
	번거로움 때문에 익명의 클래스를 생성하여 처리한다.

○ 형식 및 구조

	new 상위클래스의 생성자()
	{
		접근제어지시자 자료형 메소드()
		{
			...;
		}
		//-- 세미콜론 check~!!!
	};

*/

// super 키워드를 포함하고 있는 클래스 이름 옆에는 extends 가 있을거다. 
// Object ob = new 아무거나(); 다 가능해진다? (실험결과 안됨)

//import java.lang.*;

class Test3	// extends Object
{
	/*
	Object 클래스의 멤버들..
	..
	public String toString()
{
	..;
}
	*/
	public Object getString()
	{
		/*
		return new Object();
			   ----------- Object 형
		*/
		/*
		return new Object();{ 특정 메소드 재구성 };
		*/

		return new Object()				//객체 리턴
		{
			@Override
			public String toString()
			{
			return "익명의 클래스...";
			}
		};			//← 세미콜론 (미 작성 시 에러 발생)
	}
}

public class Test127	// extends Object
{
	/*
	Object 가 갖고 있는 멤버들...
	*/
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		System.out.println(ob1.toString());
		//--==>>Test3@15db9742

		System.out.println(ob1.getString());
		//--==>>익명의 클래스...
	}
}