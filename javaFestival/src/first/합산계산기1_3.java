package first;

public class �ջ����1_3 {

	public static void main(String[] args) {
		
		int b = 0;
		int sum = 0;
		
		for (int a = 1; a<=100; a++) {
			if (a%2==0) {
				b = -a;
			} else {
				b = a;
			}
			System.out.print(b + " ");
			sum += b;
		} System.out.println();
		System.out.println("1���� 100������ �� : " + sum);

	}

}
