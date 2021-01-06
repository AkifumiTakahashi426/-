package filewriter;

/*
日時データの書き出しを５秒ごとに繰り返す。
プログラムは一度実行すると停止させるまで永遠に繰り返す。
*/

import java.util.Scanner;

public class TodayWriter2 {

	public static void main(String[] args) {

		Scanner stop;
		TodayThread t = new TodayThread();
		t.start();

		stop = new Scanner(System.in);
		System.out.println("動かしているよ、とめたければエンター押してね：");


		///エンターキーを押すとセッターの行にいくので
		///セッターが実行されて、aaaがfalseに代わりスレッドが終わる。
		stop.nextLine();
		t.stopper(false);
		System.out.println("おわるど");

	}

}
