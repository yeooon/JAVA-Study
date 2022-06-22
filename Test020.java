
import java.util.Scanner;

public class Test020
{
	public static void main(String[] args)
		{
			//주요변수선언
			java.util.Scanner sc = new java.util.Scanner(System.in);
			String name;
			int kor, eng, mat, tot;

			//연산 및 처리
			System.out.print("이름 국어 영어 수학 입력(공백 구분) : ");

				// 사용자가 입력한 데이터를 각 변수에 한 번에 담아내기
				name = sc.next();
				kor = sc.nextInt();
				eng = sc.nextInt();
				mat = sc.nextInt();

				//총점 산출

				tot = kor + eng + mat;

				System.out.print("\n>> 이름 : " + name);
				System.out.print("\n>> 총점 : " + tot);

/*
이름 국어 영어 수학 입력(공백 구분) : 이연주
90
80
70

>> 이름 : 이연주
>> 총점 : 240계속하려면 아무 키나 누르십시오 . . .
*/


		}
}