package com.company.section3;

public class WangSi implements Observer{
	

	public void update(String str){
		System.out.println("wangsi:lisi is action...");
		this.cry(str);
		System.out.println("wagnsi:crying\n");
	}
	
	private void cry(String context){
		System.out.println("wangsi:because"+context+",so i feel sad");
	}
}

