
/*==========================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) 처리 ■■■
============================================================*/

// Vector v = new Vector();
// -- 비어있는 Vector 자료구조 v 생성

// Vector v = new Vector(8);
//-- 8개의 초기 elements 를 가진 Vector 자료구조 v 생성
// 8개가 모두 채워지게 되면(모자라게 되면) 자동으로 확장된다.

// Vector v = new Vector(3, 5);
//-- 3개의 초기 elements 를 가진 Vector 자료구조 v 생성
//	 3개가 모두 채워지게 되면(모자라게 되면) 자동으로 5개 증가(확장)된다.

// ※ 벡터는 데이터 요소로서 정수형, 실수형, 문자열... 등을
//	  담아내는 것이 가능하다.(→ 가능해졌다.)

import java.util.Vector;
import java.util.Iterator;

// MyVector 클래스 설계 → Vector 클래스 상속
class Myvector extends Vector<Object>
{
	// 생성자
	MyVector()
	{
		// Vector(슈퍼 클래스) 생성자 호출
		//Vector(); 생성자에는 클래스 이름을 못쓴다
		super(1, 1);
		//-- 첫 번째 인자 : 주어진 용량
		//	 두 번째 인자 : 증가량
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElements(a);
	}

	void addObject(Record rec)
	{
		addElement(rec);
	}

	void write()
	{
		/*
		Iterator<Object> it = this.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		*/

		Object o;
		int length = size();

		System.out.println("벡터 요소 갯수 : " + length);

		for (int i=0;i<length;i++)
		{
			o = elementAt(i);

			// instanceof 연산자
			// -- 처리해야 하는 대상의 객체 타입 확인
			if (o instanceof char[])
			{
				//System.out.println("문자배열 : " +  o);
				//System.out.println("문자배열 : " +  o.toString());
				System.out.println("문자배열 : " +  String.copyValueOf((char[])o));
			}
			if (o instanceof String)	//String을 기반해 생성된 o 라면
			{
				System.out.println("문자열 : " +  o.toString());
			}
			else if (o instanceof Integer)
			{
				System.out.println("정수형 : " + o);
			}
			else if (o instanceof Float)
			{
				System.out.println("실수형 : " + o);
			}
			else
			{
				System.out.println("타입 확인 불가~!!!");
			}
		}
		//--==>>
		/**/
		
	}
}

public class Test161
{
	public static void main(String[] args)
	{
		// MyVector 클래스 기반 인스턴스 생성
		MyVector v = new MyVector();

		// 주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s','t','u','d','y'};

		v.addInt(digit);			//-- 벡터 자료구조에 정수 저장
		v.addFloat(real);			//-- 벡터 자료구조에 실수 저장
		v.addString(s);				//-- 벡터 자료구조에 문자열 저장
		v.addCharArray(letters);	//-- 벡터 자료구조에 문자 배열 저장

		v.write();
		//--==>>
		/**/
	}
}