package first;

import java.util.Scanner;

public class 거스름돈프로그램1_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");
		int a = sc.nextInt();
		int b = a/10000;
		int c = a%10000/5000;
		int d = a%5000/1000;
		int e = a%5000%1000/500;
		int f = a%500/100;
		
		System.out.println("잔돈 : " + a +"원");
		System.out.println("10000원 : " + b +"개");
		System.out.println("5000원 : " + c +"개");
		System.out.println("1000원 : " + d +"개");
		System.out.println("500원 : " + e +"개");
		System.out.println("100원 : " + f +"개");
	
	}

}
