
// ���� ������ == ��Ȳ ������ 
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ� 
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader �� readLine()�� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
// ����, ���ǿ�����(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -12
// -12 > ����
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� �Է�
		int n;
		String r;
		
		// ���� ó��
		System.out.print("������ ���� �Է� : ");
			n = Integer.parseInt(br.readLine());

		//	r = (n>0) ? "���" :"����"; (���� �Ѱ�)
			r = (n>0) ? "���" : (n==0) ? "0" : "����";
			// ���� �� �� ��ø�ص� �Ǵ� �κ��� ��Ƴ�...
			// n���� ũ��? �����. �ƴ� ��쿡, �ٽ�! 
			// �ƴ� ��� n�� 0�̸�? 0!, �ƴҽ� ����!
			// ��ø�������� ������ ���� 

		//0 ǥ�ð� ���絥?
		
		System.out.print("");
		System.out.printf("%d �� %s%n",n,r);

	}
}