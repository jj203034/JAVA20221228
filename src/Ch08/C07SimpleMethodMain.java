package Ch08;

import java.util.Scanner;

class sum{
	//속성
	Scanner sc= new Scanner(System.in);
	//기능
	//인자o, return o
	int sum1(int x, int y) {
		return x+y;
	}
	//인자o, return x
	void sum2(int x ,int y) {
		System.out.println("sum2(x,y) : "+ (x+y));
		
	}
	//인자x, return o
	int sum3() {
		System.out.println("sum3(x,y) :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	//인자x, return x
	void sum4() {
		System.out.println("sum4(g,h,i)");
		int g = sc.nextInt();
		int h = sc.nextInt();
		int i = sc.nextInt();
		System.out.println("sum4(g,h,i) :"+ (g+h+i));
	}
}
public class C07SimpleMethodMain {

	public static void main(String[] args) {
		
		sum calc= new sum();
		
		int r1= calc.sum1(10, 20);
		System.out.println("R1 :" +r1);
		
		calc.sum2(10,20); //sc로 세수를 입력받아 세수의 합이 출력
		
		int r3 = calc.sum3();
		System.out.println("R3 :" +r3);
		
		calc.sum4();
	}

}
