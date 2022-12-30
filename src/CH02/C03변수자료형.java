package CH02;

public class C03변수자료형 {

	public static void main(String[] args) {
		//leftValue=Rightvalue - 대입연산자(=)를 기준으로 왼쪽은 1v(공간) 오른쪽은 rv(값)
		//1v(공간)=rv(값)
		
		int num1;	//4byte정수 공간 생성+num1 이름 부여 (변수 선언/정의)
		num1=10;	//10이라는 값을 상수pool에 저장하고 num1공간에 복사(대입)
		int num2=4; // 4라는 값을 상수pool에 저장하고 새로만들어지는 4byte정수공간 num2에 초기화한다
		int num3=num1+num2; // num1의값+num2의값을 4byte정수공간 num3에 초기화
		System.out.println(num3); // num3의 값을 print
	}

	}


