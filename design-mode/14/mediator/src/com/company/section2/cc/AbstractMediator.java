package com.company.section2;
public abstract class AbstractMediator
{
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	public AbstractMediator()
		{
			purchase=new Purchase(this);
			sale=new Sale(this);
			stock=Stock(this);
		}

	public abstract void execute(String str,Object...objects);
}
