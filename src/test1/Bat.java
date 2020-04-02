package test1;

public class Bat extends Birds implements Flying {

	public Bat() {
		group = "박쥐";
	}
	
	@Override
	public void fly() {
		System.out.println(group + " : 날고있는중 입니다.");
	}
	
}
