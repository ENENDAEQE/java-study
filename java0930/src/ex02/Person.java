package ex02;

public class Person {
	//Class구성요소 - 속성(필드변수), 기능(메소드)
	//사람의 속성: 이름(String), 나이(int)
	//사람의 행위: 말하다, 자다
	private String name;
	private int age;
	
	//생성자: 객체를 초기화하는 메소드
	//1.클래스명과 동일하다!
	//2.리턴타입이 없다!
	//3.new키워드에 의해서 한번 호출!
	//4.오버로딩
	
	//기본 생성자
	public Person() {}
	
	//사용자 정의 생산자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name =name;
		//this: 구분하기 힘들떄 클래스 변수지정하기 위해서 쓴다
	}
	public String getName() {
		return name;
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void talk() {
		System.out.println("말하기!");
	}
	public void sleep() {
		System.out.println("잠들기!");
	}
	
}
