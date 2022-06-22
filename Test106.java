/*========================
★★클래스와 인스턴스★★
=========================*/

//메소드 오버로딩이 가능한 형태와 불가능한 형태

public class Test106
{
	public static void main(String[] args)
	{
		print(3.14); //	public static void print(double d) {}
		double result = print(3.14); //	public static double print(double d) {}
		//=를 기준으로 왼쪽은 인식하지 않으므로, 위와 아래를 같게 판단한다. print(3.14)=print(3.14)
	}
	public static void print() {}
	// 	public static void print() {}	//--(X)
	public static void print(int i) {}
	//	public static void print(int j) {}	 //--(X)
	public static void print(char c) {}		 //--  자동 형 변환 규칙 check--!!!
	public static void print(int i, int j) {}
	public static void print(double d) {}
	//	public static void print(double e) {return 10.0;} //-- 정의 불가 (리턴은 더블인데 실수 형태 값을 가지고 있어서?0
	//	public static double print(double d) {}			  //--(X) check~!!!
}