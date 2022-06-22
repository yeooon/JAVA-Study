
//반복문 
//사용자로부터 임의의 두 정수를 입력받아
//작은 수부터 큰 수까지의 합을 구하여(중요!)
//결과를 출력하는 프로그램을 구현한다.

//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 20
//>> 10 ~ 20 까지의 합 : xxx

//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 2
//>> 2 ~ 10 까지의 합 : xxx

//쉐끼가 버퍼드 리더부터 못읽고 있는 것 같은데 / 내가 {}를 안 했네...^^ 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n; //루프 변수로 활용할 변수? 
	int a,b; //임의의 두 정수
	int result = 0; //정수 결과값

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

	//입력받은 두 수의 크기 비교와 자리 바꿈
	if (a>b)
	{
		a ^ b=a;
		b ^ a=b;
		a ^ b=a;
	}
	// 반복 연산 
	// 반복 연산 수행 전에
	// 작은 수를 따로 저장해 루프 변수로?
	// 결과 출력 과정에서 입력받은 작은 수가 필요한데...
	// 그 수를 반복 과정에서 사용하게 되면 원래의 값을 사용할 수 없기 때문

	n = a;

	while (n<b)
	{
	result += n;
	n++;
	}
	//결과 출력
	System.out.printf("%d ~ %d까지의 합 : %d",a,b,result);
	}

		

}