package curriculum_B;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scannerクラスを初期化
		Scanner scan = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください（2以上）: ");
		// 入力した生徒の人数を受け取る部分
		int score = scan.nextInt();
		// 人数をカウント
        int count = 0;
        // 各教科の点数
        int num = 0;
        // 平均点
        double avg;
        // 合計を集計するための変数
        int sum = 0;
        
        String []subject = {"英語","数学","理科","社会"};
        while(2 > score) {
        	System.out.print("生徒の人数を入力してください（2以上）: ");
        	score = scan.nextInt();
        }
        // 生徒の合計点を格納するために配列宣言
        int [] goukei;
        // 配列goukeiの要素を確保
        goukei = new int [score];
        // 多次元配列の要素を確保
        int[][] test = new int [score][subject.length];
        
        do{
        	for(int i = 0; i < subject.length; i++) {
        		System.out.print((count+1) + "人目の『" + subject[i] + "』の点数を入力してください :");
        		// 入力した各教科の点数をnumに代入
        		num = scan.nextInt();
            	test[count][i] = num;
            	sum += num;
        	}
        	goukei[count] = sum;
        	// 改行
    		System.out.println();
    		sum = 0;
    		count++;
        }while(score != count);

        // 生徒ごとの平均点を算出
        for (int j = 0; j < score; j++) {
        	avg = (double)goukei[j] / subject.length;        	
        	System.out.println(j+1 + "人目の合計点は、" + avg + "点です");
        	// 改行
    		System.out.println();

        }
        // 教科ごとの合計点を格納するため変数初期化
        int kyouka = 0;
        
        // 教科ごとの合計点を算出
        for(int k = 0; k < subject.length; k++) {
        	System.out.println(subject[k]);
        	for(int n = 0; n < score; n++) {
        		System.out.println("kamoku[" + n + "][" + k + "]：" + test[n][k]);
        		kyouka += test[n][k];
        	}
        	System.out.println("合計点は、"+ kyouka + "です");
        	// 代入
        	kyouka = 0;
        }       		
		
	}

}
