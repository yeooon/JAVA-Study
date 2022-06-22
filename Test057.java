
//반복문(do ~ while문) 실습

/*
do ~ while문은 while문과 마찬가지로
특정한 영역을 반복 수행하는 반복문이다.
다만 while과 다른 점은
조건식에 대한 검사를 반복문을 수행한 후에 한다는 것이다.
이와 같은 성격으로 인해 반드시 한 번은 수행하게 된다는 특징을 갖는다.

형식 및 구조

	do
	{
		실행문;
	}
	while(조건식);
*/

public class Test057
{
	public static void main(String[] args)
	{
		int n=1; //n에 1을 넣어
		do
		{
			System.out.println("n="+n); // n이 
			n++; //n에 1을 더해
		}
		while (n<=10); 
	}
}
		/*
//n이 2가 되는데 그럼 10 통과지
		*/
		/*
		int n=0;
		do
		{
			n++; 
			System.out.println("n="+n); // 출력되는 시점 
		}
		while (n<10); //계속 반복될지, 아니면 종료될지 정해지는 시점
		*/
		/*
		int n=0;
		do
		{
			System.out.println("n="+ n++); // 출력되는 시점 /1출력 10까지 출력
		}
		while (n<=10); //계속 반복될지, 아니면 종료될지 정해지는 시점
		*/
// 불확정일때 많이 활용되는 편.
// 예를 들어 사용자로부터 특정 범위의 정수가 입력 될 때까지 
// 입력받는 행위 자체를 반복해서 수행해야 하는 상황이라 가정한다.
// 일단 입력해보쇼. 맞는지 아닌지는 판단하고 알려주겠다.

// 즉 최소 한 번은 사용자의 입력값을 받아오는 처리를 수행해야
// 반복을 추가로 수행할지 말지의 여부를 결정할 수 있는 상황이다. 
/*
java.util.Scanner sc = new java.util.Scanner(System.in);

int num;

do
{
	System.out.print("100 이상의 정수를 입력하세요 : ");
		num = sc.nextInt();
}
while (num<100);
	System.out.println("→ 100 이상의 정수 입력 완료~ ");
		
	}
}
*/
/*
n=1
n=2
n=3
n=4
n=5
n=6
n=7
n=8
n=9
n=10
계속하려면 아무 키나 누르십시오 . . .

*/