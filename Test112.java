/*=======================================
★★★정렬(Sort) 알고리즘★★
========================================*/

// 과제

// 사용자로부터 여러 학생의 성적 데이터를 입력받아
// 점수가 높은 학생부터 낮은 순으로 등수를 부여하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 이아린 90
// 이름 점수 입력(2, 공백 구분) : 박현수 80
// 이름 점수 입력(3, 공백 구분) : 이지연 80
//					:
/*
------------------
1등 김민성 95
2등 이아린 90
	  :
------------------
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test112
{
	public static void main(String[] args)
	{
//인원 수 입력
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 입력 : ");	

		int inwon = sc.nextInt();

			String name[] = new String[inwon];		//이름 - 인원 수대로 배열방 만들기
			int jumsu[] = new int[inwon];		//점수 - 인원 수대로 배열방 만들기
			int grade[] = new int[inwon];

//이름과 점수 입력		
			for (int i=0;i<inwon;i++)
			{
				System.out.printf("이름 점수 입력(%d, 공백 구분) : ",i+1);		//num 수대로 이름, 점수 입력 반복
				name[i] = sc.next();
				jumsu[i] = sc.nextInt();
			}
/*
			do
			{
				System.out.printf("이름 점수 입력(%d, 공백 구분) : ",a);		//num 수대로 이름, 점수 입력 반복
				name[n-1] = sc.next();
				jumsu[n-1] = sc.nextInt();

			}
			while (n++<inwon); 
*/

			//System.out.printf("%3s",name[0]); ← 안나오는데

//점수 높 > 낮 순으로 정렬
//점수랑 이름을 함께 바꿔 줘야 함
			String temp;		//temp에 int 쓰면 오류난다.
			int a;
			boolean flag;
			int n=0;		
			
			do
			{
				n++;
				flag = false;	//플래그는 디폴트로 false

					for (int i=0;i<inwon-n;i++)
					{
						if (jumsu[i]<jumsu[i+1])
						{
						a = jumsu[i];
						jumsu[i]=jumsu[i+1];
						jumsu[i+1]=a;

						temp = name[i];
						name[i]=name[i+1];
						name[i+1]=temp;

						flag=true;
						}
					}	
			}
			while (flag);

/* 일반 버블로는 결과가 나오지 않는다.(이상하게 나옴)

			for (int i=1;i<inwon;i++)
			{
				for (int j=0;j<inwon-i;j++)
				{
					a = jumsu[j];
					jumsu[j]=jumsu[j+1];
					jumsu[j+1]=a;

					temp = name[j];
					name[j]=name[j+1];
					name[j+1]=temp;
				}
			}
*/

			for (int i=0;i<inwon;i++)
			{
				System.out.printf("%n%d등 %s,%d",i+1,name[i],jumsu[i]);
			}

			System.out.println();
		
		// 1. 여러 학생의 성적 데이터를 입력받기.
		// 2. 점수 높>낮 순으로 정렬
		// 3. 등수 부여
	
	}
}