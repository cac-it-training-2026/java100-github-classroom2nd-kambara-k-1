/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("シトロン　\\250");
		System.out.println("ショコラ　\\280");
		System.out.println("ピスターシュ　\\320");

		System.out.println("本日のおすすめ商品です。");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン>");
		String str1 = reader.readLine();
		int citron = Integer.parseInt(str1);

		System.out.println("ショコラ>");
		String str2 = reader.readLine();
		int chocolate = Integer.parseInt(str2);

		System.out.println("ピスターシュ>");
		String str3 = reader.readLine();
		int pistachio = Integer.parseInt(str3);

		System.out.println("\nシトロン" + citron + "個");
		System.out.println("ショコラ" + chocolate + "個");
		System.out.println("ピスターシュ" + pistachio + "個");

		int totalPiece = citron + chocolate + pistachio;
		int totalAmount = 250 * citron + 280 * chocolate + 320 * pistachio;

		System.out.println("\n合計個数" + totalPiece + "個");
		System.out.println("合計個数" + totalAmount + "個");

		System.out.println("\nをお買い上げですね。");
		System.out.println("ありがとうございました。");

	}

}
