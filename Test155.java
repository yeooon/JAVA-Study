/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

// 다른 예외 다시 던지기

public class Test155
{
	public int getValue(int value) throws Exception					//⑦예외 던지기(파란 폭탄)
	{
		int a = 0;

		try
		{
			a = getData(-2);										//③예외 발생(빨간 폭탄)			
		}
		catch (Exception e)											//④예외 잡아내기(빨간 폭탄)
		{
			//⑤ 예외 처리(빨간 폭탄)
			System.out.println("printStackTrace......");
			e.printStackTrace();

			//⑥ 예외 발생 (파란 폭탄)
			throw new Exception("value가 음수입니다.");

		}

		return a;
	}

	public int getData(int data) throws Exception					//② 예외 던지기(빨간 폭탄)
	{
		if (data < 0)
		{
			throw new Exception("data 가 0 보다 작습니다.");		//① 예외 발생(빨간 폭탄)
		}

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test155 ob = new Test155();

		try
		{
			int a = ob.getValue(-2);								//⑧ 예외 발생(파란 폭탄)	
			System.out.println("a : " + a);			
		}
		catch (Exception e)											//⑧ 예외 잡아내기(파란 폭탄)	
		{
			System.out.println("printStackTrace......");
			e.printStackTrace();
		}

	}
}