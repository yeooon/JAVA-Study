/*================================
�ڡڡ�Ŭ������ �ν��Ͻ��ڡڡ�
================================*/

//����ڷκ��� ������ ������ �Է¹޾� 
//1���� �Է¹��� �������� ���� �����Ͽ�
//������� ����ϴ� ���α׷��� �����Ѵ�.

//��, Ŭ������ �ν��Ͻ� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
//����, �Է� ó�� �������� BufferedReader�� ReadLine()�� ����Ͽ�,
//�Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
//�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�

//������ ���� �Է�(1~1000) : 1050
//������ ���� �Է�(1~1000) : -45
//������ ���� �Է�(1~1000) : 100
//>>1~100������ �� : 5050
//����Ϸ��� �ƹ� Ű�� ��������...

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;

	class Hap 
{
	int n;
	
	//�����͸� �Է¹޴�
	void Input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
		System.out.print("������ ���� �Է�(1~1000) : ");

		n = Integer.parseInt(br.readLine()); 
		}
		while (n<1||1000<n);
	}
//==============================================//�̺κ��� ������ �� ������
	//�������� �ջ� //i��� �� ������ �����ϳ�?
	int	sum()
	{
		int result = 0;

		for (int i=0;i<=n;i++) //n�� Ŀ�� ���� �����ϱ� �������� i�� ����
		{
			result+=i;
		}		
		return result;
	}

//===============================================

	//����Ʈ��
	void print(int sum) //������ �޼ҵ� �̸��� ������
		{
		System.out.printf("1 ~ %d������ �� : %d",n,sum);
		}
}


public class Test074
{
	public static void main(String[] args) throws IOException
	{
	Hap ob = new Hap();

	//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
	//�������� Ȱ��
	//ob��� ���������� �̿��� ��ǲ ȣ��
	ob.Input();

	//�� �޼ҵ�==������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� > sum
	int h = ob.sum(); 
	//h���ʿ� ���� ���� ������
	//


	//�Ű������� ��	//������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ�� > print����
	ob.print(h);
	}
}

/*

	//�� �޼ҵ�
	int hap = ob.sum();

	//�������� ũ�⸦ ������ �� �ִ� Ŭ����
	int dt() //
		if (num<0)
		{
			boolean false;
		}
		if else (num>0)
		{
			boolean false;
		}
		else 
			boolean true;


	//�������� �ջ� ����
	int	sum()
	{
		do
		{
		result+=n;
		n++;
		}
		while (n>0 || n<1000);

		return result;
	}

*/
