package com.company.section1;
public class myEmperor
{
	private static final myEmperor emperor=new myEmperor();//init an emperor
	private myEmperor()  //don't want to say second emperor
		{
		}

	public static myEmperor getInstance()
		{
			return emperor;
		}

	public static void say()
		{
			System.out.println("i am emperor chengchao");
		}
}
