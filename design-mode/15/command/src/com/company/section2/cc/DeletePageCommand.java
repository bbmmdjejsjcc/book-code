package com.company.section2;
public class DeletePageCommand extends Command
{
	public void execute()
		{
			super.pg.find();
			super.rg.delete();
			super.rg.plan();
		}
}