import java.util.Scanner;

public class Test021
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;


		// ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(,����) : ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		

		// sc = new Scanner("�̿���,90,80,70"),useDelimiter("\\s*,\\s*");
		// 
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;


		// ��� ���
		System.out.println("\n>> �̸� : " + name);
		System.out.println(">> ���� : " + tot);
	}
}