
/*==========================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ó�� ����
============================================================*/

//List �� Vector, ArrayList, ...
// ���� ����
// �迭�� ����
// �ߺ� ���

/*
�� ArrayList Ŭ����

- ArrayList �� Vector Ŭ������
List �� ũ�� ������ ������ �迭�� ������ ������
�������� Vector Ŭ������ ��ü�� �⺻������ ����ȭ ������,
ArrayList �� �׷��� �ʴٴ� ���̴�.

- �񵿱�ȭ �÷����� ����ȭ�� �÷��Ǻ��� �� ���� ������ �����ϸ�
��������� �÷����� �������� �ʴ� ���α׷������� 
�Ϲ������� ArrayList�� Vector ���� �� ��ȣ�ϸ�,
ArrayList �� ����ȭ�� ������� ���� Vector ó�� ���������ν�
������ ����ȭ�� ������ �δ��� ������ �ʱ� ������
Vector ���� �� ������ ����ȴ�.

- null �� ������ ��� ��Ҹ� ����ϸ�
List �������̽��� �����ϴ� �� �ܿ� ����Ʈ�� �ݳ��ϱ� ����
���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test167
{
	public static void main(String[] args)
	{
		// ArrayList �ڷᱸ�� �ν��Ͻ� ����

		//ArrayList<String> list = new ArrayList<String>();
		//Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		List<String> list1 = new ArrayList<String>();

		//list1 �ڷᱸ���� ��� �߰� �� add()
		list1.add("���ũŻ��");
		list1.add("��ĭ��");
		list1.add("�����̴���");

		//ArrayList �ν��Ͻ� ����
		List<String> list2 = new ArrayList<String>(list1);

		// list2 �� ��� �߰�
		list2.add("�Ǹ��� ����ٸ� �Դ´�");

		// ArrayList �ν��Ͻ� ����
		List<String> list3 = new ArrayList<String>();

		// list3 �� list�� ��ü ��� �߰� �� addAll()

		list3.addAll(list2);

		//"�����̴���" �տ� "���������" �߰�
		// �� "�����̴���" ã�� �� indexOf() �� ��ġ�� �ε��� ��ȯ
		int n = list3.indexOf("�����̴���");

		//�׽�Ʈ
		//System.out.println(n);
		//--==>> 2

		// �� "�����̴���" ã�� �ε��� ��ġ�� "���������" ����
		list3.add(2,"���������");

		// ��� �� ���� ������ Ȯ��
		System.out.println("-------------------------------------");
		System.out.println(list1);
//--==>>[���ũŻ��, ��ĭ��, �����̴���]

		System.out.println(list2);
//--==>>[���ũŻ��, ��ĭ��, �����̴���, �Ǹ��� ����ٸ� �Դ´�]

		System.out.println(list3);
//--==>>[���ũŻ��, ��ĭ��, ���������, �����̴���, �Ǹ��� ����ٸ� �Դ´�]


		System.out.println("-------------------------------------");
		System.out.println();


		// ��� �� listIterator() �޼ҵ带 Ȱ���Ͽ� ���
		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
//--==>>���ũŻ�� ��ĭ�� ��������� �����̴��� �Ǹ��� ����ٸ� �Դ´�


		// ��� �� �������� ����
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
//--==>>�Ǹ��� ����ٸ� �Դ´� �����̴��� ��������� ��ĭ�� ���ũŻ��



	}
}