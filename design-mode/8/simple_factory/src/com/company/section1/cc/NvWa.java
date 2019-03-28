package com.company.section1;
public class NvWa
{
	public static void main(String[] args)
		{
			AbstractHumanFactory YinYangLu=new HumanFactory();
			System.out.println("\nfirst create white man");
			Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
			whiteHuman.getColor();
			whiteHuman.talk();
			
			System.out.println("\nsecond create black man");
			Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
			blackHuman.getColor();
			blackHuman.talk();
			
			System.out.println("\nthird create yellow man");
			Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
			yellowHuman.getColor();
			yellowHuman.talk();
		}
}
