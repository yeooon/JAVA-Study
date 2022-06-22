/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Calender 클래스


//○ 실습 문제
// 오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을 확인하여
// 결과를 출력하는 프로그램을 구현한다.
// ※ 현재 날짜를 기준으로 날 수 더하는 연산 메소드 활용
//	  → 객체.add(Calendar.DATE, 날 수);

//실행 예)
//오늘 날짜 : 2022-2-3 목요일
//몇 일 후의 날짜를 확인하고자 하십니까? : 200

//==========[확인 결과]============
//200일 후 : xxxx-xx-xx x요일
//=================================
//계속하려면 아무 키나 누르세요...

import java.util.Calendar;
import java.util.Scanner;

public class Test146
{
	public static void main(String[] args)
	{
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// Calendar 클래스 기반 인스턴스 생성
		Calendar rigthNow = Calendar.getInstance();

		// 주요 변수 선언
		int num;			//-- 사용자로부터 입력받은 날 수 


		// 현재의 연, 월, 일, 요일 확인(가져오기 : get())
		int y = rigthNow.get(Calendar.YEAR);
		int m = rigthNow.get(Calendar.MONTH)+1;		//『+1』 check~!!!
		int d = rigthNow.get(Calendar.DATE);
		int weekname = rigthNow.get(Calendar.DAY_OF_WEEK);


		String week = "";

		switch (weekname)
		{
		case 1 : week = "일요일"; break;
		case 2 : week = "월요일"; break;
		case 3 : week = "화요일"; break;
		case 4 : week = "수요일"; break;
		case 5 : week = "목요일"; break;
		case 6 : week = "금요일"; break;
		case 7 : week = "토요일"; break;		
		}


		// 현재의 날짜 출력
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + "-" + week);



		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			num = sc.nextInt();
		}
		while (num<1);


		// 더하기 메소드
		// rigthNow.더하기 메소드(매개변수 날짜, 입력한 값);
		rigthNow.add(Calendar.DATE, num);

		y = rigthNow.get(Calendar.YEAR);
		m = rigthNow.get(Calendar.MONTH)+1;
		d = rigthNow.get(Calendar.DATE);
		weekname = rigthNow.get(Calendar.DAY_OF_WEEK);

		switch (weekname)
		{
		case 1 : week = "일요일"; break;
		case 2 : week = "월요일"; break;
		case 3 : week = "화요일"; break;
		case 4 : week = "수요일"; break;
		case 5 : week = "목요일"; break;
		case 6 : week = "금요일"; break;
		case 7 : week = "토요일"; break;		
		}

		// 출력

		System.out.println("==========[확인 결과]============");
		System.out.printf("%d일 후 : %d-%d-%d %s\n", num,y,m,d,week);
		System.out.println("=================================");
	}
}