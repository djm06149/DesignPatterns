package programming.practice.decoratortest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		int c;
		try {
			InputStream in = new BufferedInputStream(
					new FileInputStream("c:/test.txt")
					);
			
			while((c = in.read()) > 0) {
				System.out.println((char)c);
			}
			
			in.close();				
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
