package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * 房产投资方向的
 * 贷款买房
 */
public class HouseLoan extends Way implements IWayRoi{
	/**
	 * 房产年华收益率
	 */
	public static double cycleRoiYear = 0.2;
	/**
	 * 房产贷款利率
	 */
	public static double loanRate = 0.2;
	/**	 
	 * @param cycle
	 * @param cycleIn
	 * @param cycleRoiYear
	 * @see Way
	 */
	public HouseLoan(int cycle, double cycleIn) {
		super(cycle, cycleIn, cycle, cycleRoiYear);
		
	}

	@Override
	public double calcNCycleAfter() {
		return super.calcNCycleAfter();
	}

}
