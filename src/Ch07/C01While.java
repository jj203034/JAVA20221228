package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		//기본 while
		
//		int i=0; //탈출용 변수 지정
//		while(i<10) //조건식
//		{
//			System.out.println("Hello World");
//			i++; //조건식이 거짓이 되게끔 하는 연산
//		}
		
		// 1부터 10까지의 합
//		int i=1;
//		int sum = 0;
//		while(i<=10)
//		{
//			System.out.println("i 값 : "+i);
//			sum = sum+i;
//			i++;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		
		//1부터 n까지의 합(키보드로부터 입력)
		
//		Scanner sc = new Scanner(System.in);
//		int i = 1;
//		int n = sc.nextInt();
//		int sum = 0;
//		while(i<=n)
//		{
//			System.out.println("i값 : " +i);
//			sum = sum+i;
//			i++;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d",n,sum);
		
		//n부터 m까지의 합(n,m은 키보드로부터 입력)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int sum = 0;
//		while(n<=m)
//		{
//			System.out.println("n값 : " +n);
//			sum = sum + n;
//			n++;
//		}
//		System.out.println("n부터 m까지의 합 : " + sum);
		
		
		//풀이
		//n부터 m까지의 합(n,m은 키보드로부터 입력)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int i =n;
//		int sum = 0;
//		while(i<=m)
//		{
//			System.out.println("i값 : " +i);
//			sum = sum + i;
//			i++;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d" ,n,m,sum);
		
		//n부터 m까지의 합(n,m은 키보드로부터 입력) 조건 : n>m
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if (n>m) {
//			//swap
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		int i =n;
//		int sum = 0;
//		while(i<=m)
//		{
//			System.out.println("i값 : " +i);
//			sum = sum + i;
//			i++;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d" ,n,m,sum);
		
		
		//구구단(2단)
//		int dan = 2;
//		int i =1;
//		while(i<=9)
//		{
//			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//			i++;
//		}
		
		
		//구구단(n단)
		
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		int i = 1;
//		while(i<=9)
//		{
//			System.out.printf("%d x %d = %d\n" , dan, i, dan*i);
//			i++;
//		}

		//1부터 10까지의 수중 4의 배수만 출력
//		int i=1;
//		
//		while(i<=10)
//		{
//			if(i%4==0)
//			System.out.println("i 값 : "+i);
//		
//			i++;
//		}
		
		//1부터 n까지의 수중 4의 배수만 출력
//		Scanner sc= new Scanner(System.in);
//		int i = 1;
//		int n = sc.nextInt();
//		while(i<=n)
//		{
//			if(i%4==0)
//				System.out.println("i 값 : " +i);
//			
//			i++;
//		}
		
		//1부터 10까지의 수중 3의 배수의 합만 입력
		
//		int i = 1;
//		int sum = 0;
//		while(i<=10)
//		{
//			if(i%3==0) {
//				System.out.println("i값 : " +i);
//			sum = sum+i;}
//			i++;
//		}
//		System.out.printf("1부터 10중 3의배수의 합 : %d " ,sum);
		//1부터 n까지의 수중 3의 배수의 합만 입력
//		Scanner sc = new Scanner(System.in);
//		int i = 1;
//		int n = sc.nextInt();
//		int sum = 0;
//		while(i<=n)
//		{
//			if(i%3==0) {
//				System.out.println("i값 : " +i);
//			sum =sum+i;}
//			i++;
//		}
//		System.out.printf("1부터 %d중 3의배수의 합 : %d" ,n ,sum);
	}

}
