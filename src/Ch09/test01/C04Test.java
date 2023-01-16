package Ch09.test01;

public class C04Test {
	//getter, setter 생성
	private String name;
	private int age;
	private short grade;
	private double avg;
	private int[] numArr;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public short getGrade() {
		return grade;
	}
	public void setGrade(short grade) {
		this.grade=grade;
	}
	public double getAvg() {
		return age;
	}
	public void setAvg(double avg) {
		this.avg=avg;
	}
	public int[] getNumArr() {
		return numArr;
	}
	public void setNumArr(int[] numArr) {
		this.numArr=numArr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



	//setter : 클래스 외부에서 값을 받아서 멤버변수에 저장 return type은 void/
	//			매개변수는 수정할 멤버변수와 같은 type이어야함
	//			이름앞에set을 붙이고 뒤에는 수정할 멤버변수의 이름.

	//getter : 클래스 외부에 멤버변수의 값을 전달(반환) return type은 참조할 멤버변수의 자료형과 일치.
	//			매개변수는 필요없음. 이름 앞에 get을 붙이고 뒤에는 리턴할 멤버변수의 이름.