package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * 宝宝类投资方向
 */
public class BaoBao extends Way implements IWayRoi{
	public static double cycleRoiYear = 0.05;
	/**	 
	 * @param cycle
	 * @param cycleIn
	 * @param cycleRoiYear
	 * @see Way
	 */
	public BaoBao(int cycle, double cycleIn,int per) {
		super(cycleIn, cycle, cycleRoiYear/per);
		
	}

	@Override
	public double calcNCycleAfter() {
		double now = cycleIn;
		double next = 0;
		for(int i=1;i<cycle+1;i++){			
			
			next = calcNextYear(now,cycleRoi) ;
			if(i<10 || i%10==0){
				System.out.print("第"+i+"次  --- 从"+Math.round(now)+" 到   "+Math.round(next));
				double rate = Math.round((next-(cycleIn*i))/(cycleIn*i)*100);
				System.out.println("， 目前总收益率   " +rate +" %");
			}
			now = next;
		}
		return next;
	}

}
