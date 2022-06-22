
/*==========================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) 처리 ■■■
============================================================*/

// 검색 및 삭제

import java.util.Vector;

public class Test163
{

	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors
		={"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<String> v = new Vector<String>();

		// 벡터 자료구조 v 에 colors 배열 데이터를 요소로 추가
		for (String color : colors)
		{
			v.add(color);
		}

		// 벡터 자료구조 v 의 전체 요소 출력
		System.out.print("전체 요소 출력 : ");
		for (String str : v)
		{
			System.out.print(str + " ");
		}
		System.out.println();

		String s1 = "분홍";

		int i = v.indexOf(s1);
		System.out.println(s1 + " → index 위치 : " + i);
		System.out.println();


		String s2 = "노랑";

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

		//찾아서 삭제한 후 전체 요소 출력
		System.out.print("삭체 후 전체 요소 출력 : ");
		for(String str:v)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> 삭체 후 전체 요소 출력 : 검정 초록 파랑 빨강 연두


		//추가 주의사항

		System.out.println(colors);
		//--==>> [Ljava.lang.String;@15db9742	
		
		System.out.println(v);
		//--==>> [검정, 초록, 파랑, 빨강, 연두]

		// ※ 확인용 더미 데이터는
		//    실제 요소(데이터)가 아니기 때문에
		//    이를 활용하여 연산을 진행하고 처리해서는 안된다.			check~!!
	}
}