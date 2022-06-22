
//반복문(for문)t 실습
//다중 for문 (반복문의 중첩)을 활용한 구구단 출력 실습
//2가지 방법을 써봐라. 
//1.반복문의 2중첩 2번
//2.3중첩을 한 번 쓰는 법 

/*
for웅~ 큰 거 한번

2 * 1 =  2	3 * 1 =  3	4 * 1 =  4	5 * 1 =  5
2 * 2 =  4
2 * 3 =  6
2 * 4 =  8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

6 * 1 =  6	7 * 1 =  7	8 * 1 =  8	9 * 1 =  9
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54

*/
// 반복되면서 숫자랑 결과가 변하려면 어떻게 해야하지?

public class Test062
{
	public static void main(String[] args)
	{
		for ( int h=0 ; h<=1 ; h++ )//한번 반복하라는 뜻 / 한 번 더 늘어날 때는 j에 4더하기 
		{
			for (int i=1 ; i<=9 ; i++)  // 곱해지는 변수 > 가로로 변함없음
			{
				for (int j=2 ; j<=5 ; j++) //단 변수 > 가로로 변함 
				{
				System.out.printf("%4d * %d = %2d",h*4+j,i,(h*4+j*i)); // 이 문장이 반복되는 거란 말이야. // h*4이거를... 이거를 몰라서.........
				}
				System.out.println();
			}
				System.out.println();
		}

	}
}
/*
1. Test 061과 비교하여 출력의 방향이 다르기 때문에
반복문의 제어 흐름도 달라져야 한다.


2. 1에 따라 단과 곱해지는 수의 위치가 
달라진 상태에서의 반복문 구성

for (int i=1 ; i<=9 ; i++)  // 웅 > 곱해지는 수
{
for (int j=2 ; j<=5 ; j++) //숑 > 단 
{
System.out.printf("%4d * %d = %2d",j,i,(j*i)); // 이 문장이 반복되는 거란 말이야.
}
System.out.println(); 개행


3. 2에서 처리한 결과를 두 문단으로 반복하는 반복문 구성
(check 반복문에 (2)의 결과를 삽입)

for ( int h=0 ; h<=1 ; h++ )//한번 반복하라는 뜻 / 한 번 더 늘어날 때는 j에 4더하기
	{
	for (int i=1 ; i<=9 ; i++)  // 곱해지는 변수 > 가로로 변함없음
	{
		for (int j=2 ; j<=5 ; j++) //단 변수 > 가로로 변함
		{
		System.out.printf("%4d * %d = %2d",j,i,(j*i)); // 이 문장이 반복되는 거란 말이야.
		}
		System.out.println();개행
		}
	System.out.println();개행


4.
같은 구문을 두 문단으로 처리하는 과정에서 문단에 따라 주어진 환경(h의 값)을
활용하는 방법으로 최종 반복문 3중첩

for ( int h=0 ; h<=1 ; h++ )//한번 반복하라는 뜻 / 한 번 더 늘어날 때는 j에 4더하기
	{
	for (int i=1 ; i<=9 ; i++)  // 곱해지는 변수 > 가로로 변함없음
	{
		for (int j=2 ; j<=5 ; j++) //단 변수 > 가로로 변함
		{
		System.out.printf("%4d * %d = %2d",h*4+j,i,(h*4+j*i)); // 이 문장이 반복되는 거란 말이야.
		}
		System.out.println();개행
		}
	System.out.println();개행

*/

// 아 나 반복문 3중첩으로 낑낑대고 있었던 거구나. 

/*
int a, b, c;
for(a=2;a<=6;a+=4)
{
	for(c=a;c<=(a+2);c++)
	{
		System.out.printf("%4d * %d = %2d",c,b,(c*b));
	}
	System.out.println();
}
System.out.println();
*/
