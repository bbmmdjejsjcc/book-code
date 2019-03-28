package com.company.section2;
public class Client
{
	public static void main(String[] args)
		{
			Invoker xiaoSan=new Invoker();
			System.out.println("client need to delete a page");

			Command command=new DeletePageCommand();

			xiaoSan.setCommand(command);
			xiaoSan.action();
		}
}
