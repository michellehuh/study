package datastructure;

import java.util.ArrayList;

import module.MyArrayPrinter;

public class Front implements MyListInterface
{

	@Override
	public void remove(ArrayList<String> list) {
		if (list.size()>0)
			System.out.println(list.remove(0)+" 삭제됨");
		MyArrayPrinter.print(list);
	}

	@Override
	public void add(ArrayList<String> list, String str) {
		list.add(0, str);
		System.out.println(str+" 추가됨");
		MyArrayPrinter.print(list);
	}


}
