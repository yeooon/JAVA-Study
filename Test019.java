// 자바의 기본 입출력 : java.util.Scanner
// 버퍼드리더가 익숙해질 때 까지 스캐너 사용 금지
// ※java.until.Scanner
// 단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할
// 디폴트(default)로 사용되는 단락문자는 공백이다.
// 작성된 다음 토큰은 next 메소드를 사용
// 다른 형태(자료형)의 값으로 변환할 수 있다.


import java.util.Scanner; 


public class Test019
{
	public static void main(String[] args)
	{
		// Scanner 클래스 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;

		System.out.print("이름을 입력하세요 : ");
		name = sc.next();  //문자열 형태로 담아가지고 옴

		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();  
		//버퍼리더는 형변환시 Integer.parseInt 해야하는데,
		//스캐너는 sc.nextInt(), 이렇게 뒤에 붙여주기만 하면 된다!

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();

		//결과 출력

		System.out.println(" ");
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + (kor + eng + mat));



		

	}
}