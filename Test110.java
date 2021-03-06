/*=======================================
★★★정렬(Sort) 알고리즘★★
========================================*/

/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
	→ 보기 좋게... 검색하기 위함

○ 정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ....
	정렬은 리소스 소모가 심하다

*/

// 버블 정렬(거품 정렬, Bubble Sort)

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요...

public class Test110
{
	public static void main(String[] args)
	{
		int a[] = {52, 42, 12, 62, 60};

		for (int n:a)
		{
			System.out.print(n + "  ");
		}
		System.out.println();

System.out.print("Sorted Data : ");	


		//Bubble Sort 어떤 수식이 와도 괜찮다.

		/*
		10, 50, 20, 30, 40  == j -- j+1
		==  --
		10, 20, 50, 30, 40
		    ==  --
		10, 20, 30, 50, 40
		        ==  --
		10, 20, 30, 40, 50
					==  --
		--------------------------- 1회전 → 스왑 발생
		10, 20, 30, 50, 40
		==  --
		10, 20, 30, 40, 50
			==  --
		10, 20, 30, 40, 50
				==  --
		--------------------------- 2회전 → 스왑 발생하지 않음
			X
			X
		--------------------------- 3회전 → X
			X
		--------------------------- 4회전 → X			
		*/

		for (int i=0;i<a.length-1;i++)	// → 뒤에서 비교 대상을 하나씩 줄여주는 역할
										// i의 쓸모는 과연?
			// i=1 1<5									// 1	2	3  4
												// 0123 012 01 0
		{
			for (int j=0;j<a.length-i-1;j++)	// → 비교대상데이터 0 1 2 3(1234 234 34)
			//			   ------------ 어째서?
			// j =0 / 0<5-1
				{
					if (a[j]>a[j+1])		//오직 j만?
					{
					a[j]= a[j]^a[j+1];
					a[j+1]= a[j+1]^a[j];
					a[j]= a[j]^a[j+1];
					}
			// 첫바퀴 검사에서 가장 큰 값이 맨 뒤로 가게 된다. 
			// 맨 뒷자리에 큰 값이 쌓기에 되기 때문에, for문이 돌 때마다 비교 횟수를 줄여주는 거다. 
				}
		}
/*
		Sort.bubbleSort(a);
		for (int n2:a)
		{
			System.out.print("  ");
		}
*/
		for (int i=0;i<a.length;i++)
		{
			System.out.printf("%3d",a[i]);
		}
		System.out.println();
	}
}

/*
52  42  12  62  60
Sorted Data :  12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/