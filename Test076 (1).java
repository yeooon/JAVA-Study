/*==============================
 클래스와 인스턴스
===============================*/

//책상,,,타블렛,,,웹캠,,,,


/*
NumberTest nt1 = new NumberTest
					   + 
				  NumberTest()
*/
nt1.NumberTet();
//--==>에러발생(컴파일 에러)
// cannot find symbol

System.out.println(nt1.getNum));
//--==>>10

nt1.num = 100;

System.out.println(nt1.getNum));
//-==>> 100

NumberTest nt2 = new NumberTest();
//-==>> 사용자 정의 생성자 호출~!!!

int testResult = nt2.getNum();
System.out.println(testResult);
//-==>> 10