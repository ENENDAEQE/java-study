package second;

import java.util.Scanner;

public class 입력정수합2_7 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= 8; i++) {
			int ten = (int)Math.pow(10, 8-i);
			sum = sum + a/ten;
			a = a%ten;
		}
		System.out.println("합은 "+sum+"입니다.");
	}
}
