// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 7
// 두 번째 정수 입력 : 70
// 세 번째 정수 입력 : 42

// >> 정렬 결과 : 7 42 70
// 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;

			System.out.print("첫 번째 정수 입력 : ");
				a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
				b = Integer.parseInt(br.readLine());
			System.out.print("세 번째 정수 입력 : ");
				c = Integer.parseInt(br.readLine());

				// 첫 번째 정수와 두 번째 정수 크기 비교 및 자리바꿈
				// 첫 번째 정수와 세 번째 정수 크기 비교 및 자리바꿈
				// 두 번째 정수와 세 번째 정수 크기 비교 및 자리바꿈

				// 경우의 수로 해결함ㅎ 근데 다른 방법이 있을까?

				if (a<=b && b<=c)
				{
					System.out.printf("%d %d %d", a, b, c);
				}
				else if (a<=c && c<=b)
				{
					System.out.printf("%d %d %d", a, c, b);
				}
				else if (b<=a && a<=c)
				{
					System.out.printf("%d %d %d", b, a, c);
				}
				else if (b<=c && c<=a)
				{
					System.out.printf("%d %d %d", b, c, a);
				}
				else if (c<=a && a<=b)
				{
					System.out.printf("%d %d %d", c, a, b);
				}
				else if (c<=b && b<=a)
				{
					System.out.printf("%d %d %d", c, b, a);
				}
				else
					System.out.println("형용할 수 없음");


/*				
				if (a <= b && a <= c && b <= c) //a가 b보다 작을 시 자리를 바꿔야하는데... 
				{
					System.out.printf("%d %d %d",a,b,c); //위치는 
				}
					else if (a >= b && a >= c && b >= c )
				{
					System.out.printf("%d %d %d",c,b,a);
				}
					else
					System.out.println("판정불가");
*/
	}
}