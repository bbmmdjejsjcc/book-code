package com.company.section1;
public class HumanFactory extends AbstractHumanFactory
{
	public <T extends Human> T createHuman(Class<T> c)
		{
			Human human=null;
			try
				{
					human=(Human)Class.forName(c.getName()).newInstance();
				}
			catch (Exception e)
				{
					System.out.println("create man error");
				}

			return (T)human;
		}
}