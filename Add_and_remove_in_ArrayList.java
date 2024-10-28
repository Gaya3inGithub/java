package j20_Collection;

import java.util.ArrayList;

public class Add_and_remove_in_ArrayList {
public static void main(String[]args)
{
	ArrayList<String> list = new ArrayList<>();
	
	list.add("AAAAAAAA");
	list.add("BBBBBBBB");
	list.add("CCCCCCCC");
	list.add("GGGGGGGG");
	list.add(0,"LLLLLLLL");
	list.add("DDDDDDDD");
	list.add("EEEEEEEE");
	
	System.out.println("Original list: "+ list);
	System.out.println();
	list.remove("GGGGGGGG");
	list.remove(0);
	
	System.out.println("After removing: "+ list);
	System.out.println();
	
	System.out.println("Iterating through the elements:");
    for (String Alphabets : list) {
        System.out.println(Alphabets);
    }
    System.out.println();
	
	System.out.println("Iterating with index:");
	for(int i=0;i<list.size();i++)
	{
		System.out.println("Element at index " + i + ": " + list.get(i));
	}
}
}

