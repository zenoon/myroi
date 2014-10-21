package com.zeno.roi.way;

import com.zeno.roi.RoiCalc;

/**
 * @author zeno
 * ��ͬ��Ͷ�ʷ���Ļ���
 */
public class Way extends RoiCalc{
	
	/*
	 * ÿ��㶨Ͷ����ʽ�
	 */
	private double cycleIn ;
	/**
	 * N�������ʲ�
	 */
	private double result ;
	/**
	 * ÿ��㶨��Ͷ��������ROI
	 */
	private double cycleRoi ;
	/**
	 * �ƻ�Ͷ�ʵ�����
	 */
	private int cycle ;
	/**
	 * ÿ��㶨��ͨ��������
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
		System.out.println("��"+cycle+"�κ�"+rs + "    ��������   " +rate + "%");
		System.out.println();
		return rate;
	}
}
