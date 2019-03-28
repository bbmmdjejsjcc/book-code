package com.company.section1;
public class FemaleFactory implements HumanFactory
{
	public Human createBlackHuman() //create black female
		{
			return new FemaleBlackHuman();
		}

	public Human createWhiteHuman() //create white female
		{
			return new FemaleWhiteHuman();
		}

	public Human createYellowHuman() //create yellow female
		{
			return new FemaleYellowHuman();
		}
}