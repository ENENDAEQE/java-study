package second;

import java.util.Scanner;

public class �Է¹޾��ε����������2_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		
		for (int i=0; i<a.length; i++) {
			System.out.print(i+"��° ���� �� : ");
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
