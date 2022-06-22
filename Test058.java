// 사용자로부터 여러개의 양의 정수를 입력받고
// 그 합을 계산하여 출력하는 프로그램을 작성한다.
// 단,  -1이 입력되는 순간
// 입력을 중지하고 그동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
// 즉, -1을 입력 중지 커맨드로 활용한다.
// do~while문을 활용하여 문제를 해결할 수 있도록 한다. 

//정수1 입력 : 10
//정수2 입력 : 5
//정수3 입력 : 6
//정수4 입력 : -1
// >>현재까지 입력된 정수의 합 : xxx

public class Test058
{
	public static void main(String[] args)
	{
	java.util.Scanner sc = new java.util.Scanner(System.in);

	int num = 0;
	int result = 0;
	int n=1; //루프 변수로 활용하여 몇 번째 입력값인지 담아낼 변수 

	do
	{
		System.out.printf("%d번째를 입력하세요 (-1종료): ",n);
			num = sc.nextInt();
			result += num;
			n++;
	}
	while (num!=-1); //num이 1이 아닐 경우(계속해서 반복)
		//System.out.println("-1 입력 확인");
		System.out.printf("현재까지 입력된 정수의 합 : %d", (result+1)); //-1된거 복원
	}
}

//이 쉑 왤케 지랄맞지? 지랄은 내가 했네... {}를 입력 안했네... 