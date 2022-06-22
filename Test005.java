/*===========================
//자바 기본 프로그래밍
===========================*/

// 변수와 자료형


public class Test005
{
	public static void main(String[] args)
	{
		int a;

		a = 10;
		System.out.println(" " + a + "입니다.");

		byte b = 20;
		System.out.println("b");

short c;
// c=a;  //  에러 발생(컴파일 에러)
c= (short)a;    // 명시적 형변환 (강제 형 변환)

System.out.println(c);
	}
}