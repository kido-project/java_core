package wrapper_autobox_unbox;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray = new int[10];
		String [] stringArray = new String[10];
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> stringList = new ArrayList<String>();
		
		// can not be use it
		// ArrayList<int> intList = new ArrayList<int>();
		// ArrayList<double> doubleList = new ArrayList<dobule>();
		
		// int, double, float,... is PRIMITIVE DATA TYPE: du lieu nguyen thuy
		// Integer, Double, Float is WRAPPER CLASS: lop boc
		Integer integerAuto = 5; // autoboxing
		for (int i = 0; i < 10; i++) {
			intList.add(Integer.valueOf(i)); 
			intList.add(i); //boxing or autoboxing
			int intParam = new Integer(5); //unboxing
		}
		
		for (Integer integer : intList) {
			System.out.println(integer.intValue()); 
		}
	}

}
