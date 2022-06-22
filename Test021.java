import java.util.Scanner;

public class Test021
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;


		// 연산 및 처리
		System.out.print("이름,국어,영어,수학 입력(,구분) : ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		

		// sc = new Scanner("이연주,90,80,70"),useDelimiter("\\s*,\\s*");
		// 
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;


		// 결과 출력
		System.out.println("\n>> 이름 : " + name);
		System.out.println(">> 총점 : " + tot);
	}
}