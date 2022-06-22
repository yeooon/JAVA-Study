
// 변수와 자료형
// 실수형 데이터타입의 정밀도 테스트 실습

public class Test022
{
	public static void main(String[] args)
	{
		// 주요 변수 선언

		float a = 0; //정확도 낮음
		double b = 0; //정확도가 있음

		// 연산 및 처리 >> 100000(십만)번 반복
		for (int i = 1; i<=100000; i++)
		{
			//System.out.println("출력");

			a += 100000; //a를 십만 만큼 증가시켜라
			b += 100000; //b를 십만 만큼 증가시켜라
		}

		// 결과 출력

		System.out.println("float a : " + a/100000);
		System.out.println("double b : " + b/100000);

/*

*/
	}
}