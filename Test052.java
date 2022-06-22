
// 1*2*3*4*5...*10

//연산결과 : xxx
//계속 하려면 아무 키나 누르세요...

public class Test052
{
	public static void main(String[] args)
	{
		//주요 변수 및 초기화
		int n=0, result=1; //누적 곱을 담을 변수는 1로 초기화 하는 것이 일반적이다. 

		//연산 및 처리(반복문 구성)
		while(n<10)
		{
			n++;
			result *= n;
		}
		System.out.print("연산결과 : " + result);

	}
}