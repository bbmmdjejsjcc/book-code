package com.company.section1;
public class NvWa
{
	public static void main(String[] args)
		{
			HumanFactory maleHumanFactory=new MaleFactory();
			HumanFactory femaleHumanFactory=new FemaleFactory();

			Human maleYellowHuman=maleHumanFactory.createYellowHuman();
			Human femaleYellowHuman=femaleHumanFactory.createYellowHuman();

			femaleYellowHuman.getColor();
			femaleYellowHuman.talk();
			femaleYellowHuman.getSex();
		}
}
