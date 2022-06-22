/*================================
★★★클래스와 인스턴스★★★
================================*/

//사용자로부터 임의의 정수를 입력받아 
//1부터 입력받은 수까지의 합을 연산하여
//결과값을 출력하는 프로그램을 구현한다.

//단, 클래스와 인스턴스 개념을 활용하여 처리할 수 있도록 한다.
//또한, 입력 처리 과정에서 BufferedReader의 ReadLine()을 사용하여,
//입력 데이터가 1보다 작거나 1000보다 큰 경우
//다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다

//임의의 정수 입력(1~1000) : 1050
//임의의 정수 입력(1~1000) : -45
//임의의 정수 입력(1~1000) : 100
//>>1~100까지의 합 : 5050
//계속하려면 아무 키나 누르세요...

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;

	class Hap 
{
	int n;
	
	//데이터를 입력받는
	void Input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
		System.out.print("임의의 정수 입력(1~1000) : ");

		n = Integer.parseInt(br.readLine()); 
		}
		while (n<1||1000<n);
	}
//==============================================//이부분이 문제라서 더 봐야함
	//데이터의 합산 //i라는 새 변수가 등장하네?
	int	sum()
	{
		int result = 0;

		for (int i=0;i<=n;i++) //n이 커질 수는 없으니까 루프변수 i의 등장
		{
			result+=i;
		}		
		return result;
	}

//===============================================

	//프린트값
	void print(int sum) //↓위의 메소드 이름을 데려옴
		{
		System.out.printf("1 ~ %d까지의 합 : %d",n,sum);
		}
}


public class Test074
{
	public static void main(String[] args) throws IOException
	{
	Hap ob = new Hap();

	//생성한 인스턴스를 통해 입력 메소드 호출
	//참조변수 활용
	//ob라는 참조변수를 이용해 인풋 호출
	ob.Input();

	//합 메소드==생성한 인스턴스를 통해 연산 처리 메소드 호출 > sum
	int h = ob.sum(); 
	//h일필요 없고 정수 뭔가임
	//


	//매개변수가 필	//생성한 인스턴스를 통해 출력 메소드 호출 > print요함
	ob.print(h);
	}
}

/*

	//합 메소드
	int hap = ob.sum();

	//데이터의 크기를 구분할 수 있는 클래스
	int dt() //
		if (num<0)
		{
			boolean false;
		}
		if else (num>0)
		{
			boolean false;
		}
		else 
			boolean true;


	//데이터의 합산 구역
	int	sum()
	{
		do
		{
		result+=n;
		n++;
		}
		while (n>0 || n<1000);

		return result;
	}

*/
