package datastructure;

import datastructure.list.MyGuestList;
import datastructure.model.Guest;
import module.MyInputReader;

public class Main {

	public static void main(String[] args) 
	{
		MyGuestList myGuestList = new MyGuestList(MyInputReader.readInt("max no of guests "));
		
		while(myGuestList.hasEmptySlot())
		{
			try 
			{
				myGuestList.add(new Guest(MyInputReader.readString("name ")));
			} 
			catch (Exception e) {e.printStackTrace();}
			myGuestList.printCurrentWaitList();
		}
		
		while(myGuestList.hasNextGuest())
		{
			try 
			{
				myGuestList.process();
			} 
			catch (Exception e) {e.printStackTrace();}
			myGuestList.printCurrentWaitList();
		}
	}

}
