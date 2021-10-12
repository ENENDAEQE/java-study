package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		BookDate book1 = new BookDate("Java", 21000,"홍길동");
//		BookDate book2 = new BookDate("C++", 29000,"박문수");
//		BookDate book3 = new BookDate("Database", 31000,"김장독");
//		BookDate book4 = new BookDate("Android", 18000,"이순신");
//		BookDate book5 = new BookDate("Web", 26000,"김철수");
//		
//		
//		System.out.println(book1);
//		System.out.println(book2);
//		System.out.println(book3);
//		System.out.println(book4);
//		System.out.println(book5);

		Scanner sc =new Scanner(System.in);
        
		//객체배열
		BookDate[] books = new BookDate[5];
			
		
		//BookDate객체배열 초기화
		for(int i= 0;i< books.length; i++) {
			System.out.print("책 제목: ");
			String title =sc.next();
			System.out.print("가격: ");
			int price =sc.nextInt();
			System.out.print("저자: ");
			String writer = sc.next();
			
		    //객체배열 내 데이터 초기화하는 방법
			//객체배열[인덱스] = new 클래스명(데이터1, 데이터2,...);
			books[i] = new BookDate(title, price, writer);
		}
		
		
//		books[0] = new BookDate ("Java", 21000,"홍길동");
//	    books[1] = new BookDate ("C++", 29000,"박문수");
//	    books[2] = new BookDate ("Database", 31000,"김장독");
//		books[3] = new BookDate ("Android", 18000,"이순신");
//		books[4] = new BookDate ("Web", 26000,"김철수");
        
        //BookDate객체배열 출력
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i]);
		}
	}

}
