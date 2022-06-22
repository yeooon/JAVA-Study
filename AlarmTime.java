
/*=================================
★★★자바의 주요(중요) 클래스★★★
==================================*/

// Wrapper 클래스


import java.util.Scanner;

public class AlarmTime {
	private int hour;
	private int minute;
	private boolean active =false; //초기 값은 꺼져있는 상태
	private boolean[] repeat = new boolean[7];
	private char[] day = {'일','월','화','수','목','금','토'};
	
 	public AlarmTime() //시간설정
	{
		this(0,0,null,false);
	}

 	public AlarmTime(int hour, int minute) //시간설정
	{
		this(hour,minute,null,false);
	}
	public AlarmTime(int hour, int minute,boolean[] repeat, boolean active)
	{
		this.hour = hour;
		this.minute = minute;
		this.repeat = repeat;
		this.active = active;
	}

	public boolean isActive() //알람상태
	{
		if(active == true)
		{
			System.out.println("알람이 켜져있는 상태입니다.");
			return true;	
		}
		else
		{
			System.out.println("알람이 꺼져있는 상태입니다.");
			return false;
		}
	}

	public int getHour() //설정된 시간 리턴
	{
		return hour;
	}

	public int getMinute() //설정된 분 리턴
	{
		return minute;
	}

	

	public boolean[] getRepeat() //설정된 반복 요일을 리턴
	{		 
		return repeat;
	}

	

	public void setAlarmTime(int hour, int minute, boolean[] repeat, boolean active) //설정변경
	{
		this.hour = hour;
		this.minute = minute;
		this.repeat = repeat;
		this.active = active;
		if(active == true) //알람이 켜있으면
		{
			if(0<hour && hour<24 && 0<=minute && minute<60)
			{	
				System.out.println("설정된 시간은"+getHour()+"시"+getMinute()+"분"+"입니다.");
				System.out.printf("반복되는 요일은 ");
				for(int i=0;i<repeat.length;i++)
				{
					if(repeat[i] == true)
						System.out.printf("%c ",day[i]);
				}
				System.out.printf("입니다.");
				System.out.println();
			}
			else {
				System.out.println("시 또는 분이 잘못 입력되었습니다");	
			}
		}
		else {
			isActive();
		}
	}

	public static void main( String[] args ) //메인함수
	{
		Scanner scanner = new Scanner(System.in);
		boolean[] krepeat = new boolean[7];  
		boolean active;
		boolean t,d;
		int khour;
		int kminute;
		int p=0;
		AlarmTime[] k = new AlarmTime[50];
		do
		{
			p++;
			System.out.printf("알람을 켜시겠습니까?");
			active = scanner.nextBoolean();
			if(active == true)
			{
				System.out.printf("알람을 킬 시간과 분을 입력해주세요 :");
				khour = scanner.nextInt();
				kminute = scanner.nextInt();

				System.out.printf("알람이 반복될 요일을 입력해주세요 :"); //일 ~토요일 순입니다.
				for(int i=0;i<krepeat.length;i++)
				{
					t = scanner.nextBoolean();
						krepeat[i] = t;
				}
				k[p] = new AlarmTime(khour, kminute, krepeat, active);
				k[p].setAlarmTime(khour, kminute, krepeat, active);
			}
			else
			{
				k[p] = new AlarmTime();
				k[p].isActive();
			}
			System.out.println();
			System.out.printf("다시 실행하시겠습니까 ? :");
			d = scanner.nextBoolean();
			System.out.println();
		}while(d == true);
		System.out.printf("사용을 종료합니다");

	}
}
