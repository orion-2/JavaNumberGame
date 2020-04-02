package gameStart;

import java.util.Random;
import java.util.Scanner;

import intF.MissileCenter;

public class GameRoom {
	
	MonRoom mr = null;
	MissileCenter mc = new MissileCenter(); //레벨에 따른 미사일 관리객체
	int myPoint = 0;  //나의점수
	int levelOne = 5;  //레벨2가 되기 위한 기준점수
	
	GameRoom(){
		init();
		start();
	}
	
	private void init() {
		mr = new MonRoom();
	}

	private void start() {
		makeMonster();
		attackMon();
	}

	private void attackMon() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Scanner in = new Scanner(System.in);
				while(true) {
					int killNum = in.nextInt();
					if(killNum > 0 && killNum < 10) {
						int attPower;
						if(myPoint <= levelOne) {
							//레벨1 무기
							attPower = mc.setMissile("t1");
						}else {
							attPower = mc.setMissile("t2");
						}
						for(int i = 0; i < attPower; i++ ) {
							int killcnt = mr.killMon(killNum);
							myPoint += killcnt;
							System.out.println(">> "+killcnt+" 삭제 / 점수"+ myPoint);
						}
						
					}
				}
			}
		}).start();
	}

	private void makeMonster() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				Random r = new Random();
				while(true) {
					int number=r.nextInt(10)+1;
					if(number <= 5) {
						mr.makeMon(1,number);
					}else if(number > 5 && number < 10) {
						mr.makeMon(2, number);
					}
					mr.prtMon();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
		}).start();
	}

}
