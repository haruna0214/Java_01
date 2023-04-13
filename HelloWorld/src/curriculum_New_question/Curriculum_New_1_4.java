package curriculum_New_question;

public class Curriculum_New_1_4 {
	// Q1 下記9個をクラス変数として宣言のみしてください
	// Q1 バイト型
	public static byte a;
	// Q1 短整数型
	public static short b;
	// Q1 整数型
	public static int c;
	// Q1 長整数型
	public static long d;
	// Q1 単精度浮動小数点数型
	public static float e;
	// Q1 倍精度浮動小数点数型
	public static double f;
	// Q1 文字型
	public static char g;
	// Q1 文字列型
	public static String h;
	// Q1 ブーリアン型 
	public static boolean i;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	    // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		// バイト型
		a = 0;
		// 短整数型
		b = 0;
		// Q1 整数型
		c = 0;
		// Q1 長整数型
		d = 0;
		// 単精度浮動小数点数型
		e = 0.0F;
		// Q1 倍精度浮動小数点数型
		f = 0.0;
		// Q1 文字型
		g = '\u0000';
		// Q1 文字列型
		h = null;
		// Q1 ブーリアン型 
		i = false;
	    
		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください
	     // ・バイト型                 10
		a = 10;
	     // ・短整数型                 100
		b = 100;
	     // ・整数型                	 1000
		c = 1000;
	     // ・長整数型                 10000
		d = 10000;
	     // ・単精度浮動小数点数型   	 9.5
		e = 9.5F;
	     // ・倍精度浮動小数点数型		 10.5
		f = 10.5;
	     // ・文字型                   a
		g = 'a';
	     // ・文字列型              	 ハロー
		h = "ハロー";
	     // ・ブーリアン型          	 true
	    i = true;
	    
	    // Q4 下記の通りにコンソール出力されるようにしてください
	    // 必ず変数を使用すること
	     // 11110
	    System.out.println( a + b + c + d );
	     // 20.0
	    System.out.println(f + 9.5);
	     // a ハロー true
	    System.out.println(g + h + i);
	     // 11130.0      数字を全て足す
	    System.out.println(a + b + c + d + e + f);
	     // 10000000000     小数点以外の数字を全てかける
	    System.out.println( a * b * c * d );
	     // 0.105    10.5割る100をする
	    System.out.println( f / 100 );
	     // -90      10引く100をする
	    System.out.println( a - 100 );
   	 
   	// Q5 
   	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
   	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

	}

}
