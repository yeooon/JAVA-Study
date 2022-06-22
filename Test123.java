
/*=====================
�ڡڡ�Ŭ���� ��ޡڡڡ�
======================*/

// �������̽�(Interface)

// �� �ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2280946 ȫ����
// ���� ���� ���� ���� �Է�(���� ����)	  : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2290847 �ֹ���
// ���� ���� ���� ���� �Է�(���� ����)	  : 90 100 85

// 2280946 ȫ����		90  100  85		xxx xx
//						��   ��  ��
// 2290847 �ֹ���		75   85  65		xxx xx
//						��	 ��	 ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��



import java.util.Scanner;

class Record
{
	String hak, name;	//-- �й�, �̸�, ���
	int kor, eng, mat;	//-- ����, ����, ���� ����
	int tot, avg;		//-- ����, ���(���ǻ� ���� ó��)
}



// �������̽�
interface Sungjuk
{
	public void set();		//-- �ο� ����
	public void input();	//-- ������ �Է�
	public void print();	//-- ��� ���
}



//		��  �������̵� ����




// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	Scanner sc = new Scanner(System.in);

	@Override
	public void set()	//�ο� �� 
	{
		do
		{
		System.out.print("�ο� �� �Է�(1~10) : ");
		inwon = sc.nextInt();
		}
		while (inwon<0||inwon>10);		
	}
	
/*
�� ���ִ� for�� �ȿ� �ν��Ͻ� ������ �ִ� ������ ���� Record Ŭ������ ��� �������� Record �迭�� �ְ� 
�ȿ� Record �ν��Ͻ��� �ϳ��� ��� �ش��ϴ� i��°�� �迭 ��Ҹ� �����ϴ°̴ϴ�!!
*/

	@Override
	public void input()
	{
		rec = new Record[inwon];	//�� �ο� ��������� ���� ����

		for (int i=0;i<inwon;i++)
		{
		Record rc = new Record();	// ���ڵ� Ŭ���� �ν��Ͻ� ����
		rec[i] = rc;				//rec[i]�� ���ڵ� Ŭ���� ���� ��ҵ� �����̴�. 

		System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ",i+1);
		rec[i].hak = sc.next();
		rec[i].name = sc.next();

		System.out.print("���� ���� ���� ���� �Է�(���� ����) : ");
		rec[i].kor = sc.nextInt();
		rec[i].eng = sc.nextInt();
		rec[i].mat = sc.nextInt();

		rec[i].tot += rec[i].kor + rec[i].eng + rec[i].mat;
		rec[i].avg = rec[i].tot/3;
		}
	}

	@Override
	public void print()
	{
		for (int i=0;i<inwon;i++)
		{
		System.out.printf("%s %s, %d %d %d, %d %d\n",rec[i].hak,rec[i].name,rec[i].kor,rec[i].eng,rec[i].mat,rec[i].tot,rec[i].avg);		
		}
		//System.out.printf("%s %s %s",);			
	}
	
	// ���������� ��޿� ���� ������ ������ �޼ҵ�

	private String panjung(int score)	//�����̶�� �޼ҵ� ���� ��� 
	{

		// ���� ����... �ȵǴ� �ǰ�... 
		String result;

			if (score>=90)
				result = "��";
			if (score>=80 && score<90)
				result = "��";
			if (score>=70 && score<80)
				result = "��";
			if (score>=60 && score<70)
				result = "��";
			if (score>=50 && score<60)
				result = "��";	

		return result;

/*
			switch (score)
			{
			case 100 : return "��";
			case 90 :  return "��";
			case 80 :  return "��";
			case 70 :  return "��";
			case 60 :  return "��";
			default : return "��";
			}
*/
	}		
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test123
{
	public static void main(String[] args)
	{
		SungjukImpl ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob.set();	//�⺻ ����
		ob.input(); //�Է�
		ob.print();	//���
	}
}