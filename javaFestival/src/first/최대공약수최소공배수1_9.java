package first;

import java.util.Scanner;

public class �ִ������ּҰ����1_9 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ִ� �����&�ּ� ����� ���ϱ�");
		System.out.print("����1�Է� >> ");
		int a = sc.nextInt();
		System.out.print("����2�Է� >> ");
		int b = sc.nextInt();
		int c = 0;
		
		for (int i = 1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				c=i;
			}
		}
		System.out.println("�ִ� ����� : "+c);
		
		int d = a*b/c;
		System.out.println("�ּ� ����� : "+d);

	}

}
