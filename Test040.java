
//����ڷκ��� ������ ���� 5���� �Է¹޾�
//¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
//��, Scanner�� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

//���� ��
//������ ���� 5�� �Է� : 1 2 3 4 5 
//¦���� ���� 6�̰�, Ȧ���� ���� 9�Դϴ�.
//��� �Ϸ��� �ƹ� Ű��...

import java.util.Scanner;

public class Test040
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e; //�ֿ� ���� ����
		int A =0; //¦���� (���� ���� �Ϲ������� 1�� �ʱ�ȭ)
		int B =0; //Ȧ����

		System.out.print("������ ���� 5�� �Է� : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		//¦���� ���� , Ȧ���� ����
		//¦�� Ȧ���� ������ ¦������ ���ϰ�, Ȧ������ ���ϱ�
		//������ ȯ-��

		//a�� ¦���� �� A���� a��ŭ ����
		//a�� Ȧ���� �� B���� a��ŭ ����
		//�ݺ�...

		if (a%2==0)//a�� ¦����� 2
			A+=a; //A�� a��ŭ �������Ѷ� 2
		else //���������
			B+=a; //B�� a��ŭ �������Ѷ�
		if (b%2==0)
			A+=b;
		else
			B+=b;
		if (c%2==0)
			A+=c;
		else
			B+=c;
		if (d%2==0)
			A+=d;
		else
			B+=d;
		if (e%2==0)
			A+=e;
		else
			B+=e;		
			System.out.printf("¦���� ���� %d�̰�, Ȧ���� ���� %d�Դϴ�.",A,B);

	}

}