package first;

import java.util.Scanner;

public class ����1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("��������� : ");
		int a = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int b = sc.nextInt();
		int c = 0;
		
		while(a>b) {
			c++;
			System.out.print(c + "���� ���� ������ : ");
			int d = sc.nextInt();
			a = a - d;	
		}
		System.out.println(a+"kg �޼�! �����մϴ�!");

	}

}
