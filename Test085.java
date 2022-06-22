
//배열의 가본적 활용
//과제
//사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
//단, 배열을 활용하여 구현할 수 있도록 한다.

//실행 예)
//입력할 데이터의 갯수 : 12
//데이터 입력(공백 구분) : 12 45 89 15 78 42... 등등
//>>가장 큰 수 → 89
//계속 하려면 아무 키나 누르세요...
//

import java.util.Scanner;

public class Test085
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int num = 0; // 입력할 데이터의 갯수
		int big = 0; // 가장 큰 수를 담을 변수

		//① = 데이터를 입력받는다

		System.out.print("입력할 데이터의 갯수 : ");
			num = sc.nextInt();

		//② = 입력받은 데이터를 집어넣을 배열을 만든다

		int [] datas = new int[num]; //넘 갯수만큼 배열 방을 만들어라. 인트 타입일거고, 이름은 데이타스로 하겠다.

									 //데이타스 = 입력한 숫자들을 모으는 곳

		//③ =  데이터를 입력토록 한다. 
		//for문을 이용해 data=num범위만큼 증가시킨다. 0,1,2,3... 그리고 그 방 안에 들어갈 숫자를 입력받는다.

		System.out.print("데이터 입력(공백구분) : ");
			for (int i=0;i<datas.length;i++) //i는 0부터 시작해서, 데이타스의 범위만큼 커질거다
			{

		//④ = 만약 big이 데이타스 배열보다 작을 때에, big은 datas의 최댓값이다.

				datas[i]=sc.nextInt(); //데이타스 방에 들어갈 숫자를 입력하라

				if (big<datas[i])
				{
					big=datas[i];
				}
			}

			System.out.printf("가장 큰 수 : %d",big);

		//범위 테스트

	}
}