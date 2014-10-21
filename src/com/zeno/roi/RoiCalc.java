package com.zeno.roi;
/**
 * 
 * @author zeno
 * 投资收益率计算器
 * 计算年基本收入、年投资收益率 一定的情况下，n年的收益
 */
public class RoiCalc {

//	private static double cycleIn = 10;
//	private static double result = 0;
//	private static double cycleRate = 0.3;
//	private static int cycles = 10;
//	
//	
//	public static void main(String[] args) {
//		result = calcNCycleAfter(cycles,cycleIn,cycleRate);
//		long rs = Math.round(result);
//		double rate = rs/(cycleIn*cycles);
//		System.out.println("第"+cycles+"年后："+rs + " 收益率" +rate);
//	}
	
	public static double calcNCycleAfter(int cycles,double cycleIn,double cycleRate){
		double now =  cycleIn;
		double next = 0;
		for(int i=1;i<cycles+1;i++){			
			
			next = calcNextYear(now,cycleRate) ;
			if(i<10 || i%10==0){
				System.out.print("第"+i+"次  --- 从"+Math.round(now)+" 到   "+Math.round(next));
				double rate = Math.round((next-(cycleIn*i))/(cycleIn*i)*100);
				System.out.println("， 目前总收益率   " +rate +" %");
			}
			now = next + cycleIn;
		}
		return next;
	}
	protected static double calcNextYear(double now, double cycleRate2) {
		
		double next = now *(1+cycleRate2);
		return next;
	}
	
}
