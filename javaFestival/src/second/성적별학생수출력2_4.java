package second;

public class �������л������2_4 {

	public static void main(String[] args) {
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		// split() �Լ� ����ϱ�
		
		String[] score2 = score.split(",");
		
		// �� ������ ���� Ȯ�� -> ���� ���
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		//for���� Ȱ���Ͽ� �迭�� ��ü Ȯ��
		for(int i = 0; i<score2.length; i++) {
			System.out.print(score2[i]+" ");	
		}System.out.println();
		for(int i = 0; i<score2.length; i++) {
			if(score2[i].equals("A")) {
				a += 1;
			}else if (score2[i].equals("B")) {
				b += 1;
			}else if (score2[i].equals("C")) {
				c += 1;
		    }else if (score2[i].equals("D")) {
		    	d += 1;
		    }else if (score2[i].equals("F")) {
		    	f += 1;
		    }
		}
		System.out.println("A : "+a+"��");
		System.out.println("B : "+b+"��");
		System.out.println("C : "+c+"��");
		System.out.println("D : "+d+"��");
		System.out.println("F : "+f+"��");
	}
}
