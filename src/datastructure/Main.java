package datastructure;

import datastructure.list.MyGuestList;
import datastructure.model.Guest;
import module.MyInputReader;

public class Main {

	public static void main(String[] args) 
	{
		MyGuestList myGuestList = new MyGuestList(new MyInputReader().readInt("max no of guests "));
		
		while(myGuestList.hasEmptySlot())
			myGuestList.add(new Guest(new MyInputReader().readString("name ")));
		
		while(myGuestList.hasNextGuest())
			myGuestList.process();
		
	}

}
