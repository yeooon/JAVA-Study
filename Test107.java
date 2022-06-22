/*========================
★★만년달력★★
=========================*/

//다음과 같은 기능의 프로그램을 구현한다.

//실행 예)
//『연도』를 입력하세요 : 2022
//『월』을 입력하세요 : 6
/*
[2020년 6월]
일 월 화 수 목 금 토
=====================
		 1  2   3   4
5  6  7  8  9  10  11
12  13  14  15  16  17  18
어쩌구...
=====================
*/


import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		//배열 선언 및 초기화
		//-- 각 달이 담고 있는 마지막 날짜(매 월의 최대 날짜)
		int[] days = {31,28,31,30,31,30,1,31,30,31,30,31};
		//테스트
		//System.out.println(days,length);
		//--==>> 12

		//주요 변수 선언
		int nalsu, y, m, w;

		do
		{
		System.out.print("『연도』를 입력하세요 : ");
		y = sc.nextInt();
		}
		while (y<1);

		do
		{
		System.out.print("『월』을 입력하세요 : ");
		m = sc.nextInt();
		}
		while (m<1||m>12);
		//-- 입력받은 월이 1보다 작거나 12보다 크면 다시 입력받기~!!

		//---------------------여기까지 수행하면 유효한 연도의 월을 입력한 상태

		//입력받은 연도에 해당하는 2월의 마지막 날을 계산

		if ((y%4==0 && y%100!=0) || y%400==0)// 윤년이라면
		{
			days[1] = 29;
		}
		// else 구문은 현재 days 배열의 1번째 요소(2)가 28로 구성되어 있는 상태기 때문에 생략이 가능한 구문이 된다.

		// 1년 1월 1일 ~ 입력받은 연도의 이전년도 12월 31일까지의 날 수 계산

		nalsu = (y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;

		// 입력받은 연도(해당연도) 1월 1일 ~ 입력한 월의 이전 월까지의 날 수 누적 연산
		for (int i=0;i<(m-1);i++)
		{
			nalsu+=days[i];
		}

		//입력받은 월의 1일을 날 수 누적 연산

		nalsu+=1;	//++nalsu

		//----------여기까지 수행하면 모든 날 수에 대한 종합 처리 완료

		//요일 확인
		//-- 입력받은 연도의 입력받은 월의 1일이 무슨 요일인지 확인하기 위한 연산

		w = nalsu % 7;
		// w:0 → 일요일
		// w:1 → 월요일
		// w:2 → 화요일
		// w:3 → 수요일
		// w:4 → 목요일
		// w:5 → 금요일

		//테스트
		//System.out.println(w); 
		//2022년 1월 1일은 토요일(6)이라는 의미

		//--------------------------------------여기까지 수행하면 해당 연도 해당 월 1일이 무슨 요일인지 확인 완료


		//출력 : 달력 그리기
		System.out.println(); 
		System.out.printf("\t[%d년 %d월]\n",y,m);
		System.out.println(); 
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");

		//특정 요일부터 1일이 출발 할 수 있도록 공백 발생(지정)
		for (int i=1;i<=w;i++)
		{
			System.out.print("    "); 
		}

		//테스트
		//System.out.printf("%4d",1);
		//====↑==== 여기 윗부분이 뭔가 이상한 상태 //공백 4개 발생(공백 2개랑 4개 차이였음 아 어이없네)

		for (int i=1;i<=days[m-1];i++) //days배열의 m-1번째까지 반복하기
		{
			System.out.printf("%4d",i);				//-- 1 2 3 4 5 6 7 8 9 ...30
			w++;									//	 3 4 5 6 7 8 9 ...
			//--날짜를 처리하는 만큼 요일도 함께 증가

			//일요일을 구성하려는 경우...(이번에 출력하고자 하는 날짜가 일요일인 경우)

			if (w%7==0)
			{
				System.out.println(); 
			}
		}
		//달의 마지막 날짜가 출력 형식을 모두 채웠을 경우(토요일까지 라인 전체 출력)
		//이미 일요일 개행이 이루어졌기 때문에
		//이 경우에는 추가 개행 처리를 해준다
		if (w%7!=0) //일요일이 아닐 경우 
		{
		System.out.println(); 
		}
		System.out.println("============================");
	}
}

//?? 뭔가 연결을 잘못한 것 같은데... 1월에 고정된 것 같은데?

//아악 문제 분석 내용~

/*
import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{
		int year, month; 
		int yearDay = 0, monthDay = 0, totalDay = 0; //(한 해의 날수, 한 달의 날수, 총합 날수)
		int startDay; //시작하는 요일
		int firstDay = 1; //시작하는 날짜

		// 1 ~ 12월 배열
		int[] montharr = {31,0,31,30,31,30,1,31,30,31,30,31};
		int[] week = {0, 1, 2, 3, 4, 5, 6}; //한 주 구성 배열
		String[] weekname = {"일","월","화","수","목","금","토"};

		Scanner sc = new Scanner(System.in);

		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();
		System.out.print("『월』을 입력하세요 : ");
		month = sc.nextInt();


		//연도에 따른 일수 총합 계산
		for (int i=1;i<year;i++)
		{
			//윤년계산 - 달 부분의 0 채워넣는 과정
			if (year%4==0 && year%100!=0 && year%400==0) //윤년일 경우
			{
				yearDay += 366;
			}
			else
			{
				yearDay += 365;
			}
		}

		//월에 따른 일 수 총합
		for (int i=1;i<month;i++)
		{
			monthDay += montharr[i-1]; //한 달의 날수는 배열 -1(ex. 3월 입력시 배열의 0,1,2로 가서 날수 계산)
		}

		System.out.println(); 
		System.out.printf("[%d년 %d월]",year,month);
		System.out.println(); 
		System.out.println("==========================");

		//주 계산 및 요일 계산
		startDay = (yearDay+monthDay+1)%7; //시작하는 요일 = ( 한 해의 날수 + 한 달의 날수 + 1 )%7

		for (int i=0;i<week[startDay];i++)
		{
			System.out.print("  ");
		}
		
		for (int i=week[startDay];i<week.length;i++)
		{
			System.out.print(firstDay);
				firstDay++;
		}
		System.out.println();

		int j=0;

		for (int i=firstDay;i<=montharr[month-1];i++) //날짜 출력
		{
			System.out.printf("%3d",firstDay);
			firstDay++;
			j++;
			if (j%7==0)
			{
				System.out.println(); //개행
			}
		}

		System.out.println(); 
		System.out.println("==========================");

	}
}


*/

/*
public class Test107
{
	public static void main(String[] args)
	{
		int year, month; 
		int yearDay = 0, monthDay = 0, totalDay = 0; //(한 해의 날수, 한 달의 날수, 총합 날수)
		int startDay; //시작하는 요일
		int firstDay = 1; //시작하는 날짜

		// 1 ~ 12월 배열
		int[] montharr = {31,0,31,30,31,30,1,31,30,31,30,31};
		int[] week = {0, 1, 2, 3, 4, 5, 6}; //한 주 구성 배열
		String[] weekname = {"일","월","화","수","목","금","토"};

		Scanner sc = new Scanner(System.in);

		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();
		System.out.print("『월』을 입력하세요 : ");
		month = sc.nextInt();


		//연도에 따른 일수 총합 계산
		for (int i=1;i<year;i++)
		{
			//윤년계산 - 달 부분의 0 채워넣는 과정
			if (year%4==0 && year%100!=0 && year%400==0) //윤년일 경우
			{
				yearDay += 366;
			}
			else
			{
				yearDay += 365;
			}
		}


		for (int i=0;i<year;i++)
		{
			//윤년계산 - 달 부분의 0 채워넣는 과정
			if (year%4==0 && year%100!=0 && year%400==0) //윤년일 경우
				montharr[1] = 29;
			else if (year%4!=0 && year%100==0 && year%400!=0)
				montharr[1] = 28;
		}


		//월에 따른 일 수 총합
		for (int i=1;i<month;i++)
		{
			monthDay += montharr[i-1]; //한 달의 날수는 배열 -1(ex. 3월 입력시 배열의 0,1,2로 가서 날수 계산)
		}

		System.out.println(); 
		System.out.printf("[%d년 %d월]",year,month);
		System.out.println(); 
		System.out.println("==========================");

		//주 계산 및 요일 계산
		startDay = (yearDay+monthDay+1)%7; //시작하는 요일 = ( 한 해의 날수 + 한 달의 날수 + 1 )%7

		for (int i=0;i<week[startDay];i++)
		{
			System.out.print("  ");
		}
		
		for (int i=week[startDay];i<week.length;i++)
		{
			System.out.print(firstDay);
				firstDay++;
		}
		System.out.println();

		int j=0;

		for (int i=firstDay;i<=montharr[month-1];i++) //날짜 출력
		{
			System.out.printf("%3d",firstDay);
			firstDay++;
			j++;
			if (j%7==0)
			{
				System.out.println(); //개행
			}
		}

		System.out.println(); 
		System.out.println("==========================");

	}
}	
*/














/*
		//변수 입력
		int year, month;
		int nal, day;
		//사용자가 입력할 수 있도록 만들어라
		Scanner sc = new Scanner(System.in);

		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();
		System.out.print("『월』을 입력하세요 : ");
		month = sc.nextInt();

		//연산하라

		int month[] = {30,0,30,31,31,30,31,31,30,31,30,31};	//달 배열 구성

		//요일 배열 구성 - 딱히 필요 없지 않나?
		String weekname[] = {"일","월","화","수","목","금","토"}

		//윤년계산 - 달 부분의 0 채워넣는 과정
		if (year%4==0 && year%100!=0 && year%400==0) //윤년일 경우
		{
			month[1] = 29;
		}
		else if (year%4!=0 && year%100==0 && year%400!=0)
		{
			month[1] = 2;
		}
		
		//날수 계산
		nal = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;

		//1년 계산
		for (int i=0;i<(month-1);i++)
		{
			nal+=month[i]; //날수 = 달의 배열
		}

		nal++; //날수는 계속해서 증가한다. = 연도계산

		//주 계산
		nal%7=week;

		//요일 계산

		//토에서 개행이 되어줘야 할 것 같은데?? > 그러면 어느 날짜가 토요일인지 맞춰야 하는 것 아닌가?

		//프린트를 출력하라

		System.out.printf("[%d년 %d월]",year,month);
		System.out.println(yoil);
		System.out.println("==========================");
		System.out.println(); 
		System.out.println("==========================");

*/