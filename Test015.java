
//�ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
//�� �ﰢ���� ���̸� �����ϴ� ���α׷��� �����Ѵ�.
//���� ��
// �ڻﰢ���� ���� ���ϱ��
// - �ﰢ���� �غ� �Է� :
//(����) - �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxx
// ��� �Ϸ��� �ƹ� Ű��...

// �ع��� �ν� �� �м�
// �ﰢ���� ���� = �غ� * ���� / 2
// ����ڷκ��� �����͸� �Է¹޾� ó�� > BufferedReader Ȱ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*; (�ڹ� ���� �ȿ� �ִ� ��� ��)
//��� �Ŷ� ��ȿ������ �� �ִ�.

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		//Ű���� ����
		//���۸��� �ҷ��ðž� = ���ο� ���۸����� �ҷ��ðž�(���ο� �����⵵(�ý��� �ȿ���)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�ֿ� ���� ����
		int r;
		int l;
		double a; //�̰� �뷫 �� ����ִ� �ɷ� �����

		//��� ���
		System.out.println("�ڻﰢ���� ���� ���ϱ��");
		System.out.print("-�ﰢ���� �غ� �Է� : ");
		r = Integer.parseInt(br.readLine()); //�ܺηκ��� ���� ���� 
		System.out.print("-�ﰢ���� ���� �Է� : ");
		l = Integer.parseInt(br.readLine()); //�ܺηκ��� ���� ���� 
		
		//���� ���ϴ� ���� 
		
		//a = (r * l) / 2;
		a = r * l / 2.0; // �Ǽ��� �� ������� ������ �� �� �ƹ��ų��� �Ǽ��� �־�� ��
		// ������ ������ �ִٸ� ���� ������ ����ؾ� ��
		// ���� ����� ������ ���� ���ϰ� �������� ������ �� �� ����
		System.out.println(); // = �� �ؿ� \n���� �����ص� ��)
		System.out.printf(">> �غ��� %d, ���̰� %d �� �ﰢ���� ���� : %.2f\n", r, l, a);

		//System.out.printf(">> �غ��� %, ���̰� % �� �ﰢ���� ���� : ", a);


// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxx


/*
���������ϴ� �� �ȵ�
Test015.java:16: error: <identifier> expected
import.java.io.BufferedReader;

�ذ�� ������ . �پ��־ �׷��� 
*/		

/*
Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = ','
        at java.util.Formatter.checkText(Formatter.java:2579)
        at java.util.Formatter.parse(Formatter.java:2565)
        at java.util.Formatter.format(Formatter.java:2501)
        at java.io.PrintStream.format(PrintStream.java:970)
        at java.io.PrintStream.printf(PrintStream.java:871)
        at Test015.main(Test015.java:44)
*/

/*
���� ���µ� ���� ������ �̴ϼȶ���� ���ؼ� �� ��������
*/

	}


}