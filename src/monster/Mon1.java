package monster;

public class Mon1 extends NumMon {

	
	public Mon1(int energy, int monNum) {
		super(energy, monNum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prtNumber() {
		// TODO Auto-generated method stub
		System.out.print(super.monNum+"["+super.energy+"]"+"  ");
	}

}
