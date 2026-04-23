/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double citron = Double.parseDouble(str1);

		System.out.println("ショコラ>");
		String str2 = reader.readLine();
		double chocolate = Double.parseDouble(str2);

		System.out.println("ピスターシュ>");
		String str3 = reader.readLine();
		double pistachio = Double.parseDouble(str3);

		System.out.println("\nシトロン" + citron + "個");
		System.out.println("ショコラ" + chocolate + "個");
		System.out.println("ピスターシュ" + pistachio + "個");

		double totalPiece = citron + chocolate + pistachio;
		double totalAmount = 250 * citron + 280 * chocolate + 320 * pistachio;

		System.out.println("\n合計個数" + totalPiece + "個");
		System.out.println("合計金額" + totalAmount + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("ありがとうございました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		int citronRest = 30 - (int) Math.ceil(citron);
		int chocolateRest = 30 - (int) Math.ceil(chocolate);
		int pistachioRest = 30 - (int) Math.ceil(pistachio);

		System.out.println("シトロン　\\250" + "・・・" + "残り" + citronRest + "個");
		System.out.println("ショコラ　\\280" + "・・・" + "残り" + chocolateRest + "個");
		System.out.println("ピスターシュ　\\320" + "・・・" + "残り" + pistachioRest + "個");

	}
}