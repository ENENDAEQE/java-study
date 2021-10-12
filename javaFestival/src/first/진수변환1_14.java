package first;

import java.util.Scanner;

public class 진수변환1_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력>> ");
		
		int a = sc.nextInt();
		
		// 2진수의 배열 생성
		int[] num = new int[50];
		
		// 배열의 위치 지정값
		int i = 0;
		
		while(a != 1) {
			// 배열의 위치가 0인 곳부터 차례로 2로 나누어진 나머지 값을 저장
			num[i++] = a%2;
			
			// 입력값의 몫을 구할 수 있는 연산
			a = a/2;			
		}
		num[i] = a;
		
		//배열의 순서를 거꾸로 출력하기
		for(int j = i; j >=0; --j) {
			System.out.print(num[j]+" ");
		}

	}

}
