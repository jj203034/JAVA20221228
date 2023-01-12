package Ch09;

//this : 만들어져있는 개체의 위치정보(주소)
//this를 통해 멤버변수와 매개변수를 구분
//this를 통해 동일클래스내의 다른매개변수를 가지는 생성자를 호출
class C03Simple{
	int x;
	int y;
	
	C03Simple getThis() {
		return this;
	}
}

public class C03This {

	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple();
		System.out.println("ob1 : "+ob1);
		System.out.println("ob1 this : "+ob1.getThis());
		System.out.println();
		
		
		C03Simple ob2 = new C03Simple();
		System.out.println("ob2 : "+ob2);
		System.out.println("ob2 this : "+ob2.getThis());
	}

}
