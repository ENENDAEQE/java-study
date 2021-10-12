package first;

import java.util.Scanner;

public class 최대공약수최소공배수1_9 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최대 공약수&최소 공배수 구하기");
		System.out.print("숫자1입력 >> ");
		int a = sc.nextInt();
		System.out.print("숫자2입력 >> ");
		int b = sc.nextInt();
		int c = 0;
		
		for (int i = 1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				c=i;
			}
		}
		System.out.println("최대 공약수 : "+c);
		
		int d = a*b/c;
		System.out.println("최소 공배수 : "+d);

	}

}
