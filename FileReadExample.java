package filewriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) {
		try {

			//読み込み準備
			File file = new File("D:/java/testcode.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			//読み込んだ文字列の格納するための変数
			String s;

			//文字列がなくなるまで読み込む
			while((s = br.readLine())!=null) {
				System.out.println(s + "を読み込みました");
			}
			br.close();
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
