package Ch09.test01;

public class TestMain {

	public static void main(String[] args) {
		GeneralChick generalChick = new GeneralChick();
		generalChick.display();
		
		Redchick redChick = new Redchick();
		redChick.display();
		System.out.println(redChick.x);

	}

}
