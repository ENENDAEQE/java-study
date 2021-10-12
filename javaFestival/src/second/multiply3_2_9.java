package second;

import java.util.Scanner;

public class multiply3_2_9 {

	public static void main(String[] args) {
		// 숫자를 입력받아 3의 배수인 숫자를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10]; 
		int[] arr2 = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번 째 정수 입력>>");
			arr[i] = sc.nextInt();
			
			if(arr[i]%3==0) {
				arr2[i] = arr[i];
			}
		}
		System.out.print("3의 배수 : ");
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i] != 0) {
			System.out.print(arr2[i]+" ");
			}
		}
	}

}
