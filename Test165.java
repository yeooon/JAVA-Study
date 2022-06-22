
/*==========================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ó�� ����
============================================================*/

// Test165 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����
>> �޴� ����(1~6) : 1

1��° ��� �Է� : ������
1��° ��� �Է� ���� ~ !!!

��� �Է� ���(Y/N)? : y

2��° ��� �Է� : ���̻�
2��° ��� �Է� ����~!!
��� �Է� ���(Y/N)? : N

[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����
>> �޴� ����(1~6) : 2

[���� ��ü ���]

	������
	���̻�
���� ��ü ��� �Ϸ�~!!!

[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����
>> �޴� ����(1~6) : 3

�˻��� ��� �Է� : ���̻�

[�˻� ��� ���]
�׸��� �����մϴ�.

[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����
>> �޴� ����(1~6) : 3

�˻��� ��� �Է� : �Ӽҹ�
[�˻� ��� ���]
�׸��� �������� �ʽ��ϴ�.


[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����
>> �޴� ����(1~6) : 4

������ ��� �Է� : ȫ����

[���� ��� ���]
�׸��� �������� �ʾ� ������ �� �����ϴ�.

[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����
>> �޴� ����(1~6) : 4

������ ��� �Է� : ������

[���� ��� ���]
������ �׸��� �����Ǿ����ϴ�.

[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����
>> �޴� ����(1~6) : 5
������ ��� �Է� : ��μ�

[���� ��� ���]
������ ����� �������� �ʽ��ϴ�.

[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����
>> �޴� ����(1~6) : 5

������ ��� �Է� : ���̻�
������ ���� �Է� : ������

[���� ��� ���]
������ �Ϸ�Ǿ����ϴ�.

[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����
>> �޴� ����(1~6) : 6

���α׷� ����


*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus	// �� �ϼ�
{
	public static final int E_ADD = 1;	//-- ��� �߰�
	public static final int E_DISP = 2; //-- ��� ���
	public static final int E_FIND = 3; //-- ��� �˻�
	public static final int E_DEL = 4;  //-- ��� ����
	public static final int E_CHA = 5;	//-- ��� ����
	public static final int E_EXIT = 6; //-- ����
}

public class Test165
{
	// �ֿ� �Ӽ� ���� �� �ϼ�
	private static final Vector<Object> vt;		//-- �ڷᱸ��
	private static BufferedReader br;			//-- �Է� �� Ȱ��
	private static Integer sel;					//-- ���� ��
	private static String con;					//-- ��� ����

	// static �ʱ�ȭ �� �� �ϼ�
	static
	{
	// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

	// BufferedReader Ŭ���� �ν��Ͻ� ����

		br = new BufferedReader(new InputStreamReader(System.in));

	// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}


	// �޴� ��� �޼ҵ� �� �ϼ�
	public static void menuDisp()
	{
		System.out.println("[�޴� ����]");
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ���");
		System.out.println("3. ��� �˻�");
		System.out.println("4. ��� ����");
		System.out.println("5. ��� ����");
		System.out.println("6. ����");
		System.out.print(">> �޴� ����(1~6) : ");
	}


	// �޴� ���� �޼ҵ� �� �ϼ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ� �� �ϼ�
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case Menus.E_ADD : addElement(); break;		//-- ��� �߰�
			case Menus.E_DISP : dispElement(); break;	//-- ��� ���
			case Menus.E_FIND : findElement(); break;	//-- ��� �˻�
			case Menus.E_DEL : delElement(); break;		//-- ��� ����
			case Menus.E_CHA : chaElement(); break;		//-- ��� ����
			case Menus.E_EXIT : exit(); break;			//-- ����
		}
	}

	// �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ� �� ���ѹݺ���....
	public static void addElement() throws IOException
	{
		// �ڷᱸ�� vt
		do
		{
			System.out.printf("%d��° ��� �Է� : ",vt.size()+1);	
			String name = br.readLine();

			vt.add(name);
			
			System.out.println();
			System.out.printf("%d��° ��� �Է� ����~!",vt.size());	
			System.out.print("\n��� �Է��� ��� �Ͻðڽ��ϱ�?(Y/N) : ");
			con = br.readLine();
		}
		//while (con != "n" || con != "N" || con != "y" || con != "Y"); �� ���ѹݺ�
		while (con.equals("y")||con.equals("Y"));

		System.out.println();
	}

	// �ڷᱸ�� ��ü ��� ��� �޼ҵ� �� �ϼ�
	public static void dispElement()
	{
		System.out.println();
		// ���ͱ����� ��ü ���
		System.out.println("[���� ��ü ���]");
		for (int i=0;i<vt.size();i++)
		{
			System.out.printf("%s", vt.get(i));		//vt.get() ��������
		}
		System.out.println("\n���� ��ü ��� �Ϸ�~!!!");		
	}

	// �ڷᱸ�� �� ��� �˻� �޼ҵ� �� �ϼ�
	public static void findElement() throws IOException
	{
		System.out.print("�˻��� ��� �Է� : ");
		String name = br.readLine();

		int i = vt.indexOf(name);

		System.out.println("[�˻� ��� ���]");

		if (i<0)	//Test162���� -1�̸� ���°�
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		else 
			System.out.println("�׸��� �����մϴ�.");
	}

	// �ڷᱸ�� �� ��� ���� �޼ҵ� �� �ϼ�

	public static void delElement() throws IOException
	{
		System.out.print("������ ��� �Է� : ");
		String name = br.readLine();

		System.out.println("[���� ��� ���]");

/*	
Test163

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
*/
		if (vt.contains(name))
		{
			int i = vt.indexOf(name);
			vt.remove(i);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		else
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
	}

	// �ڷᱸ�� �� ��� ����(����) �޼ҵ�
/*
Test162
		// �� ù ��° ��Ҹ� "�Ͼ�"���� ��.��. �� set()
		v.set(0, "�Ͼ�");
*/

	public static void chaElement() throws IOException
	{
		System.out.print("������ ��� �Է� : ");
		String name = br.readLine();

		if (vt.contains(name))
		{
			System.out.print("������ ���� �Է�");
			String change = br.readLine();

			int i = vt.indexOf(name);
			vt.set(i, change);

			System.out.println();
			System.out.println("[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		else 
		{
			System.out.println("[���� ��� ���]");
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
		}
	}

	//���α׷� ���� �޼ҵ� �� �ϼ�
	public static void exit()
	{
		System.out.println("���α׷� ����~~!!~ \n");
		System.exit(-1);
	}

	// main() �޼ҵ� �� �ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}