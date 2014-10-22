package com.zeno.roi;
/**
 * 
 * @author zeno
 * 投资收益率计算器
 * 计算年基本收入、年投资收益率 一定的情况下，n年的收益
 */
public class RoiCalc {
	
	/**
	 * 计算 N 个收益周期后的总资产,只适用投资周期与收益周期相同的情况，cycles == cycleCalc
	 * @param cycleIn
	 * @param cycleCalc
	 * @param cycleRate
	 * @return 
	 */
	public static double calcNCycleAfter(double cycleIn,int cycleCalc,double cycleRate){
		double now =  cycleIn;
		double next = 0;
		boolean isIndex = false;
		for(int i=1;i<cycleCalc+1;i++){
			
			next = calcNextCycle(now,cycleRate) ;
			if(Constant.isPrint )
				if(cycleCalc < Constant.MONTH){
					isIndex = true;
				}else if(cycleCalc > Constant.DAYS && cycleCalc % Constant.DAYS == 0){
					isIndex = true;
				}else if(cycleCalc > Constant.MONTH && cycleCalc% Constant.MONTH == 0 ){
					isIndex = true;
				}
				
				if(isIndex){
					System.out.print("第"+i+"次  --- 从"+Math.round(now)+" 到   "+Math.round(next));
					double rate = Math.round( (next - (cycleIn * i) ) / (cycleIn*i) * Constant.PERCENT);
					System.out.println("， 目前总收益率   " +rate +" %");
				}
			
			
				
			now = next + cycleIn;
		}
		return next;
	}
	/**
	 * 计算下个周期后的总资产
	 * @param now
	 * @param cycleRate2
	 * @return
	 */
	protected static double calcNextCycle(double now, double cycleRate2) {
		
		double next = now *(1+cycleRate2);
		return next;
	}
	
}
