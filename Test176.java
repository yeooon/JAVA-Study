
/*==========================================
  ���� �ڹ��� �⺻ �����(I/O) ó�� ����
============================================*/

// Reader �ǽ�

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test176
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.im : �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader :  ����Ʈ�� ���ڷ� �ٲ��ִ� ���� ����
		// Reader : ���� ��� ��Ʈ�� ��ü

		Reader rd = new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(����:ctrl+z)");

		while ((data = rd.read()) != -1)
		{
			ch = (char)data;

			//System.out.print(ch);
			/*
			���ڿ� �Է�(����:ctrl+z)
			asdf
			asdf
			1234
			1234
			�����ٶ�
			�����ٶ�
			*/

			System.out.write(ch);
			/*
			���ڿ� �Է�(����:ctrl+z)
			asdf
			asdf
			1234
			1234
			�����ٶ�
			 ��|
			*/
		}
	}
}