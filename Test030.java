
// 조건 연산자 == 상황 연산자 
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지, 음수인지, 0인지 구분하여 
// 이 결과를 출력하는 프로그램을 구현한다.
// 단, 입력 데이터는 BufferedReader 의 readLine()을 통해 넘겨받을 수 있도록 한다.
// 또한, 조건연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : -12
// -12 > 음수
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수 입력
		int n;
		String r;
		
		// 연산 처리
		System.out.print("임의의 정수 입력 : ");
			n = Integer.parseInt(br.readLine());

		//	r = (n>0) ? "양수" :"음수"; (내가 한거)
			r = (n>0) ? "양수" : (n==0) ? "0" : "음수";
			// 식을 두 번 중첩해도 되는 부분이 어렵네...
			// n보다 크면? 양수임. 아닐 경우에, 다시! 
			// 아닐 경우 n이 0이면? 0!, 아닐시 음수!
			// 중첩개수에는 제한이 없음 

		//0 표시가 힘든데?
		
		System.out.print("");
		System.out.printf("%d → %s%n",n,r);

	}
}