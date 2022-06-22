
// 1부터 100까지 정수의 합을 구하되, 10의 배수가 될 때 마다 결과를 출력하는 프로그램을 구현한다.

// 1~10까지의 합 : xx
// 1~20까지의 합 : xxx
//		:
// 1~100까지의 합 : xxxx
//계속하려면 아무 키나 누르세요...

public class Test050
{
	public static void main(String[] args)
	{
		//변수 설정
		int n=1, sum=0;

		while (n<=100)
		{
			sum+=n;
			if (n%10==0) //n이 10의 배수가 될 때 마다
			{
				//출력
			System.out.printf("1 ~ %d까지의 합 : %d%n", n, sum);
			}
			n++;
		}
	}
}