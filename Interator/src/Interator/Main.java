package Interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Ant");
		animals.add("Rabit");

//		for (String string : animals) {
//			System.out.println(string);
//		}
		Iterator<String> iterator = animals.iterator();

//		String firstAnimal = iterator.next();
//		iterator.next();
//		iterator.next();
//		String nextAnimal = iterator.next();
//		System.out.println(firstAnimal);
//		System.out.println(nextAnimal);
		
		// vua duyet vua thao tac duoc.
		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
			String iString =  iterator.next();
			if(iString.equalsIgnoreCase("dog")) {
				iterator.remove();
			}
		}
		
		for (String string : animals) {
			if(string.equalsIgnoreCase("cat")) {
				animals.remove(string); // khong vua duyet vua xoa duoc, se loi exception
			}
		}
		
		for (String string : animals) {
			System.out.println(string);
		}
	}

}
