/*==============================
  자바 기본 프로그래밍
  =============================*/

// 변수와 자료형
// 키워드 및 식별자


public class Test006

{
	public static void main(String[] args)
	{
		double height = 172.8;  //변수선언
		int age = 27;  //변수선언
		char degree = 'ㅇ';  //변수선언

		// 진짜로 문자 단 1개 이상 출력이 안되네...(char의 경우)
		// 문자열은 객체화 
		// 객체 지향 프로그래밍 기법, 객체 지향 프로그램, 객체 지향 언어
		// String name = "홍길동";

		System.out.println(height);  //출력
		System.out.println(age);     //출력
		System.out.println(degree);  //출력


		String name = "이연주";
		//String name = "홍은혜";  //변수 이름이 겹친다(name)
		// 스코프 영역 안에서 변수명은 식별자~!!!

		//String #name = "김태형";
		//$와 _만 특수문자로 사용 가능 
		// 하지만 사용 가능한 특수문자도 함부로 사용하지 말아라

		//int tel = "0104423043";
		String tel = "0104423043";
		String 주소 = "충북 청주시";
		// 문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		//실무적인 측면에서 접근한다면 절대 한글 데이터를 사용해서는 안된다.

		//숫자로 이루어진 데이터더라도 0으로 시작해서는 안된다
		//자바에서는 접두어로 0을 붙이면 진법이 변환된다/
		System.out.println("tel : "+tel);
		System.out.println("주소 : " +주소);


		/*
		172.8
27
ㅇ
tel : 0104423043
주소 : 충북 청주시
name : 이연주
계속하려면 아무 키나 누르십시오 . . .
*/



		// 결과 출력
		System.out.println("name : " + name);

//문자와 문자열은 다르다~!
//아는 것과 실천하는 것은 다르다~!

// 데이터 타입이 다르더라도 변수의 이름이 같아서는 안된다



	}


}