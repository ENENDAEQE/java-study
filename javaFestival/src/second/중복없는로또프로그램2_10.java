package second;

import java.util.Random;

public class �ߺ����·ζ����α׷�2_10 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] arr = new int[6];
		
		for (int a = 0; a < arr.length; a++) {
			arr[a] = rd.nextInt(45)+1;
		
			for (int b = 0; b<a; b++) {
				if (arr[a]==arr[b]) {
					a--;
					break;
				}
			}
		}
		for (int a = 0; a<arr.length;a++) {
			System.out.println("����� ���� : " + arr[a]);
		}
	}
}
