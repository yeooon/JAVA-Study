/*========================
Ŭ������ �ν��Ͻ�
=========================*/

//Ŭ������ �ν��Ͻ� Ȱ��

//1~3 ������ ������ �߻����Ѽ�
//����, ����, �� ���� ���α׷��� �����Ѵ�.
//��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
//����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
//���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

//  ���� ������ �� 1:����, 2:����, 3:��

// ���� ��)
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 4
// 1:����, 2:����, 3:�� �� �Է�(1~3) : -2
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 2

//-���� : ����
//-��ǻ�� : ��

// >>�º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~~!!!

//����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Random;
import java.util.Scanner;

class RpsGame
{

//����
		int Num;			//����ڰ� �Է��� ���ڸ� ��Ƴ��� �μ�
		int[] RpsNum;		//����ڰ� �Է��� ���ڸ� ��Ƴ��� �迭
		String str[] = {"����","����","��"};			//�ʿ��� ���������� ����


//��ǲ > ����ڰ� ����, ����, �� �� �ϳ��� �Է��� �� �ְ� �����
		
	void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			Num = sc.nextInt(); // ���� �Է��ϱ�
		}
		while (Num<0||Num>3);

		RpsNum = new int[Num]; // ���ǿ����ѹ迭�� �� ������ŭ ����ڴ�.
	}	


//��� win,loose,sam
	int randomGame()
	{
		//������ �߻���Ų��.
		Random rd = new Random();

		for (int i = 0;i<Num;i++)
		{
			//RpsNum�迭�� rd �Է¹��� ���ڷ� �����ȴ�. (+1?)
			int com = rd.nextInt()+1;//��ǻ�Ͱ� �߻���Ų ���� 
			//������ ���� Num���� ������ ���� 
			String result;
			//RpsNum[j]=rd.nextInt()+1;				//RpsNum[j]�� �߻��� ������ ����ִ�.
			
			for (int j = 0;j<3;j++)
			{
				if (RpsNum[i]==RpsNum[j]) 
				{
					result = "�����ϴ�";
				}
				else if (RpsNum[i]<2)
				{
					result = "�̰���ϴ�";
				}
				else if (RpsNum[i]>2)
				{
					result = "�����ϴ�";
				}
			}
		}

		//�׸��� �߻��� ������ �̿��Ͽ� ����� �� ����ϱ�
		//���ڰ� ������ ���Ű�
		//1�϶� 2�� ���� / 2�϶� 3�̸� ���� / 3�϶� 1�̸� ����
		//1�϶� 3�̸� �̱�� / 2�϶� 1�̸� �̱�� / 3�϶� 2�� �̱��
	}
//����Ʈ
	void print();
	{
		System.out.printf("-���� : %d%n", RpsNum[i]);	
		System.out.printf("-��ǻ�� : %d%n", RpsNum[j]);
		System.out.printf("�º� ���� ��� : %s",result);
	}


}

public class Test104
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();

		ob.randomGame();

		ob.print();
	}
}