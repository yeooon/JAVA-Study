//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 소수인지 아닌지를 판별하여
//결과를 출력하는 프로그램을 구현한다.

//소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도 나누어 떨어지지 않는 수. 
//단, 1은 소수 아님

//실행 예
//임의의 정수 입력 : 10
//10 → 소수 아님

//임의의 정수 입력 : 11
//11 → 소수!

//hint 967 많이 나누어 봐야하네...
//마지막으로 대상이 1인지 아닌지를 판단.
//와우.

//bloolean flag=true

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int num; //사용자가 입력할 값
		int n = 2;
		String result = "소수다";
		boolean flag = true; //num사용자 입력값은 소수일 것이다. 

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		//연산 과정
		//소수
		
 
\

boolean flag = true; //num사용자 입력값은 소수일 것이다. 

while(n<num) //num이 6일때
{
	if(num%n==0)
	{
		// result = "소수가 아니다~"
		flag = false; // "소수가 아니다~"
		break;//break를 감싸는 가장 가까운 반복문
	}
	n++; //그럼 n의 용도는 뭐지?(이게 필요가 없어지기 때문에, break가 등장한다)
	}
	if (flag && num!=1)
	//최종적으로 num은 소수다
	System.out.printf("%d → 소수\n", num)
	else 
	//최종적으로 num은 소수가 아니다. 
	System.out.printf("%d → 소수아님\n", num)

//system.out.println(result); //결과 출력 전 1인지 아닌지에 대한 추가 조건 삽입


/*
		int n=0; //변수 입력
		int result = 0;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		//연산 과정
		//소수
		
		while (0<n) //n이라는 값을 넣었을 때 
		{
			result+=n; //결과는 n만큼 증가한다.
			if (n%2==0||n%(n-1)==0)
				System.out.printf("%d → 소수아님\n",result);
			else if (n%2!=0||n%(n-1)!=0)
			{
				System.out.printf("%d → 소수\n",result);
			}
			else 
			System.out.println("계산불가");
			return;
		}
	}
}
*/