package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl + shift + o = 자동import지정
		
//		System.out.println("정수 입력 :");
//		int num1 = sc.nextInt();
//		System.out.println("입력된 정수 값 : "+num1);
//		
//		System.out.println("실수 입력 :");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 :" +num2);
		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next(); 		//문자열입력받기기능함수, 띄어쓰기는 포함x
//		System.out.println("입력된 문자열 :"+str1);
		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.nextLine(); 		//문자열입력받기기능함수, 띄어쓰기는 포함x
//		System.out.println("입력된 문자열 :"+str1);
		//----------------------------------------------------------------
		//주의 nextLine() 함수사용시 주의점
		//nextInt(), nextDouble(), next()함수 사용 이후에
		//nextLine()를 사용해서 문자열을 받는 경우
		//sc.nextLine()를 한번더 사용해서 읽어들이는 버퍼라인을 초기화한다
		
		
		
		System.out.println("정수 입력 :");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : "+num1);
		
		sc.nextLine();
		System.out.print("문자열 입력 : ");
		String str1 = sc.nextLine(); 		//
		System.out.println("입력된 문자열 :"+str1);
		sc.close();
	}

}
