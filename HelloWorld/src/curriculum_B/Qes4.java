package curriculum_B;
//Objectsクラスをインポートする（nullチェックのため）
import java.util.Objects;
// 標準入力を取得するため、Scannerクラスをインポート
import java.util.Scanner;
import java.util.regex.Matcher;
// 正規表現を使うため、Patternクラスをインポート
import java.util.regex.Pattern;
public class Qes4 {

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


	}

}
