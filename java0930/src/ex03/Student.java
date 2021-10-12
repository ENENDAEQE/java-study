package ex03;
//�л� ������ �����ϴ� Ŭ����
public class Student {
	//�л��� ������: �̸�, �й�, ����, Java����,Web����, Android����
	
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	public Student() {}
	
	public Student(String name, String number, int age, int scoreJava, int scoerWeb, int scoerAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoerWeb;
		this.scoreAndroid = scoerAndroid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String ScoreJava() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoerWeb() {
		return scoreWeb;
	}

	public void setScoerWeb(int scoerWeb) {
		this.scoreWeb = scoerWeb;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

	public String getNumber() {
		return number;
	}

	public int getScoerAndroid() {
		return scoreAndroid;
	}

	public void setScoerAndroid(int scoerAndroid) {
		this.scoreAndroid = scoerAndroid;
	}
	
	//�л������� ����ϴ� �޼ҵ�
	public void show() {
	
	      System.out.println(this.name + "�� �ȳ��ϼ���.");
	      System.out.println("[ "+this.number+", "+this.age+" ]");
	      System.out.println(this.name+"���� Java ������ "+this.scoreJava+"�� �Դϴ�.");
	      System.out.println(this.name+"���� Web ������ "+this.scoreJava+"�� �Դϴ�.");
	      System.out.println(this.name+"���� Android ������ "+this.scoreAndroid+"�� �Դϴ�.");
	      System.out.println("==============================================");
	
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", age=" + age + ", scoreJava=" + scoreJava
				+ ", scoreWeb=" + scoreWeb + ", scoreAndroid=" + scoreAndroid + "]";
	}
	
	
	
//	@Override
//	public String toString() {
//		return "Student��ü[name: "+name+"]";
//	}
		
}

