package curriculum_B;
// Objectsクラスをインポートする（nullチェックのため）
import java.util.Objects;
// パッケージをインポートする
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// scanクラスをインスタンス化し、引数で標準入力System.inを指定する
		Scanner scan =  new  Scanner(System.in);  
		// 入力された内容をインスタンスから取得する
		String inputText = scan.nextLine();
		// 入力した内容をコンソールに表示する
		System.out.println(inputText);
		// scanクラスのインスタンスをクローズする
		scan.close();
		
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
	}

}
