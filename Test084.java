/*===============
 �ڡڡڹ迭�ڡڡ�
 ================*/
 //�迭�� �⺻�� Ȱ��

 //����ڷκ��� �ο����� �Է¹ް�
 //�Է¹��� �ο� �� ��ŭ�� �ϻ� �̸��� ��ȭ��ȣ�� �Է¹ް�
 //�̸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
 //����� ����� �� �ִ� ���α׷��� �����Ѵ�.

 //���� ��)
 //�Է� ó���� �л� �� �Է�(��, 1~10) : 27
 //�Է� ó���� �л� �� �Է�(��, 1~10) : -5
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���鱸��) : ������ 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[1](���鱸��) : �Ž��� 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[1](���鱸��) : ���̻� 010-3333-3333

//---------------------------
//��ü �л� �� : 3��
//---------------------------
//�̸�     ��ȭ��ȣ
//---------------------------
//�̸�		��ȭ��ȣ
//������	010-1111-1111
//�Ž���	010 ~
//���̻�	010 ~
//---------------------------
//��� �Ϸ��� �ƹ� Ű�� �����ÿ�

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	//����
	int membercount = 0;

		//�ο� �� �Է¹ޱ� (���� ���� ������ �� �ݺ��� > �ƴ� ���� ������ �� �ݺ��Ǿ���ϴµ�.)
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10)  : ");
			membercount = sc.nextInt();
		}
		while (membercount<1 || membercount>10); //�ΰ� �̻��� ������ ����������(������)

/*
	//�׽�Ʈ(���÷� �غ���)
	System.out.print("����ڰ� �Է��� ����  : "+membercount);
*/

	//�̸� �迭�� �����ϱ�
	String[] names = new String[membercount]; //���ī��Ʈ ��ŭ �迭 ���� ������

	//�̸� �迭�� �����ϱ�
	String[] tels = new String[membercount]; //������ ����(���ī��Ʈ) ��ŭ �迭 ���� ������


	//(�ݺ�) �л� �̸��� ��ȭ��ȣ �Է¹ޱ�(?????)(��Ʈ�� �ƴϸ� ���� �޴µ�??)�̸��� ���ڸ� ���ÿ� ���� �޴µ�?????
	for (int i = 0 ; i<membercount ; i++) //i�� �迭��, <>�� = ���� �� ���� �ȴ�
	{
		System.out.printf("�̸� ��ȭ��ȣ �Է� [%d]", i+1); //����? ������ ���.
		names[i] = sc.next();
		tels[i] = sc.next();	
	}

	//���� ��� ���

	//�л� �� ǥ��
	System.out.println();
	System.out.println("------------------");
	System.out.printf("��ü �л� �� : %d%n",membercount);
	System.out.println("------------------");
	System.out.println("�̸�		��ȭ��ȣ\n");

	//�л� ����Ʈ �ݺ� ���
	for (int i=0;i<membercount;i++)
	{
		System.out.printf("%2s %4s%n",names[i],tels[i]);
	}
	}
}