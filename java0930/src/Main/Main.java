package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		BookDate book1 = new BookDate("Java", 21000,"ȫ�浿");
//		BookDate book2 = new BookDate("C++", 29000,"�ڹ���");
//		BookDate book3 = new BookDate("Database", 31000,"���嵶");
//		BookDate book4 = new BookDate("Android", 18000,"�̼���");
//		BookDate book5 = new BookDate("Web", 26000,"��ö��");
//		
//		
//		System.out.println(book1);
//		System.out.println(book2);
//		System.out.println(book3);
//		System.out.println(book4);
//		System.out.println(book5);

		Scanner sc =new Scanner(System.in);
        
		//��ü�迭
		BookDate[] books = new BookDate[5];
			
		
		//BookDate��ü�迭 �ʱ�ȭ
		for(int i= 0;i< books.length; i++) {
			System.out.print("å ����: ");
			String title =sc.next();
			System.out.print("����: ");
			int price =sc.nextInt();
			System.out.print("����: ");
			String writer = sc.next();
			
		    //��ü�迭 �� ������ �ʱ�ȭ�ϴ� ���
			//��ü�迭[�ε���] = new Ŭ������(������1, ������2,...);
			books[i] = new BookDate(title, price, writer);
		}
		
		
//		books[0] = new BookDate ("Java", 21000,"ȫ�浿");
//	    books[1] = new BookDate ("C++", 29000,"�ڹ���");
//	    books[2] = new BookDate ("Database", 31000,"���嵶");
//		books[3] = new BookDate ("Android", 18000,"�̼���");
//		books[4] = new BookDate ("Web", 26000,"��ö��");
        
        //BookDate��ü�迭 ���
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i]);
		}
	}

}
