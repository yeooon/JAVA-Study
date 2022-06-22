
//추상 클래스(Abstract)

/*
○ 추상 클래스는
선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로 
하위 클래스에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해 
메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다

○ 형식 및 구조
	[접근제어지시자] abstract class 클래스명
	{
		[접근제어지시자] abstract 자료형 메소드명([매개변수], ...);
	}

○ 특징
	클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
	그 클래스는 클래스 앞에 abstract 키워드를 붙여 추상 클래스로 명시해야 하며,
	추상 클래스로 선언한 경우에는 불완전한 형태의 클래스이므로 객체를 생성할 수 없다.
	추상 메소드가 존재하지 않는 추상 클래스마저도 객체를 생성할 수 없는 것이다.

	즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에 상속을 위해서만 존재하며
	추상 클래스에서 상속받은 하위 클래스에서는 반드시 추상 메소드를 오버라이딩(Overriding)해야 한다.

	『abstract』 키워드는
	클래스와 메소드에서만 사용할 수 있으며
	멤버 변수나 로컬 변수에서는 사용 불가능하다

	abstract가 메소드에 있으면 클래스는 abstract 추상 클래스로 가는 거.
	abstract만 있으면 일단 추상 클래스인듯
*/

//추상 클래스(일반 메소드로서의 원대한 꿈을 가지고 있었지만 추상 메소드를 품으므로써 추상 클래스가 됐다)







/*★★★ 엄마 클래스 ★★★*/

abstract class SortInt117 //추상 클래스
{
	private int[] value; //이건 없는게 되겠죠?

	protected void sort(int[] value) 
	{
		this.value = value;
		sorting();
	}
	
	//추상 메소드
	protected abstract void sorting();	//정렬 알고리즘이 많으니까, 그냥 이런 메소드가 필요하다~ 라는 느낌

	protected int dataLenght()
	{
		return value.length;
	}

	protected final int compare(int i, int j)
		{
			int x = value[i]; //x는 i범위의 정렬
			int y = value[j]; //y는 j범위의 정렬
			if (x==y)
				return 0;
			else if (x>y)
					return 1;
			else 
				return -1;
		}

		protected final void swap(int i, int j) //i와 j값을 바꾼다고?
		{
			int temp = value[i];
			value[i] = value[j];
			value[j] = temp;
		}
}



/*★★★ 자식 클래스 ★★★*/


public class Test117 extends SortInt117 //<<==abstract를 추가했을 때 오류가 안났다. 
{
		int i,j;

		static int[] data = {7, 10, 3, 8, 7};

		@Override //오버라이드할거다.
		//protected abstract void sorting(); 이거를
		protected void sorting() //이렇게 재정의 
	{
		// ↓ 이 값의 용도를 잘 모르겠다.
		//<< int num값이 dataLength() 메소드라는게 이해가 잘 안간다.
		// dataLength() = data 이 범위인 것 같단 말이지?
		//정렬해야지...

		for (i=0;i<data.length-1;i++)
		{
			for (j=i+1;j<data.length;j++)
			{
				int x = compare(i,j); //7,7을 마주 정렬하기 위한 것. 계산 방법 이해가 안가......

				if (x==1) //만약에 리턴값이 1일 때, x>y니까 스왑해라.
				{
					swap(i,j);
				}
			}
		}		
	}
	
		public static void main(String[] args)
		{
			System.out.println("Source Data : ");
			for (int n : data)
			System.out.print(n + "  ");

			System.out.println();


			//정렬을 나타내라. 


			Test117 ob = new Test117(); //추상 클래스는 new명령어를 사용해 인스턴스화 할 수 없다

			ob.sort(data); //SortInt117의 sort 메소드를 소환하기 

			//protected abstract void sorting(); 메소드 오버로딩을 해야할 것 같은데
			//swap을 이용해서 정렬 가능?


			System.out.println("Source Data : ");
			for (int n : data)
			System.out.print(n + "  ");

			System.out.println();

		}
}

/*
추상 클래스 → 미완성의 설계도

클래스 → 설계도

객체 생성 → 설계도 기반 인스턴스 생성

설계도 ob = new 설계도();
*/
/*
class 클래스명
	void 메소드명a()
*/