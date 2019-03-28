package com.company.section3;
public class Client
{
	public static void main(String[] args)
		{
			Boy boy=new Boy();
			Caretaker caretaker=new Caretaker();
			boy.setState("The mood is great");
			System.out.println("boy's now mood is;");
			System.out.println(boy.getState());

			caretaker.setMemento(boy.createMemento());//record the state of now

			boy.changeState();
			System.out.println("\nboy's state after catach the girl");
			System.out.println(boy.getState());

			boy.restoreMemento(caretaker.getMemento());//restore the state
			System.out.println("\nthe boy's state after restore");
			System.out.println(boy.getState());
			
		}
}
