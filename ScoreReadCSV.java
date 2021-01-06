package filewriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ScoreReadCSV {

	public static void main(String[] args) {

		String score = getCSV();
		System.out.println(score);
		String[] scores = getCSVArray(score);
		int total = getTotal(scores);
		double avg=total/scores.length;//合計÷スコアの数
		showResult(total,avg);

	}

	//文字列として取ってくる
	public static String getCSV() {

		String score = null;//取ってきた文字列が入る
		File file = new File("D:/java/Score.csv");//ファイルオープン

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			score = br.readLine();//CSVファイルから一行とってくる。一行だけなので繰り返しする必要なし
			br.close();//閉める
		} catch (IOException e) {
			System.out.println(e);
		}
		return score;
	}

	//文字列をひとつずつ分ける
	public static String[] getCSVArray(String score) {
		String[] scores = score.split(",");
		return scores;

	}

	//合計を出す
	public static int getTotal(String scores[]) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			int num = Integer.parseInt(scores[i]);
			sum += num;
		}
		return sum;
	}

	//結果表示
	public static void showResult(int sum,double avg) {
		System.out.println("合計は：" + sum);
		System.out.println("平均は：" + avg);

	}
}
