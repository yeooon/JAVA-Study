
//�ݺ��� 
//����ڷκ��� ������ �� ������ �Է¹޾�
//���� ������ ū �������� ���� ���Ͽ�(�߿�!)
//����� ����ϴ� ���α׷��� �����Ѵ�.

//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 20
//>> 10 ~ 20 ������ �� : xxx

//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 2
//>> 2 ~ 10 ������ �� : xxx

//������ ���۵� �������� ���а� �ִ� �� ������ / ���� {}�� �� �߳�...^^ 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n; //���� ������ Ȱ���� ����? 
	int a,b; //������ �� ����
	int result = 0; //���� �����

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

	//�Է¹��� �� ���� ũ�� �񱳿� �ڸ� �ٲ�
	if (a>b)
	{
		a ^ b=a;
		b ^ a=b;
		a ^ b=a;
	}
	// �ݺ� ���� 
	// �ݺ� ���� ���� ����
	// ���� ���� ���� ������ ���� ������?
	// ��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�...
	// �� ���� �ݺ� �������� ����ϰ� �Ǹ� ������ ���� ����� �� ���� ����

	n = a;

	while (n<b)
	{
	result += n;
	n++;
	}
	//��� ���
	System.out.printf("%d ~ %d������ �� : %d",a,b,result);
	}

		

}