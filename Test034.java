
//if��
//if ~ else �� �ǽ�

// ������ �Է¹޾� Ȧ��/¦�� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
// ��, ���� if ������ ����Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//����
		int a;

		System.out.print("������ �Է��Ͻÿ� : ");

		a = Integer.parseInt(br.readLine());

			if (a%2==0)
			{
				System.out.printf("%d�� ¦���Դϴ�", a);
			}
			if (a%2!=0)
			{
				System.out.printf("%d�� Ȧ���Դϴ�", a);
			}


/*
		int a; //
		double A; //���� ��
			
		A = a/2;
			
			if (A=0)
			{
				A = "¦��";
			}
			else 
			{
				A = "Ȧ��";
			}

		System.out.print("������ �Է��Ͻÿ� : ");
			a = Integer.parseInt(br.readLine());

		System.out.printf("��� : %s", A);
*/			
	}
}