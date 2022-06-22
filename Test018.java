
// 자바의 기본 입출력 : system.out.printf()

public class Test018
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");

		System.out.println(); //개행
		System.out.printf("1234567890");
		System.out.printf("1234567890\n"); // \n개행
		System.out.printf("1234567890%n");  // %n개행

		// System.out.printf(); >> 컴파일 에러

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		
//10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);
		System.out.printf("%8d\n", 1234);
		System.out.printf("%010d\n", 123);

/*
123
       123
    1234
0000000123
*/

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);

/*
+365
+365
*/
		//System.out.printf("%-d\n", 365);
		//런타임 에러
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);

		//System.out.printf("%d\n", 'A'); 
		//에러. 정수 형태의 %d에는 문자를 담지 못한다.

		System.out.printf("%c\n", 'A'); //문자는 c와 ''
		System.out.printf("%s\n", "asdf"); //문자열은 s와 ""

		System.out.printf("%h\n", 365);
		// >> 16d
		System.out.printf("%o\n", 24);
		// >> 30

		System.out.printf("%b\n", true); // 불린의 B
		System.out.printf("%b\n", false);

		System.out.printf("%f\n",123.23);

		System.out.printf("%.2f\n", 123.23);
		
		System.out.printf("%.2f\n", 123.231);
		
		System.out.printf("%.2f\n", 123.235); // 반올림 발생

		System.out.printf("%8.2f\n", 123.236); //8은 글자 전체 영역 확보,2는 띄어 쓰기?

		System.out.printf("%2.2f\n", 123.236); //내가 표현해야 하는 부분보다 공간을 적게 쓰면 이 명령은 무시된다.

/*
AAABBBCCC

12345678901234567890
1234567890
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
-365
-365
A
asdf
16d
30
true
false
123.230000
123.23
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .

*/
	}
}