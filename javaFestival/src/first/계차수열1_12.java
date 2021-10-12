package first;

import java.util.Scanner;

public class 계차수열1_12 {

	public static void main(String[] args) {
		// 1 2 4 7 11 같은수열
		//  +1+2+3+4+5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		
		int n = sc.nextInt();
		int b = 1;
		
		for (int a = 1; a <=n; a++) {
			System.out.print(b+" ");
			b += a;
		}
		

	}

}
