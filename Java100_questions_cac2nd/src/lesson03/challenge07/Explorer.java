/**
 * 第3章 探検隊のお仕事
 *
 * 問題7  ワニが現れた
 *
 * 進行方向にワニが3匹現れました。
 * このワニはそれぞれグーワニ、チョキワニ、パーワニの何れかです。
 *
 * グーワニは手をパーかグーにして見せるとおとなしくなり、
 * チョキワニは手をグーかチョキにして見せるとおとなしくなり、
 * パーワニは手をチョキかパーにして見せるとおとなしくなるのですが、
 * この3種は外見がまったく一緒で見分けがつきません。
 * （つまり、3匹がそれぞれ1種ずつである場合も
 *   3匹ともグーワニである可能性もあります。）
 *
 * この道を通り抜けるためには、 3匹にそれぞれ勝つか引き分けるか
 * しなければなりません。負けるとその時点でチャレンジ終了となります。
 *
 * コメントの位置にwhile文とif文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  ワニ3匹発見！
 *  グーワニかチョキワニかパーワニのどれかです。
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞2
 *
 *  隊長：
 *  相手はチョキワニでした。
 *  1匹目通り抜け成功！
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞3
 *
 *  隊長：
 *  相手はグーワニでした。
 *  2匹目通り抜け成功！
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞1
 *
 *  隊長：
 *  相手はグーワニでした。
 *  3匹目通り抜け成功！
 *
 *  隊長：
 *  川を渡り切りました。
 *
 * <通り抜けに失敗した場合の実行例>
 *  隊長：
 *  相手はグーワニでした。
 *  通り抜けに失敗しました...
 *
 * <範囲外の手が入力された場合の実行例>
 *
 *  隊長：
 *  そんな手はありませんよ。もう一度入れてください。
 *
 */

package lesson03.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("ワニ3匹発見！\n");
		System.out.println("グーワニかチョキワニかパーワニのどれかです。\n");

		int alligator = 0;
		int hand = 0;
		int i = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//ここにwhile文、if文を利用した処理を記述
		while (i < 3) {
			System.out.println("隊長：");
			System.out.println("どの手を出して通り抜けますか");
			System.out.print("（グー… 1 : チョキ… 2 : パー… 3）＞");

			String handStr = br.readLine();
			hand = Integer.parseInt(handStr);

			//ジャンケン形式のため、1～3の乱数を求める必要がある。
			//しかし、Math.random()は0.0以上で1.0より小さいdouble型の乱数を返すため、
			//そのまま利用するだけでは1～3の乱数を取得できない。		 
			//Math.random()の結果を10倍すれば0.0以上で10より小さい数値にすることができます。
			//この数値を3で割った余り(剰余)を求めれば0.0以上で3.0より小さい数値に変換可能。
			//剰余の値に1を足せば1.0以上で4.0より小さいdouble型の数値を作成可能。
			alligator = (int) (Math.random() * 10 % 3) + 1;

			if (hand == 1) {
				if (alligator == 1 || alligator == 2) {
					System.out.println("\n隊長：");
					//★間違い箇所（ワニの種別をkindとし、条件演算子[?]を使用）
					//ある値と等しい場合に特定の値を、等しくない場合には別の値を変数に代入する
					//ワニが1と等しければグーワニ、等しくなけらばチョキワニの文字列を代入
					String kind = (alligator == 1) ? "グーワニ" : "チョキワニ";
					System.out.println("相手は" + kind + "でした。");
					System.out.println((i + 1) + "匹目通り抜け成功！\n");

				} else {
					System.out.println("\n隊長：");
					System.out.println("相手は：パーワニでした。");
					break;
				}

			} else if (hand == 2) {
				if (alligator == 2 || alligator == 3) {
					String kind = (alligator == 2) ? "チョキワニ" : "パーワニ";
					System.out.println("相手は" + kind + "でした。");
					System.out.println((i + 1) + "匹目通り抜け成功！\n");
				} else {
					System.out.println("\n隊長：");
					System.out.println("相手は：グーワニでした。");
					break;
				}

			} else if (hand == 3) {
				if (alligator == 1 || alligator == 3) {
					String kind = (alligator == 1) ? "グーワニ" : "パーワニ";
					System.out.println("相手は" + kind + "でした。");
					System.out.println((i + 1) + "匹目通り抜け成功！\n");
				} else {
					System.out.println("\n隊長：");
					System.out.println("相手は：チョキワニでした。");
					break;
				}
			} else {
				System.out.println("\n隊長：");
				System.out.println("そんな手はありませんよ。もう一度入れてください。\n");
				//★もう一度手を出させるため、1増える「i」を事前に1減らして調整
				i--;
			}
			i++;
		}

		if (i == 3)

		{
			System.out.println("隊長：");
			System.out.println("川を渡り切りました。");
			//★負けたらwhile文から抜け出し、iが3でない場合はelse文にて通り抜け失敗を表示。
		} else {
			System.out.println("通り抜けに失敗しました...");
		}

	}
}