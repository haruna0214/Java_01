package curriculum_New_question;

public class Curriculum_New_1_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        //  好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』

        // ↓↓format↓↓
        // 「初めまして○○です」
        // 「年齢は○○歳です」
        // 「身長は○○cmです」
        // 「体重は○○kgです」
        // 「好きな食べ物は○○です」

    	// Q1を下記に記載
			String name = "山田太郎";
			System.out.println("初めまして" + name + "です");
	       
			String age = "18歳";
			System.out.println("年齢は" + age + "歳です");
			double height = 170.5;
			System.out.println("身長は" + height + "cmです");
	       
			double weight = 62.2;
			System.out.println("体重は" + weight + "kgです");

			String eat = "寿司";
			System.out.println("は" + eat + "です");

        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること

        // Q2を下記に記載
//		// BMI = 体重(Kg) × (身長(m))2
			double bmi = weight / ((height / 100) * (height / 100));
			System.out.println("BMIは" + bmi + "です");
		
    	    	
        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です

        // Q3を下記に記載
			name = "鈴木一郎";
			System.out.println("初めまして" + name + "です");
		       
			age = "24歳";
			System.out.println("年齢は" + age + "歳です");

			height = 168.5;
			System.out.println("身長は" + height + "cmです");
		       
			weight = 64.2;
			System.out.println("体重は" + weight + "kgです");

			eat = "オムライス";
			System.out.println("は" + eat + "です");
			
			bmi = 22.6;
			System.out.println("BMIは" + bmi + "です");

    	// ↓↓コンソール最終結果↓↓
    	
    	//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です

		
	}

}
