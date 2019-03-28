package com.company.section3;
public class LiSi implements Observer
{
	public void update(String str)
		{
			System.out.println("report to lisi");
			this.reportToQinShiHuang(str);
			System.out.println("report over,give them something reward");
		}

	private void reportToQinShiHuang(String reportContext)
		{
			System.out.println("boss Qin,hanfei has action:"+reportContext);
		}
}
