package minigame;

import java.util.Scanner;

/**
 * タイプゲーム 結果有
 */

public class G_003 {

	public static void main(String[] args) {


		String input_str;
		String output_str;
		boolean flg;
		int count;

		Scanner input_samp = new Scanner(System.in);

		System.out.println("【見本となる文字を入力】");

		input_str = input_samp.next();
		System.out.println("【タイプみほん】\n" + input_str);

		System.out.println("<<<---タイピングをします--->>>");


		// *** フラグ、カウント初期化
		flg = true;
		count = 0;


		// *** 継続条件

		while(flg) {

			if(input_str.equals(input_samp.next())) {

				System.out.println("<<<---タイプ結果は、みほんと等しいです--->>>");
				System.out.println("<<<---入力終了--->>>");

				flg = false;
			}else {

				System.out.println("<<<---タイプ結果は、みほんと異なります--->>>");
				count ++;

				if(count == 10) {
					count =0;
					System.out.println("【タイプみほん】\n" + input_str);
				}
			}
		} //while end
	}
}
