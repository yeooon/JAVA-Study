// ������ �ڷ���
// �ڹ��� �⺻ ����� : BufferedReader Ŭ����

// ���� �������� �Է��ϼ��� ��� �߰� ������!
// �Է�����! 
// Enter >> ����� ���´�!

//import java.in.BufferedReader; // �Է±�
//import java.io.InputStreamReader; // ������
//import java.io.IOException;  // ���� ��Ȳ �޴���

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test014
{
	public static void main (String[] args) throws IOException //(���� �������� ����)
	{
		//Ű���� ����(����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//���� �Է��� �о���̴� ��ġ
		//-------------------------------------����Ʈ ������
		//-----------------------------------------------------------����Ʈ �Է°�
		//

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
// in�̶�� ����Ʈ ����� Ű���忡�� �� ���� ��ǲ��Ʈ���� �����ؼ� ���۸������� ����
// br.readLine();


	// �ֿ� ���� ����
	int r;   // ������
	final double PI = 3.141592;  // ������
	double a, b; // ����, �ѷ�


	// ���� �� ó��
	//1. ����ڿ��� �ȳ� �޼��� ���
	System.out.print("���� ������ �Է� : ");
	

	//2. ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ��Ƴ���
	//r = br.readLine(); �̰� �ȵ�. �ֳĸ� ���ڿ��� �޾Ƶ���.
	//r = "80";�̷���.

	//�׷���
	//r = Integer.parseInt(br.readLine()); �̰� �̿��ϸ�
	//r = Integer.parseInt("80"); ���ڷ� �޾Ƶ��̰� ��.
	//r = 80  // �̷���. �ٸ� ���ڷ� �Է��ϸ� �ȵ�

	r = Integer.parseInt(br.readLine());
	// ����ڰ� �Է��� ���� ���۸����� ����������� �о��
	// �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
	// �� ���� ��Ʈ���� ���� ���� ��ȯ
	// ���� ������ ������ ���� r�� ����! �ϼ�!

	//3. ���� �� �ѷ� ���(����)
	a = r * r * PI;
	b =	r * 2 * PI;

	// ��� ���
	System.out.println(">> ���� : " + a);
	System.out.println(">> �ѷ� : " + b);

	System.out.printf(">> �������� %d�� ���� ���̴� %.2f�̴�.",r,a);  //%�� ������ �ñ��� 
	System.out.printf("\n>> �������� %d�� ���� �ѷ��� %.2f�̴�.",r,b);

	
	}
}

/*
���� ������ �Է� : 45
>> ���� : 6361.723800000001
>> �ѷ� : 282.74328
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '��'
        at java.util.Formatter.checkText(Formatter.java:2579)
        at java.util.Formatter.parse(Formatter.java:2555)
        at java.util.Formatter.format(Formatter.java:2501)
        at java.io.PrintStream.format(PrintStream.java:970)
        at java.io.PrintStream.printf(PrintStream.java:871)
        at Test014.main(Test014.java:68)
*/

//��Ÿ�� ���� ����...!! %�̰� ���� ������ �� �׷��� ����?