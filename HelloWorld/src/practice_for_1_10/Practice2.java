/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
			2×1=2 2×2=4…2×9=18
			9×1=9 9×2=18…9×9=81
*/
package practice_for_1_10;

public class Practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//変数iに1から9の値を格納
		int[] number = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < number.length; i++) { //変数iに配列の要素数分繰り返される
			for(int j = 0; j < number.length; j++){ //変数jに配列の要素数分繰り返される
				// 配列[i番目]の値 × 配列[j番目]の値を変数kukuに代入する
				int kuku = number[i] * number[j];
				System.out.print(number[i] + "×" + number[j] + "=" + kuku + " ");
			}
		}
	}

}
