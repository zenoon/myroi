package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * 房产投资方向的
 */
public class House extends Way implements IWayRoi{
	public static double cycleRoi = 0.3;
	/**	 
	 * @param cycle
	 * @param cycleIn
	 * @param cycleRoi
	 * @see Way
	 */
	public House(int cycle, double cycleIn) {
		super(cycleIn, cycle, cycleRoi);
		
	}

	@Override
	public double calcNCycleAfter() {
		return super.calcNCycleAfter();
	}

}
