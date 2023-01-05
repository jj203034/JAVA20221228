package Ch06;

import java.util.Scanner;

public class C01IF문 {

	public static void main(String[] args) {
		//01 단순 IF
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age >=8)
//		{
//			System.out.println("학교에 다닙니다");
//		}
//		System.out.println("첫번째 if 블럭 종료");
//		if(age<8)
//		{
//			System.out.println("학교에 다니지 않습니다");
//		}
//		System.out.println("두번째 if 블럭 종료");
//		System.out.println("프로그램을 종료합니다");
		
		//02 IF-ELSE
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age >=8)
//			{
//				System.out.println("학교에 다닙니다");
//			}
//		else
//			{
//				System.out.println("학교에 다니지 않습니다");
//			}
		
		
		//1.입력받은수가 짝수인지 홀수인지 확인
		//2.정수하나 받아 입력받은수가 3의배수인지 아닌지 확인
		//3.두수를 입력받아 큰수를 출력
		//4.세수를 입력받아 큰수를 출력(%%연산자 사용)
		
		//1
		
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		if(a%2==0)
//		{
//			System.out.println("짝수입니다");
//		}
//		else
//		{
//			System.out.println("홀수입니다");
//		}
//		
//		//2
//		
//		int b = sc.nextInt();
//		if(b%3==0)
//		{
//			System.out.println("3의 배수 입니다");
//		}
//		else
//		{
//			System.out.println("3의 배수가 아닙니다");
//		}
//
//		
//		//3
//		
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//		if(c>d)
//		{
//			System.out.println("큰수 : " +c);
//		}
//		else
//		{
//			System.out.println("큰수 : " +d);
//		}
		
		//4
		
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		if(e>=f&&e>=g)
		{
			System.out.println("큰수 :" +e);
		}
		else if(f>=e&&f>=g)
		{
			System.out.println("큰수 :" +f);
		}
		else if(g>=e&&g>=f)
		{
			System.out.println("큰수 :" +g);
		}
	}
	

}