package filewriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayWriter {

	public static void main(String[] args) {
		//日付を作る（年月日日時）、todaySにString型で格納
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日　hh：mm：ss");
		String todayS = sdf.format(date);

		File file = new File("D:/java/testToday.txt");
		//現在の日時を出力
		//tryの中にファイル宣言とか書いちゃってもいい。
		try (FileWriter fw = new FileWriter(file,true);
				BufferedWriter bw = new BufferedWriter(fw);) {

			//FileWriter fw = new FileWriter(file);
			//BufferedWriter bw = new BufferedWriter(fw);//少量ならなくてもOK

			bw.write(todayS);
			bw.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
