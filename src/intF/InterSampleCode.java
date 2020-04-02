package intF;

import java.util.Scanner;

public class InterSampleCode {
	int en = 0;
	public InterSampleCode() {
		runTimer();
		attack();
	}
	private void attack() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Scanner in = new Scanner(System.in);
				int aPower = 0;
				MissileCenter ms = new MissileCenter();
			//	Missile myM = null;
				while(true) {
					if(en >= 10) {
						aPower = ms.setMissile("t2");
			//			myM = new MissileType2();
					}else {
						aPower = ms.setMissile("t1");
			//			myM = new MissileType1();
					}
					in.nextLine();
					System.out.println("Attack power : " + aPower);
					en = en + aPower;
					nowEn();
				}
			}
		}).start();
	}
	
	private void runTimer() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(300);
						en -= 1;
						nowEn();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	private void nowEn() {
		System.out.println("¿¡³ÊÁö : "+en);
	}  
	
	
	
	public static void main(String[] args) {
		new InterSampleCode();	
	}
}
