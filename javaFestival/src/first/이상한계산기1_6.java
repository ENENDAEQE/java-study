package first;

public class �̻��Ѱ���1_6 {

	public static void main(String[] args) {
		
		// (77*1)+(76*2)+(75*3)+...+(1*77) ��� ���
		int sum = 0;
		int a = 78;
		int b = 0;
		for (int i=1; i<=77; i++) {
			a--;
			b++;
			sum += (a*b);
		}
		System.out.println(sum);

	}

}
