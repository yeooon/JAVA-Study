// �ڹ��� �⺻ ����� : java.util.Scanner
// ���۵帮���� �ͼ����� �� ���� ��ĳ�� ��� ����
// ��java.until.Scanner
// �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� ����
// ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
// �ۼ��� ���� ��ū�� next �޼ҵ带 ���
// �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.


import java.util.Scanner; 


public class Test019
{
	public static void main(String[] args)
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;

		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();  //���ڿ� ���·� ��ư����� ��

		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();  
		//���۸����� ����ȯ�� Integer.parseInt �ؾ��ϴµ�,
		//��ĳ�ʴ� sc.nextInt(), �̷��� �ڿ� �ٿ��ֱ⸸ �ϸ� �ȴ�!

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		//��� ���

		System.out.println(" ");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + (kor + eng + mat));



		

	}
}