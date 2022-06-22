
/*============================
// 실행 흐름의 컨트롤(제어문)
==============================*/

// if ~ else 문 실습
// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 출력받아
//다음과 같은 형태로 출력하는 프로그램을 작성한다.
//등급은 평균 점수를 기준으로 처리한다.
//90점 ~ 100점 : A   80점 ~ 89점 : B
//70점 ~ 79점 : c 60점 ~69점 D
/*
프로그램을 작성할 때 주어진 조건에 따라
분기 방향을 정하기 위해 사용하는 제어문에는
ir 문, 
*/
//단, 버퍼리더의 리드라인 메소드를 통해 입력받을 수 있도록 하며,
//printf() 메소드를 통해 출력할 수 있도록 한다.
//실행 예)
// 이름 입력 : 이연주
//국어점수 :
//수학점수 :
//영어점수 : 

//>> 당신의 이름은 홍은혜입니다.
//>> 국어 점수는 90,
// 영어 점수는 80,
// 수학 점수는 70,
// 총점은 240이고 평균은 80입니다.
// 등급은 B입니다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수
		int a,b,c,total; //점수
		String name; //이름
		char rank; //랭크
		Double aver; //평균

		//연산

			System.out.print("이름 입력 : "); //입력하는 칸은 printf를 넣는게 아니구나!

			name = br.readLine();

			System.out.print("국어 점수 입력 : ");

			a = Integer.parseInt(br.readLine());

			System.out.print("수학 점수 입력 : ");
			
			b = Integer.parseInt(br.readLine());

			System.out.print("영어 점수 입력 : ");

			c = Integer.parseInt(br.readLine());


		total = a+b+c;
		aver = total/3.0;


		if (aver>=90)
		{
			rank = 'A';
		}
		else if (aver>=80)
		{
			rank = 'B';
		}
		else if (aver>=70)
		{	
			rank = 'C';
		}
		else if (aver>=60);
		{
			rank = 'D';
		}

			System.out.printf("\n당신의 이름은 %s 입니다", name);
			System.out.printf("\n국어 점수는 %d", a);
			System.out.printf("\n수학 점수는 %d", b);
			System.out.printf("\n영어 점수는 %d", c);
			System.out.printf("\n총점은 %d점이고 평균은 %.2f입니다", total,aver);
			System.out.printf("\n등급은 %n%s", rank);


	}
}