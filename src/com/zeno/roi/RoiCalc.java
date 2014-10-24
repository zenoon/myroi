package com.zeno.roi;
/**
 * 
 * @author zeno
 * 投资收益率计算器
 * 投资方向的父类
 * 计算年基本收入、年投资收益率 一定的情况下，n年的收益
 * @see Way
 */
public class RoiCalc {
	/**
	 * 0=年  1=月 2=天
	 */
	protected static int type = -1;
	/**
	 * “年”、“月”、“天”
	 */
	protected static String dayORmonth = "次";
	/**
	 * 计算 N 个收益周期后的总资产,只适用投资周期与收益周期相同的情况(cycles == cycleCalc)</br>
	 * 其他特殊的情况，在子类中实现
	 * @param cycleIn
	 * @param cycleCalc
	 * @param cycleRate
	 * @return 
	 */
	public static double calcNCycleAfter(double cycleIn,int cycleCalc,double cycleRate){
		double now =  cycleIn;
		double next = 0;
		double sum = now;
		for(int i=1;i<cycleCalc+1;i++){
			
			next = calcNextCycle(now,cycleRate) ;						
			printLog(cycleCalc, i, next, now, cycleIn,sum);	
			sum += cycleIn;
			now = next + cycleIn;
		}
		reset();
		return next;
	}
	/**
	 * 重置计算器
	 */
	protected static void reset() {
		type = -1;
		dayORmonth = "次";
	}
	/**
	 * 打印计算时的日志信息，根据收益周期年、月、日的不同，打印不同数量的阶段性日志
	 * @param cycleCalc
	 * @param i
	 * @param next
	 * @param now
	 * @param cycleIn
	 * @param sum
	 */
	protected static void printLog(int cycleCalc, int i, double next, double now, double cycleIn, double sum) {
		
		// 每次循环都需要计算isIndex 和 rate
		boolean isIndex = false;//只打印阶段性的日志，而不是全部，因为全部日志条数过多
		double rate = 0;
		
		checkType(cycleCalc);		
		
		if(Constant.isPrint){
			switch(type){
			case 0:
				rate = Math.round( (next - (cycleIn * i) ) / (cycleIn*i) * Constant.PERCENT);
				isIndex = true;
			case 1:
				rate = Math.round( (next - (cycleIn * i) ) / (cycleIn*i) * Constant.PERCENT);
				if(i% Constant.YEAR_MONTHS == 0 ){
					isIndex = true;
				}
			case 2:
				rate = Math.round( (next-sum ) / sum * Constant.PERCENT);
				if(i% Constant.YEAR_DAYS == 0 ){
					isIndex = true;
				}			
			}			
			
			if(isIndex){
				System.out.print("第" + i + dayORmonth + "  --- 从"+Math.round(now)+" 到   "+Math.round(next));				 
				System.out.println("， 目前总收益率   " +rate +" %");
			}
		}
	}
	protected static void checkType(int cycleCalc) {
		// 判断收益周期类型
		if(type == -1){
			if(cycleCalc <= Constant.YEAR_MONTHS*2 ){
				type = 0;
				dayORmonth = "年";
			}else if(cycleCalc > Constant.YEAR_DAYS && cycleCalc % Constant.YEAR_DAYS == 0){
				type = 2;
				dayORmonth = "天";
			}else if(cycleCalc > Constant.YEAR_MONTHS && cycleCalc% Constant.YEAR_MONTHS == 0 ){
				type = 1;
				dayORmonth = "月";
			}			
		}		
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
