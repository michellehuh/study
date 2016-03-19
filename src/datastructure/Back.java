package datastructure;

import java.util.ArrayList;

import module.MyArrayPrinter;

public class Back implements MyListInterface{

	@Override
	public void remove(ArrayList<String> list) {
		if (list.size()>0)
			System.out.println(list.remove((list.size()-1))+" 삭제됨");
		MyArrayPrinter.print(list);
		return;
	}

	@Override
	public void add(ArrayList<String> list, String str) {
		if(list.add(str))
			System.out.println(str+" 추가됨");
		MyArrayPrinter.print(list);
	}

}
