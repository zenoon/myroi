package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * 房产投资方向的
 * 全款买房
 */
public class House extends WaySon implements IWayRoi{
	public static double cycleRoiYear = 0.2;
	/**	 
	 * @param cycle
	 * @param cycleIn
	 * @param cycleRoiYear
	 * @see Way
	 */
	public House(int cycle, double cycleIn,int cycleCalc) {
		super(cycle, cycleIn, cycleCalc, cycleRoiYear);
		
	}	

}
