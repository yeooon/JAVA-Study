/*================================
�ڡڡ�Ŭ������ �ν��Ͻ��ڡڡ�
================================*/

//CircleTest�� ��Ʈ��~~!!

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


import java.io.IOException;

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		//CircleTest Ŭ���� ��� �ν��Ͻ� ����

		//CircleTest �ν��Ͻ� ����
		//CircleTest ��ü ����

		CircleTest ob = new CircleTest();

		//�Է� �޼ҵ�
		ob.Input(); //ob = object��� ��

		//���� �޼ҵ�
		double area = ob.CiArea();

		//�ѷ� �޼ҵ�
		double length = ob.CilLength();

		//��� �޼ҵ�
		ob.print(area,length);


	}
}
/*

*/