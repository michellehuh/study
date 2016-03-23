package datastructure.list;

import datastructure.model.Guest;

public class MyGuestList implements MyListInterface{
	
	private Guest[] guestList;
	private int MAX_GUEST;
	private int processQueue=0;
	private int waitQueue=0;
	

	public MyGuestList(int max_guest) 
	{
		MAX_GUEST = max_guest;
		this.guestList = new Guest[MAX_GUEST];
	}

	@Override
	public void add(Guest guest) throws Exception
	{
		System.out.println((guestList[waitQueue++] = guest).getName()+" added");;
	}

	@Override
	public void process() throws Exception
	{
			System.out.println(guestList[processQueue++].getName()+" done");
	}
	
	public boolean hasNextGuest()
	{
		return processQueue<MAX_GUEST;
	}
	
	public boolean hasEmptySlot()
	{
		return waitQueue<MAX_GUEST;
	}
	
	public int noOfGuestsWaiting()
	{
		return waitQueue-processQueue;
	}
	
	public void printCurrentWaitList()
	{
		System.out.print("names: { ");
		for (int i=processQueue; i<waitQueue; i++)
		{
			System.out.print("\""+guestList[i].getName()+"\"");
			
			if (i<(waitQueue-1))
				System.out.print(", ");
		}
		System.out.println(" }\n");
	}
}
