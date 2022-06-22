
//switch�� �ǽ�

//���� ���ù��̶� �ϸ�, switch�� ������ ���� ���� ����
//���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.
//���� ���ù� = ����ġ��

/*
���� �� ����
switch(����)
{
	case ���1 : ����1; [break;](break�ȿ� ����ִ� �� ������ ������ �κ�)
	case ���2 : ����2; [break;]
		.
		.
	[default : ����n+1;[break;]]
}

switch���� ���İ� case�� ����� 
byte, short, int, long ���̾�� �Ѵ�.(������)

break ���߰� ����������
continue �޺κ� �����ϰ� ����ض�

case �� �ڿ� break�� ���� ������ ���
���� case ���� ������ ����ؼ� �̾ �����ϰ� �ȴ�. >> �⺻��
break�� ������ ��� �ش� �������� ������ ���� �� switch ���� ����������. >> �Ϲݸ�


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, mat, eng, tot;
		int avg;
		char grade;

		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		
		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());

		tot = kor + mat + eng;
		avg = tot/3;

		switch(avg/10)   //avg�� Ȯ���ؼ� ����� 100�̶�� A�� ��ڴ�, 60�̶�� d�� ��ڵ�
		{
			case 10 : grade = 'A'; break;
			case 9 : grade = 'A'; break;
			case 8 : grade = 'b'; break;
			case 7 : grade = 'c'; break;
			case 6 : grade = 'd'; break;
			default : grade = 'f'; break;

		}	

		System.out.printf("%n����� �̸��� %s �Դϴ�.", name);
		System.out.printf("%n����� ����� %d �Դϴ�.", avg);
		System.out.printf("%n����� ����� %c �Դϴ�.", grade);
	}
}

/*
�̸� �Է� : �̿���
���� ���� �Է� : 29
���� ���� �Է� : 53
���� ���� �Է� : 65

����� �̸��� �̿��� �Դϴ�.
����� ����� 49 �Դϴ�.
����� ����� f �Դϴ�.����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/