package ex02;

public class Main {

	public static void main(String[] args) {
		//Person ��ü����
		//Ŭ������ ��ü���� = new Ŭ������();
		
		Person person = new Person();
		//new��� ��ü�� �ʼ������� �̿��Ͽ� person.name ����
		
		
		//name�� �ʱ�ȭ
		person.setName ("���Ʒ�");
		
		//name�� ����
		System.out.println(person.getName());
		
		person.sleep();
        
	}

}
