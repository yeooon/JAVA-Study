
//클래스 설계
//배열 활용
//접근제어지시자와 정보은닉

//사용자로부터 년, 월, 일을 입력받아
//해당 날짜의 요일을 출력하는 프로그램을 구현한다.
//단, 달력 클래스(Calendar)는 사용하지 않는다.
//또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다.(WeekDay)
//그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
//접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
//최종적으로 WeekDay 클래스 설계를 통해
//Test101 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

// 1년 1월 1일 > "월요일"

//실행 예)
// 년 월 일 입력(공백 구분) : 2022 1 19
// 2022년 1월 19일 → 수요일
// 계속하려면 아무 키나 누르세요...


import java.util.Scanner;

class WeekDay
{

	//변수 선언
	private int day, month, year;

	//인풋(년도와 날짜를 받아들일 수 있도록 함)
	public void input() //메소드에는 ;붙이지 말기
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("년 월 일 입력(공백 구분) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
	}

	//연산 → 요일 산출이라 String
	public String week() //왜 문자열로 받는지? 시선이 닿는 곳에 있으면 ()안에 들어갈 거 필요 없다
	{
		int nal,w; //날수를 종합할 변수

	//달 배열 구성
	int months[] = {30,0,31,30,31,30,31,31,30,31,30,31}; //12개

	//요일 배열 구성
	String weekname[] =  {"월","화","수","목","금","토","일"}; //7개

	//달 배열의 0부분 채워넣는 과정
	
	if (year%4==0 && year%100!=0 && year%400==0) //값을 만족하면 
	{
		months[1] = 29; //달 배열의 첫번째 값은 29
	}
	else
	{
		months[1] = 28; //달 배열의 두번째 값은 28
	}

	nal = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400; //1년 날수 구하는 계산(????)

	//0월 1월 2월... 식이라 -1하는 것 2월 입력하면 1월까지 날짜 계산
	for (int i=0;i<(month-1);i++) //배열이 0부터 시작하기 때문에 1을 빼주는 것
	{
		nal+=months[i];
	}

	nal+=day; //1년 계산된 날수는 365일과 똑같다

	w=nal%7; //요일변수 = 날수 % 7 나머지 0 → 
	
	return weekname[w];

	}
	//프린트
	public void print(String d)//스트링 뒤에 들어가는건 아무 알파벳이라도 좋음
	{
		System.out.printf("%d년 %d월 %d일 → %s요일",year,month,day,d);
	}

}


public class Test101
{
	public static void main(String[] args)
	{
		WeekDay ob = new WeekDay();

		ob.input();

		String weeks = ob.week();

		ob.print(weeks);
	}
}