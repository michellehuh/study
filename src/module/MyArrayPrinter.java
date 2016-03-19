package module;

import java.util.ArrayList;

public class MyArrayPrinter {
	
	public static void print(ArrayList<String> list){
		if(list.size()==0)
		{	
			System.out.println("남은 사람 없음");
			return;
		}
		
		String str = "{";
		for (int i=0, n=list.size(); i<n; i++)
		{
			str += list.get(i);
			if (i<n-1)
				str += ", ";
			else
				str += "}";
		}
		System.out.println(str);
	}

}
