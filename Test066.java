
//�ݺ���(for��) �ǽ�
//���� for��(�ݺ����� ��ø)�� Ȱ���� ����� �ǽ�

//����
//������ ���� ������ ��µ� �� �ֵ��� �ݺ����� ��ø ������ �ۼ��Ͽ� 
//���α׷��� �����Ѵ�.

//���� ��
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

public class Test066
{
	public static void main(String[] args)
	{
		//==========���Ƕ�̵�============
			for (int line=0;line<4;line++) //���Ƕ�̵� �Ŀ��� ���� 1�� ����
			{
			for (int vo=0;vo<5-line;vo++)  //������ ������ �÷� ������ �о
			{
			System.out.printf(" ");
			}
			for (int star=0;star<1*(2*line+1);star++)
			{
			System.out.printf("*");
			}
			System.out.println();	
			}
		//==============���Ƕ�̵�=============
			for (int line = 0; line < 5 ; line++)
			{
			for (int vo=0 ; vo<=line; vo++) //������ �þ�鼭 ������ �þ(���� 4���� �þ)
			{
			System.out.print(" ");
			}
			for (int star=10;star>(1+2*line);star--) //������ �þ�鼭 ���� �پ��(2���� ����)
			{
			System.out.print("*");
			}
			System.out.println();
			}
	}
}