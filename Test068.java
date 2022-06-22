
//continue 실습
//continue 를 활용하여
//다음과 같이 출력될 수 있도록 프로그램을 구현한다.

/*
1 : 1 n
3 : 4
5 : 9
  :
99 : 2500
계속하려면 아무 키나 누르세요...
*/
//홀수의 누적합을 구하시오

//입력받는거 따로 없고. 
//1부터 100까지의 범위에서 홀수를 구분함
//홀수의 누적값을 구함

public class Test068
{
	public static void main(String[] args)
	{
		int n = 0; //0으로 초기화
		int result = 0; //누적합
		while (n<100) //n의 범위
		{
			n++;
			System.out.printf("%d : %d%n",n,result);
			if(n%2!=0)// n이 짝수라면...
			continue; //뒷부분 무시하고 계속해라				
			result+=n; // 누적값을 구함
		}
				
	}
}