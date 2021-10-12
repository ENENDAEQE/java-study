package second;

public class 성적별학생수출력2_4 {

	public static void main(String[] args) {
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		// split() 함수 사용하기
		
		String[] score2 = score.split(",");
		
		// 각 성적별 갯수 확인 -> 변수 사용
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		//for문을 활용하여 배열의 전체 확인
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
		System.out.println("A : "+a+"명");
		System.out.println("B : "+b+"명");
		System.out.println("C : "+c+"명");
		System.out.println("D : "+d+"명");
		System.out.println("F : "+f+"명");
	}
}
