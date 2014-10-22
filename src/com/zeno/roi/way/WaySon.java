package com.zeno.roi.way;

import com.zeno.roi.Constant;
import com.zeno.roi.IWayRoi;
import com.zeno.roi.RoiCalc;

/**
 * @author zeno
 * Way的子类，适用于投资周期和收益周期不一致的情况
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


	@Override
	public double calcNCycleAfter() {
		double now = cycleIn;
		double next = 0;
		sum = now;//
		int count = 1;//临时保存已经追加投资的周期数
		for(int i=1;i<cycleCalc+1;i++){			
			
			next = calcNextCycle(now,cycleRoi) ;
			if(Constant.isPrint)
				if(i % Constant.DAYS ==0){
					System.out.print("第"+i+"次  --- 从"+Math.round(now)+" 到   "+Math.round(next));
					double rate = Math.round( (next-sum ) / sum * Constant.PERCENT);
					System.out.println("， 目前总收益率   " +rate +" %");
				}
			if(i%30 == 0 && count<cycle && i != cycleCalc){
				now = next + cycleIn;
				sum += cycleIn;
				count ++;
				
			}else{
				now = next;
			}
		}
		this.result = next;
		return next;
	}

}
