


import java.util.Scanner; //�̷� ������ �׻� �� ����

public class sungjuk 
{
	//0. �ֿ� �Ӽ� ����
	int inwon;					//-- �ο� ��
	Record[] rec;				//Record �迭(�л� �� �� �� Record �迭 �� �� �� Ȱ��)
								//Record�� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭
								//�迭 ����Ŵ� ����
	
								//Ŭ���� �ȿ� �ν��Ͻ� ���� ���� ���ųִ°� ���� ����

	//�ֿ� �޼ҵ� ����(��� ����)

	// 1. �ο� �� �Է� �� ���⼭�� �ο� ���� �Է¹ް�&�׸�ŭ �迭�� �����
	public void set()
	{
		Scanner sc = new Scanner(System.in); //��ĳ�ʴ� �޼ҵ� �ȿ� ���������

		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon>100||inwon<1);

								//Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
								//�迭���� inwon��ŭ ������ ������
								//Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.         

		rec = new Record[inwon]; //�迭��� �ν��Ͻ��� �ٸ��� (�迭=�׸� , �ν��Ͻ� ��ü=���� ���빰)

								//���ڵ� Ÿ���� �迭�濡�� ���ڵ� Ÿ�Ը� ���� �� �ִ�(����, ���� ��� �ƹ��͵� ������)
								//���� ���� �迭�� �ο���ŭ ���� ����ڴ� ����
	}




	//2.�� ������ �Է�(���� �� ��� ���� ��� ����) �� ������ ���� �迭�� �����͸� �־��ش�. 

	public void input()								//void�� ���� �ڷ���
	{
		Scanner sc = new Scanner(System.in);		//��ĳ�ʴ� �޼ҵ� �ȿ� ���������

		String[] title = {"���� ���� : ","���� ���� : ","���� ���� : "}; //��,��,�� ���� �迭

		for (int i=0;i<inwon;i++) //rec.legnth
		{
													//��� ������ ���� ���ڵ� Ŭ���� ����� �ν��Ͻ� ������ ���� ���� �Ǿ�� �Ѵ�
			rec[i]= new Record();					//���ڵ� �迭�� �ν��Ͻ� ��ü�� ��´�.

			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			rec[i].name = sc.next();				//���ڵ�.name �迭�� ��ƿ� �̸��� ��´�. 

/*
			System.out.print("���� ���� : ");
			rec[i].guk = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].eng = sc.nextInt();
			System.out.print("�������� ���� : ");
			rec[i].mat = sc.nextInt();
*/
/*
			System.out.print("���� ���� : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("�������� ���� : ");
			rec[i].score[2] = sc.nextInt();
*/
			for (int j=0;j<title.length;j++)		//��������, ��������, �������� ����� �Ǵ� �κ��̴�.
			{
													// �ȳ� �޼��� ���
				System.out.print(title[j]);

													//����ڰ� �Է��� �����͸� ���ھ� �迭�� ��Ƴ���
				rec[i].score[j] = sc.nextInt();		//score[0] �� ��������
													//score[1] �� ��������
													//score[2] �� ��������

			//����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
			//������ ���� ���� ����

				rec[i].tot += rec[i].score[j];
			}
			//��� �����ϱ�
				rec[i].avg = rec[i].tot/3.0;
		}//end outer for
	}

	
	//3. ����Ʈ
	public void print()
	{
		//��ŷ ��� ����
		ranking();

		for (int i=0;i<inwon;i++) //=rec.length
		{
			//�̸� ���
			System.out.printf("%5s",rec[i].name);

			//���� �ݺ� ���
			for (int j=0;j<3 ;j++) //j�� �� 3���� ���� �ɱ�? Record���� 3���� �����س��� �׷���
				System.out.printf("%4d",rec[i].score[j]);
			
			//����, ��� ���
			System.out.printf("%5d",rec[i].tot);
			System.out.printf("%8.2f",rec[i].avg);

			//���� ��� ���� �߰�
			System.out.printf("%5d",rec[i].rank);

			//����
		}
	}
	
	// ���� ���� �޼ҵ� �߰�
	// - ���� ���� �������� ���꿡 �ʿ��� �����Ͱ� �̹� �����ϴ� ��Ȳ > �Ű����� ���� (�Ű�����:������ ���� �޾ƿ;� �ϴ� ������?) 
	// - Record �迭�� rank �Ӽ� �ʱ�ȭ ��� ���� > ��ȯ �ڷ��� void
	// - Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� > �������� ������ private
	private	void ranking()
	{
		// ��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
		for (int i = 0;i<inwon ;i++ )
			rec[i].rank = 1;

		//��� ����
		for (int i=0;i<inwon-1;i++) // �� > �񱳱��� > 0     1     2
		{
			for (int j=i+1;j<inwon;j++) //�� > �񱳴�� > 123  23   3
			{
				// �񱳱����� ����� �� ����� ��պ��� ũ�ٸ� 
				// �񱳴���� rank�� 1��ŭ ����
				if (rec[i].avg > rec[j].avg)//�񱳱��� ���, �񱳴�� ��� 
				{
					rec[j].rank++;
				}
				else if (rec[i].avg < rec[j].avg)
				{
					rec[i].rank++;
				}

				// �񱳴���� ����� �񱳱����� ��պ��� ũ�ٸ� 
				// �񱳱����� rank�� 1��ŭ ����
			}
		}
	}
}
