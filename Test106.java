/*========================
�ڡ�Ŭ������ �ν��Ͻ��ڡ�
=========================*/

//�޼ҵ� �����ε��� ������ ���¿� �Ұ����� ����

public class Test106
{
	public static void main(String[] args)
	{
		print(3.14); //	public static void print(double d) {}
		double result = print(3.14); //	public static double print(double d) {}
		//=�� �������� ������ �ν����� �����Ƿ�, ���� �Ʒ��� ���� �Ǵ��Ѵ�. print(3.14)=print(3.14)
	}
	public static void print() {}
	// 	public static void print() {}	//--(X)
	public static void print(int i) {}
	//	public static void print(int j) {}	 //--(X)
	public static void print(char c) {}		 //--  �ڵ� �� ��ȯ ��Ģ check--!!!
	public static void print(int i, int j) {}
	public static void print(double d) {}
	//	public static void print(double e) {return 10.0;} //-- ���� �Ұ� (������ �����ε� �Ǽ� ���� ���� ������ �־?0
	//	public static double print(double d) {}			  //--(X) check~!!!
}