package curriculum_B;

import java.util.Random;
// 一旦、BufferedReaderクラスのオブジェクトに変換して一行にまとめて読み込む
//import java.io.BufferedReader;
// 入力文字列を取得するため
//import java.io.InputStreamReader;
// 標準入力を取得するためインポート
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// // Scannerクラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);		
		// Scannerクラスのインスタンスから入力内容を取得する
		String input_text = scanner.nextLine();
		// カンマ「、」で区切り配列に格納する
		String[] product = input_text.split("、");
		
		// Randomクラスのインスタンスを作成し、変数randomに代入する
		Random random = new Random();
		// 乱数の宣言
		int r = 0;
		// キーボードから入力した商品をiに一時的に代入
		for (String i : product) {
			// 0~11までの乱数を生成し変数rに代入する
			 r = random.nextInt(12);
//			 
			// 入力した商品がcaseのどれかに一致した場合、シスアウトで表示させる 
			switch(i) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(i + "の残り台数は"+ r + "台です");
				break;
			// 入力した商品がテレビかディスプレイの場合、同じ扱いにする
			case "テレビ":
			case "ディスプレイ":
				// テレビの出力：最大個数11からディスプレイを引いた値
				String tv = i + "の残り台数は" + (11 - r) +"台です";
				// ディスプレイの出力：上記の差額
				String display = i + "の残り台数は" + (r) + "台です";
				String result = i == "テレビ" ? tv: display;
				System.out.println(result);
//				if (i == "テレビ") {
//					System.out.println(11 - r);
//				} else {
//					System.out.println(r);
//				}
				break;
			
			// その他の商品を入力された場合の表示
			case "その他商品":
			default:
				System.out.println("『受け取った値』は指定の商品ではありません");
			}
		}
		scanner.close();
	}

}
