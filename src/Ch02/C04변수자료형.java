package Ch02;

public class C04변수자료형 {

	public static void main(String[] args) {
		//----------------------
		//정수 int - 4byte 정수 부호 o >> 기본자료형
		//---------------------
//		int n1 = 0b10101101;	//2진수값
//		int n2 = 173;	//10진정수값
//		int n3 = 0255;	//8진수값
//		int n4 = 0xad;	//16진수값
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
		
		
		//----------------------
		//정수 byte - 1byte 정수 부호 o
		//---------------------
//		byte n1 = -128;
//		byte n2 = -30;
//		byte n3 = 30;
//		byte n4 = 127;
//		byte n5 = (byte)128;// 
//		System.out.printf("%d\n", n5);
		
		//----------------------
		//정수 short - 2byte 정수 부호 o   char - 2byte정수부호 x (양수만)
		//---------------------
//		char n1 = 65535; //(0~2^16-1) (0~65535)
//		short n2 = 32767; //(-2^15 ~ +2^15-1)(-32768~ +32767)
//		
//		char n3 = 60000;
//		short n4 = (short)n3;
//		System.out.printf("%d\n",n4);
		
		//----------------------
		//정수 long - 8byte 정수 부호 o 
		//---------------------
//		long n1 = 10;
//		long n2 = 20L; // l,L (리터럴접미사) : long자료형사용하여 값을 저장
//		
//		long n3 = 10000000000; //(int 값을 초과)
//		long n4 = 10000000000L;
		
		//----------------------
		//실수 
		//---------------------
		//소숫점이하값을 가지는 수
		//float : 4byte 실수(6-9자리)
		//double : 8byte 실수(15-18자리) >> 기본자료형
		
		//정밀도 확인
//		float n1 = 0.123456789F; //F,f : float형 접미사
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		//----------------------
		//단일문자 char 2byte 정수
		//---------------------
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1); //01100001
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2); //01100010
//		char ch3 = 'b'+1;
//		System.out.println(ch3);
//		System.out.println((int)ch3); //01100011
//		
//		byte ch4 = 'c'+2;
//		System.out.println((char)ch4);
//		System.out.println(ch4); // 01100100
//		
//		char ch5 = '가';
//		char ch6 = 0xac00;
//		System.out.printf("%c %c\n", ch5,ch6);
//		
//		// \\u : 유니코드값 이스케이프문자
//		System.out.printf("%c\n", '\uac80');
//		
//		char ch7 = '\ud7fb';
//		System.out.printf("%c\n", '\ud7fb');
		
		//----------------------
		//문자열 : string (클래스자료형)
		//---------------------
		
		//클래스자료형
		//클래스자료형으로 만든 변수는 '참조변수'라고 하고
		//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
//		int n1 = 10;
//		String name = "홍길동"; 
//		String job = "프로그래머";
//		System.out.println(name);
//		System.out.println(job);
		
		//----------------------
		//boolean : 논리형(true/false 저장)
		//---------------------
		
		boolean flag = true; //참(긍정)
		if(flag)
		{
			System.out.println("참인경우 실행");
		}
		else
		{
			System.out.println("거짓인경우 실행");
		}
//		확인 문제1
//
//		정수타입 
//		1byte :  byte
//		2byte : char, short
//		4byte : int
//		8byte : long
//
//		실수타입
//		4byte : float 
//		8byte : double
//
//		논리타입
//		1byte : boolean
//
//
//		확인문제2
//
//		맞는 코드인지 틀린 코드인지 확인 
//		byte var = 200;												(x)
//		char var='AB';												(x)
//		char var=65;												(o)
//		long var=50000000000;										(x)	
//		float var = 3.14		>>F접미사필요							(x)
//		double var = 100.0											(o)
//		String var = "나의직업은 "개발자" 입니다.";							(x)
//		boolean var = 0;											(x)
//		int v2 = 1e2;		>>double형 값을 int값에 출력하려했기때문에 불가능	(x)
//		float =1e2f;												(x)
		}
	}


