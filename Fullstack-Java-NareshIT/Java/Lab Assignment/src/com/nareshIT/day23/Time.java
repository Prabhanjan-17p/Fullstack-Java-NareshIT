package com.nareshIT.day23;

public class Time {
	 private int hh,mm,ss;

	public Time(int hh, int mm, int ss) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}

	public Time() {
		super();
	}
	
	public void show() {
		System.out.println(this.hh+":"+this.mm+":"+this.ss);
	}
	
	public static Time add(Time t1,Time t2) {
		int tH = t1.hh+t2.hh;
		int tM = t1.mm+t2.mm;
		int tS = t1.ss+t2.ss;
		
		int temp =0;
		if (tS >= 60) {
			tS -= 60;
		}
		
		if (tM >= 60) {
			tM += 1;
			tM -= 60;
		}else {
			tM += 1; 
		}
		
		if(tH < 24) {
//			if (temp >= 60) {
//				tH += 1;
//			}
//			else {
//				tH +=0;
//			}
			tH += 1;
//			
		}
		Time summ = new Time();
		summ.hh =tH;
		summ.mm = tM;
		summ.ss = tS;
		summ.show();
		return summ;
	}
}
