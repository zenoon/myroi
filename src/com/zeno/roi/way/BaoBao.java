package com.zeno.roi.way;

import com.zeno.roi.Constant;
import com.zeno.roi.IWayRoi;

/**
 * @author zeno
 * 宝宝类投资方向
 */
public class BaoBao extends WaySon implements IWayRoi{
	/**
	 * 宝宝类理财年化收益率
	 */
	public static double cycleRoiYear = 0.05;
	/**
	 * 默认的计算每天收益率的分母
	 */
	private static int per = Constant.YEAR_DAYS;
	
	/**	 
	 * @param cycle 计划总共投资的周期次数
	 * @param cycleIn 每个投资周期追加的投资数
	 * @param cycleCalc 计算收益的周期数，例如 720天
	 * @param per 计算每天收益率的分母
	 * @see Way
	 */
	public BaoBao(int cycle, double cycleIn,int cycleCalc,int per) {
		super(cycle, cycleIn, cycleCalc, cycleRoiYear/per);
		
	}
	/**	 
	 * @param cycle 计划总共投资的周期次数
	 * @param cycleIn 每个投资周期追加的投资数
	 * @param cycleCalc 计算收益的周期数，例如 720天
	 * @see Way
	 */
	public BaoBao(int cycle, double cycleIn,int cycleCalc) {
		super(cycle, cycleIn, cycleCalc, cycleRoiYear/per);		
		
	}

	
	

}
