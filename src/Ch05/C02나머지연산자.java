package Ch05;

import java.util.Random;
import java.util.Scanner;

public class C02나머지연산자 {

	public static void main(String[] args) throws InterruptedException {
		//1. 짝홀수구분 N%2== 0or1
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		
//		String result = (num1%2==0)?"짝수입니다":"홀수입니다";
//		System.out.println("결과 :" +result);
//		
		//2. 배수구분
//		Scanner sc = new Scanner(System.in);
//		int n1,n2,n3,sum;
//		n1 =sc.nextInt();
//		n2 =sc.nextInt();
//		n3 =sc.nextInt();
//		sum = n1+n2+n3;
//		String result = (sum%5==0)?"5의 배수 입니다":"5의 배수가 아닙니다";
//		System.out.println("RESULT :"+result);
		
		//3. 수의범위제한
		// N%2 = 0~1
		// N%3 = 0~2
		
		// 난수생성
		// 01 Random 객체 생성
//		Random rnd = new Random();
//		while (true) {
//			System.out.println(rnd.nextInt(5)); //N%5 과 동일
//			Thread.sleep(500);
//		}
		
		//02. Math.random()사용
//		while(true) {
//			System.out.println((int)(Math.random()*100)%45 +1);
//			Thread.sleep(500);
//		}
		
		//4. 자리수
//		int num = 56789;
//		
//		System.out.println("오른쪽 끝 1자리 :" + (num % 10));
//		System.out.println("오른쪽 끝 2자리 :" + (num % 100));
//		System.out.println("오른쪽 끝 3자리 :" + (num % 1000));
//		System.out.println("오른쪽 끝 4자리 :" + (num % 10000));
//		System.out.println();
//		System.out.println("왼쪽 끝 1자리 :" + (num % 10000));
//		System.out.println("왼쪽 끝 2자리 :" + (num % 1000));
//		System.out.println("왼쪽 끝 3자리 :" + (num % 100));
//		System.out.println("왼쪽 끝 4자리 :" + (num % 10));
		
		//정수 하나를 입력받아 거꾸로 저장해보세요(반복문법 이후 풀어보기)%,/연산 동시이용할 것
		//예
		
//		입력 : 1234
//		저장
//		int reserve = 4321;
//		출력 : 4321
		
		//문제
		//정수값 3개를 입력받아서 세수의합
		//짝수이면서 5의배수면 '참입니다'를 출력 아니면'거짓입니다'를 출력
		//조건식에 %,&&연산기호 사용
		//삼항연산자 사용
		
		//내 풀이
//		Scanner sc = new Scanner(System.in);
//		int a,b,c,sum;
//		a= sc.nextInt();
//		b= sc.nextInt();
//		c= sc.nextInt();
//		sum = a+b+c;
//		String result1 = (sum%2==0)?"짝수입니다":"홀수입니다";
//		System.out.println("결과 :" +result1);
//		String result2 = (sum%5==0)?"5의배수입니다":"5의배수가아닙니다";
//		System.out.println("결과 : " +result2);
		
		//풀이
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int sum = a+b+c;
//		String result = (sum%2==0 %% sum%5==0)?"참입니다":"거짓입니다";
//		System.out.println(result);
		
		
		
		

	}

}
