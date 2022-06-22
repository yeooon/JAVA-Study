
//변수와 자료형
//키워드 및 식별자
//printf()

public class Test007
{
	public static void main(String[] args)
	{
		//주요 변수 선언 및 초기화
		int a = 10, b=5;  //변수 선언을 할 때엔 무조건 맨 뒤에 ; 한개만 붙이면 되는 건가?
		int c, d;

		//연산 및 처리
		c = a+b;
		d = a-b;

		//결과 출력
		System.out.println(c);
		System.out.println(d);
		// >> 15
		// >> 5

		// 결과 출력 > '10+5=15'로 출력이 됐으면 좋겠따.
		System.out.println(a + "+" + b + "=" + c);
		// 자바에서는 서로 다른 자료형의 데이터들끼리도 + 연산이 가능하다.
		// 다른 어떤 자료형과 문자열 데이터의 + 연산 결과는 문자열이다.
		// 즉, 문자열 결합 연산자로써 +

		//print() / println() / printf() / format()

		//print() / format()
		// JDK 1.5 부터 지원되는 메소드

		//서식 출력용 메소드
		//System.out.printf("○+○=○",10,20,30);
		System.out.printf("%d+%d=%d\n",10,20,30);
		//문자열 안에서 \n 개행 , %n 개행
		System.out.format("%d 와 %d\n",10,20,30);
		//System.out.printf("%d+%d=%d\n", 10, 3.14);
		// 런타임 에러 발생. 
		System.out.format("%d 와 %f\n",10,3.14);
		//10 와 3.140000

		System.out.printf("%.2f\n",3.14152);
		// 소수점 이하 2자리까지 표현(반올림 발생)
		System.out.printf("%.3f\n",3.14152);
		// 소수점 이하 3자리까지 표현(반올림 발생)


/*

15
5
10+5=15
10+20=30
10 와 20
10 와 3.140000
3.14
3.142
계속하려면 아무 키나 누르십시오 . . .

*/
		



	}
}