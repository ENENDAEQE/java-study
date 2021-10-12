package ex02;

public class Person {
	//Class������� - �Ӽ�(�ʵ庯��), ���(�޼ҵ�)
	//����� �Ӽ�: �̸�(String), ����(int)
	//����� ����: ���ϴ�, �ڴ�
	private String name;
	private int age;
	
	//������: ��ü�� �ʱ�ȭ�ϴ� �޼ҵ�
	//1.Ŭ������� �����ϴ�!
	//2.����Ÿ���� ����!
	//3.newŰ���忡 ���ؼ� �ѹ� ȣ��!
	//4.�����ε�
	
	//�⺻ ������
	public Person() {}
	
	//����� ���� ������
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name =name;
		//this: �����ϱ� ���鋚 Ŭ���� ���������ϱ� ���ؼ� ����
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
		System.out.println("���ϱ�!");
	}
	public void sleep() {
		System.out.println("����!");
	}
	
}
