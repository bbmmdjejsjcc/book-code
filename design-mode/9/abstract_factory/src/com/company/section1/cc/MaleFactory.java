package com.company.section1;
public class MaleFactory implements HumanFactory
{
	public Human createBlackHuman()
		{
			return new MaleBlackHuman();
		}

	public Human createWhiteHuman()
		{
			return new MaleWhiteHuman();
		}

	public Human createYellowHuman()
		{
			return new MaleYellowHuman();
		}
}