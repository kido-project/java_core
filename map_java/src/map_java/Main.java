package map_java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// Doi tuong map
//		Map<Integer, String> studentMap = new HashMap<Integer, String>(); map la interface
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		studentMap.put(1, "A");
		studentMap.put(2, "A2");
		studentMap.put(3, "A3");
		studentMap.put(4, "A4");
		studentMap.put(5, "A5");
//		System.out.println(studentMap);
//		for (Map.Entry<Integer, String> student : studentMap.entrySet()) {
//			System.out.println(student.getKey() + "---" + student.getValue());
//		}
		if (studentMap.containsKey(3)) {
			studentMap.put(3, "A33"); // overwrite
		}
//		System.out.println(studentMap);

		// HASHMAP, LINKEDHASHMAP, TREEMAP, HASHTABLE
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		Map<Integer, String> hashTable = new Hashtable<Integer, String>();
//		testMap(hashMap);  // ngau nhien khong co thu tu
//		testMap(linkedHashMap); // put vao nhu nao lay ra nhu the
//		testMap(treeMap); // sap xep theo key, neu la object tu tao thi can co phuong thuc comparable hoac comparator de sort.
		testMap(hashTable); // su dung trong lap trinh da luong, it su dung.
	}

	public static void testMap(Map<Integer, String> testMap) {
		testMap.put(12, "B");
		testMap.put(2, "B2");
		testMap.put(13, "B3");
		testMap.put(64, "B4");
		testMap.put(95, "B5");
		testMap.put(26, "B6");
		testMap.put(17, "B7");
		testMap.put(48, "B8");
		testMap.put(59, "B9");
		testMap.put(100, "B10");

		for (Integer key : testMap.keySet()) {
			String valueString = testMap.get(key);
			System.out.println(key + "---" + valueString);
		}
	}
}
