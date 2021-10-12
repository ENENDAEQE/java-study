package first;

import java.util.Scanner;

public class 소인수분해1_13 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소인수분해 할 수를 입력하세요 : ");
		
		int a = sc.nextInt();
		
		System.out.print(a+" = ");
		
		for(int i = 2; i<=a; i++) {
			
			while(a%i == 0) {
				a /= i;
				System.out.print(i+" ");
			}
		}
		
		

	}

}
