package test1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flying flyer01 = new Bat();
		Flying flyer02 = new Sparrow();
		
		flyer01.fly();
		flyer02.fly();
		
		Swimable [] Swimmer = new Swimable[2];
		Swimmer[0] = new Whale();
		Swimmer[1] = new Penguin();
		
		for (Swimable Animal : Swimmer) {
			Animal.swimming();
		}
		
	}

}
