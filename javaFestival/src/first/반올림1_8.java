package first;

import java.util.Scanner;

public class 반올림1_8 {

	public static void main(String[] args) {
		// 1의 자리에서 반올림
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int a = sc.nextInt();
		int b = 10-(a%10);
		
		if (a%10 >= 5) {
			a += b; 
		}else {
			a -= (a%10);
		}
		System.out.print("반올림 수 : "+a);

	}

}
