
//1���� 100���� ������ �� : 5050
//1���� 100���� ¦���� �� : 2550
//1���� 100���� Ȧ���� �� : 2500
//����Ϸ��� �ƹ� Ű�� ��������...

public class Test049
{
	public static void main(String[] args)
	{
		int n=1;
		int A=0; 
		int B=0;
		int C=0;

		while (n<=100)
		{
			C+=n;  //����
			if (n%2==0)
			{
				A +=n; //¦��
			}
			else if (n%2!=0)
			{
				B +=n; //Ȧ��
			}
			else
			{
				System.out.print("���Ұ�");
			return
			}
				n++;
		}
				System.out.print("1���� 100���� ������ ��" +C);
				System.out.print("1���� 100���� ¦���� ��" +A);
				System.out.print("1���� 100���� Ȧ���� ��" +B);
	}
}

//{}ǥ�ö��� ���ƹ�������. �̰� �ٽ� �Է��غ��°� ���� ��. 