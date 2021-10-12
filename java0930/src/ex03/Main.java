package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				

		Student student1 = new Student();

		student1.setName("홍길동");
		student1.setNumber("20150675");
		student1.setAge(22);
		student1.setScoreJava(50);
		student1.setScoerWeb(898);
		student1.setScoerAndroid(70);

		// 사용자정의생성자를 이용해서 STUDENT2객체 초기화
		Student student2 = new Student("김영희", "20090541", 29, 90, 25, 30);
		
		//student1객체의 정보를 출력
//		student1.show();
//	    
//		student2.show();
		System.out.println(student1);
		System.out.println("--------------------");
		System.out.println(student2);

	}

}
