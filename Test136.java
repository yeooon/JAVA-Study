

/*=================================
【【【切郊税 爽推(掻推) 適掘什【【【
==================================*/

// Wrapper 適掘什


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

		// Byte 適掘什税 byteValue()五社球 硲窒
		byte b3 = b2.byteValue();		//情酵縮

		// Integer 適掘什税 intValue()五社球 硲窒
		int i3 = i2.intValue();		//情酵縮


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

	// java.lang.Number 適掘什(蓄雌 適掘什)澗
	// 乞窮 収切莫 Wrapper 適掘什級税 採乞 適掘什
	//(輯遁適掘什, 雌是 適掘什)戚陥.
	//b2,i2切戟莫戚 Number拭 角嬢神檎辞
	// 穣 蝶什特戚 析嬢蟹惟 吉陥.
	// Auto-Boxing  戚 析嬢蟹惟 吉陥.
	static void print(Number n)//∞ 3
	{	
		System.out.println(n);	
	}
	// 郊 左 旭 焼 ば  ぬ ぬばばばばば

}