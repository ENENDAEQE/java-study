package second;

import java.util.Scanner;

public class 입력받아인덱스수별출력2_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		
		for (int i=0; i<a.length; i++) {
			System.out.print(i+"번째 별의 수 : ");
			a[i] = sc.nextInt();
		}
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+":");
			
			for (int j=0; j<a[i]; j++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
