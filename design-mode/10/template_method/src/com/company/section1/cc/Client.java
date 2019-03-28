package com.company.section1;
public class Client
{
	public static void main(String[] args)
		{
			HummerH1Model h1 = new HummerH1Model();
			h1.setAlarm(false);
			h1.run();

			h1.setAlarm(true);
			h1.run();
		}
}
