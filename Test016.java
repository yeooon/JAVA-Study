
//������ �ڷ���
//�ڹ��� �⺻ ����� : BufferedReader Ŭ����

//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
// �̸��� �Է��ϼ��� : ������ (���)
// �������� �Է� : (���)
// �������� �Է� : (���)
// �������� �Է� : (���)

// ===[���]===
// �̸� :
// ���� : 
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�������� .�� �ƴ϶� )�Ἥ ����
	//InputStreamReader isr = new InputStreamReader(System.in)
	//BufferedReader br = new BufferedReader(isr)

	//����
	/*
	int a, b, c, d;
	double e;
	*/
	String n; //�̸�����
	int b, c, d, e; //���� �����ϱ� �Ѳ����� �ص� ���x


	//���
	System.out.print("�̸��� �Է��ϼ��� : ");

	n = br.readLine(); //�ܺ� ������ ���, �������� �ƴϹǷ� �̷��� 
/*
	n = Integer parseInt(br.readLine());
*/	
	System.out.print("�������� �Է� : ");

	b = Integer.parseInt(br.readLine());  //���� �������� Integer.parseInt�� Integer parseInt�� ���Ἥ ����

	System.out.print("�������� �Է� : ");

	c = Integer.parseInt(br.readLine());  //���� �������� Integer.parseInt�� Integer parseInt�� ���Ἥ ����
	
	System.out.print("�������� �Է� : ");
	
	d = Integer.parseInt(br.readLine());  //���� �������� Integer.parseInt�� Integer parseInt�� ���Ἥ ����

	System.out.println("\n===[���]===");

	System.out.println("\n�̸� : " + n); //printf ���ڿ��� %s ������ %d 
		
	// System.out.printf("\n�̸� : %s", n); �̷��Ե� �� �� �ִ�. 

	e = b + c + d;
	
	System.out.println("���� : " + e);



	}
}

/*
Test016.java:25: error: ';' expected
        public static void main(String[] args) throw IOException
                                              ^
Test016.java:27: error: ')' expected
                BufferedReader br = new BufferedReader(new InputStreamReader (System(in));
                                                                                         ^
Test016.java:49: error: ';' expected
        b = Integer parseInt(br.readLine());
                   ^
Test016.java:53: error: ';' expected
        c = Integer parseInt(br.readLine());
                   ^
Test016.java:57: error: ';' expected
        d = Integer parseInt(br.readLine());
                   ^
Test016.java:63: error: ';' expected
        e = b + c + d
*/
