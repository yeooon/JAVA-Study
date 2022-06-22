public class Test025
{
	public static void main(String[] args)
	{
		int a = 13, b = 7;
		int c, d, e;
		
		//비트 연산은 전부 다 비트로 바꿔서 계산
		//EX 11001100 00110011 이런식

		c = a & b; // 둘 다 1이어야만 1이다,
		d = a | b; // 하나라도 1이면 1이다.
		e = a ^ b; // 서로 달라야만 1이다.

		System.out.printf("a & b : %d%n", c);
		System.out.printf("a | b : %d%n", d);
		System.out.printf("a ^ b : %d%n", e);

	}
}

/*
a & b : 5
a | b : 15
a ^ b : 10
계속하려면 아무 키나 누르십시오 . . .
*/

