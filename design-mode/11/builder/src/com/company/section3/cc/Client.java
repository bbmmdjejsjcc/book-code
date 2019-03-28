package com.company.section3;
public class Client
{
	public static void main(String[] args)
		{
			Director director=new Director();

			for(int i=0;i<10000;i++)
				{
					director.getABenzModel().run();
				}
		}
}
