/*===============
 ★★★배열★★★
 ================*/
 //배열의 기본적 활용

 //사용자로부터 인원수를 입력받고
 //입력받은 인원 수 만큼의 하생 이름과 전화번호를 입력받고
 //이를 이름 배열과 전화번호 배열로 구성하여
 //결과를 출력할 수 있는 프로그램을 구현한다.

 //실행 예)
 //입력 처리할 학생 수 입력(명, 1~10) : 27
 //입력 처리할 학생 수 입력(명, 1~10) : -5
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백구분) : 박현수 010-1111-1111
// 이름 전화번호 입력[1](공백구분) : 신시은 010-1111-1111
// 이름 전화번호 입력[1](공백구분) : 오이삭 010-3333-3333

//---------------------------
//전체 학생 수 : 3명
//---------------------------
//이름     전화번호
//---------------------------
//이름		전화번호
//박현수	010-1111-1111
//신시은	010 ~
//오이삭	010 ~
//---------------------------
//계속 하려면 아무 키나 누르시오

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	//변수
	int membercount = 0;

		//인원 수 입력받기 (옳은 수가 나왔을 때 반복됨 > 아닌 수가 나왔을 때 반복되어야하는데.)
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10)  : ");
			membercount = sc.nextInt();
		}
		while (membercount<1 || membercount>10); //두개 이상의 조건은 논리연산자(무조건)

/*
	//테스트(수시로 해볼것)
	System.out.print("사용자가 입력한 숫자  : "+membercount);
*/

	//이름 배열로 구성하기
	String[] names = new String[membercount]; //멤버카운트 만큼 배열 방을 만들어라

	//이름 배열로 구성하기
	String[] tels = new String[membercount]; //네임즈 범위(멤버카운트) 만큼 배열 방을 만들어라


	//(반복) 학생 이름과 전화번호 입력받기(?????)(스트링 아니면 뭘로 받는데??)이름과 숫자를 동시에 뭘로 받는데?????
	for (int i = 0 ; i<membercount ; i++) //i는 배열값, <>에 = 거의 안 들어가게 된다
	{
		System.out.printf("이름 전화번호 입력 [%d]", i+1); //뭐지? 오류가 뜬다.
		names[i] = sc.next();
		tels[i] = sc.next();	
	}

	//최종 결과 출력

	//학생 수 표기
	System.out.println();
	System.out.println("------------------");
	System.out.printf("전체 학생 수 : %d%n",membercount);
	System.out.println("------------------");
	System.out.println("이름		전화번호\n");

	//학생 리스트 반복 출력
	for (int i=0;i<membercount;i++)
	{
		System.out.printf("%2s %4s%n",names[i],tels[i]);
	}
	}
}
