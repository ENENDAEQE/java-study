package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				

		Student student1 = new Student();

		student1.setName("ȫ�浿");
		student1.setNumber("20150675");
		student1.setAge(22);
		student1.setScoreJava(50);
		student1.setScoerWeb(898);
		student1.setScoerAndroid(70);

		// ��������ǻ����ڸ� �̿��ؼ� STUDENT2��ü �ʱ�ȭ
		Student student2 = new Student("�迵��", "20090541", 29, 90, 25, 30);
		
		//student1��ü�� ������ ���
//		student1.show();
//	    
//		student2.show();
		System.out.println(student1);
		System.out.println("--------------------");
		System.out.println(student2);

	}

}
