package com.company.section2;
public class Client
{
	public static void main(String[] args)
		{
			IGamePlayer player=new GamePlayer("zhangsan");
			IGamePlayer proxy=new GamePlayerProxy(player);
		}
}
