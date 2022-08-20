package file_io_stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) {
		// FileReader trong java
		// chuyen doc static file, doc tung ky tu 1 (16 bite)
		File file = new File("test.txt");
		FileReader fileReader;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(file);
			buffer = new BufferedReader(fileReader);
			String lineString;
//			System.out.println(lineString);
			while((lineString = buffer.readLine()) != null) {
				System.out.println(lineString);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (buffer != null) {
				try {
					buffer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		// Ngoai ra con BuffreadInputStream ket hop vs InputStreamReader
		// case nay toc do doc ghi nhanh nhat.
	}

}
