package com.company.section2;
public class Purchase extends AbstractColleage
{
	public Purchase(AbstractMediator _medeator)
		{
			super(_medeator);
		}

	public void buyIBMcoputer(int number)
		{
			super.mediator.execute("purchase.buy",number);
		}

	public void refuseBuyIBM()
		{
			System.out.println("stop buy IBM computer");
		}
}

