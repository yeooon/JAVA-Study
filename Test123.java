
/*=====================
★★★클래스 고급★★★
======================*/

// 인터페이스(Interface)

// ○ 실습 문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2280946 홍은혜
// 국어 영어 수학 점수 입력(공백 구분)	  : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2290847 최문정
// 국어 영어 수학 점수 입력(공백 구분)	  : 90 100 85

// 2280946 홍은혜		90  100  85		xxx xx
//						수   수  우
// 2290847 최문정		75   85  65		xxx xx
//						우	 미	 양
// 계속하려면 아무 키나 누르세요...

// 속성만 존재하는 클래스 → 자료형 활용



import java.util.Scanner;

class Record
{
	String hak, name;	//-- 학번, 이름, 등급
	int kor, eng, mat;	//-- 국어, 영어, 수학 점수
	int tot, avg;		//-- 총점, 평균(편의상 정수 처리)
}



// 인터페이스
interface Sungjuk
{
	public void set();		//-- 인원 세팅
	public void input();	//-- 데이터 입력
	public void print();	//-- 결과 출력
}



//		↓  오버라이딩 예정




// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	Scanner sc = new Scanner(System.in);

	@Override
	public void set()	//인원 수 
	{
		do
		{
		System.out.print("인원 수 입력(1~10) : ");
		inwon = sc.nextInt();
		}
		while (inwon<0||inwon>10);		
	}
	
/*
그 연주님 for문 안에 인스턴스 생성문 넣는 이유가 저희가 Record 클래스를 담는 껍데기인 Record 배열만 있고 
안에 Record 인스턴스가 하나도 없어서 해당하는 i번째의 배열 요소를 생성하는겁니다!!
*/

	@Override
	public void input()
	{
		rec = new Record[inwon];	//→ 인원 갯수대로의 정렬 생성

		for (int i=0;i<inwon;i++)
		{
		Record rc = new Record();	// 레코드 클래스 인스턴스 생성
		rec[i] = rc;				//rec[i]는 레코드 클래스 안의 요소들 정렬이다. 

		System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ",i+1);
		rec[i].hak = sc.next();
		rec[i].name = sc.next();

		System.out.print("국어 영어 수학 점수 입력(공백 구분) : ");
		rec[i].kor = sc.nextInt();
		rec[i].eng = sc.nextInt();
		rec[i].mat = sc.nextInt();

		rec[i].tot += rec[i].kor + rec[i].eng + rec[i].mat;
		rec[i].avg = rec[i].tot/3;
		}
	}

	@Override
	public void print()
	{
		for (int i=0;i<inwon;i++)
		{
		System.out.printf("%s %s, %d %d %d, %d %d\n",rec[i].hak,rec[i].name,rec[i].kor,rec[i].eng,rec[i].mat,rec[i].tot,rec[i].avg);		
		}
		//System.out.printf("%s %s %s",);			
	}
	
	// 내부적으로 등급에 대한 판정을 수행할 메소드

	private String panjung(int score)	//판정이라는 메소드 안의 결과 
	{

		// 변수 저장... 안되는 건가... 
		String result;

			if (score>=90)
				result = "수";
			if (score>=80 && score<90)
				result = "우";
			if (score>=70 && score<80)
				result = "미";
			if (score>=60 && score<70)
				result = "양";
			if (score>=50 && score<60)
				result = "가";	

		return result;

/*
			switch (score)
			{
			case 100 : return "수";
			case 90 :  return "수";
			case 80 :  return "우";
			case 70 :  return "미";
			case 60 :  return "양";
			default : return "가";
			}
*/
	}		
}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test123
{
	public static void main(String[] args)
	{
		SungjukImpl ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();	//기본 설정
		ob.input(); //입력
		ob.print();	//출력
	}
}