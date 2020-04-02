package intF;

public class MissileCenter {
	Missile myMissile = null;
	
	public int setMissile(String type) {
		switch (type){
		case "t1":
			myMissile = new MissileType1();
			break;
		case "t2":
			myMissile = new MissileType2();
			break;
		}
		return myMissile.attack();
	}
}
