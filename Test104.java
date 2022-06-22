/*========================
클래스와 인스턴스
=========================*/

//클래스와 인스턴스 활용

//1~3 사이의 난수를 발생시켜서
//가위, 바위, 보 게임 프로그램을 구현한다.
//단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
//또한, 배열을 활용하여 처리할 수 있도록 한다.
//최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

//  기준 데이터 → 1:가위, 2:바위, 3:보

// 실행 예)
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 4
// 1:가위, 2:바위, 3:보 중 입력(1~3) : -2
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 2

//-유저 : 바위
//-컴퓨터 : 보

// >>승부 최종 결과 : 컴퓨터가 이겼습니다~~!!!

//계속하려면 아무 키나 누르세요...

import java.util.Random;
import java.util.Scanner;

class RpsGame
{

//변수
		int Num;			//사용자가 입력한 숫자를 담아놓을 인수
		int[] RpsNum;		//사용자가 입력한 숫자를 모아놓은 배열
		String str[] = {"가위","바위","보"};			//필요한 가위바위보 문구


//인풋 > 사용자가 가위, 바위, 보 중 하나를 입력할 수 있게 만들기
		
	void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			Num = sc.nextInt(); // 숫자 입력하기
		}
		while (Num<0||Num>3);

		RpsNum = new int[Num]; // 알피에스넘배열은 뉴 범위만큼 만들겠다.
	}	


//계산 win,loose,sam
	int randomGame()
	{
		//난수를 발생시킨다.
		Random rd = new Random();

		for (int i = 0;i<Num;i++)
		{
			//RpsNum배열은 rd 입력받은 숫자로 구성된다. (+1?)
			int com = rd.nextInt()+1;//컴퓨터가 발생시킨 난수 
			//유저의 값은 Num으로 정해져 있음 
			String result;
			//RpsNum[j]=rd.nextInt()+1;				//RpsNum[j]는 발생한 난수가 담겨있다.
			
			for (int j = 0;j<3;j++)
			{
				if (RpsNum[i]==RpsNum[j]) 
				{
					result = "비겼습니다";
				}
				else if (RpsNum[i]<2)
				{
					result = "이겼습니다";
				}
				else if (RpsNum[i]>2)
				{
					result = "졌습니다";
				}
			}
		}

		//그리고 발생한 난수를 이용하여 경우의 수 계산하기
		//숫자가 같으면 비긴거고
		//1일때 2면 진거 / 2일때 3이면 진거 / 3일때 1이면 진거
		//1일때 3이면 이긴거 / 2일때 1이면 이긴거 / 3일때 2면 이긴거
	}
//프린트
	void print();
	{
		System.out.printf("-유저 : %d%n", RpsNum[i]);	
		System.out.printf("-컴퓨터 : %d%n", RpsNum[j]);
		System.out.printf("승부 최종 결과 : %s",result);
	}


}

public class Test104
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();

		ob.randomGame();

		ob.print();
	}
}