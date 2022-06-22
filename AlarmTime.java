
/*=================================
�ڡڡ��ڹ��� �ֿ�(�߿�) Ŭ�����ڡڡ�
==================================*/

// Wrapper Ŭ����


import java.util.Scanner;

public class AlarmTime {
	private int hour;
	private int minute;
	private boolean active =false; //�ʱ� ���� �����ִ� ����
	private boolean[] repeat = new boolean[7];
	private char[] day = {'��','��','ȭ','��','��','��','��'};
	
 	public AlarmTime() //�ð�����
	{
		this(0,0,null,false);
	}

 	public AlarmTime(int hour, int minute) //�ð�����
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

	public boolean isActive() //�˶�����
	{
		if(active == true)
		{
			System.out.println("�˶��� �����ִ� �����Դϴ�.");
			return true;	
		}
		else
		{
			System.out.println("�˶��� �����ִ� �����Դϴ�.");
			return false;
		}
	}

	public int getHour() //������ �ð� ����
	{
		return hour;
	}

	public int getMinute() //������ �� ����
	{
		return minute;
	}

	

	public boolean[] getRepeat() //������ �ݺ� ������ ����
	{		 
		return repeat;
	}

	

	public void setAlarmTime(int hour, int minute, boolean[] repeat, boolean active) //��������
	{
		this.hour = hour;
		this.minute = minute;
		this.repeat = repeat;
		this.active = active;
		if(active == true) //�˶��� ��������
		{
			if(0<hour && hour<24 && 0<=minute && minute<60)
			{	
				System.out.println("������ �ð���"+getHour()+"��"+getMinute()+"��"+"�Դϴ�.");
				System.out.printf("�ݺ��Ǵ� ������ ");
				for(int i=0;i<repeat.length;i++)
				{
					if(repeat[i] == true)
						System.out.printf("%c ",day[i]);
				}
				System.out.printf("�Դϴ�.");
				System.out.println();
			}
			else {
				System.out.println("�� �Ǵ� ���� �߸� �ԷµǾ����ϴ�");	
			}
		}
		else {
			isActive();
		}
	}

	public static void main( String[] args ) //�����Լ�
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
			System.out.printf("�˶��� �ѽðڽ��ϱ�?");
			active = scanner.nextBoolean();
			if(active == true)
			{
				System.out.printf("�˶��� ų �ð��� ���� �Է����ּ��� :");
				khour = scanner.nextInt();
				kminute = scanner.nextInt();

				System.out.printf("�˶��� �ݺ��� ������ �Է����ּ��� :"); //�� ~����� ���Դϴ�.
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
			System.out.printf("�ٽ� �����Ͻðڽ��ϱ� ? :");
			d = scanner.nextBoolean();
			System.out.println();
		}while(d == true);
		System.out.printf("����� �����մϴ�");

	}
}
