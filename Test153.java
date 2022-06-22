/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

// Test152.java 파일과 비교~!!!

// ※ throw		cf) throws와는 다르다

class Demo
{
	private int value;

	public void setValue(int value) throws Exception
	{
		if(value <= 0)
		{
			//return;				//-- 종료 → 메소드 종료
			throw new Exception("value 는 0보다 작거나 같을 수 없습니다.");
		}
		this.value=value;
	}

	public int getValue()
	{
		return value;
	}
}


public class Test153
{
	public static void main(String[] args) //throw Exception
	{
		Demo ob = new Demo();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);					
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}