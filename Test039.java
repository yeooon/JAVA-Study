// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 7
// �� ��° ���� �Է� : 70
// �� ��° ���� �Է� : 42

// >> ���� ��� : 7 42 70
// �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;

			System.out.print("ù ��° ���� �Է� : ");
				a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
				b = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
				c = Integer.parseInt(br.readLine());

				// ù ��° ������ �� ��° ���� ũ�� �� �� �ڸ��ٲ�
				// ù ��° ������ �� ��° ���� ũ�� �� �� �ڸ��ٲ�
				// �� ��° ������ �� ��° ���� ũ�� �� �� �ڸ��ٲ�

				// ����� ���� �ذ��Ԥ� �ٵ� �ٸ� ����� ������?

				if (a<=b && b<=c)
				{
					System.out.printf("%d %d %d", a, b, c);
				}
				else if (a<=c && c<=b)
				{
					System.out.printf("%d %d %d", a, c, b);
				}
				else if (b<=a && a<=c)
				{
					System.out.printf("%d %d %d", b, a, c);
				}
				else if (b<=c && c<=a)
				{
					System.out.printf("%d %d %d", b, c, a);
				}
				else if (c<=a && a<=b)
				{
					System.out.printf("%d %d %d", c, a, b);
				}
				else if (c<=b && b<=a)
				{
					System.out.printf("%d %d %d", c, b, a);
				}
				else
					System.out.println("������ �� ����");


/*				
				if (a <= b && a <= c && b <= c) //a�� b���� ���� �� �ڸ��� �ٲ���ϴµ�... 
				{
					System.out.printf("%d %d %d",a,b,c); //��ġ�� 
				}
					else if (a >= b && a >= c && b >= c )
				{
					System.out.printf("%d %d %d",c,b,a);
				}
					else
					System.out.println("�����Ұ�");
*/
	}
}