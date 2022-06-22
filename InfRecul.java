/*========================
★★메소드의 재귀 호출★★
========================*/


public class InfRecul

{
	public static void main(String[] args)
	{
		showHi(1);
	}

	//코드 내에서 2군데 위치 바꾸기 

	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		if(cnt==1) 
		return; //1일 경우엔 메소드 종료 
		showHi(--cnt);
		//포스트 픽스는 다음 처리에서 감소한다
		//그래서 여전히 10인채로 처리됨
		//먼저 감소 처리를 해주고 > 진행
	}
	
}
/*
	public static void showHi(int cnt) //showhi를 10번 호출했지
	{
		System.out.println("Hi~");
		if(cnt==1) 
		 //"Hi"라는걸 호출하고 싶어//만약 1번 호출했다면 
		return;
		showHi(--cnt);
	}
*/

//객체는 명사같은 것?
//객체 = 속성+기능 
//      ----- ------
//		데이터 동작,행위
///       변수   메소드
//객체를 만들기 위한 설계도가 클래스 = 변수+메소드
//클래스 = 설계한다
//변수 = 선언한다
//메소드 = 불러온다

//생성자는 final 변수(즉, 상수화된 변수)를 초기화 할 수 있다. 