package first;

import java.util.Scanner;

public class 임금계산기1_2 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		
		int a = sc.nextInt();
		int b = a-8;
		
		if (b>0) {
			System.out.println("총 임금은 " + ((8*5000)+(b*7500)) + "원 입니다.");
		} else {
			System.out.println("총 임금은 " + (a*5000) + "원 입니다.");
		}

	}

}
