/*=======================
�ڡ�Ŭ������ �ν��Ͻ��ڡ�
========================*/

//���� ���а� ���� ���� ������(����������, ����������, ...)

import java.util.Scanner;

class CircleTest2
{
	//��� ����, �ν��Ͻ� ����, ���� ����
	//int num;

	//

	//���� ����
	//private �̶�� ���������������� ������
	//Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
	//int �� ���� ���� > �ڵ� 0���� �ʱ�ȭ ����
	private int num; //���Ǳ� �Ѳ� �ᰡ���� ��

	//getter/setter ����
	/*
	int getNum()
	{
		return num;
	}
	void setNum(int num)
	{
		this.num = num;
	}
	*/
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		num = sc.nextInt();
	}

	double calArea()
	{
		return num * num * 3.141592;
	}
	void write(double area)
	{
		System.out.println("������ : " + num);
		System.out.println("���� : " + area);
	}



}

public class Test100
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();//�ν��Ͻ� ����


	ob1.setNum(10);


		ob1.input();
		double result = ob1.calArea();
		ob1.write(result);
	}
}