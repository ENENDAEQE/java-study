package second;

import java.util.Scanner;

public class getMiddle2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String word = sc.next();
		
		System.out.println(getMiddle(word));
	}

	public static String getMiddle(String word) {
		
		String[] arr = word.split("");
		
		String result = "";
		
		// 글자수가 짝수일 경우
		if(arr.length%2 == 0) {
			result = arr[arr.length/2-1] + arr[arr.length/2];
		}else { // 홀수일 경우
			result = arr[arr.length/2];
		}
		return result;
	}

}
