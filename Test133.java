
/*=================================
★★★자바의 주요(중요) 클래스★★★
==================================*/

// Wrapper 클래스


public class Test133
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;			//-- 오토박싱

		int n = 300;
		Integer wrapN = new Integer(n);
		int n2 = wrapN;				//-- 오토언박싱

		float f = 300.3f;
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);

		//Integer 클래스

		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 12

		ni = Integer.parseInt("0101",2);			//인티저 클래스 안에 파스인트 메소드 안에 문자열과 숫자가 오버로딩 되어있다?
		System.out.printf("ni : %3d\n", ni);		// 인자의 갯수가 다르면 메소드 오버로딩(이진수를 문자열 형태로 반환한다)
		//--==>> ni : 5

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 10

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 10

		sn = Integer.toBinaryString(20); //문자열 형태를 반환 / to가 붙어있는 메소드는 변환을 수행하는 메소드다. 
		System.out.printf("sn : %s\n", sn);
		//--==>> ni : 10100

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n",sn);
		//--==>> ni : 37

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n", sn);
		//--==>> ni : 1f

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> ni : 50

		int n3 =345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		//--==>> ni : 345


	}
}