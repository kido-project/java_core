package file_io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(1, "Mi1");
		Student std2 = new Student(2, "Mi2");
		Student std3 = new Student(3, "Mi3");
		String fileName = "data.bin";
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			objectOutputStream.writeObject(std1);
			objectOutputStream.writeObject(std2);
			objectOutputStream.writeObject(std3);
			objectOutputStream.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
			Student student = (Student) objectInputStream.readObject();
			System.out.println(student);
			objectInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
