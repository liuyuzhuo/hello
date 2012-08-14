package com.yl.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(eat(1,10));
	}
	private static int eat(int s,int day){
		day --;
		if(day>0){
			return eat((s+1)*2,day);
		}
		System.out.println("qqqq");
		return s;
	}

}
