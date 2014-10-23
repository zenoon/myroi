package com.zeno.roi.way;

import com.zeno.roi.Constant;
import com.zeno.roi.RoiCalc;

/**
 * @author zeno
 * 不同的投资方向的基类
 * RoiCalc的子类
 */
public class Way extends RoiCalc{
	/**
	 * 计划投资的周期数
	 */
	protected int cycle ;
	/**
	 * 每个周期点恒定投入的资金
	 */
	protected double cycleIn ;
	/**
	 * 计算收益的周期数，不同于cycle
	 * 例如，每个月投入，但是每天计算收益的宝宝理财
	 */
	protected int cycleCalc ;
	/**
	 * 每个收益周期的恒定的投资收益率ROI
	 */
	protected double cycleRoi ;
	/**
	 * N个周期后的总资产
	 */
	protected double result ;	
	/**
	 * N个周期的总投资额
	 */
	protected double sum ;	
	/**
	 * N个周期的总投资收益率
	 */
	protected double rate ;	
	/**
	 * 是否考虑通货膨胀率
	 */
	protected boolean isInflation = true ;
	/**
	 * 
	 * @param cycle 计划总共投资的周期次数
	 * @param cycleIn 每个投资周期追加的投资数
	 * @param cycleCalc 计算收益的周期数，例如 720天
	 * @param cycleRoi  每个计算收益的周期的收益率，如果是年就是年化收益率，如果是月就是月化收益率，如果是天就是日化收益率
	 */
	public Way(int cycle, double cycleIn, int cycleCalc, double cycleRoi) {
		super();
		this.cycle = cycle;
		this.cycleIn = cycleIn;
		this.cycleCalc = cycleCalc;
		this.cycleRoi = cycleRoi;
	}
	
	/**
	 * 计算 N 个收益周期后的资产，并且保存到result中
	 * @return N个周期后的总资产
	 */
	public double calcNCycleAfter(){
		this.result = calcNCycleAfter(this.cycleIn,this.cycleCalc,this.cycleRoi);
		return result;
	}
	/**
	 * 计算 N 个周期后的总的投资收益率
	 * @return N 个周期后的总投资收益率
	 */
	public double calcNCycleRate(){
		
		long rs = Math.round(this.result);
		sum = (this.cycleIn*this.cycle);
		double sumInflation = sum;
		double rateInflation = 0;
		//考虑通货膨胀的情况
		if(isInflation){
			
			if(cycleCalc % Constant.YEAR_DAYS == 0){
				for(int i = 0; i < cycleCalc / Constant.YEAR_DAYS; i++){
					sumInflation = sumInflation*(1+Constant.INFLATION_RATE);
				}	
			}else if(cycleCalc %Constant.YEAR_MONTHS == 0){
				for(int i=0; i < cycleCalc / Constant.YEAR_MONTHS; i++){
					sumInflation = sumInflation*(1+Constant.INFLATION_RATE);
				}	
			}else if(cycleCalc % 1 == 0){
				for(int i=0;i<cycleCalc;i++){
					sumInflation = sumInflation*(1+Constant.INFLATION_RATE);
				}
			}
			sumInflation = Math.round(sumInflation);
			rateInflation = Math.round( (rs-sumInflation) / sum * Constant.PERCENT); 
		}
		
		rate = Math.round((rs-sum) / sum * Constant.PERCENT);		
		
		System.out.println(":投入("+ sum +")，通胀("+sumInflation+")， 现总资产("+rs + ")， 总收益率(" +rate + "%)，扣除通胀总收益率(" +rateInflation + "%)");
		
		return rate;
	}
}
