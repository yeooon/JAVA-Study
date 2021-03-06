/*================================
★★★지역변수와 전역변수★★★
================================*/

// 직사각형 클래스 설계 실습

/*
직사각형의 넓이와 둘레 계산 → 클래스 표현

클래스의 정체성 → 직사각형
클래스의 속성   → (가로, 세로, 넓이, 둘레, 부피, 무게, 재질...)
클래스의 기능   → 넓이 계산, 둘레 계산, 가로세로 입력, 결과 출력, ......

객체를 구성     → 데이터(속성, 상태) + 기능(동작, 행위) 

클래스를 설계   →		 변수↑ 	  +		메소드↑ 

class 직사각형
{
	//데이터(속성, 상태) → 변수(순서 의미 없음)
	int 가로, 세로;

	//기능(동작, 행위)	 → 메소드(순서 의미 없음)
	가로세로 입력()
	{
	}

	둘레 계산()
	{
	}

	넓이 계산()
	{
	}

	결과 출력()
	{
	}

}
*/

import java.util.Scanner;

class Rect		//직사각형 클래스 설계 
{
	//데이터(속성, 상태) → 변수(순서 의미 없음)

	int w, h; //가로, 세로

	//기능(동작, 행위)	 → 메소드(순서 의미 없음)

//↓여기에는 void가 온다(생성자가 아닌 이상은)
	void input()					//가로세로 입력()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 입력 : ");
		w = sc.nextInt();
		
		System.out.print("세로 입력 : ");
		h = sc.nextInt();
		//return은 호출한 공간에다 무언가 값을 주고 올때(반환한다고 함)
	}

	int calLength(/*매개변수자리*/)				//둘레 계산()→(가로+세로)*2
	{
	//계산해야하는데 안갖고있지? 내가 줄게(매개변수)
	//매개변수가 뭘까?
	//매개변수는 정수 인트 아닌가?
	//리턴자료형은 정수 인트
	//어딘가에 변수가 있으면 void로 간다
	//(가로+세로)*2 이 계산식에서 필요한데 없는 값을 매개변수로 데려온다.
	//근데 위에는 int w,h가 있다.
	//연산결과를 담아둘 곳이 없어서

	int result;
	result = (w+h)*2;
	return result;
	
	}

	int calArea()				//넓이 계산()→(가로x세로)
	{
		// 주요 변수 선언
		int result;
		// 연산 및 처리 → 선언한 변수들에 값 담아내기 
		result = w*h;

		//최종 결과 반환
		return result;

		//return w*h;
	}

	void print(int a, int l)					//결과 출력() → 성능 좋은 프린터
	{
		// 가로 : 10(변수 w) //위에 있음
		// 세로 : 20(변수 h) //위에 있음
		// 넓이 : xxx (값만 출력)
		// 둘레 : xxx (값만 출력)
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("높이 : " + a);
		System.out.println("넓이 : " + l);
		//호출한 위치에 값을 두고 오지 않으면 void
	}
}

// 하나의 자바 파일(.java)에 여러 개의 클래스(class)를 설계할 수 있다.
// 단, 『public class』는 한개만 만들 수 있다. 
// 파일을 저장할 때의 이름은 이 『public class』의 이름으로 지정한다.
// 일반적으로는 하나의 파일에 하나의 클래스를 설계한다.
// (게임 보면 압축 개많이 되있으니까... 그런 느낌일까?)
// 또한 여러개의 클래스가 설계된 파일을 컴파일 하게 되면
// 내부에 설계된 클래스의 수 만큼 클래스파일(.class)이 파생된다.


public class Test072
{
	public static void main(String[] args)
	{
		// Rect 클래스 기반의 인스턴스 생성(객체 생성)
		// new Rect(); 만으로도 메모리에 퍼올려지고 객체생성
		Rect ob = new Rect();
		
		//입력 메소드 호출
		ob.input();

		//넓이 연산 메소드 호출
		int area = ob.calArea();
		//시각적으로 보이는 것은 없지만 연산이 됐고, 
		//System.out.printf("%d", area);
		//여기에서 확인할 수 있다.

		//둘레 연산 메소드
		int length = ob.calLength();

		//출력 메소드 호출
		ob.print(area,length);

		
	}
}