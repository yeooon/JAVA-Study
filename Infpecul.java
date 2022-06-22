/*========================
★★메소드의 재귀 호출★★
========================*/


public class InfRecul

{
	public static void main(String[] args)
	{
		showHi(10);
	}
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
			showHi(cnt--);
		if(cnt==1)
			return;
	}
	
}