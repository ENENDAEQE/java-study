package first;

import java.util.Arrays;
import java.util.Random;

public class �迭�����ʱ�ȭ1_10 {

	public static void main(String[] args) {
		// 
		Random rd = new Random();

		int[] arr = new int[8];
		

		for (int a = 0; a < arr.length; a++) {
			arr[a] = rd.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int b=0; b<arr.length-1; b++) {
			
			for(int a=0; a<arr.length-1; a++) {
			
				if(arr[a] < arr[a+1]) {
				
					int temp = arr[a];
					arr[a] = arr[a+1];
					arr[a+1] = temp;
				}
			}
		}
		System.out.println("���� ū �� : " + arr[0]);
		System.out.println("���� ���� �� : " + arr[7]);

	}

}
