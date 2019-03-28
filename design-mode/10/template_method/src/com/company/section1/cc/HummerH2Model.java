package com.company.section1;
public class HummerH2Model extends HummerModel
{
	public void alarm()
		{
			System.out.println("H2 alarm...");
		}

	public void engineBoom()
		{
			System.out.println("H2 enginBoom...");
		}

	public void start()
		{
			System.out.println("H2 start...");
		}

	public void stop()
		{
			System.out.println("H2 stop...");
		}

	protected boolean isAlarm()
		{
			return false;
		}
}