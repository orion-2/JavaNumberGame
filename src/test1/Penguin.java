package test1;

public class Penguin extends Birds implements Swimable {

	public Penguin() {
		group = "���";
	}
	
	@Override
	public void swimming() {
		System.out.println(group + " : ������ �Դϴ�.");
	}

}
