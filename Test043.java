
//switch문 실습

//다중 선택문이라 하며, switch문 다음의 수식 값에 따라
//실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.
//다중 선택문 = 스위치문

/*
형식 및 구조
switch(수식)
{
	case 상수1 : 문장1; [break;](break안에 들어있는 건 생략이 가능한 부분)
	case 상수2 : 문장2; [break;]
		.
		.
	[default : 문장n+1;[break;]]
}

switch문의 수식과 case의 상수는 
byte, short, int, long 형이어야 한다.(정수형)

break 멈추고 빠져나간다
continue 뒷부분 무시하고 계속해라

case 문 뒤에 break가 없는 형태인 경우
다음 case 문의 문장을 계속해서 이어서 수행하게 된다. >> 기본모델
break가 존재할 경우 해당 지점에서 수행을 멈춘 후 switch 문을 빠져나간다. >> 일반모델


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, mat, eng, tot;
		int avg;
		char grade;

		System.out.print("이름 입력 : ");
		name = br.readLine();
		
		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 입력 : ");
		mat = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());

		tot = kor + mat + eng;
		avg = tot/3;

		switch(avg/10)   //avg를 확인해서 평균이 100이라면 A에 담겠다, 60이라면 d에 담겠따
		{
			case 10 : grade = 'A'; break;
			case 9 : grade = 'A'; break;
			case 8 : grade = 'b'; break;
			case 7 : grade = 'c'; break;
			case 6 : grade = 'd'; break;
			default : grade = 'f'; break;

		}	

		System.out.printf("%n당신의 이름은 %s 입니다.", name);
		System.out.printf("%n당신의 평균은 %d 입니다.", avg);
		System.out.printf("%n당신의 등급은 %c 입니다.", grade);
	}
}

/*
이름 입력 : 이연주
국어 점수 입력 : 29
수학 점수 입력 : 53
영어 점수 입력 : 65

당신의 이름은 이연주 입니다.
당신의 평균은 49 입니다.
당신의 등급은 f 입니다.계속하려면 아무 키나 누르십시오 . . .
*/