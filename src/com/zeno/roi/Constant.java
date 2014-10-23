/**
 * 
 */
package com.zeno.roi;

/**
 * @author zeno
 * 常量
 */
public class Constant {

	/**
	 * 一年有多少个天
	 */
	public static final int YEAR_DAYS = 360;
	/**
	 * 一年有多少个月
	 */
	public static final int YEAR_MONTHS = 12;
	/**
	 * 一月有多少个天
	 */
	public static final int MONTH_DAYS = 30;
	/**
	 * 天
	 */
	public static final int DAY = 1;
	/**
	 * 每个月的固定投资金额
	 */
	public static final int MONEY = 10000;
	/**
	 * 换算百分比
	 */
	public static final int PERCENT = 100;
	/**
	 * 是否打印过程中的计算日志，如果设置为true，则打印阶段性的日志，不会打印全部日志
	 */
	public static boolean isPrint = false;
	/**
	 * 基本恒定的年通货膨胀率
	 */
	public static final double INFLATION_RATE = 0.05;
}
