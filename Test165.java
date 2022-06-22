
/*==========================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) 처리 ■■■
============================================================*/

// Test165 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료
>> 메뉴 선택(1~6) : 1

1번째 요소 입력 : 박현수
1번째 요소 입력 성공 ~ !!!

요소 입력 계속(Y/N)? : y

2번째 요소 입력 : 오이삭
2번째 요소 입력 성공~!!
요소 입력 계속(Y/N)? : N

[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료
>> 메뉴 선택(1~6) : 2

[벡터 전체 출력]

	박현수
	오이삭
벡터 전체 출력 완료~!!!

[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료
>> 메뉴 선택(1~6) : 3

검색할 요소 입력 : 오이삭

[검색 결과 출력]
항목이 존재합니다.

[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료
>> 메뉴 선택(1~6) : 3

검색할 요소 입력 : 임소민
[검색 결과 출력]
항목이 존재하지 않습니다.


[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료
>> 메뉴 선택(1~6) : 4

삭제할 요소 입력 : 홍은혜

[삭제 결과 출력]
항목이 존재하지 않아 삭제할 수 없습니다.

[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료
>> 메뉴 선택(1~6) : 4

삭제할 요소 입력 : 박현수

[삭제 결과 출력]
박현수 항목이 삭제되었습니다.

[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료
>> 메뉴 선택(1~6) : 5
변경할 요소 입력 : 김민성

[변경 결과 출력]
변경할 대상이 존재하지 않습니다.

[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료
>> 메뉴 선택(1~6) : 5

변경할 요소 입력 : 오이삭
수정할 내용 입력 : 정은정

[변경 결과 출력]
변경이 완료되었습니다.

[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료
>> 메뉴 선택(1~6) : 6

프로그램 종료


*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus	// → 완성
{
	public static final int E_ADD = 1;	//-- 요소 추가
	public static final int E_DISP = 2; //-- 요소 출력
	public static final int E_FIND = 3; //-- 요소 검색
	public static final int E_DEL = 4;  //-- 요소 삭제
	public static final int E_CHA = 5;	//-- 요소 변경
	public static final int E_EXIT = 6; //-- 종료
}

public class Test165
{
	// 주요 속성 구성 → 완성
	private static final Vector<Object> vt;		//-- 자료구조
	private static BufferedReader br;			//-- 입력 시 활용
	private static Integer sel;					//-- 선택 값
	private static String con;					//-- 계속 여부

	// static 초기화 블럭 → 완성
	static
	{
	// Vector 자료구조 생성
		vt = new Vector<Object>();

	// BufferedReader 클래스 인스턴스 생성

		br = new BufferedReader(new InputStreamReader(System.in));

	// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}


	// 메뉴 출력 메소드 → 완성
	public static void menuDisp()
	{
		System.out.println("[메뉴 선택]");
		System.out.println("1. 요소 추가");
		System.out.println("2. 요소 출력");
		System.out.println("3. 요소 검색");
		System.out.println("4. 요소 삭제");
		System.out.println("5. 요소 변경");
		System.out.println("6. 종료");
		System.out.print(">> 메뉴 선택(1~6) : ");
	}


	// 메뉴 선택 메소드 → 완성
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);
	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드 → 완성
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case Menus.E_ADD : addElement(); break;		//-- 요소 추가
			case Menus.E_DISP : dispElement(); break;	//-- 요소 출력
			case Menus.E_FIND : findElement(); break;	//-- 요소 검색
			case Menus.E_DEL : delElement(); break;		//-- 요소 삭제
			case Menus.E_CHA : chaElement(); break;		//-- 요소 변경
			case Menus.E_EXIT : exit(); break;			//-- 종료
		}
	}

	// 자료구조에 요소 추가(입력) 메소드 → 무한반복중....
	public static void addElement() throws IOException
	{
		// 자료구조 vt
		do
		{
			System.out.printf("%d번째 요소 입력 : ",vt.size()+1);	
			String name = br.readLine();

			vt.add(name);
			
			System.out.println();
			System.out.printf("%d번째 요소 입력 성공~!",vt.size());	
			System.out.print("\n요소 입력을 계속 하시겠습니까?(Y/N) : ");
			con = br.readLine();
		}
		//while (con != "n" || con != "N" || con != "y" || con != "Y"); → 무한반복
		while (con.equals("y")||con.equals("Y"));

		System.out.println();
	}

	// 자료구조 전체 요소 출력 메소드 → 완성
	public static void dispElement()
	{
		System.out.println();
		// 벡터구조의 전체 출력
		System.out.println("[벡터 전체 출력]");
		for (int i=0;i<vt.size();i++)
		{
			System.out.printf("%s", vt.get(i));		//vt.get() 가져오기
		}
		System.out.println("\n벡터 전체 출력 완료~!!!");		
	}

	// 자료구조 내 요소 검색 메소드 → 완성
	public static void findElement() throws IOException
	{
		System.out.print("검색할 요소 입력 : ");
		String name = br.readLine();

		int i = vt.indexOf(name);

		System.out.println("[검색 결과 출력]");

		if (i<0)	//Test162참고 -1이면 없는것
			System.out.println("항목이 존재하지 않습니다.");
		else 
			System.out.println("항목이 존재합니다.");
	}

	// 자료구조 내 요소 삭제 메소드 → 완성

	public static void delElement() throws IOException
	{
		System.out.print("삭제할 요소 입력 : ");
		String name = br.readLine();

		System.out.println("[삭제 결과 출력]");

/*	
Test163

		// contains(s)
		// v.contains(s)
		//-- 벡터 자료구조 v에 찾고자하는 s 가 포함되어 있다면...
		// → index 위치 확인
		if (v.contains(s2))
		{
			i = v.indexOf(s2);
			System.out.println(s2 + "→ index 위치 : " + i);

			// 우선 위의 코드를 통해 찾고...
			// 찾았으면 제거해라(삭제해라)
			v.remove(i);
		}
		//--==>> 노랑 → index 위치 : 1
*/
		if (vt.contains(name))
		{
			int i = vt.indexOf(name);
			vt.remove(i);
			System.out.println("삭제가 완료되었습니다.");
		}
		else
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
	}

	// 자료구조 내 요소 수정(변경) 메소드
/*
Test162
		// ○ 첫 번째 요소를 "하양"으로 변.경. → set()
		v.set(0, "하양");
*/

	public static void chaElement() throws IOException
	{
		System.out.print("변경할 요소 입력 : ");
		String name = br.readLine();

		if (vt.contains(name))
		{
			System.out.print("수정할 내용 입력");
			String change = br.readLine();

			int i = vt.indexOf(name);
			vt.set(i, change);

			System.out.println();
			System.out.println("[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");
		}
		else 
		{
			System.out.println("[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지 않습니다.");
		}
	}

	//프로그램 종료 메소드 → 완성
	public static void exit()
	{
		System.out.println("프로그램 종료~~!!~ \n");
		System.exit(-1);
	}

	// main() 메소드 → 완성
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}