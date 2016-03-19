package module;

import java.util.Scanner;

public class MyReader {
	
	private Scanner sc = new Scanner(System.in);
	
	public int readInt(String var){
		int result = 0;
		
		while(true)
		{
			System.out.print(var+" 입력: ");
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
		
		System.out.print(var+" 입력: ");
		String result = sc.next();
		
		return result;
	}
}
