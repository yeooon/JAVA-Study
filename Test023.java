
//��� ������
//BufferedReader
//printf()

//����ڷκ��� ������ ������ �� �� �Է¹޾�
//��Ģ���� �� ������ ������ �����Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �Է¹޴� ������ BufferedReader�� Ȱ���� �� �ֵ��� �Ѵ�.
//����ϴ� ������ printf() �޼�Ʈ�� Ȱ���� �� �ֵ��� �Ѵ�.
//���� ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է� :
// �� ��° ���� �Է� :

//===[���]===
//10 + 2 = 12
//10 - 2 = 8
//10 * 2 = 20
//10 / 2 = 5
//10 % 2 = 0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test023
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �����Է�

		int a, b;
		int A, B, C, D, E;  

		// ���
	System.out.print("\nù ��° ���� �Է� : "); //����� �� ���°� �� print�� �ص� ��
		a = Integer.parseInt(br.readLine()); //Integer(�޼ҵ�).parseInt(���� ��ȯ��)

	System.out.print("\n�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		// ���� ����

		A = a+b;
		B = a-b;
		C = a*b;
		D = a/b;
		E = a%b;

	//System.out.println("===[���]===");

	System.out.printf("\n===[���]===\n");

	System.out.printf("%d + %d = %d\n", a, b, A);  //������ %d!!!

	System.out.printf("%d - %d = %d\n", a, b, B);  //�Ǽ��� %s!!! 

	System.out.printf("%d * %d = %d\n", a, b, C);

	System.out.printf("%d / %d = %d\n", a, b, D);

	System.out.printf("%d %% %d = %d\n", a, b, E); //%% >> %

	System.out.printf("============\n");

/*
		int a, b;
		double A, B, C, D, E;  

		// ���
	System.out.print("\nù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

	System.out.print("\n�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		// ���� ����

		A = a+b;
		B = a-b;
		C = a*b;
		D = a/b; //�� ��쿡�� '��Ȯ�ϰ�' �϶�� �����
		E = a%b;

	System.out.println("===[���]===");

	System.out.printf("\n%d + %d = %s", a, b, A);  //������ %d!!!

	System.out.printf("\n%d - %d = %s", a, b, B);  //�Ǽ��� %s!!! 

	System.out.printf("\n%d * %d = %s", a, b, C);

	System.out.printf("\n%d / %d = %s", a, b, D);

	System.out.printf("\n%d %% %d = %s\n", a, b, E);

	// ���� ���� // Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
	// d != java.lang.Double ��� ��. �ڹٴ� ������ �ƴϷ�.
	// ������ �Ǽ����ε�, %d(����)�� ��� Ÿ�� ������ �� �� 

*/

		}
}