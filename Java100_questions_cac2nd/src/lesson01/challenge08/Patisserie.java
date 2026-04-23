/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		double totalAmount = (int) (250 * citron + 280 * chocolate + 320 * pistachio);

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

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計" + "\\" + totalAmount);

		System.out.println("\n内訳");

		System.out.println(
				"シトロン      \\" + (int) (250 * citron) + "・・・ " + (int) ((250 * citron) / totalAmount * 100) + "%");
		System.out.println("ショコラ      \\" + (int) (280 * chocolate) + "・・・ "
				+ (int) ((280 * chocolate) / totalAmount * 100) + "%");
		System.out.println(
				"ピスターシュ  \\" + (int) (320 * pistachio) + "・・・ " + (int) ((320 * pistachio) / totalAmount * 100) + "%");
	}

}
