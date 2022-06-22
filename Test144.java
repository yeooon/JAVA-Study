/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Calender 클래스

/*
※ Calenda 클래스는 추상 클래스이기 때문에 객체를 생성할 수 없다.
	(추상 클래스 : 미완성된 클래스)
	
	Calenda ob = new Calendar();
	→ 이와 같은 구문을 통해 인스턴스 생성 불가


○	Calendar 클래스 객체(인스턴스)를 생성할 수 있는 방법.
	1. Calendar ob1 = Calendar.getInstance();

	2. Calendar ob2 = new GregorianCalendar();

	3. GregorianCalendar ob = GregorianCalendar();

	(※ GregorianCalendar : calendar 클래스의 하위 클래스)

*/

// 연, 월, 일, 요일을 Calendar 객체로부터 가져와서 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test144
{
	public static void main(String[] args)
	{
		// Calendar 클래스 기반 인스턴스 생성
		//Calendar ob = new Calendar();
		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해
		// 날짜 관련 정보를 얻어낼 수 있는 메소드 → 『get()』
		// 얻는건 get, 지정해서 생성하는건 set 메소드?

		int y = rightNow.get(Calendar.YEAR);
		System.out.println(y);
		//--==>> 2022

		int m = rightNow.get(Calendar.MONTH)+1;	//--『+1』 check~!!
		System.out.println(m);
		//--==>> 2

		int d = rightNow.get(Calendar.DATE);	//--『+1』 check~!!
		System.out.println(d);
		//--==>> 3

		int w = rightNow.get(Calendar.DAY_OF_WEEK);	//--『+1』 check~!!
		System.out.println(w);
		//--==>> 5

		// 테스트

		System.out.println(y + "-" + m + "-" + d + "-" + w);

		String week = "";
		switch (w)
		{
		/*
		System.out.println(Calendar.SUNDAY);		//--==>> 1 → 일요일
		System.out.println(Calendar.MONDAY);		//--==>> 2 → 월요일
		System.out.println(Calendar.TUESDAY);		//--==>> 3 → 화요일
		System.out.println(Calendar.WEDNESDAY);		//--==>> 4 → 수요일
		System.out.println(Calendar.THURSDAY);		//--==>> 5 → 목요일
		System.out.println(Calendar.FRIDAY);		//--==>> 6 → 금요일
		System.out.println(Calendar.SATURDAY);		//--==>> 7 → 토요일
		*/
		case 1 : week = "일요일"; break;
		case 2 : week = "월요일"; break;
		case 3 : week = "화요일"; break;
		case 4 : week = "수요일"; break;
		case 5 : week = "목요일"; break;
		case 6 : week = "금요일"; break;
		case 7 : week = "토요일"; break;		
		}

		System.out.println(y + "-" + m + "-" + d + "-" + week);

		System.out.println("/////////////////////////////////////////");

		// Calendar 클래스 기반 인스턴스 생성

		Calendar rigthNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};


		// 달력의 날짜 세팅 → set() 메소드 활용

		rigthNow2.set(2022, 5, 20);

		System.out.println(rigthNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 2
		System.out.println(week2[rigthNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 월요일

	}
}