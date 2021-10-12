package ex02;

public class Main {

	public static void main(String[] args) {
		//Person 객체생성
		//클래스명 객체변수 = new 클래스명();
		
		Person person = new Person();
		//new라는 개체는 필수변수를 이용하여 person.name 적용
		
		
		//name을 초기화
		person.setName ("이훈렬");
		
		//name값 접근
		System.out.println(person.getName());
		
		person.sleep();
        
	}

}
