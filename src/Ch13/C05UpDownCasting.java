package Ch13;

class A{
	int a=10;
}
class B extends A{
	int b=20;
}
class C extends A{
	int c=30;
}
class D extends B{
	int d=40;
}
class E extends B{
	int e=50;
}
class F extends C{
	int f=60;
}
class G extends E{
	int g=70;
}

class UpdownTest{
	void ShowMember(A obj) {
		//instance of
		if(obj instanceof D) {
			D down = (D)obj;
			System.out.println("D 객체 : "+down.a+" "+down.b+" "+down.d);
		}else if(obj instanceof C) {
			C down = (C)obj;
			System.out.println("C 객체 : "+down.a+" "+down.c);
		}else if(obj instanceof B) {
			B down = (B)obj;
			System.out.println("B 객체 : "+down.a+" "+down.b);
		}
		
	}
}
public class C05UpDownCasting {

	public static void main(String[] args) {
		UpdownTest test = new UpdownTest();
		B ob1 = new B();
		C ob2 = new C();
		D ob3 = new D();
		test.ShowMember(ob1); //A obj = ob1; upcasting
		test.ShowMember(ob2); //A obj = ob2; upcasting
		test.ShowMember(ob3); //A obj = ob3; upcasting
		test.ShowMember(new D()); //A obj = new D(); upcasting
		
		}

}
