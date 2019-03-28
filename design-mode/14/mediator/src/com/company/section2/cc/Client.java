package com.company.section2;
public class Client
{
	public static void main(String[] args)
		{
			AbstractMediator mediator=new mediator();
			System.out.println("purchase person buy computer");
			Purchase purchase=new Purchase(mediator);
			purchase.buyIBMcoputer(100);
		}
}
