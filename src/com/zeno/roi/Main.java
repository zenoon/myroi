package com.zeno.roi;

import com.zeno.roi.way.Bank;
import com.zeno.roi.way.BaoBao;
import com.zeno.roi.way.HouseLoan;
import com.zeno.roi.way.Stock;
import com.zeno.roi.way.Way;
/**
 * ������
 * @author zeno
 *
 */
public class Main {

	public static void main(String[] args) {
		
		
		int cycle = 120;//10��
		int cycleIn = 10000;
		int per = 12;//��=1   ��=12   ��=360
		//����
		Way stock = new Stock(cycle,cycleIn,per);
		stock.calcNCycleAfter();
		stock.calcNCycleRate();
				
		cycle = 10;
		cycleIn = 120000;
		//���ж���
		Way bank = new Bank(cycle,cycleIn);
		bank.calcNCycleAfter();
		bank.calcNCycleRate();
		
		cycle = 360;
		cycleIn = 120000;
		per = 360;
		//�������
		Way baobao = new BaoBao(cycle,cycleIn,per);
		baobao.calcNCycleAfter();
		baobao.calcNCycleRate();
		
		cycle = 10;
		cycleIn = 120000;
		//ȫ���
		Way house = new HouseLoan(cycle,cycleIn);
		house.calcNCycleAfter();
		house.calcNCycleRate();
		
		cycle = 10;
		cycleIn = 120000;
		//�����
		Way houseLoan = new HouseLoan(cycle,cycleIn);
		houseLoan.calcNCycleAfter();
		houseLoan.calcNCycleRate();
		
	}

}
