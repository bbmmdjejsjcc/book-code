package com.company.section2;
public class Mediator extends AbstractMediator
{
	public void execute(String str, Object...objects)
		{
			if(str.equals("purchase.buy"))
				{
					this.buyComputer((Integer)objects[0]);
				}
		}
}