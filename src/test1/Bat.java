package test1;

public class Bat extends Birds implements Flying {

	public Bat() {
		group = "����";
	}
	
	@Override
	public void fly() {
		System.out.println(group + " : �����ִ��� �Դϴ�.");
	}
	
}
