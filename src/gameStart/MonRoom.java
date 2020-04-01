package gameStart;

import java.util.ArrayList;

import monster.*;

public class MonRoom {
	private ArrayList<NumMon> mList = new ArrayList<>();
	private int maxMon = 7;

	MonRoom() {

	}

	public void addMon(NumMon newM) {
		mList.add(newM);

	}

	public int killMon(int killNum) {
		int killcnt = 0;
		for (int i = 0; i < mList.size(); i++) {
			NumMon imsiM = mList.get(i);
			if (imsiM.getMonNum() == killNum) {
			//	System.out.println(i + "�� 媛숇떎");
				imsiM.damageMon();
				if (imsiM.getEenergy() == 0) {
					killcnt++;
					mList.remove(i);
					i--;
				}
			}
		}
		return killcnt;
	}

	public void prtMon() {
		for (int i = 0; i < mList.size(); i++) {
			mList.get(i).prtNumber();
		}
		System.out.println();
	}

	public void makeMon(int type, int number) {
		if (mList.size() >= maxMon) {
			systemHalt();
		} else {
			NumMon newM = null;
			if (type == 1) {
				newM = new Mon1(1, number);
			} else if (type == 2) {
				newM = new Mon2(2, number);
			}
			mList.add(newM);
		}
	}

	public void systemHalt() {
		System.out.println("Game Over----");
		System.exit(-1); //0 zero , 1 positive ,-1 negative 
	}

}
