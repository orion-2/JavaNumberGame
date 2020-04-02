package test1;

public class Penguin extends Birds implements Swimable {

	public Penguin() {
		group = "Æë±Ï";
	}
	
	@Override
	public void swimming() {
		System.out.println(group + " : ¼ö¿µÁß ÀÔ´Ï´Ù.");
	}

}
