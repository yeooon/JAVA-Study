/*==============================
 Ŭ������ �ν��Ͻ�
===============================*/

//å��,,,Ÿ��,,,��ķ,,,,


/*
NumberTest nt1 = new NumberTest
					   + 
				  NumberTest()
*/
nt1.NumberTet();
//--==>�����߻�(������ ����)
// cannot find symbol

System.out.println(nt1.getNum));
//--==>>10

nt1.num = 100;

System.out.println(nt1.getNum));
//-==>> 100

NumberTest nt2 = new NumberTest();
//-==>> ����� ���� ������ ȣ��~!!!

int testResult = nt2.getNum();
System.out.println(testResult);
//-==>> 10