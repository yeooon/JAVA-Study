
/*=================================
�ڡڡ��ڹ��� �ֿ�(�߿�) Ŭ�����ڡڡ�
==================================*/

// Wrapper Ŭ����


public class Test133
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;			//-- ����ڽ�

		int n = 300;
		Integer wrapN = new Integer(n);
		int n2 = wrapN;				//-- �����ڽ�

		float f = 300.3f;
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);

		//Integer Ŭ����

		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 12

		ni = Integer.parseInt("0101",2);			//��Ƽ�� Ŭ���� �ȿ� �Ľ���Ʈ �޼ҵ� �ȿ� ���ڿ��� ���ڰ� �����ε� �Ǿ��ִ�?
		System.out.printf("ni : %3d\n", ni);		// ������ ������ �ٸ��� �޼ҵ� �����ε�(�������� ���ڿ� ���·� ��ȯ�Ѵ�)
		//--==>> ni : 5

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 10

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 10

		sn = Integer.toBinaryString(20); //���ڿ� ���¸� ��ȯ / to�� �پ��ִ� �޼ҵ�� ��ȯ�� �����ϴ� �޼ҵ��. 
		System.out.printf("sn : %s\n", sn);
		//--==>> ni : 10100

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n",sn);
		//--==>> ni : 37

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n", sn);
		//--==>> ni : 1f

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> ni : 50

		int n3 =345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		//--==>> ni : 345


	}
}