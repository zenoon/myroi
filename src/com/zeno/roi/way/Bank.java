package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * 银行存款投资方向
 */
public class Bank extends Way implements IWayRoi{
	public static double cycleRoi = 0.03;
	/**	 
	 * @param cycle
	 * @param cycleIn
	 * @param cycleRoi
	 * @see Way
	 */
	public Bank(int cycle, double cycleIn) {
		super(cycleIn, cycle, cycleRoi);
		
	}

	@Override
	public double calcNCycleAfter() {
		return super.calcNCycleAfter();
	}

}
