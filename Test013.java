
//퀴즈
//직사각형의 넓이와 둘레를 구하는 프로그램을 만드시오
// 가로 : 10, 세로 : 20
public class Test013
{
	public static void main(String[] args)
	{
		int g = 10;
		int s = 20;	

		double area, length;

		area = g * s;		//앞에 double 붙였을 때 오류 났었음
		length = (g + s) * 2;		//마찬가지, 굳이 쓸데없는 반복 하지 말라는 걸까?

			System.out.println("넓이 : " + area);
			System.out.println("둘레 : " + length);

/*
		int g = 10;
		int s = 20;	

		area = g * s;
		length = (g + s) * 2; 

		double area, length;

		이렇게 입력할 시 오류남. 우째서?
*/

		
	}
}