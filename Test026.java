// 비트 단위 연산자
// 비트 단위 연산자 [xor]연산자를 활용하여
// 두 변수에 담겨있는 내용(값) 바꾸기

public class Test026
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int x=20, y=23;
		//int temp; // <<< 임시 저장 변수(빈컵)

		// 담긴 내용물 확인
		System.out.printf("x > %d, Y > %d", x, y);

		//연산 및 처리
		/*
		temp = x;
		x = y;
		y = temp;
		// 빈컵에다 X를 담고, X에다 Y를 담고, 빈컵에 있는걸 Y에 담는)
		*/

		x=x^y;
		y=y^x;
		x=x^y; //처음거를 마지막에 다시 한 번 반복해주기

		// 담긴 내용물 확인
		System.out.printf("%nx > %d, Y > %d", x, y);

	}
}