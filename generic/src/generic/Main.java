package generic;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// PART I
		// BeforeDrag Java 1.5
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add("KKK");
		arrayList.add(5);

//		printDouble(arrayList); => loi bien dich

		// After 1.5

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(1);
		arrayList2.add(2);
		arrayList2.add(3);
//		arrayList2.add("KKK"); => bao loi cu phap luon
		arrayList2.add(5);

		printDouble(arrayList2);

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		System.out.println("------------------");

		// PART II
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'A', 'B', 'C', 'D', 'E' };

		printArray(intArray);
		System.out.println("------------------");
		printArray(charArray);

		// PART III
		System.out.println("------------------");
		List <Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle());
		drawShape(rectangles);
		System.out.println("------------------");
		List <Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle());
		drawShape(circles);
	}

	public static void printDouble(ArrayList<Integer> arrayList) {
		for (int objectInteger : arrayList) {
			System.out.println(objectInteger * 2);
		}
	}

	// PART II
	// function generic cho kieu mang
	public static <T> void printArray(T[] elements) {
		for (T t : elements) {
			System.out.println(t);
		}
	}

	// PART III
	public static void drawShape(List<? extends Shape> list) { // request tat ca cac class extends tu Shape
		for (Shape shape : list) {
			shape.draw();
		}
	}
}

// PART III
abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw rectangle");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw circle");
	}
}
