package com.company.section1;
public class HummerH1Model extends HummerModel
{
	private boolean alarmFlag=true;
	public void alarm()
		{
			System.out.println("H1 alarm...");
		}

	public void engineBoom()
		{
			System.out.println("H1 enginBoom...");
		}

	public void start()
		{
			System.out.println("H1 start...");
		}

	public void stop()
		{
			System.out.println("H1 stop...");
		}

	protected boolean isAlarm()
		{
			return this.alarmFlag;
		}

	public void setAlarm(boolean isAlarm)
		{
			this.alarmFlag=isAlarm;
		}
}