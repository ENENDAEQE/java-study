package second;

import java.util.Scanner;

public class ������2_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int a = sc.nextInt();
		System.out.print("��� ������ �� : ");
		int b = sc.nextInt();
		
		for (int i=1;i<=b;i++) {
			System.out.println(a + "*" + i + "=" + (a*i));
		}

	}

}
