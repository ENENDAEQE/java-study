package first;

import java.util.Scanner;

public class �ӱݰ���1_2 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		
		int a = sc.nextInt();
		int b = a-8;
		
		if (b>0) {
			System.out.println("�� �ӱ��� " + ((8*5000)+(b*7500)) + "�� �Դϴ�.");
		} else {
			System.out.println("�� �ӱ��� " + (a*5000) + "�� �Դϴ�.");
		}

	}

}
