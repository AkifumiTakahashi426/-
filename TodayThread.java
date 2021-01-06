package filewriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayThread extends Thread {

	boolean stopper = true;

		public void stopper(boolean stopper) {
		this.stopper = stopper;
	}



	@Override
	public void run() {
		while (stopper) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日　hh：mm：ss");
			String todayS = sdf.format(date);
			File file = new File("D:/java/testToday.txt");

			try (FileWriter fw = new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(fw);) {

				//FileWriter fw = new FileWriter(file);
				//BufferedWriter bw = new BufferedWriter(fw);//少量ならなくてもOK

				bw.write(todayS);
				bw.newLine();

				bw.close();

			} catch (IOException e) {
				System.out.println(e);
			}

		}

	}

}
