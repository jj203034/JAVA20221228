package Ch10;

public class C03MultiArray {

	public static void main(String[] args) {
		//이차원배열[행][열]
		//1차원 배열의 배열요소 단위는 자료형단위이다
		//2차원 배열의 배열요소 단위는 1차원배열이다
		int [][] arr1 = new int[2][3];
		
		arr1[0][0] =10;
		arr1[0][1] =20;
		arr1[0][2] =30;
		
		arr1[1][0] =11;
		arr1[1][1] =22;
		arr1[1][2] =33;
		
		System.out.println("행 개수 :" + arr1.length);
		System.out.println("0번행의 열 개수 :" + arr1[0].length);
		System.out.println("1번행의 열 개수 :" + arr1[1].length);

	}

}
