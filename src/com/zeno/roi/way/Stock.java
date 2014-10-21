package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * ��ƱͶ�ʷ����
 */
public class Stock extends Way implements IWayRoi{
	public static double cycleRoiYear = 0.3;
	/**	 
	 * @param cycle
	 * @param cycleIn
	 * @param per 0:��  1:��  2����
	 * @see Way
	 */
	public Stock(int cycle, double cycleIn,int per) {
		
		super(cycleIn, cycle, cycleRoiYear/per);
		
		
	}

	@Override
	public double calcNCycleAfter() {
		return super.calcNCycleAfter();
	}

}
