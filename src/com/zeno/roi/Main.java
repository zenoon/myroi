package com.zeno.roi;

import com.zeno.roi.way.Bank;
import com.zeno.roi.way.BaoBao;
import com.zeno.roi.way.House;
import com.zeno.roi.way.HouseLoan;
import com.zeno.roi.way.Stock;
import com.zeno.roi.way.Way;
/**
 * 主方法
 * @author zeno
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		int year = 20;//总共的投资年限
		Constant.isPrint = true;//是否打印详情
		int cycle,cycleIn,cycleCalc,per;
		

		//股市
//		cycle = year * Constant.MONTH;//10年，120月，3600天
//		cycleIn = Constant.MONEY;
//		per = Constant.MONTH;//用于换算年化收益率-》周期收益率
//		Way stock = new Stock(cycle,cycleIn,per);
//		stock.calcNCycleAfter();
//		System.out.print("【股票投资】【"+year+"年】");
//		stock.calcNCycleRate();
//		System.out.println();
		
		//银行定期				
		cycle = year;
		cycleIn = Constant.MONTH * Constant.MONEY;
		Way bank = new Bank(cycle,cycleIn);
		bank.calcNCycleAfter();
		System.out.print("【银行定期】【"+year+"年】");
		bank.calcNCycleRate();
		System.out.println();
		
		
		//宝宝理财
//		cycle = year * Constant.MONTH;//十二个月
//		cycleIn = Constant.MONEY;//每个月投入
//		cycleCalc = year * Constant.DAYS;//3600 天==10年
//		per = Constant.DAYS;//用于计算每天计算收益
//		Way baobao = new BaoBao(cycle,cycleIn,cycleCalc,per);
//		baobao.calcNCycleAfter();
//		System.out.print("【宝宝理财】【"+year+"年】");
//		baobao.calcNCycleRate();
//		System.out.println();

		//全款房产
		cycle = 1;//一次性投入
		cycleIn = year * Constant.MONTH * Constant.MONEY;//
		cycleCalc = year;//10年
		Way house = new House(cycle,cycleIn,cycleCalc);
		house.calcNCycleAfter();
		System.out.print("【全款房产】【"+year+"年】");
		house.calcNCycleRate();
		System.out.println();
		
		cycle = year;
		cycleIn = 120000;
		//贷款房产
//		Way houseLoan = new HouseLoan(cycle,cycleIn);
//		houseLoan.calcNCycleAfter();
//		houseLoan.calcNCycleRate();
//		System.out.println("贷款房产");
//		System.out.println();
		
	}

}
