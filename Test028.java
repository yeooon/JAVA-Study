//논리 연산자

public class Test028
{
	public static void main(String[] args)
	{
		boolean a = true, b = false;
		
		System.out.printf("a && b : %b%n", (a&&b));
		System.out.printf("a || b : %b%n", (a||b));
		System.out.printf("!a	  : %b%n", !a);
		System.out.printf("!b	  : %b%n", !b);
		
	}
}

/*
a && b : false //and
a || b : true //or
!a        : false //빵이 아니다
!b        : true //우유가 아니다
계속하려면 아무 키나 누르십시오 . . .
*/
