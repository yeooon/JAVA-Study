//==========================
//���� �帧�� ��Ʈ��(���)
//==========================
// ���� ��ȭ�ΰ�?
// �� ī��

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������� ������� �Ǻ��Ͽ�
// ��, �Է��� ���۵帮���� �ް�, ��������� Ȱ���ϰ�,
// if ���ǹ��� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

// Ǯ���� ������ �������� ���ε�, ÷�����Ϸε� ���ε�.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		//����ڷκ��� ������ ������ �Է¹ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int yea;

		System.out.print("������ �Է��Ͻÿ� : ");

		yea = Integer.parseInt(br.readLine());
		
		// �����ΰ���? �ƴϸ� ����ΰ���?
		// ������ 4�� ����̸鼭 100�� ����� �ƴϰ�, 400�� ����̸� �����̴�

/*
		if (yea%4==0)
		{
			System.out.printf("d% �� ����\n", yea);
		}
		else if (yea%100!=0)
		{
			System.out.printf("d% �� ����\n", yea);
		}
		else if (yea%400==0)
		{
		System.out.printf("d% �� ����\n", yea);
		}
		else
			System.out.print("���� �ٽ� Ȯ���ϼ���.");
*/
// ��Ÿ�� ����
// ���� ���� : %d�� d%�� �ٲ� ���. �����Ͽ��� �� �˷� ���.

		if (yea%4==0 && yea%100!=0 || yea%400==0) // (������ 4�� ����̸鼭, 100�� ����� �ƴϰ�, 400�� ���)
		{
			System.out.printf("%d �� ����\n", yea);
		}
		else if (yea%4!=0 && yea%100==0 || yea%400!=0) // (������ 4�� ����� �ƴϸ鼭, 100�� ����̰�, 400�� ����� �ƴ� ��)
		{
			System.out.printf("%d �� ���\n", yea);
		}
			else
			System.out.print("���� �ٽ� Ȯ���ϼ���.");
	}
}

//(yea%4==0 && yea%100!=0 || yea%400==0) �� ���� (yea%4==0) && (yea%100!=0) || (yea%400==0) �̷��� �ٲپ� ���� �� ������ ������ ����. �� �׷���?