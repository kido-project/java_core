package linked_list_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// PART 2: Comparator
class ReverseAlphabetOrderComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
//		return arg0.compareTo(arg1);
		return -arg0.compareTo(arg1); // or
	}

}

class ReverseAlphabetOrderStringlength implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return arg0.length() - arg1.length();
	}

}

class Student {
	private long id;
	private int age;
	private String name;

	public Student(long id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}

class AgeReverseComparator implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		return (std1.getAge() - std2.getAge());
	}
	
}
//PART 2: Comparator

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// quan ly theo cac node (truoc va sau) vua co tinh chat cua list va queue
		// insert nhanh hon array list
		// arrayt list search nhanh hon, linked list phai duyet
		// linked list ton nhieu bo nho hon, do array list chi quan tam den
		// linked list giu ca gia tri cac bo nho truoc va sau node do

		LinkedList<String> names = new LinkedList<String>();
		names.add("Viet");
		names.add("Viet1");
		names.add("Viet2");
		names.add("Viet3");
		names.add("Viet4");

		// add into the position
		names.addFirst("Mi To");
		names.addLast("Mi To2");
		names.add(3, "Mi To3");
//
//		for (String name : names) {
//			System.out.println(name);
//		}

		// PART 1: Linked List vs Array List
		long n = (long) 1E7;

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		long milisecond = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			arrayList.add(i);
		}
		long milisecondEnd = System.currentTimeMillis();
		System.out.println("array list take: " + (milisecondEnd - milisecond));

		System.out.println("-----------------");

		LinkedList<Integer> interLinkedList = new LinkedList<Integer>();
		milisecond = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			interLinkedList.add(i);
		}
		milisecondEnd = System.currentTimeMillis();

		System.out.println("linked list take: " + (milisecondEnd - milisecond));

		System.out.println("-----------------");

		milisecond = System.currentTimeMillis();
		arrayList.get((int) n / 2);
		milisecondEnd = System.currentTimeMillis();
		System.out.println("array list take: " + (milisecondEnd - milisecond));

		System.out.println("-----------------");

		milisecond = System.currentTimeMillis();
		interLinkedList.get((int) n / 2);
		milisecondEnd = System.currentTimeMillis();
		System.out.println("linked list take: " + (milisecondEnd - milisecond));
		// PART 1: Linked List vs Array List

		// PART 2: Comparator
		Collections.sort(names);
		Collections.sort(names, new ReverseAlphabetOrderComparator());
		Collections.sort(names, new ReverseAlphabetOrderStringlength());
		Collections.sort(names, Collections.reverseOrder());
		Collections.sort(interLinkedList, new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0 - arg1;
			}

		});
		for (String name : names) {
			System.out.println(name);
		}

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, 18, "AAA"));
		studentList.add(new Student(2, 16, "BBB"));
		studentList.add(new Student(3, 15, "CCC"));
		studentList.add(new Student(4, 14, "DDD"));
		studentList.add(new Student(5, 13, "EEE"));
		studentList.add(new Student(6, 12, "FFF"));

		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student std1, Student std2) {
				return -(std1.getAge() - std2.getAge());
			}
		});
		Collections.sort(studentList, new AgeReverseComparator());
//		for (Student student : studentList) {
//			System.out.println(student);
//		}
		
		// PART 2: Comparator
		
		// PART 3: Comparable
		List<Human> humanList = new ArrayList<Human>();
		humanList.add(new Human(1, 18, "AAA"));
		humanList.add(new Human(2, 16, "BBB"));
		humanList.add(new Human(3, 15, "CCC"));
		humanList.add(new Human(4, 14, "DDD"));
		humanList.add(new Human(5, 13, "EEE"));
		humanList.add(new Human(6, 12, "FFF"));
		
		Collections.sort(humanList); 
		// doi tuong phai implement interface Comparable moi co the su dung phuong thuc Collections sort
		// Cac doi tuong nguyen thuy thi co the su dung duoc luon.
		
		for (Human human : humanList) {
			System.out.println(human);
		}
		// So sanh:
		// comparable: java.lang: dinh nghia theo kieu sort tu nhien cua 1 Object, comparator: java.util, sap xep nhieu kieu, uyen hon
		// Comparable chi co the su dung 1 dieu kien de sort, con comparator thi nhieu dieu kien hon
		// Comparable viet vao class goc, con comparator co the viet o rac nhieu cac class
		// Comparable: Collections.sort(list), Comparator: Collections.sort(list, Comparator);
		// PART 3: Comparable
	}

}
