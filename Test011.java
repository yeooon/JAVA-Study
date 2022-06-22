// 변수와 자료형
// 변수와 자료형 실습 및 테스트 : double
// 나눗셈 연산 실습

public class Test011
{
	public static void main (String[] args)
	{
		// 정수와 정수의 나눗셈
		double a = 1 / 2;
		//double a = 0;
		//내 상식으로는 1나누기2가 0.5인데 정수의 나눗셈이라 0만 도출
		System.out.println("double a : " + a);
		//double a = 0.0;
		double b = 1/2 + 1/2;
		System.out.println("double b : " + b);
		//double b = 0.0;

		// 피 연산자로 실수가 포함되어 있는 형태의 나눗셈
		// 실수가 포함되어 있는 연산에는 실수 기반으로 연산해줌
		// 신기하네. 정수만 있으면 정수값만, 실수가 포함되어 있으면 실수값만
		double c = 1 / 2.0;
		System.out.println("double c : " + c);

		double d = 3/2 + 1/2;
		System.out.println("double d : " + d);

		double e = 3/2 + 1/2.0;
		System.out.println("double e : " + e);


	}
}

/*
double a : 0.0
double b : 0.0
double c : 0.5
double d : 1.0
double e : 1.5
계속하려면 아무 키나 누르십시오 . . .
*/