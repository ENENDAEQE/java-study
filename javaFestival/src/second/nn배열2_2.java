package second;

import java.util.Scanner;

public class nn�迭2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int cnt = 1;
		
		// �� �ݺ�
		for(int i = 0; i < n; i++) {
			// �� �ݺ�
			for(int j = 0; j <n; j++) {
				arr[i][j] = cnt++;
			}
		}
		// �迭�� ���ڸ� �����ϱ� ���� �۾�
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();			
		}
	}

}
