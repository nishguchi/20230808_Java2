package minigame;
import java.util.Random;
import java.util.Scanner;

public class G_002 {

/**
 * じゃんけんゲーム 結果有り
 */


	public static void main(String[] args) {

		int int_num;
		int int_ran;
		boolean flg = true;

		//じゃんけん入力値
		//0 ぱー
		//1 ぐー
		//2 ちょき


		// *** 継続条件

		while(flg == true) {

			System.out.println("<<<---数値入力--->>>");
			System.out.println("<<<--- 【0 = パー】 【1= グー】 【2= チョキ】--->>>");

			try {


				Scanner scan = new Scanner(System.in);
				int_num = scan.nextInt();

				Random rand = new Random();
				int_ran = rand.nextInt(3);

System.out.println(int_ran);
				//*** 【出力】相手の手番


				if(int_ran == 0) {
					System.out.println("【相手】パー");
				}else if(int_ran == 1){
					System.out.println("【相手】グー");
				}else if(int_ran == 2){
					System.out.println("【相手】チョキ");
				}


				//*** 【出力】自分の手番


				if(int_num == 0) {
					System.out.println("【あなた】パー");
				}else if(int_num == 1){
					System.out.println("【あなた】グー");
				}else if(int_num == 2){
					System.out.println("【あなた】チョキ");
				}else{
					System.out.println("<<<---入力値が正しくありません--->>>");
					flg = false;
				}




				// *** じゃんけん結果 あいこ

				if(int_num == int_ran) {

					System.out.println("【じゃんけん結果】あいこです\n");

				}

				// *** じゃんけん結果 自分かち


				// ***じゃんけん結果 ぱー
				if(int_num == 0 && int_ran == 1) {

					System.out.println("【じゃんけん結果】あなたのかち\n");

				}else if (int_num == 0 && int_ran == 2){

					System.out.println("【じゃんけん結果】あなたのまけ\n");



				// ***じゃんけん結果 ぐー

				}else if(int_num == 1 && int_ran == 0) {


					System.out.println("【じゃんけん結果】あなたのまけ\n");

				}else if(int_num == 1 && int_ran == 2) {

					System.out.println("【じゃんけん結果】あなたのかち\n");




				// ***じゃんけん結果 ちょき

				}else if(int_num == 2 && int_ran == 0) {

					System.out.println("【じゃんけん結果】あなたのかち\n");

				}else if(int_num == 2 && int_ran == 1) {

					System.out.println("【じゃんけん結果】あなたのまけ\n");

				}


				System.out.println("----------------------------------");


			}catch(java.util.InputMismatchException e){

				System.out.println("<<<---入力値が正しくありません2--->>>");
				flg = false;


			}finally {

				// *** 終了条件


				if(flg == false) {
					System.out.println("<<<---ゲーム終了--->>>\n");

				}
			}
		}	//*** ---while end---
	}
}