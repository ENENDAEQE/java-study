package second;

import java.util.Scanner;

public class 구구단2_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int a = sc.nextInt();
		System.out.print("출력 끝나는 수 : ");
		int b = sc.nextInt();
		
		for (int i=1;i<=b;i++) {
			System.out.println(a + "*" + i + "=" + (a*i));
		}

	}

}
