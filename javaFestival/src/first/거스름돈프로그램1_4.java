package first;

import java.util.Scanner;

public class �Ž��������α׷�1_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ݾ� �Է� : ");
		int a = sc.nextInt();
		int b = a/10000;
		int c = a%10000/5000;
		int d = a%5000/1000;
		int e = a%5000%1000/500;
		int f = a%500/100;
		
		System.out.println("�ܵ� : " + a +"��");
		System.out.println("10000�� : " + b +"��");
		System.out.println("5000�� : " + c +"��");
		System.out.println("1000�� : " + d +"��");
		System.out.println("500�� : " + e +"��");
		System.out.println("100�� : " + f +"��");
	
	}

}
