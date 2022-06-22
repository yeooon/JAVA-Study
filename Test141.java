/*=================================
★★★자바의 주요(중요) 클래스★★★
==================================*/

// StringBuffer 클래스

public class Test141
{
	public static void main(String[] args)
	{
		StringBuffer s2 = new StringBuffer("123456789");
			s2.delete(0,3).replace(1,3,"24").delete(4,6);
			//"123456789"
			//"123456789".delete(0,3).replace(1,3,"24").delete(4,6);
			//"456789".replace(1,3,"24").delete(4,6);
			//"424789".delete(4,6);
			//"4247"



			System.out.println(s2);
			//--==>>4247

		StringBuffer s3 = new StringBuffer("123456789");
		String s4 = s3.substring(3,6);
	}
}