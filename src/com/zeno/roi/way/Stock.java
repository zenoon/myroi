package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * ��ƱͶ�ʷ����
 */
public class Stock extends Way implements IWayRoi{
	public static double cycleRoi = 0.03;
	/**	 
	 * @param cycle
	 * @param cycleIn
	 * @param cycleRoi
	 * @see Way
	 */
	public Stock(int cycle, double cycleIn) {
		super(cycleIn, cycle, cycleRoi);
		
	}

	@Override
	public double calcNCycleAfter() {
		return super.calcNCycleAfter();
	}

}
