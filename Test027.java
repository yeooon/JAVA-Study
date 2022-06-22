// 비트 단위 연산자

public class Test027
{
	public static void main(String[] args)
	{
		int x = 128;

		// 00000000 00000000 00000000 10000000
		// 여기서 이동한다는 뜻

		System.out.printf("x << 3 : %d%n", x<<3);
		System.out.printf("x * 8 : %d%n", x*8);

		//x << 3 : 1024
		//x * 8 : 1024

		System.out.printf("x >> 3 : %d%n", x>>3);
		System.out.printf("x / 8 : %d%n", x/8);
		// x >> 3 : 16
		// x / 8 : 16

		System.out.printf("x << 24 : %d%n", x<<24);

		System.out.printf("x << 25 : %d%n", x<<25);
		System.out.printf("x << 26 : %d%n", x<<26);
		System.out.printf("x << 31 : %d%n", x<<31);

	}
}