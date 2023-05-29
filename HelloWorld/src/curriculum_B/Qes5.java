package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		// TODO 自動生成されたメソッド・スタブ
		//変数numberに1から9の値を格納
//		int [] number = {1,2,3,4,5,6,7,8,9};
		int [] number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		// 外側のループが1回処理をする中で、内側のループが指定された回数分の処理を実行する
		// カウンタ変数jがnumberの数値より小さい場合に繰り返し処理を実行。
		for(int j = 0; j < number[8]; j++ ) {
			
			// // カウンタ変数iがnumberの数値より小さい場合に繰り返し処理を実行。
			for(int i = 0; i < 20; i++) {
				// number[j]とnumber[i]をかけ、変数kukuに代入する
				int kuku = number[i] * number[j];				
				String answer = String.format(" " + "%03d" + " " + "*" + " " + "%03d" + " " + "=" + " " + "%03d" + " ",number[i] ,number[j], kuku );
				
				// 縦棒||の表示について
				if (number[i] == 20) {
					System.out.print(answer);
				}else {
					System.out.print(answer + "||");
				}
//				for (int k = 0 ; k <= 9 ; k++) {
//					if(number[i] < 9){
//						System.out.print("");
//						break;
//					}
//				}
			}
			
			// jの1~9まで処理が終えたら改行する
			System.out.println();
		}
	}

}
