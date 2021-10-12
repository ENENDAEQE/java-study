package second;

import java.util.Scanner;

public class nn배열2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int cnt = 1;
		
		// 행 반복
		for(int i = 0; i < n; i++) {
			// 열 반복
			for(int j = 0; j <n; j++) {
				arr[i][j] = cnt++;
			}
		}
		// 배열에 숫자를 저장하기 위한 작업
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();			
		}
	}

}
