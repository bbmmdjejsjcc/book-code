package com.company.section3;
import java.util.ArrayList;
public class HanFeiZi implements Observable,IHanFeiZi
{
	private ArrayList<Observer> observerList=new ArrayList<Observer>();

	public void addObserver(Observer observer)
		{
			this.observerList.add(observer);
		}

	public void deleteObserver(Observer observer)
		{
			this.observerList.remove(observer);
		}

	public void notifyObservers(String context)
		{
			for(Observer observer:observerList)
				{
					observer.update(context);
				}
		}

	public void haveBreakfast()
		{
			System.out.println("hanfeizi:begin eating...");
			this.notifyObservers("hanfeizi is eating");
		}

	public void haveFun()
		{
			System.out.println("hanfeizi:begin havefun...");
			this.notifyObservers("hanfeizi is having fun");
		}
}