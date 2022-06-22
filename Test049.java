
//1부터 100까지 정수의 합 : 5050
//1부터 100까지 짝수의 합 : 2550
//1부터 100까지 홀수의 합 : 2500
//계속하려면 아무 키나 누르세요...

public class Test049
{
	public static void main(String[] args)
	{
		int n=1;
		int A=0; 
		int B=0;
		int C=0;

		while (n<=100)
		{
			C+=n;  //정수
			if (n%2==0)
			{
				A +=n; //짝수
			}
			else if (n%2!=0)
			{
				B +=n; //홀수
			}
			else
			{
				System.out.print("계산불가");
			return
			}
				n++;
		}
				System.out.print("1부터 100까지 정수의 합" +C);
				System.out.print("1부터 100까지 짝수의 합" +A);
				System.out.print("1부터 100까지 홀수의 합" +B);
	}
}

//{}표시땜에 돌아버리겠음. 이건 다시 입력해보는게 빠를 듯. 