package first;

import java.util.Scanner;

public class ���μ�����1_13 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���μ����� �� ���� �Է��ϼ��� : ");
		
		int a = sc.nextInt();
		
		System.out.print(a+" = ");
		
		for(int i = 2; i<=a; i++) {
			
			while(a%i == 0) {
				a /= i;
				System.out.print(i+" ");
			}
		}
		
		

	}

}
