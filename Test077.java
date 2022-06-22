/*==============================
 클래스와 인스턴스
===============================*/

//생성자

class NumberTest2
{
	int num;

	// 사용자 정의 생성자가 정의되어 있으므로 default 생성자 자동으로 삽입되지 않음.
	/*
	NumberTest2()
	{
	}
	*/

	//생성자 → 사용자 정의 생성자
	NumberTest2(int n) //얘가 디폴트 생성자의 역할을 잡아먹었다.(NumberTest2)
	{
		num=2;
		System.out.println("생성자 호출 시 매개변수 전달 : " +n);
	}

	int getNum()
	{
		return num;
	}
}


public class Test077
{
		public static void main(String[] args)
	{
		//NumberTest 인스턴스 생성구문
		//--==>> 에러 발생(컴파일 에러)
		//-- NumberTest2 클래스에는
		// 사용자 정의 생성자가 존재하고 있는 상황이기 때문에
		// default생성자가 자동으로 삽입되지 않으며
		// 사용자가 정의한 생성자는 매개변수를 갖는 형태이기 때문에
		// 위와 같이 매개변수 없는 생성자 호출 시 문제가 발생하게 되는 것이다.
		NumberTest2 ob1 = new NumberTest2(10); 

		System.out.println("메소드 반환 값 : " + ob1.getNum()); //새롭게 초기화 된 것
		//--==>> 메소드 반환 값 : 2
		NumberTest2 ob2 = new NumberTest2(3564);
		//--==>> 생성자 호출 시 매개변수 전달 : 3564

		System.out.println("메소드 반환 값 : " + ob2.getNum()); //새롭게 초기화 된 것
		//--==>> 메소드 반환 값 : 3564


	}
}