package com.zeno.roi.way;

import com.zeno.roi.Constant;
import com.zeno.roi.IWayRoi;
import com.zeno.roi.RoiCalc;

/**
 * @author zeno
 * Way的子类，适用于投资周期和收益周期不一致的情况，例如连续5年每月投入1w，计算10年后的收益率
 */
public class WaySon extends Way implements IWayRoi{
	
	/**	 
	 * @param cycle 计划总共投资的周期次数
	 * @param cycleIn 每个投资周期追加的投资数
	 * @param cycleCalc 计算收益的周期数，例如 720天
	 * @param cycleRoi 计算每天收益率的分母
	 * @see Way
	 */
	public WaySon(int cycle, double cycleIn,int cycleCalc,double cycleRoi) {
		super(cycle, cycleIn, cycleCalc, cycleRoi);
		
	}

	/**
	 * 适用于 投资周期和收益周期不同步 的投资计算
	 */
	@Override
	public double calcNCycleAfter() {
		double now = cycleIn;
		double next = 0;
		sum = now;//
		int count = 1;//临时保存已经追加投资的周期数
		int regular = 1;
		
		checkType(cycleCalc);
		switch(type){
		case 0://年
			regular = Constant.YEAR_DAYS;
		case 1://月
			regular = Constant.MONTH_DAYS;
		case 2://天
			regular = Constant.DAY;
		}
		for(int i=1;i<cycleCalc+1;i++){			
			
			next = calcNextCycle(now,cycleRoi) ;
			printLog(cycleCalc, i, next, now, cycleIn,sum);
			
			if(i%regular == 0 && count<cycle && i != cycleCalc){
				now = next + cycleIn;
				sum += cycleIn;
				count ++;
				
			}else{
				now = next;
			}
		}
		this.result = next;
		reset();
		return next;
	}
	
}
