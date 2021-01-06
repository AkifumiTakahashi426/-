package filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {

		//File file = new File("D:/java/test.txt");
		String file = "D:/java/test.txt";//これでもいい
		try {

			FileWriter fw = new FileWriter(file);//file,trueにすると上書きじゃなくて追記になる
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < 10; i++) {
				bw.write("[" + i + "]");
				bw.newLine();
			}
			bw.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
