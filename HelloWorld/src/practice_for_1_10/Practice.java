/*
問題.for文を使用し、以下のプログラムを作成してください。
	①変数iに1を代入
	②変数iに2ずつ足す処理を10回繰り返す。
		出力結果：3
				5
				7
				9
				・
				・
				・
				21
*/
package practice_for_1_10;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// *①変数iに1を代入する*
		int i = 1 ;
		// *②初期化色に「3」代入、繰り返しの回数を指定、2ずつ足す処理*
		for (i = 3; i < 22; i +=2){
		System.out.println(i);
		}
	}

}
