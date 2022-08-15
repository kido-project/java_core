package set_java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>(); // sap xep theo kieu tu nhieu A-Z or 1-2-3...
//		Set<String> set1 = new LinkedHashSet<String>();
//		Set<String> set1 = new TreeSet<String>(); //tu dong sort theo comparable
		set1.add("pig");
		set1.add("dog");
		set1.add("human");
		set1.add("cat");
		set1.add("cat");
		set1.add("elephant");
		// cac phan tu trung se khong add them vao set
		System.out.println(set1);

		Set<String> set2 = new HashSet<String>(); // sap xep theo kieu tu nhieu A-Z or 1-2-3...
		set2.add("cat");
		set2.add("cat");
		set2.add("elephant");
		set2.add("cow");

		Set<String> set3 = new HashSet<String>(set2);

		System.out.println(set3);
		System.out.println(set2);
		set1.retainAll(set3); // phan tu trung
		set1.removeAll(set3); // xoa cac phan tu cua set3 trong set1
		System.out.println(set1);

		// PHAN II: EQUALS vs HASHCODE
		String s2 = new String("Hello");
		String s1 = new String("Hello");
		String s11 = new String("hello");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s11)); // false
		System.out.println(s1.equalsIgnoreCase(s11)); // true: khong phan biet hoa thuong

		String s3 = new String("Hello");
		String s4 = s3;
		System.out.println(s3 == s4); // true

		String s5 = "Hello";
		String s6 = "Hello";
		System.out.println(s5 == s6); // true

		Human h1 = new Human(1, 1, "A");
		Human h2 = new Human(1, 1, "A");
		System.out.println(h1.equals(h2)); // false if not use equals function in class
		Set<Human> humans = new HashSet<Human>();
		humans.add(h1);
		humans.add(h2);
		System.out.println(humans);
		// SET su dung equal vs hashCode de bo phan tu lap trong Set interface
	}
}
