package test1;

public class Sparrow extends Birds implements Flying { //fly ����� �������̽���  

	public Sparrow() {
		group = "����";
	}
	@Override
	public void fly() {
		System.out.println(group + " : �����ִ��� �Դϴ�.");
	}

}
