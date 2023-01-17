package Ch11;

public class C02MainArg {

	public static void main(String[] args) {
		System.out.println("배열 길이 : " +args.length);
		for(String s : args) {
			System.out.println(s);
		}
	}

}
