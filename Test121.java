
/*=====================
★★★클래스 고급★★★
======================*/

// 인터페이스(Interface)


// 인터페이스
interface Demo
{
	public void write();
	public void print();
}


// 인터페이스를 구현하는 추상 클래스
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() 매소드 재정의...");
	}
	
	//	public void print();
}


// 추상 클래스를 상속받는 추상 클래스
// abstract class DemoImpl implements Demo
//		↓
// 추상 클래스를 상속받는 클래스
class DemoImlsub extends DemoImpl		// → 인터페이스 정의를 온전히 완료했기 때문에 
{
	/*
	public void write()
	{
		System.out.println("write() 매소드 재정의...");
	}
	*/
	@Override
	public void print()
	{
		System.out.println("print() 매소드 재정의...");		
	}
}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test121
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//-- 인스턴스 생성 불가 → 인터페이스

		//DemoImpl ob2 = new DemoImpl()
		//-- 인스턴스 생성 불가 → 추상 클래스

		DemoImlsub ob3 = new DemoImlsub();

		ob3.write();
		ob3.print();
		//-- write() 매소드 재정의...
		//-- print() 매소드 재정의...

	}
}