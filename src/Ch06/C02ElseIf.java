package Ch06;

import java.util.Scanner;

public class C02ElseIf {

	public static void main(String[] args) {
		//국어, 영어, 수학
		//각 과목당 40점 미만일 시 불합격
		//총 평균이 60점 미만일 시 불합격
		//그게 아니라면 합격
		
		//국어<40 ->불합격
		//영어<40 ->불합격
		//수학<40 ->불합격
		//평균<60 ->불합격
		
//		int kor=0, eng=0, mat=0, sum=0;
//		double avr = 0.0;
//		Scanner sc = new Scanner(System.in);
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		mat = sc.nextInt();
//		sum = kor+eng+mat;
//		avr = (double)sum/3;
//		
//		if(kor<40)
//		{
//			System.out.println("불합격");
//		}
//		else if(eng<40)
//		{
//			System.out.println("불합격");
//		}
//		else if(mat<40)
//		{
//			System.out.println("불합격");
//		}
//		else if(avr<60)
//		{
//			System.out.println("불합격");
//		}
//		else {
//			System.out.println("합격");
//		}
		
		
		//나이별로 요금을 부과하는 else if문 만드세요
		//나이는 정수값으로 입력
		//8세미만 : 1000원
		//14세미만 : 2000원
		//20세미만 : 2500원
		//20세이상 : 3000원
		
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		
//		if(age<8)
//		{
//			System.out.println("1,000원");
//		}
//		else if(age<14)
//		{
//			System.out.println("2,000원");
//		}
//		else if(age<20)
//		{
//			System.out.println("2,500원");
//		}
//		else
//		{
//			System.out.println("3,000원");
//		}
		
		
		//풀이 -> 간결하고 가독성 좋게 작성하는것이 좋다.
		
		Scanner sc= new Scanner(System.in);
		int age = sc.nextInt();
		int charge = 0;
		
		if(age<8)
		{
			charge=1000;
		}
		else if(age<14)
		{
			charge=2000;
		}
		else if(age<20)
		{
			charge=2500;
		}
		else
		{
			charge=3000;
		}
		System.out.println("요금 : " +charge);
	}
	

}
