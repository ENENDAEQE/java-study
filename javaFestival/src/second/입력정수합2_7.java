package second;

import java.util.Scanner;

public class �Է�������2_7 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= 8; i++) {
			int ten = (int)Math.pow(10, 8-i);
			sum = sum + a/ten;
			a = a%ten;
		}
		System.out.println("���� "+sum+"�Դϴ�.");
	}
}
