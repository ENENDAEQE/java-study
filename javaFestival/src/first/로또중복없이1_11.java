package first;

import java.util.Random;

public class �ζ��ߺ�����1_11 {

	public static void main(String[] args) {
		// �ߺ� ���� ���� ���� �ζ�
		
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
