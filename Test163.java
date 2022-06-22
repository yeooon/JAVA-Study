
/*==========================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ó�� ����
============================================================*/

// �˻� �� ����

import java.util.Vector;

public class Test163
{

	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		={"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� colors �迭 �����͸� ��ҷ� �߰�
		for (String color : colors)
		{
			v.add(color);
		}

		// ���� �ڷᱸ�� v �� ��ü ��� ���
		System.out.print("��ü ��� ��� : ");
		for (String str : v)
		{
			System.out.print(str + " ");
		}
		System.out.println();

		String s1 = "��ȫ";

		int i = v.indexOf(s1);
		System.out.println(s1 + " �� index ��ġ : " + i);
		System.out.println();


		String s2 = "���";

		// contains(s)
		// v.contains(s)
		//-- ���� �ڷᱸ�� v�� ã�����ϴ� s �� ���ԵǾ� �ִٸ�...
		// �� index ��ġ Ȯ��
		if (v.contains(s2))
		{
			i = v.indexOf(s2);
			System.out.println(s2 + "�� index ��ġ : " + i);

			// �켱 ���� �ڵ带 ���� ã��...
			// ã������ �����ض�(�����ض�)
			v.remove(i);
		}
		//--==>> ��� �� index ��ġ : 1

		//ã�Ƽ� ������ �� ��ü ��� ���
		System.out.print("��ü �� ��ü ��� ��� : ");
		for(String str:v)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> ��ü �� ��ü ��� ��� : ���� �ʷ� �Ķ� ���� ����


		//�߰� ���ǻ���

		System.out.println(colors);
		//--==>> [Ljava.lang.String;@15db9742	
		
		System.out.println(v);
		//--==>> [����, �ʷ�, �Ķ�, ����, ����]

		// �� Ȯ�ο� ���� �����ʹ�
		//    ���� ���(������)�� �ƴϱ� ������
		//    �̸� Ȱ���Ͽ� ������ �����ϰ� ó���ؼ��� �ȵȴ�.			check~!!
	}
}