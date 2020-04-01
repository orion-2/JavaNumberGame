package monster;

public class Mon2  extends NumMon{

	

	public Mon2(int energy, int monNum) {
		super(energy, monNum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prtNumber() {
		// TODO Auto-generated method stub
		if(super.energy == 2) {
			System.out.print(super.monNum+"["+super.energy+"]* ");
		}else if(super.energy == 1) {
			System.out.print(super.monNum+"["+super.energy+"]& ");
		}
	}

}
