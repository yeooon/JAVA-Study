
//����
//����ڷκ��� ������ ������ �Է¹޾�
//1���� �Է¹��� �� ���������� 
//��ü �հ�, ¦���� �հ�, Ȧ���� ���� ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

//������ ���� �Է� : 280
//>> 1 ~ 280���� ������ �� : 
//>> 1 ~ 280���� ¦���� �� : 
//>> 1 ~ 280���� Ȧ���� �� : 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test055
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num; //����ڰ� �Է��� ���� 
		int n=1; //1���� num���� ������ ������)(���߿��)
		int result = 0; //������
		int result2 = 0; //¦�� ������
		int result3 = 0; //Ȧ�� ������

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		//������ ���� ���� ������ �ݺ��Ѵ�. �� while
		//������ 
		//¦���� �� if
		//Ȧ���� �� if


		while (n<=num)  //(������ <= �Է°�) �������� �Է°����� ũ�� �ʵ��� �Ѵ�
		{
			result+=n;  //num������ ������

			if (n%2==0) //¦�� �Ǻ�
			{
				result2+=n; //¦�������� ������
			}
			else if (n%2!=0) //Ȧ�� �Ǻ�
			{
				result3+=n; //Ȧ�������� ������
			}
			else
			{
				System.out.print("�Ǻ� �Ұ�");
				return; //�޼ҵ� ����
			}
			n++; //if���� �������ͼ� while���� �� ���� ��ġ �� ���� ������ �⺻ ��ġ�� �� ����. 
		}
			System.out.printf("1 ~ %d���� ������ �� : %d%n", num, result);
			System.out.printf("1 ~ %d���� ¦���� �� : %d%n", num, result2);
			System.out.printf("1 ~ %d���� Ȧ���� �� : %d%n", num, result3);
		
	}
}

/*
*/