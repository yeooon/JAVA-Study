public class Test078
{
		int x;

		// 생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며
		// 필요한 경우 인수를 받아들이는 것도 가능하고
		// 같은 이름의 메소드를 정의하는 중복정의가 가능하지만
		// 리턴값(반환값)은 가질 수 없다.

		// 생성자는 다른 일반 메소드처럼 호출될 수 없고,
		// 『new』연산자를 이용하여 객체를 생성하기 위해 호출되며,
		// 각 클래스의 인스턴스인 객체를 생성한 후에
		// 생성된 객체의 멤버를 초기화시키는 작업을 수행한다.

		Test078() //사용자 정의 생성자(동일한 클래스 안에서 같은 이름의 메소드를 만들 수 없다)/다만 문법적 허용 있음
		{
			//생성자 내부에서 또다른 생성자를 호출하는 것은 문법적으로 가능하다.
			//하지만, 생성자 내부에서 가장 먼저 실행되어야 한다. 
			//ex--==>>다른생성자호출()

			this(100); //→Test078(int x) 호출


			//this.x = 10;
			x=10;
			System.out.println("1 인자가 없는 생성자");
			System.out.println("2 Test078이 갖고있는 x : " + this.x);
			System.out.println("3 Test078이 갖고있는 x : " + x);
		}

		Test078(int x) //사용자 정의 생성자
		{
			x = x; //문법적으로는 문제가 없다
			//둘 다 지역변수이다
			//this
			this.x = x; //이것은 클래스변수 x이다
			//--논리적 해석 → Test078.x = x;
			System.out.println("4 인자가 하나인 생성자");
			System.out.println("5 Test078이 갖고있는 x : " + x); //매개변수 x(int x)
			System.out.println("6 Test078이 갖고있는 x : " + this.x);
		}

			public static void main(String[] args)
			{
				//Test078 클래스 기반 인스턴스 생성
				Test078 ob1 = new Test078();
				Test078 ob2 = new Test078(100); //←메소드 오버로딩

				System.out.println();
				System.out.println("main에서 ob1.x : " + ob1.x);
				System.out.println("main에서 ob2.x : " + ob2.x);
			}
}

/*
//메소드 오버라이딩 띠용때용

//메소드 오버로딩(중복정의)
//method Overloading
//메소드의 기능이 같다 + 구분(식별) 가능 → 동일한 이름 허용

*/