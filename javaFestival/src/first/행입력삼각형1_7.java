package first;

import java.util.Scanner;

public class ���Է»ﰢ��1_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� : ");
		
		int a = sc.nextInt();
		
		for (int i=1; i<=a; i++) {
			for(int j=a;j>=i; j--) {
				System.out.print("*");
			} System.out.println();
		}

	}

}
