
// 1*2*3*4*5...*10

//������ : xxx
//��� �Ϸ��� �ƹ� Ű�� ��������...

public class Test052
{
	public static void main(String[] args)
	{
		//�ֿ� ���� �� �ʱ�ȭ
		int n=0, result=1; //���� ���� ���� ������ 1�� �ʱ�ȭ �ϴ� ���� �Ϲ����̴�. 

		//���� �� ó��(�ݺ��� ����)
		while(n<10)
		{
			n++;
			result *= n;
		}
		System.out.print("������ : " + result);

	}
}