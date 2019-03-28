package com.company.section1;
public class myMinister
{
	public static void main(String[] args)
		{
			for(int day=0;day<3;day++)
				{
					myEmperor emperor=myEmperor.getInstance();
					emperor.say();//the same emperor
				} 
		}
} 

