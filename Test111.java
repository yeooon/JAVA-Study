/*=======================================
�ڡڡ�����(Sort) �˰�����ڡ�
========================================*/

// �� �տ��� �� Selection Sort(Test109)��  Bubble Sort(Test110)�� ������ ����.
//		(�� �ݺ��� Ƚ���� ����)
//		������, ���� Bubble Sort�� ��� �������� ������ ����
//		�Ϲ� Bubble Sort�� Selection Sort ���� ������ ���� �� �ִ�.

// ���� ������ : 61 15 20 22 30
//				 15 20 22 30 61 - 1ȸ�� (���� �߻� �� true) �� ���� ȸ�� ���� O
//				 15 20 22 30 61 - 2ȸ�� (���� �߻� �� false) �� ���� ȸ�� ���� X
// ==> 1ȸ�� ����... 2ȸ�� ����...�� �غ��Ҵ���...
// 2ȸ������ ����(�ڸ��ٲ�)�� ���� �Ͼ�� �ʾұ� ������
// ���ʿ��� �߰� ����(�� �̻��� ȸ��)�� ���ǹ��� ������ �Ǵ��Ͽ�
// �������� �ʴ´�.

// ���� ��)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50

// ���� ������ �ڿ������� ���ĵǴ� �Ŷ�� �ϳ�?

public class Test111
{
	public static void main(String[] args)
	{
		int arr[] = {10, 50, 20, 30, 40};
		/*
		10, 50, 20, 30, 40  == i , i+1
		==  --
		10, 20, 50, 30, 40
		    ==  --
		10, 20, 30, 50, 40
		        ==  --
		10, 20, 30, 40, 50
					==  --
		--------------------------- 1ȸ�� �� ���� �߻�
		10, 20, 30, 50, 40
		==  --
		10, 20, 30, 40, 50
			==  --
		10, 20, 30, 40, 50
				==  --
		--------------------------- 2ȸ�� �� ���� �߻����� ����
			X
			X
		--------------------------- 3ȸ�� �� X
			X
		--------------------------- 4ȸ�� �� X			
		*/
		System.out.print("Source Data");
		for (int n:arr)
			System.out.print(n + "  ");
		System.out.println();

		//���� Bubble Sort ����

		int pass=0;
		boolean flag; //�÷��� ���� ���� ���̴���

		do
		{
			flag = false; // �ѹ��� �ڸ��ٲ��� �Ͼ�� ���� �Ŷ�� ����
			pass++;

			for (int i=0;i<arr.length-pass;i++)
					//	1<5-1	
			{
				//�׽�Ʈ
				//System.out.println("��");
				if (arr[i] > arr[i+1])
				{
					//�ڸ��ٲ��� �Ͼ��?!
					arr[i] =  arr[i]^arr[i+1];
					arr[i+1]=arr[i+1]^arr[i];
					arr[i] =  arr[i]^arr[i+1];

					flag = true;	//�ڸ� �ٲٴ°� �� �ѹ��̶� �Ͼ�� flag ������ true�� ����
				}
			}
		}
		while (flag);
		// flag ������ false��� ����
		// ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ����
		// �� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ� ����
	}
}
