package com.zeno.roi;

import com.zeno.roi.way.Bank;
import com.zeno.roi.way.House;
import com.zeno.roi.way.Stock;
import com.zeno.roi.way.Way;
/**
 * Ö÷·½·¨
 * @author zeno
 *
 */
public class Main {

	public static void main(String[] args) {
		int cycle = 120;
		int cycleIn = 10000;
		Way stock = new Stock(cycle,cycleIn);
		stock.calcNCycleAfter();
		stock.calcNCycleRate();
				
		cycle = 10;
		cycleIn = 120000;
		Way bank = new Bank(cycle,cycleIn);
		bank.calcNCycleAfter();
		bank.calcNCycleRate();
		
		cycle = 10;
		cycleIn = 120000;
		Way house = new House(cycle,cycleIn);
		house.calcNCycleAfter();
		house.calcNCycleRate();
	}

}
