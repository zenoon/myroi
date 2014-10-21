package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * ���д��Ͷ�ʷ���
 */
public class Bank extends Way implements IWayRoi{
	public static double cycleRoiYear = 0.03;
	/**	 
	 * @param cycle
	 * @param cycleIn
	 * @param cycleRoiYear
	 * @see Way
	 */
	public Bank(int cycle, double cycleIn) {
		super(cycleIn, cycle, cycleRoiYear);
		
	}

	@Override
	public double calcNCycleAfter() {
		return super.calcNCycleAfter();
	}

}
