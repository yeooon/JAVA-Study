//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.

//�Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε� ������ �������� �ʴ� ��. 
//��, 1�� �Ҽ� �ƴ�

//���� ��
//������ ���� �Է� : 10
//10 �� �Ҽ� �ƴ�

//������ ���� �Է� : 11
//11 �� �Ҽ�!

//hint 967 ���� ������ �����ϳ�...
//���������� ����� 1���� �ƴ����� �Ǵ�.
//�Ϳ�.

//bloolean flag=true

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int num; //����ڰ� �Է��� ��
		int n = 2;
		String result = "�Ҽ���";
		boolean flag = true; //num����� �Է°��� �Ҽ��� ���̴�. 

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		//���� ����
		//�Ҽ�
		
 
\

boolean flag = true; //num����� �Է°��� �Ҽ��� ���̴�. 

while(n<num) //num�� 6�϶�
{
	if(num%n==0)
	{
		// result = "�Ҽ��� �ƴϴ�~"
		flag = false; // "�Ҽ��� �ƴϴ�~"
		break;//break�� ���δ� ���� ����� �ݺ���
	}
	n++; //�׷� n�� �뵵�� ����?(�̰� �ʿ䰡 �������� ������, break�� �����Ѵ�)
	}
	if (flag && num!=1)
	//���������� num�� �Ҽ���
	System.out.printf("%d �� �Ҽ�\n", num)
	else 
	//���������� num�� �Ҽ��� �ƴϴ�. 
	System.out.printf("%d �� �Ҽ��ƴ�\n", num)

//system.out.println(result); //��� ��� �� 1���� �ƴ����� ���� �߰� ���� ����


/*
		int n=0; //���� �Է�
		int result = 0;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		//���� ����
		//�Ҽ�
		
		while (0<n) //n�̶�� ���� �־��� �� 
		{
			result+=n; //����� n��ŭ �����Ѵ�.
			if (n%2==0||n%(n-1)==0)
				System.out.printf("%d �� �Ҽ��ƴ�\n",result);
			else if (n%2!=0||n%(n-1)!=0)
			{
				System.out.printf("%d �� �Ҽ�\n",result);
			}
			else 
			System.out.println("���Ұ�");
			return;
		}
	}
}
*/