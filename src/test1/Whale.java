package test1;

public class Whale extends Mammal implements Swimable{

	public Whale() {
		group = "고래";
	}
	@Override
	public void swimming() {
		System.out.println(group + " : 수영중 입니다");	
	}
	
}
