package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		//구구단(2단 -9단)
		
//		int dan = 2;
//		int i = 1;
//		while(dan<=9)
//		{	
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		//2단 9단 출력  (구구단 순서만 역순)
		
//		int dan = 9;
//		int i = 1;
//		while(dan>=2)
//		{	
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
		//2단 9단 출력  (전체 역순)		
//		int dan = 9;
//		int i = 9;
//		while(dan>=2)
//		{	
//			i=9;
//			while(i>=1)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		//n단을 입력받아 n단부터 9단까지 출력
		
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		int i = 1;
//		while (dan<=9)
//		{
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//n,m을 입력받아 n부터 m단까지 출력(n<m and n<8,m<9)
		
		
		
		//1
		//*****
		//*****
		//*****
		//*****
		//i(줄바꿈)	j(별찍기)
		//i=0		j=0
		//i++		j++
		//i<4		j<5
		
//		int i =0; //줄바꿈
//		int j =0; //별찍기
//		while(i<4)
//		{
//			j=0;
//			while(j<5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		//2
	//    *
	//    **
	//    ***
	//    ****
		//i(줄바꿈)	j(별찍기)
		//i=0		j=0
		//i++		j++
		//i<4		j<=i
		
//		int i = 0;
//		int j = 0;
//		while(i<4)
//		{
//			j=0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
			
		
		//높이 입력 : 3
		//높이만큼의 직삼각형별이 출력되게하라
		//*
		//**
		//***
//		Scanner sc= new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i<h)
//		{
//			j=0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//3
	//	 ****
	//	 ***
	//	 **
	//	 *
	//i(줄바꿈)	j(별찍기)
	//i=0		j=0
	//i++		j++
	//i<4		j<=3-i
//		int i = 0;
//		int j = 0;
//		while(i<4)
//		{
//			j=1;
//			while(j<=3-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 높이 입력 
		//i(줄바꿈,개행)	j(별찍기)
		//i=0		j=0
		//i++		j++
		//i<h		j<h-i  or j<=(h-i)-1
//		Scanner sc= new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i<h)
//		{
//			j=0;
//			while(j<h-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//4
	//		*
	//	   ***
	//	  *****
	//	 *******
	// i(개행)		j(공백)		k(별)
	// 0			0-2			0-0
	// 1			0-1			0-2
	// 2			0-0			0-4
	// 3			x			0-7
	//-------------------------------
	//i=0			j=0			k=0
	//i++			j++			k++
	//i<4			j<=2-i		k<=2*1
		
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i<4)
//		{
//			//공백
//			j=0;
//			while(j<=2-i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//높이 입력받아서 출력
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<h)
		{
			//공백
			j=0;
			while(j<= (h-2) -i)
			{
				System.out.print(" ");
				j++;
			}
			//별
			k=0;
			while(k<= 2*i)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		
		//5
	//	 *******
	//	  *****
	//	   ***
	//	    *
		
		
		
		
	}
	
}
