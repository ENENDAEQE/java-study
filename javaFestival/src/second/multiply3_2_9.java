package second;

import java.util.Scanner;

public class multiply3_2_9 {

	public static void main(String[] args) {
		// ���ڸ� �Է¹޾� 3�� ����� ���ڸ� ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10]; 
		int[] arr2 = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"�� ° ���� �Է�>>");
			arr[i] = sc.nextInt();
			
			if(arr[i]%3==0) {
				arr2[i] = arr[i];
			}
		}
		System.out.print("3�� ��� : ");
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i] != 0) {
			System.out.print(arr2[i]+" ");
			}
		}
	}

}
