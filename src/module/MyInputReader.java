package module;

import java.util.Scanner;

public class MyInputReader {
	
	private Scanner sc = new Scanner(System.in);
	
	public int readInt(String var){
		int result = 0;
		
		while(true)
		{
			System.out.print(var+": ");
			if(sc.hasNextInt())
			{
				result = sc.nextInt();
				break;
			}
			sc.nextLine();
		}
		return result;
	}
	
	public String readString(String var){
		
		System.out.print(var+": ");
		String result = sc.next();
		
		return result;
	}
}
