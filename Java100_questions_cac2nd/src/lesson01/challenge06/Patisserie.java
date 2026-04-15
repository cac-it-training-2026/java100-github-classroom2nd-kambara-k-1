/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println("\n本日のおすすめ商品です。\n");

		int citronRest = 30 - citron;
		int chocolateRest = 30 - chocolate;
		int pistachioRest = 30 - pistachio;

		System.out.println("シトロン　\\250" + "・・・" + "残り" + citronRest + "個");
		System.out.println("ショコラ　\\280" + "・・・" + "残り" + chocolateRest + "個");
		System.out.println("ピスターシュ　\\320" + "・・・" + "残り" + pistachioRest + "個");

	}
}
