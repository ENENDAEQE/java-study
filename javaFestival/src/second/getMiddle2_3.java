package second;

import java.util.Scanner;

public class getMiddle2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է��ϼ��� : ");
		String word = sc.next();
		
		System.out.println(getMiddle(word));
	}

	public static String getMiddle(String word) {
		
		String[] arr = word.split("");
		
		String result = "";
		
		// ���ڼ��� ¦���� ���
		if(arr.length%2 == 0) {
			result = arr[arr.length/2-1] + arr[arr.length/2];
		}else { // Ȧ���� ���
			result = arr[arr.length/2];
		}
		return result;
	}

}
