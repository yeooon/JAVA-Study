

/*=================================
★★★자바의 주요(중요) 클래스★★★
==================================*/

// Wrapper 클래스


public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		//--==> 3
		//--==> 256

		print(b2);
		print(i2);

		// Byte 클래스의 byteValue()메소드 호출
		byte b3 = b2.byteValue();		//언박싱

		// Integer 클래스의 intValue()메소드 호출
		int i3 = i2.intValue();		//언박싱


		System.out.println(b3);
		System.out.println(i3);

		// check~!!
		System.out.println(b4);
		System.out.println(i4);
	}

	/*
	static void print(Byte b)
	{	
	}

	static void print(Integer i)
	{	
	}
	*/

	// java.lang.Number 클래스(추상 클래스)는
	// 모든 숫자형 Wrapper 클래스들의 부모 클래스
	//(슈퍼클래스, 상위 클래스)이다.
	//b2,i2자료형이 Number에 넘어오면서
	// 업 캐스팅이 일어나게 된다.
	// Auto-Boxing  이 일어나게 된다.
	static void print(Number n)//← 3
	{	
		System.out.println(n);	
	}
	// 바 보 같 아 ㅠ  ㅜ ㅜㅠㅠㅠㅠㅠ

}