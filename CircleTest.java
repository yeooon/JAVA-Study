/*================================
�ڡڡ�Ŭ������ �ν��Ͻ��ڡڡ�
================================*/

// Test 073�� ��Ʈ��~~!!

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ���� �޼ҵ忡���� ��Ŭ�׽�Ʈ�� �ν��Ͻ� �����ϸ� �ȴ�.
// ������ �Է� : xx
//>>�������� xx�� ���� 
//>>���� :xxx
//>>�ѷ� :xxx
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest 
{
	int r;
	double a,b;
	final double pi = 3.141592; //(������ ���ȭ)

	void Input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine()); 
	}
	double CilLength() //�ѷ�
	{
		a = r * 2 * pi;
		return a;
	}
	double CiArea()
	{
		b = r * r * pi;
		return b;	
	}
	void print(double a, double b)
	{
		System.out.printf("�������� %d�� ����", r);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + b);
	}
	
}

//��Ÿ�� ������ public Ŭ���� �ۼ��϶�� �ؼ� ��Ȳ�߾���
//��� Ŭ���� �ȿ� main�̶�� �޼ҵ尡 ���� ��� �ȴ�. 
//���� ���غô�...
//static�� ���� Ŭ������ ���� Ư���ϴ�. 