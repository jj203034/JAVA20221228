package Ch09.test01;

class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20;
	
	void method() {
		int x = 30; //지역변수
		System.out.println("x = " +x); // x = 30. 지정된게 없어서 가장 가까운 곳에서 선언된 지역변수를 호출
		System.out.println("this.x = " +this.x); // this.x = 20. 객체 기준
		//super : 상속을 하면 자식의 멤버(변수,메서드)와 이름이 겹치게 될 때가 있는데 이를 구분하기 위해 super.
		//변수 super.메서드()를 사용하면 자식의 멤버가 호출되지 않고 상속받은 부모의 멤버를 호출할 수 있게 됩니다.
		System.out.println("super.x = " +super.x); // super.x = 10. 부모 클래스 기준
	}
}
public class C07Mylnher {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		// x = 30, this.x = 20, super.x = 10

	}

}
