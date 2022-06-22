/*==============
★★★배열★★★
================*/

//배열과 난수 처리(*Random 클래스 활용)


//사용자로부터 임의의 정수를 입력받아
//그 정수의 갯수만큼 난수(1~100)를 발생시켜 배열에 담고
//배열에 담겨있는 데이터들 중
//가장 큰 값과 가장 작은 값을 선택하여
//결과를 출력하는 프로그램을 구현한다.

//실행 예)
//발생시킬 난수의 갯수 입력 : 10
// 50 7 24 81 97 45 61 38 1 → 무작위로 발생한 정수들...
// int[] arr = {50, 7, 24, 81, 97, 45, 61, 38, 1} → 배열에 담아내기(배열구성)
//가장 큰 값 : 99, 가장 작은 값 : 1
//계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.util.Random;

public class Test097
{
	public static void main(String[] args)
	{
		//데이터 입력
		Scanner sc = new Scanner(System.in);

		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size=sc.nextInt();

		//사이즈 변수에 담아낸 수 만큼의 배열방 만들기
		//배열 선언 및 메모리 할당
		int[] arr = new int[size];

		//무작위 정수(난수)를 발생시키기 위해서는
		//난수 발생 전용 객체가 필요하다.
		//→ 『java.util.Random』
		Random rd = new Random(); //매개변수가 없는 형태의 생성자 호출~

		//Random 클래스의 『nextInt()』 메소드
		//0 ~매개변수로 넘겨받은 정수 n-1까지의 수 중
		//무작위 정수(난수) 1개를 발생시킨다.

		//rd.nextInt(10)		// 0~9

		//테스트
		//System.out.print("발생한 난수 : "+rd.nextInt(10));
		//0 ~ 9까지의 범위 내에서 무작위 정수 한 개 발생~~!!

		//배열 구성
		for (int i=0;i<arr.length;i++)
		//for (int i=0;i<size;i++)
		{
			arr[i] = rd.nextInt(100)+1; //→ 1~100까지의 무작위 정수 한 개 발생
			//rd.nextInt(100); 0~99 무작위 정수 한 개 발생
			//rd.nextInt(101); //101을 입력하면 0~100까지의 무작위 정수 한개 발생
		}
		//테스트 → 구성된 배열의 전체 요소 출력
		for (int i=0;i<arr.length;i++)
		{
			System.out.printf("%4d",arr[i]);
		}
		System.out.println();

		/*
		발생시킬 난수의 갯수 입력 : 10
		42  45  41  24  77  38  33  59  53  58
		계속하려면 아무 키나 누르십시오 . . .
		*/

		//가장 큰 작은 값, 가장 큰 값 출력~~!!

		int max = arr[0];//배열의 0번째다. < 배열에서 난수로 발생한 첫번째 값
		int min = arr[0];

		for (int i=1;i<arr.length;i++) //0번째는 정해놔서, 1~9까지의 값만
		{
			//i는 배열안의 n번째값이라는 뜻이다. i는 0 1 2 3 4~중의 n번쨰값 
			if (arr[i]>max) //초기화 한 값보다 클 때(true)
			{
			max=arr[i]; //i++되므로 최댓값이다
			}
			//논리적인 개연성이 없어서 각각 독립적인 if문이 된다.
			if (arr[i]<min) //i번째 값보다 min이 크면 min에다 arr[i]를 담음
			{
			min=arr[i];
			}
		}
		System.out.printf("가장 큰 값 : %d%n", max);
		System.out.printf("가장 작은 값 : %d%n", min);
	}
}
