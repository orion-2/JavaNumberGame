package monster;

public abstract  class NumMon {
	int energy=0;
	int monNum=0;
	int damage=1;
	
	NumMon(int energy, int monNum){
		this.energy=energy;
		this.monNum=monNum;
	}
	
	public abstract void prtNumber();
	public int monNum() {
		return monNum;
	}
	public int getMonNum() {
		return monNum;
	}
	public int getEenergy() {
		return energy;
	}
	public void damageMon() {
		energy = energy-damage;
	}
	
}
