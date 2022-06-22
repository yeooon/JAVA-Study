
/*==========================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ó�� ����
============================================================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test159
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		={"����", "���", "�ʷ�", "�Ķ�", "����", "����"};


	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		Queue<String> qu = new LinkedList<String>();
		//-- Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
		// new �����ڸ� �̿��Ͽ� Queue �������̽��� implements ��
		// ���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.

		// qu ��� Queue �ڷᱸ����
		// colors �迭�� ������ �Է� �� offer()

		for (String color : colors)
		{
			qu.offer(color);
		}

		// qu ��� Queue �ڷᱸ���� ��� ������ ��ü ���
		// peek()
		// :
		// poll()

		while (qu.peek() != null)
		{
			// poll()
			//-- ť�� head ��� ��ȯ. ������.
			//	 ť�� empty �� ��� null �� ��ȯ.
			System.out.print(qu.poll() + "  ");
		}
		System.out.println();
	}
}