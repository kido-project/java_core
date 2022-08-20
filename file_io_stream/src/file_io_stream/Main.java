package file_io_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "test.txt";
		File file = new File(fileName);
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String lineString = scanner.nextLine();
				System.out.println(lineString);
			}
			scanner.close();
			// lam viec xong phai dong file,
			// trong TH lam viec voi nhieu file ma k dong se gay ton bo nho
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// FILESTREAM
		String fileName2 = "output.bin";
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName2); // doc theo kieu nhi phan
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // ghi
			objectOutputStream.writeInt(1215);
			objectOutputStream.writeInt(1996);
			objectOutputStream.writeInt(1997);
			objectOutputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finish");
		}

		try {
			FileInputStream fileInputStream = new FileInputStream(fileName2);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			int index = objectInputStream.readInt();
			System.out.println(index);
			double indexD = objectInputStream.readDouble();
			System.out.println(indexD);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
