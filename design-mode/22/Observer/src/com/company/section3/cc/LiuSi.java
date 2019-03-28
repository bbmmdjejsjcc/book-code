package com.company.section3;

public class LiuSi implements Observer{
	
	public void update(String str){
		System.out.println("liusi:hanfeizi is action...");
		this.happy(str);
		System.out.println("liusi:fun\n");
	}
	
	private void happy(String context){
		System.out.println("liusi:because" +context+",so i feel happy" );
	}
}

