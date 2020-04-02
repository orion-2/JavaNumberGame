package gameStart;

import java.util.Random;
import java.util.Scanner;

import intF.MissileCenter;

public class GameRoom {
	
	MonRoom mr = null;
	MissileCenter mc = new MissileCenter(); //������ ���� �̻��� ������ü
	int myPoint = 0;  //��������
	int levelOne = 5;  //����2�� �Ǳ� ���� ��������
	
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
							//����1 ����
							attPower = mc.setMissile("t1");
						}else {
							attPower = mc.setMissile("t2");
						}
						for(int i = 0; i < attPower; i++ ) {
							int killcnt = mr.killMon(killNum);
							myPoint += killcnt;
							System.out.println(">> "+killcnt+" ���� / ����"+ myPoint);
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
