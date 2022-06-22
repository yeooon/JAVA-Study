
//StringBuffer Ŭ����

/*
�� StringBuffer Ŭ������
���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
String Ŭ������ ���� ���ڿ� �������� ������ �Ұ��������� 
StringBuffer Ŭ������ ���ڿ��� ����� �� 
���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.

��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

����, JDK 1.5 ���ĺ��ʹ�
���ڿ��� ó���ϴ� StringBuilder��� Ŭ������ �����Ѵ�. 
StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ���������� 
���� ū �������� multi-thread unsafe ��� ���̴�.
��, Syncronization�� ���� ������
StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.
*/

public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);		//�ּҰ� ��
		System.out.println(sb1.equals(sb2));
//--==>>false
//--==>>false

		System.out.println(sb1);
//--==>>korea

		System.out.println(sb1.toString());
//--==>>korea

		System.out.println(sb1.toString().equals(sb2.toString()));
//���� ũ�� : 16true

		System.out.println("-------------------------------------");

		StringBuffer sb3 = new StringBuffer();
		//--StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		//�⺻������ �����Ǵ� ������ ũ��� 16

		System.out.println("���� ũ�� : " + sb3.capacity());
//���� ũ�� : 16
	
		///////////////////////////////////////////////////////

		System.out.println(sb3);
//--==>> ��
/*
		String name = "ȫ�浿";
		name += "�̼���";
		name += "������";
		System.out.println(name);
*/
		sb3.append("seoul");		// sb += "seoul";
		sb3.append("korea");		// sb += "seoul";
		sb3.append("�츮����");		// sb += "�츮����";
		sb3.append("���ѹα�");		// sb += "���ѹα�";

		System.out.println(sb3);  //��Ʈ������Ÿ��
//--==>>seoulkorea�츮������ѹα�

		System.out.println(sb3.toString());		//��Ʈ��Ÿ��		
//--==>>seoulkorea�츮������ѹα�


		System.out.println("���� ũ�� : " + sb3.capacity());
//--==>>���� ũ�� : 34

		/////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());			//�ҹ��ڸ� �빮�ڷ� �ٲپ��ش�
//--==>>JAVA AND ORACLE

		String temp2= "JAVA AND ORACLE";
		System.out.println(temp1.toLowerCase());
//--==>>java and oracle

		//System.out.println(sb3.toLowerCase());	
		//System.out.println(sb3.toLowerCase());	
		
		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());	
//--==>>SEOULKOREA�츮������ѹα�

		System.out.println(sb3.toString().toUpperCase());
//--==>>SEOULKOREA�츮������ѹα�	

		// seoulkorea�츮������ѹα�


		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//	"�ѱ�" �̶�� ���ڿ� �߰�
		// �� �ѱ�seoulkorea�츮������ѹα�
		sb3.insert(0,"�ѱ�");
		System.out.println("seoul �տ� �ѱ� �߰� : " + sb3.toString());
//--==>>seoul �տ� �ѱ� �߰� : �ѱ�seoulkorea�츮������ѹα�

	
		// �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		// "���" �̶�� ���ڿ� �߰�
		// ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ �ʰ�...

		//�׽�Ʈ ��
		System.out.println(sb3.toString());		
//--==>>�ѱ�seoulkorea�츮������ѹα�

		//�׽�Ʈ ��
		//sb3.insert(12,"���");
		//System.out.println("korea �ڿ� ��� �߰� : " + sb3.toString());

		//�׽�Ʈ ��
		System.out.println(sb3.indexOf("korea"));
//--==>>7

		//�׽�Ʈ ��		
		//sb3.insert(sb3.indexOf("korea")+"koerea".length(),"���");	
		//			   ---------------
		//System.out.println(sb3.insert(sb3.indexOf("korea"),"���"));
		//System.out.println(sb3.insert(sb3.indexOf("korea")+5,"���"));
		System.out.println(sb3.insert(sb3.indexOf("korea")+"korea".length(),"���"));
//--==>>�ѱ�seoulkorea����츮������ѹα�

		
		// �� ��� ���ڿ�(sb3) ����
		// ���츮���� ���ڿ� ����
		// sb3.delete(14,18);
		// System.out.println(sb3);
//--==>>�ѱ�seoulkorea������ѹα�



/*
		sb3.delete(14,18);
//--==>>sb3.delete(sb3.indexOf("�츮����"),18);
//--==>>sb3.delete(sb3.indexOf("�츮����"),sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println(sb3);
//--==>>�ѱ�seoulkorea������ѹα�

		System.out.println(sb3.delete(sb3.indexOf("�츮����"),sb3.indexOf("�츮����")+"�츮����".length()));
		//													  ------------------------- ����Ʈ ���� �����ϴ� �ſ���... �츮���� ����(14), +4 = �츮����(18)
		//(������("�츮����" �κ�,"�츮����" �κ� + "�츮����" ����)

		// �� ��� ���ڿ�(sb3) ����
		// ��korea�� ���� ���ڿ� ����(korea ����)
		sb3.delete(sb3.indexOf("korea"),sb3.length());
		System.out.println(sb3);

*/



		// ���� ũ�� Ȯ��
		
		// ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34

		//���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==>> ���ڿ��� ���� : 34


		//���� ũ�� ����
		// �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize();

		//���� ũ�� ���� ���� ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());


		
	}
}