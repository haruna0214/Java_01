package test11;

public class Variable2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問１）
//		変数 x を宣言し、「3」を代入して下さい。
//		変数 x に自己代入を使って「20」を掛け算して下さい。
//		その後 x の値をコンソールに表示して下さい。
		int x = 3;
		x = x * 20;
		System.out.println(x);
		
//		問２）
//		以下のプログラムを作成してください。
//		①int 型の変数 i に 100 を代入する。
		int i = 100;
//		②インクリメント演算子を適用して数値を 1 増やす。
		i =  + ++i ;
//		③コンソールに変数 i の値を表示する。
		System.out.println(i);
//		④デクリメント演算子を適用して数値を 1 減らす。
		i = + --i;
//		⑤コンソールに変数 i の値を表示する。
		System.out.println(i);

//		問３）
//		下記の例のような文章をコンソールに出力して下さい。
//		但し、年齢の部分は乱数を使用し実行毎に結果が変わるようにして下さい。
//		※数字は0～100までの間で表示されるようにしてください。
//		例）
//		あなたの年齢を予想します。
//		あなたの年齢はおそらく〇〇歳ですね？
		double rand = Math.random() * 100 + 0;
		int number = (int)rand;
		System.out.println("あなたの年齢はおそらく" + number + "歳ですね？");
	}

}
