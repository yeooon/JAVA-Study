
import java.util.Scanner;

public class Test020
{
	public static void main(String[] args)
		{
			//�ֿ亯������
			java.util.Scanner sc = new java.util.Scanner(System.in);
			String name;
			int kor, eng, mat, tot;

			//���� �� ó��
			System.out.print("�̸� ���� ���� ���� �Է�(���� ����) : ");

				// ����ڰ� �Է��� �����͸� �� ������ �� ���� ��Ƴ���
				name = sc.next();
				kor = sc.nextInt();
				eng = sc.nextInt();
				mat = sc.nextInt();

				//���� ����

				tot = kor + eng + mat;

				System.out.print("\n>> �̸� : " + name);
				System.out.print("\n>> ���� : " + tot);

/*
�̸� ���� ���� ���� �Է�(���� ����) : �̿���
90
80
70

>> �̸� : �̿���
>> ���� : 240����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


		}
}