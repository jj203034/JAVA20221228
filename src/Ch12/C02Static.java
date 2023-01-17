package Ch12;

class C02Simple{
	int n1;
	static int n2;	//static변수
	
	void Func1() {
		n1=10;
		n2=20;
	}
	static void Func2() {
//		n1=10;	//문제발생 -> static함수는 static 멤버변수에만 접근가능.
		n2=20;
		int num=10;
	}
}
public class C02Static {

	public static void main(String[] args) {
		
	}

}
