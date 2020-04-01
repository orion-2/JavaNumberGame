package gameStart;

import java.util.Random;
import java.util.Scanner;

public class GameRoom {
	
	MonRoom mr = null;
	
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
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Scanner in = new Scanner(System.in);
				while(true) {
					int killNum = in.nextInt();
					if(killNum > 0 && killNum < 10) {
						int killcnt = mr.killMon(killNum);
						System.out.println(">> "+killcnt+" 삭제");
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
