package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * 银行定期存款投资方向
 */
public class Bank extends Way implements IWayRoi{
	/**
	 * 银行定期 固定收益率
	 * 
	 */
	public static double cycleRoiYear = 0.03;
	/**	 
	 * @param cycle
	 * @param cycleIn
	 * @see Way
	 */
	public Bank(int cycle, double cycleIn) {
		super(cycle, cycleIn, cycle, cycleRoiYear);
		
	}

}
