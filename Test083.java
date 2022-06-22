/*===============
 ★★★배열★★★
 ================*/
 //배열의 기본적 활용
// 배열의 선언과 초기화
//배열의 기본적 활용

//char 자료형의 배열을 만들어
// 그 배열의 각 방에 발파벳 대문자를 채우고
//채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다
//단, 채우는 구문과 출력하는 구문은 따로 분리하여 정리한다.

public class Test083
{
	public static void main(String[] args)
	{
		//배열을 채우는 구문(배열을 구성하는 구문)
		/*3*/char arr[] = new char[26]; //int[] arr = new int[10]; /변수 선언, 메모리 할당, 초기화 

		//2 char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		//>>이렇게 될 경우 char타입으로 변환 필요 x

		// char 타입 arr 배열 = 새로운 char 타입 arr배열[배열을 구성하는 객체 수]

		/*
		char[] arr1; → 변수선언
		arr = new char[26]; → 초기화
		그리고 배열... 
		*/
		
		//출력 구문(나오는 구문)

		System.out.println("배열 요소 전체 출력"); 

		for (int i=0;i<arr.length;i++) //int로 받았기 때문에 char타입으로 변환해야 할 것 같은데?
		{
			arr[i]=(char)(65+i); //A코드 65 + i(배열 0부터 시작하기 때문인가?)
		}

		for (int i=0;i<arr.length;i++)//(char 배열 i를 arr범위보다 작게 반복해서 출력)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println( ); 
	}
}