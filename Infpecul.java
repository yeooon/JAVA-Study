/*========================
�ڡڸ޼ҵ��� ��� ȣ��ڡ�
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