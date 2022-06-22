


import java.util.Scanner; //이런 구문은 항상 맨 위에

public class sungjuk 
{
	//0. 주요 속성 구성
	int inwon;					//-- 인원 수
	Record[] rec;				//Record 배열(학생 한 명 당 Record 배열 방 한 개 활용)
								//Record를 기반으로 생성된 객체만 담아낼 수 있는 배열
								//배열 만들거다 선언
	
								//클래스 안에 인스턴스 구문 마구 쑤셔넣는거 좋지 않음

	//주요 메소드 정의(기능 구성)

	// 1. 인원 수 입력 → 여기서는 인원 수를 입력받고&그만큼 배열을 만든다
	public void set()
	{
		Scanner sc = new Scanner(System.in); //스캐너는 메소드 안에 만들어주자

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon>100||inwon<1);

								//Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
								//배열방을 inwon만큼 생성한 것이지
								//Record 클래스의 인스턴스를 생성한 것은 아니다.         

		rec = new Record[inwon]; //배열방과 인스턴스는 다르다 (배열=그릇 , 인스턴스 객체=담을 내용물)

								//레코드 타입의 배열방에는 레코드 타입만 담을 수 있다(정수, 문자 등등 아무것도 못담음)
								//위에 만든 배열에 인원만큼 방을 만들겠다 선언
	}




	//2.상세 데이터 입력(총점 및 평균 산출 기능 포함) → 위에서 만든 배열에 데이터를 넣어준다. 

	public void input()								//void가 리턴 자료형
	{
		Scanner sc = new Scanner(System.in);		//스캐너는 메소드 안에 만들어주자

		String[] title = {"국어 점수 : ","영어 점수 : ","수학 점수 : "}; //국,영,수 제목 배열

		for (int i=0;i<inwon;i++) //rec.legnth
		{
													//얘네 내용을 담을 레코드 클래스 기반의 인스턴스 생성이 가장 먼저 되어야 한다
			rec[i]= new Record();					//레코드 배열에 인스턴스 객체를 담는다.

			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			rec[i].name = sc.next();				//레코드.name 배열에 담아온 이름을 담는다. 

/*
			System.out.print("국어 점수 : ");
			rec[i].guk = sc.nextInt();
			System.out.print("영어 점수 : ");
			rec[i].eng = sc.nextInt();
			System.out.print("수학점수 점수 : ");
			rec[i].mat = sc.nextInt();
*/
/*
			System.out.print("국어 점수 : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("영어 점수 : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("수학점수 점수 : ");
			rec[i].score[2] = sc.nextInt();
*/
			for (int j=0;j<title.length;j++)		//국어점수, 영어점수, 수학점수 출력이 되는 부분이다.
			{
													// 안내 메세지 출력
				System.out.print(title[j]);

													//사용자가 입력한 데이터를 스코어 배열에 담아내기
				rec[i].score[j] = sc.nextInt();		//score[0] → 국어점수
													//score[1] → 영어점수
													//score[2] → 수학점수

			//국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
			//총점에 대한 누적 산출

				rec[i].tot += rec[i].score[j];
			}
			//평균 산출하기
				rec[i].avg = rec[i].tot/3.0;
		}//end outer for
	}

	
	//3. 프린트
	public void print()
	{
		//랭킹 출력 구문
		ranking();

		for (int i=0;i<inwon;i++) //=rec.length
		{
			//이름 출력
			System.out.printf("%5s",rec[i].name);

			//성적 반복 출력
			for (int j=0;j<3 ;j++) //j가 왜 3보다 작은 걸까? Record에서 3개로 설정해놔서 그런듯
				System.out.printf("%4d",rec[i].score[j]);
			
			//총점, 평균 출력
			System.out.printf("%5d",rec[i].tot);
			System.out.printf("%8.2f",rec[i].avg);

			//석차 출력 구문 추가
			System.out.printf("%5d",rec[i].rank);

			//개행
		}
	}
	
	// 석차 산출 메소드 추가
	// - 석차 산출 과정에서 연산에 필요한 데이터가 이미 존재하는 상황 > 매개변수 없음 (매개변수:연산을 위해 받아와야 하는 데이터?) 
	// - Record 배열의 rank 속성 초기화 기능 수행 > 반환 자료형 void
	// - 클래스 내부에서 활용할 메소드로 정의 > 접근제어 지시자 private
	private	void ranking()
	{
		// 모든 학생들의 등수(석차, rank)를 1로 초기화
		for (int i = 0;i<inwon ;i++ )
			rec[i].rank = 1;

		//등수 산출
		for (int i=0;i<inwon-1;i++) // 웅 > 비교기준 > 0     1     2
		{
			for (int j=i+1;j<inwon;j++) //숑 > 비교대상 > 123  23   3
			{
				// 비교기준의 평균이 비교 대상의 평균보다 크다면 
				// 비교대상의 rank를 1만큼 증가
				if (rec[i].avg > rec[j].avg)//비교기준 평균, 비교대상 평균 
				{
					rec[j].rank++;
				}
				else if (rec[i].avg < rec[j].avg)
				{
					rec[i].rank++;
				}

				// 비교대상의 평균이 비교기준의 평균보다 크다면 
				// 비교기준의 rank를 1만큼 증가
			}
		}
	}
}
