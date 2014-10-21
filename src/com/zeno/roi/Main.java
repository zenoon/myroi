package com.zeno.roi;

import com.zeno.roi.way.Bank;
import com.zeno.roi.way.BaoBao;
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
		
		
		int cycle = 120;//10年
		int cycleIn = 10000;
		int per = 12;//年=1   月=12   天=360
		//股市
		Way stock = new Stock(cycle,cycleIn,per);
		stock.calcNCycleAfter();
		stock.calcNCycleRate();
				
		cycle = 10;
		cycleIn = 120000;
		//银行定期
		Way bank = new Bank(cycle,cycleIn);
		bank.calcNCycleAfter();
		bank.calcNCycleRate();
		
		cycle = 360;
		cycleIn = 120000;
		per = 360;
		//宝宝理财
		Way baobao = new BaoBao(cycle,cycleIn,per);
		baobao.calcNCycleAfter();
		baobao.calcNCycleRate();
		
		cycle = 10;
		cycleIn = 120000;
		//全款房产
		Way house = new HouseLoan(cycle,cycleIn);
		house.calcNCycleAfter();
		house.calcNCycleRate();
		
		cycle = 10;
		cycleIn = 120000;
		//贷款房产
		Way houseLoan = new HouseLoan(cycle,cycleIn);
		houseLoan.calcNCycleAfter();
		houseLoan.calcNCycleRate();
		
	}

}
