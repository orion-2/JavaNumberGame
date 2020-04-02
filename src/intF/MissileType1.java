package intF;

public class MissileType1 implements Missile{
	int x=100;
	int y=100;
	int maxy=300;
	
	MissileType1(){
//		moveAction();
	}
	@Override   
	public int attack() {
		return 1;
	}
	public void moveAction() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while(y <= maxy) {
					try {
						Thread.sleep(200);
					//	x = x+2;
					//	System.out.println("m1 posit"
					//			+x+"/"+y);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}	
	
}
