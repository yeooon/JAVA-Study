
//break �ǽ�

//������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
//�� �Է¹޴� ������ 1 ~ 100 ���� �ȿ����� �����ϵ��� �ۼ��Ѵ�.

//������ ���� �Է� : -10

//������ ���� �Է� : 0

//������ ���� �Է� : 2020

//������ ���� �Է� : 10

//>> 1~ 10������ �� : 55 (�ݺ���) �� �����ǻ� ���ޱ����� ���μ��� ��� ����

//��� �Ͻðڽ��ϱ�?(Y/N) : y

//������ ���� �Է� : 100

//>> 1 ~ 100������ �� : 5050

//��� �Ͻðڽ��ϱ�?(Y/N) : n
//����Ϸ��� �ƹ� Ű�� ��������... �� ���α׷� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//����
	//������ ������ �Է¹��� o
	//���� �Է¹��� ������ ���� (1~100)
	//�Է¹��� ���������� ���ϱ� ���� ����.
	//����� result o
	//��� �Ͻðڽ��ϱ�? ���
	//�� �Է¹���
	//��� �Ͻðڽ��ϱ�? ���
	//�ƴ϶�� �ҽ� ����

	//����
		int num, sum; //����ڰ� �Է¹��� �� 
		int i;
		char ch;

		while (true)
		{

	//������ ������ �Է¹��� o
	//���� �Է¹��� ������ ���� (1~100)
		do //��ȿ�� �˻��� ���� ��
		{
		System.out.print("\n������ ������ �Է��Ͻÿ� : ");  //�Է°��� ���ϴ� ���� �ۿ� ���� �� ���� �ݺ�
		num = Integer.parseInt(br.readLine());
		}
		while (num<1 || num>100); //�̷��� ������ ��� �ݺ� ����


		//����� �� ������ �Էµƴ�. 
									
		//���� ������ 



		sum=0; //������ ���� �ʱ�ȭ ��ġ 

	//�Է¹��� ���������� ���ϱ� ���� ����.
	//����� result o
		
		for (i=1 ; i<=num ; i++)
		{
			sum+=i;
		}
		System.out.printf(" 1 ~ %d ������ �� : %d%n", num, sum);
		System.out.print("����Ͻðڽ��ϱ�?(Y/N) : ");
		ch = (char)System.in.read();  //���ڷ� �ҷ����� �� > ĳ���ͷ� ����ȯ


		//��� �Ͻðڽ��ϱ�? ���
		//�ƴ϶�� �ҽ� ����

		//�׸��ҷ� �ǻ�ǥ��
		//Y �Ǵ� y �Է��Ѱ� �ƴѰ� Ȯ��?
		if(ch!='Y' && ch!='y') //���� ch�� n�̳� N�̶��
		{
		// �ݺ����� ���߰� �������� �� �ִ� �ڵ� �ʿ�
		//���� ���� �ǻ� ǥ���� �ߴٸ�
		//�׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�
		break;
		//�����(�׸��� ����������)
		}
		System.in.skip(2);
		}

	}
}