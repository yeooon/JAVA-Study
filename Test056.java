
// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리한다.

// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
//   :
// 7 * 9 = 63

//원하는 단(구구단) 입력 : 11


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n; //변수

		System.out.print("원하는 단(구구단) 입력 : ");
		n = Integer.parseInt(br.readLine()); // n을 입력하면 

		if(n<1 || n>9) //조건부터. 1보다 작거나 혹은 9보다 큰 건 제외 
		{
			System.out.println("보여드릴 수 없답니다");
			return; //(그대로 종료된다는 뜻이에요.
		}

		int a = 0;

		//반복 출력

		while (a<9)
		{
			a++;
			System.out.printf("%d * %d = %d%n",n,a,(n*a));
		}
	}
}

//됏슈.