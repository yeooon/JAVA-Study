
//반복문 실습(for)

//1부터 100까지의 정수 중에서
//4의 배수만 출력하는 프로그램을 구현한다.
//단, for문을 활용해야 하며
//한줄에 5개씩만 출력할 수 있도록 한다.

// 4 8 12 16 20
//24 28 32 36 40
//등등...

public class Test060
{
	public static void main(String[] args)
	{
			for (int n = 4;n<=100;n+=4) 
			//변수 4로 초기화, 100보다 작은 범위, n은 4만큼 증가
			{
			System.out.printf("%4d",n);
			if(n%(4*5)==0)
				System.out.println();
			//출력 구문이 4*5의 배수가 될 때 마다
			//개행
			}
	}
}