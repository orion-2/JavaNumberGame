package test1;

public class Whale extends Mammal implements Swimable{

	public Whale() {
		group = "��";
	}
	@Override
	public void swimming() {
		System.out.println(group + " : ������ �Դϴ�");	
	}
	
}
