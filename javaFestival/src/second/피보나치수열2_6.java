package second;

import java.util.Scanner;

public class 피보나치수열2_6 {

	public static void main(String[] args) {
		// 1 2 4 7 11 16 22
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int b = 1;
		
		for (int i=1; i<=n; i++) {
			System.out.print(b+" ");
			b += i;
		}

	}

}
