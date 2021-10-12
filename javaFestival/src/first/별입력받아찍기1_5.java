package first;

import java.util.Scanner;

public class 별입력받아찍기1_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		
		int a = sc.nextInt();
		
		for (int i=1; i<=a; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}
}
