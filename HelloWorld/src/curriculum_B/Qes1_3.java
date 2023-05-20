package curriculum_B;
// Objectsクラスをインポートする（nullチェックのため）
import java.util.Objects;
import java.util.Random;
//標準入力を取得するため、Scannerクラスをインポート
import java.util.Scanner;
import java.util.regex.Matcher;
//正規表現を使うため、Patternクラスをインポート
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ~問1~
		// Scannerクラスをインスタンス化し、引数で標準入力(キーボードからの入力)System.inを指定する
		Scanner scan =  new  Scanner(System.in);  
		// キーボードに入力された内容(1行)をインスタンスから読み取る
		String inputText = scan.nextLine();
		// 上記読み取った値をコンソールに表示する
		System.out.println(inputText);
		// scanクラスのインスタンスをクローズする
		
		// コンソールに入力した文字列が10より大きい場合に「名前を10文字以内にして下さい」と表示させる
		if (inputText.length() > 10) {
		System.out.println("名前を10文字以内にして下さい。");
		// falseの場合、コンソールに入力した文字列が0以下またはnullの場合に
		// 「名前を入力してください」と表示させる
		} else if(inputText.length() <= 0 || Objects.isNull(inputText.length())) {
	    System.out.println("名前を入力してください。");
	    // 上記条件と一致しない（=正常に入力した）場合、
	    // ユーザー名「 入力したユーザー名 」を登録しました　と表示させる
		} else {
        System.out.println("ユーザー名" + inputText + "を登録しました。");
		}
		
		// ~問2~
		// Patternのcompileメソッドの引数に正規表現パターンを指定する（今回は半角英数字を判定する方法)
		Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$"); 
		// 
		String loginName = "abcd12345";
		// Patternクラスのmatcherメソッドに対象文字列を渡して、
		Matcher matcher = pattern.matcher(loginName);
		// 半角英数字以外で入力した場合、	「半角英数字のみで名前を入力してください」と表示させる
		if (matcher.find()) {
			System.out.println("半角英数字のみで名前を入力してください");
			// コンソールに入力した文字列が10より大きい場合に
			//「名前を10文字以内にして下さい」と表示させる
		} else if (inputText.length() > 10) {
			System.out.println("名前を10文字以内にして下さい。");
			// falseの場合、コンソールに入力した文字列が0以下またはnullの場合に
			//「名前を入力してください」と表示させる
		} else if(inputText.length() <= 0 || Objects.isNull(inputText.length())) {
			System.out.println("名前を入力してください。");
			// 上記条件と一致しない（=正常に入力した）場合、
			// ユーザー名「 入力したユーザー名 」を登録しました　と表示させる
		} else {
			System.out.println("ユーザー名" + inputText + "を登録しました。");
		}
		
		
		// ~問3~
		// じゃんけんに勝つまでループさせるため、無限ループのwhileを使う
		while (true) {
			// String型変数jankenに配列を代入
			String[] janken = {"グー","チョキ","パー"};
			System.out.println("じゃんけんの手を数字で入力して下さい");
			System.out.println("0がグー、1がチョキ、2がパー");
			// キーボードに入力された内容(1行)を変数myHandに代入する
			int myHand	= scan.nextInt();
			// jankenの引数に入力されたmyHand変数を入れ出力させる
			String my = janken[myHand];
			System.out.println(my);
			
			// コンピュータの手も「0はグー、1：チョキ、2：パー」
			// コンピュータの手を取得するため、Randomクラスのインスタンスを作って、変数randomに代入
			Random random = new Random();
			// 乱数で生成された数値を代入する
			int computer = random.nextInt(3);
			// 生成された乱数をjankenのインデックス番号で指定して代入する
			String computerHand = janken[computer];
			
			System.out.println(inputText + "の手は・・・" + my);
			System.out.println("コンピュータの手は・・・" + computerHand);
			// 勝つまでにかかった回数を表示させるために変数を用意
			int count = 1;
			if (myHand == 0 && computer == 1 || myHand == 1 && computer == 2 || myHand == 2 && computer == 0) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				count++;
				System.out.println("勝つまでにかかった合計回数は" + count++ + "回です");
				break;
			} else if(myHand == 1 && computer == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次に繋がるチャンスです！");
				System.out.println("ネバーギブアップ");
				continue;
			} else if(myHand == 2 && computer == 1) {
				System.out.println("俺の勝ち");
				System.out.println("たかがじゃんけん、そう思ってないですか");
				System.out.println("それやったら次も俺が勝ちますよ");
				continue;
			} else if(myHand == 0 && computer == 2) {
				System.out.println("俺の勝ち");
				System.out.println("なんで負けたか、明日まで考えといて下さい");
				System.out.println("そしたら何かが見えてくるはずです");
				continue;
			} else if(myHand == computer) {
				System.out.println("DRAW あいこ　もう一回しましょう！");
				continue;
			}
			
		}
		
	}

}
