
//변수와 자료형
//자바의 기본 입출력 : BufferedReader 클래스

//사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
//이름과 총점을 출력하는 프로그램을 구현한다.

//실행 예)
// 이름을 입력하세요 : 김태형 (대기)
// 국어점수 입력 : (대기)
// 영어점수 입력 : (대기)
// 수학점수 입력 : (대기)

// ===[결과]===
// 이름 :
// 총점 : 
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //개같은거 .이 아니라 )써서 망함
	//InputStreamReader isr = new InputStreamReader(System.in)
	//BufferedReader br = new BufferedReader(isr)

	//변수
	/*
	int a, b, c, d;
	double e;
	*/
	String n; //이름변수
	int b, c, d, e; //전부 정수니까 한꺼번에 해도 상관x


	//출력
	System.out.print("이름을 입력하세요 : ");

	n = br.readLine(); //외부 데이터 담기, 정수형이 아니므로 이렇게 
/*
	n = Integer parseInt(br.readLine());
*/	
	System.out.print("국어점수 입력 : ");

	b = Integer.parseInt(br.readLine());  //여기 오류에는 Integer.parseInt를 Integer parseInt로 띄어써서 망함

	System.out.print("영어점수 입력 : ");

	c = Integer.parseInt(br.readLine());  //여기 오류에는 Integer.parseInt를 Integer parseInt로 띄어써서 망함
	
	System.out.print("수학점수 입력 : ");
	
	d = Integer.parseInt(br.readLine());  //여기 오류에는 Integer.parseInt를 Integer parseInt로 띄어써서 망함

	System.out.println("\n===[결과]===");

	System.out.println("\n이름 : " + n); //printf 문자열은 %s 정수는 %d 
		
	// System.out.printf("\n이름 : %s", n); 이렇게도 쓸 수 있다. 

	e = b + c + d;
	
	System.out.println("총점 : " + e);



	}
}

/*
Test016.java:25: error: ';' expected
        public static void main(String[] args) throw IOException
                                              ^
Test016.java:27: error: ')' expected
                BufferedReader br = new BufferedReader(new InputStreamReader (System(in));
                                                                                         ^
Test016.java:49: error: ';' expected
        b = Integer parseInt(br.readLine());
                   ^
Test016.java:53: error: ';' expected
        c = Integer parseInt(br.readLine());
                   ^
Test016.java:57: error: ';' expected
        d = Integer parseInt(br.readLine());
                   ^
Test016.java:63: error: ';' expected
        e = b + c + d
*/
