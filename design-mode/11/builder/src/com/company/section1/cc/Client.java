package com.company.section1;
import java.util.ArrayList;
public class Client
{
	public static void main(String[] args)
		{
			BenzModel benz=new BenzModel();
			ArrayList<String> sequence=new ArrayList<String>();
			sequence.add("engine boom");
			sequence.add("start");
			sequence.add("stop");
			benz.setSequence(sequence);
			benz.run();
		}
}
