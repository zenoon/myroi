package com.zeno.roi.way;

import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * 股票投资方向的
 */
public class Stock extends WaySon implements IWayRoi{
	public static double cycleRoiYear = 0.3;
	/**	 
	 * 投资周期 与 计算收益周期 【相同】
	 * @param cycle
	 * @param cycleIn
	 * @param per 年化收益率 转换 为 周期收益率的 分母
	 * @see Way
	 * 
	 */
	public Stock(int cycle, double cycleIn,int per) {		
		super(cycle,cycleIn,cycle, cycleRoiYear/per);		
	}
	/**	 
	 * 投资周期 与 计算收益周期  【不同】
	 * @param cycle
	 * @param cycleIn
	 * @param per 年化收益率 转换 为 周期收益率的 分母
	 * @see Way
	 * 
	 */
	public Stock(int cycle, double cycleIn,int cycleCalc,int per) {
		super(cycle, cycleIn, cycleCalc, cycleRoiYear/per);
	}

}
