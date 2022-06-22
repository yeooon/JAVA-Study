/*===============
 ★★★배열★★★
 ================*/
 //배열의 기본적 활용

 // 임의의 정수들이 들어있는 배열의 숫자 데이터들 중
 //짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
 //프로그램을 구현한다.
 
 //배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8
 //실행 예)
 //배열 요소 전체 출력
 //4 7 9 1 3 2 5 6 8
 //짝수 선택적 출력
 //4 2 6 8
 //3의 배수 선택적 출력 
 //9 3 6

public class Test082
{	
	public static void main(String[] args)
	{

	//배열 요소 접근
	/*
	num[0] = 4;
	num[1] = 7;
	num[2] = 9;
	num[3] = 1;
	num[4] = 3;
	num[5] = 2;
	num[6] = 5;
	num[7] = 6;
	num[8] = 8;
	*/
	
	//방법2
	int[] num = {4, 7, 9, 1, 3, 2, 5, 6, 8}; //인트[] 변수 선언 = 범위(num.length)

	//출력
	//일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는
	//배열에 담긴 데이터들을 출력할 수 없다.

	System.out.println("배열 요소 전체 출력"); 
	for (int i=0 ; i<num.length ;i++ )//배열 요소 전체 출력하는 방법(범위를 적었기 때문에 위에 배열 범위를 안써도 됨)
	{
			System.out.print(num[i]+" ");
	}
	System.out.println();

	System.out.println("짝수 선택적 출력"); 
	for (int i=0 ; i<num.length ;i++ )
		{
		/*
			if (i%2=0) //--== i가 짝수라면... → 짝수 번쨰에 해당하는 요소라면...
			{
			System.out.print(num[i]+" ");
			}
		*/
		if (num[i]%2==0)//-i번째 요소가 짝수라면...
		{
			System.out.print(num[i]+" ");
		}
		}
	System.out.println();

	System.out.println("홀수 선택적 출력"); 
	for (int i=0 ; i<num.length ;i++ )
		{
		if (num[i]%3==0)//-i번째 요소가 짝수라면...
		{
			System.out.print(num[i]+" ");
		}
		}
	System.out.println();


	}
}