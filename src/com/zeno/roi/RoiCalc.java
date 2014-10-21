package com.zeno.roi;
/**
 * 
 * @author zeno
 * Ͷ�������ʼ�����
 * ������������롢��Ͷ�������� һ��������£�n�������
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
//		System.out.println("��"+cycles+"���"+rs + " ������" +rate);
//	}
	
	public static double calcNCycleAfter(int cycles,double cycleIn,double cycleRate){
		double now =  cycleIn;
		double next = 0;
		for(int i=1;i<cycles+1;i++){			
			
			next = calcNextYear(now,cycleRate) ;
			if(i<10 || i%10==0){
				System.out.print("��"+i+"��  --- ��"+Math.round(now)+" ��   "+Math.round(next));
				double rate = Math.round((next-(cycleIn*i))/(cycleIn*i)*100);
				System.out.println("�� Ŀǰ��������   " +rate +" %");
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
