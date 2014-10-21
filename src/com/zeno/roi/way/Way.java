package com.zeno.roi.way;

import com.zeno.roi.RoiCalc;

/**
 * @author zeno
 * 不同的投资方向的基类
 */
public class Way extends RoiCalc{
	
	/*
	 * 每年恒定投入的资金
	 */
	private double cycleIn ;
	/**
	 * N年后的总资产
	 */
	private double result ;
	/**
	 * 每年恒定的投资收益率ROI
	 */
	private double cycleRoi ;
	/**
	 * 计划投资的年限
	 */
	private int cycle ;
	/**
	 * 每年恒定的通货膨胀率
	 */
	private static final double INFLATION_RATE = 0.1;
	
	/**
	 * 
	 * @param cycleIn
	 * @param cycle	 
	 * @param cycleRoi
	 */
	public Way(double cycleIn,int cycle,double cycleRoi) {
		super();
		this.cycleIn = cycleIn;
		this.cycleRoi = cycleRoi;
		this.cycle = cycle;
	}
	public double getResult() {
		return result;
	}
	private void setResult(double result) {
		this.result = result;
	}
	
	public double calcNCycleAfter(){
		this.result = calcNCycleAfter(this.cycle,this.cycleIn,this.cycleRoi);
		return result;
	}
	public double calcNCycleRate(){
		
		long rs = Math.round(this.result);
		double rate = Math.round(rs*100/(this.cycleIn*this.cycle));
		System.out.println("第"+cycle+"次后："+rs + "    总收益率   " +rate + "%");
		System.out.println();
		return rate;
	}
}
