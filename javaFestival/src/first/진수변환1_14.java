package first;

import java.util.Scanner;

public class ������ȯ1_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է�>> ");
		
		int a = sc.nextInt();
		
		// 2������ �迭 ����
		int[] num = new int[50];
		
		// �迭�� ��ġ ������
		int i = 0;
		
		while(a != 1) {
			// �迭�� ��ġ�� 0�� ������ ���ʷ� 2�� �������� ������ ���� ����
			num[i++] = a%2;
			
			// �Է°��� ���� ���� �� �ִ� ����
			a = a/2;			
		}
		num[i] = a;
		
		//�迭�� ������ �Ųٷ� ����ϱ�
		for(int j = i; j >=0; --j) {
			System.out.print(num[j]+" ");
		}

	}

}
