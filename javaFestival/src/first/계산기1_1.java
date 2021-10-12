package first;

import java.util.Scanner;

public class 계산기1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int a = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int b = sc.nextInt();
		int c = 0;
		
		while(a>b) {
			c++;
			System.out.print(c + "주차 감량 몸무게 : ");
			int d = sc.nextInt();
			a = a - d;	
		}
		System.out.println(a+"kg 달성! 축하합니다!");

	}

}
