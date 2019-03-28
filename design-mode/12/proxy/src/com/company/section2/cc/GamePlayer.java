package com.company.section2;
public class GamePlayer implements IGamePlayer
{
	private string name="";

	public GamePlayer(String _name)
		{
			this.name=_name;
		}

	public void killBoss()
		{
			System.out.println(this.name+"killing boss");
		}

	public void login(String user,String password)
		{
			System.out.println("user:"+user+this.name);
		}

	public void upgrade()
		{
			System.out.println(this.name+"upgrade 1");
		}
}
