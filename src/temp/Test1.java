package temp;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		
		int maxCustomers = 5;
		System.out.print("몇 명? ");
		
		try 
		{
			maxCustomers = sc.nextInt();
		}
		catch (Exception e)
		{
			maxCustomers = 5;
		}
		
		System.out.println("------------");
		
		for (int i=0; i<maxCustomers; i++)
		{
			System.out.print("이름입력: ");
			String name = sc.next();
			list.add(name);
		}
		
		System.out.println("------------");
		
		while(true)
		{
			System.out.print("앞[l]? 뒤[r]? : ");
			String dir = sc.nextLine();
			
			if (dir.equals("l"))
				System.out.println(list.remove(0)+" 삭제됨 ("+list.size()+"명 남음)");
			else if (dir.equals("r"))
				System.out.println(list.remove((list.size()-1))+" 삭제됨 ("+list.size()+"명 남음)");
			else
				System.out.println("잘 못 된 입력: "+dir);
			
			printNames(list);
			
			if (list.size()==0){
				System.out.println("------------");
				System.out.println("종료");
				break;
			}
		}
		
		
	}
	
	public static void printNames(ArrayList<String> list)
	{
		if(list.size()==0)
			return;
		
		String str = "���� �����: ";
		for (int i=0, n=list.size(); i<n; i++)
		{
			str += list.get(i);
			if (i<n-1)
				str += ", ";
		}
		System.out.println(str);
	}

}
