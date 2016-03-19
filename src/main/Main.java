package main;

import java.util.ArrayList;

import datastructure.Back;
import datastructure.Front;
import module.MyReader;

public class Main {
	
	public static MyReader myReader = new MyReader();
	public static Back back = new Back();
	public static Front front = new Front();
	
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		int maxCustomers = myReader.readInt("최대사람 수");
		
		System.out.println("------------");
		
		for (int i=0; i<maxCustomers; i++)
		{
			back.add(list, myReader.readString("이름"));
		}
		
		System.out.println("------------");
		
		while(!list.isEmpty())
		{
			String dir = myReader.readString("앞[l], 뒤[r]:");
			
			if (dir.equals("l"))
				front.remove(list);
			else if (dir.equals("r"))
				back.remove(list);
			else
				System.out.println("입력값 에러: "+dir);
		}
		
		System.out.println("------------");
		System.out.println("종료");
	}
}
