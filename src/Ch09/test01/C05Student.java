package Ch09.test01;

public class C05Student {
	

	public static void main(String[] args) {
		
		Student s= new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " +s.name);
		System.out.println("총점 : " +s.getTotal());
		System.out.println("평균 : " +s.getAverage());
	}

}

class Student{
	
	//내풀이
//	String name;
//	public int ban, no, kor, eng, math;
//	private int total = kor+eng+math;
//	private int average = (kor+eng+math)/3;
//	
//	public int getTotal() {
//		return total;
//	}
//	public int getAverage() {
//		return average;
//	}
	
	//답안
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (float)this.getTotal()/3;
	}
	
	
}
