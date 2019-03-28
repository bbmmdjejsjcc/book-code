package com.company.section3;
public interface Observable
{
	public void addObserver(Observer observer);
	public void deleteObserver(Observer observer);
	public void notifyObservers(String context);
}
