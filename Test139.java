
/*=================================
�ڡڡ��ڹ��� �ֿ�(�߿�) Ŭ�����ڡڡ�
==================================*/

// String Ŭ����

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
//--==>>seoul korea


		//�� ���ڿ� ����		
		System.out.println(s.substring(6,9));
//--==>>kor

		// �� String.substring(s,e)
		// String ���ڿ��� �������
		// S��°����... e-1��°���� ����
		// (��, �ε����� 0���� ����)


		System.out.println(s.substring(7));
//--==>>kor

		// �� String.substring(s)
		// String ���ڿ��� �������
		// S��°����... ������ ����
		// (��, ���ڿ��� ���� ���̸�ŭ...)

		//�� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
//--==>>true
//--==>>false		
		//--��ҹ��� ����

		System.out.println(s.equalsIgnoreCase("seoul Korea"));
//--==>>true
		//--��ҹ��� ���� ����

		//�� ã���� �ϴ� ��� ���ڿ�(s)��
		// ��kor�� ���ڿ��� �����ұ�?
		// �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?

		//"seoul korea"
		// 0123456

		System.out.println(s.indexOf("kor"));
//--==>> 6
		System.out.println(s.indexOf("ea"));	
//--==>> 9
		System.out.println(s.indexOf("e"));	
//--==>> 1
		System.out.println(s.indexOf("tt"));	
//--==>> -1 
		//--ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		// �� ���ڿ��� �ε����� ��ȯ������
		// �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�. (-1)

		// �� ��� ���ڿ�(s)�� rea �� ���������� ���� Ȯ��
		// (true / false)
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
//--==>>true
//--==>>false

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		// e ���ڿ��� �����ұ�?
		// �����Ѵٸ� �� ��ġ�� ��� �ɱ�?
		// (��, �ڿ������� �˻�)

		//seoul korea
		System.out.println(s.indexOf("e"));
//--==>> 1 

		System.out.println(s.indexOf("o"));
//--==>> 2

		System.out.println(s.lastIndexOf("e"));
//--==>> 9
		//"seoul korea"
		// 0123456789
		// ���� a���� ã�Ƽ�, �տ������� ���� �����ش�.
		System.out.println(s.lastIndexOf("o"));
//--==>> 7

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		// e ���ڿ��� �����ұ�?
		// �����Ѵٸ� �� ��ġ�� ��� �ɱ�?
		// (��, �ڿ������� �˻�)	

		// �� ��� ���ڿ�(s) ��
		// 6 ��° �ε��� ��ġ�� ���ڴ�?

		//seoul korea
		System.out.println(s.charAt(6));
//--==>> k

		//System.out.println(s.charAt(22));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//-- StringIndexOutOfBoundsException

		// �� ��� ���ڿ�(s) �� �� ���ڿ� seoul corea ��
		// � ���ڿ��� �� ū��?	�� ���ڿ��� ���� ũ�� ��
		// ==> �� ���ڿ��� ���ٸ�	�� 0
		// ==> �� ���ڿ��� �ٸ��ٸ� �� ���̸� Ȯ��

		System.out.println(s.compareTo("seoul korea"));
		//--==>> 0

		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8
//-- c ~ 

		// �� ��� ���ڿ�(s) ��
		// �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ����

		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����","����");

		System.out.println("ó�� ��� : " + s);
//--==>>ó�� ��� : �츮���� ���ֹα� ���ֵ��� ����


		// �� ���� ����
		s = "          ��        ��          ";
		System.out.println("|||" + s + "|||");
//--==>>|||          ��        ��          |||
		System.out.println("|||" + s.trim() + "|||");
//--==>>|||��        ��|||
//--> ���� �����ڸ� ���� ����

		System.out.println("|||" + s.replaceAll("  ","") + "|||");
//--==>>|||���|||
// ������ ������ ������ ���� ���ڿ��� ��ü�ض�.

		//"30"
		int temp = Integer.parseInt("30");
		//System.out.println(temp);
		System.out.printf("%d\n",temp);
//--==>>30
// ���� ���·� ��ȯ
		s = Integer.toString(30);
		System.out.printf("%s\n",temp);
//--==>>30
// ���� ���·� ��ȯ

		int n = 2345678;
		System.out.printf("%d",n);
		System.out.format("%d",n);
//--==>>23456782345678

		System.out.println();

		s = String.format("%d", n);
		System.out.println(s);
//--==>>2345678
	
		s = String.format("%,d",n);
		System.out.println(s);
//--==>>2,345,678

		//String str = "�⺻, ����, ���";
		//String[] strArr = str.split(",");

		//line 174 ~ 175 �� ������ ����
		String[] strArr = "�⺻, ����, ���".split(",");

		for(String str : strArr)
		{
			System.out.print(str+" ");
		}
		System.out.println();




		

	}
}