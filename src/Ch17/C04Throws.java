package Ch17;


public class C04Throws {
	
	public static void Ex1() {
		try {
		throw new NullPointerException("Ex1의 예외처리");
		}catch(Exception e) {
			System.out.println("Ex1 실행코드");
		}
	}
	public static void Ex2() throws Exception{
		throw new NullPointerException("Ex2의 예외처리");
		
	}
		
	
	public static void main(String[] args) {
		Ex1();
		try {
		Ex2();
		}catch(Exception e) {
			System.out.println("Ex2 예외처리");
		}
	}
}
