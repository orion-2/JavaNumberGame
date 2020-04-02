package test1;

public class Sparrow extends Birds implements Flying { //fly 기능을 인터페이스함  

	public Sparrow() {
		group = "제비";
	}
	@Override
	public void fly() {
		System.out.println(group + " : 날고있는중 입니다.");
	}

}
