package first;

import java.util.Scanner;

public class �ݿø�1_8 {

	public static void main(String[] args) {
		// 1�� �ڸ����� �ݿø�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		
		int a = sc.nextInt();
		int b = 10-(a%10);
		
		if (a%10 >= 5) {
			a += b; 
		}else {
			a -= (a%10);
		}
		System.out.print("�ݿø� �� : "+a);

	}

}
