/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題11 Stringクラス③（indexOf）
 *
 * 宇宙船が次の目的地γ星に到着しました。
 * γ星は不思議な星です。γ星人たちは
 * 名前に数字が入っているものを珍重しています。
 * 例えば、「アリナミン5」は大事にしていますが
 * 「アリナミンEX」は大事にしていません。
 *
 * γ星人クラスGammalianを新たに作成してください。
 * GammalianはString型フィールドitem、boolean型フィールドisGood
 * を持ち、メソッドsetItem()で登録します。setItem()は文字列中に
 * 数字が含まれていれば、isGoodをtrueにした後にitemに登録し、
 * 含まれていなければ、isGoodをfalseにした後に登録します。
 *
 * <実行例1>
 *
 * γ星人にアイテムを渡してください＞TanquerayNo.10
 *
 * γ星人：
 * こんな良いものをもらっていいガンマか！
 * ゆっくりしていくガンマ。
 *
 * <実行例2>
 *
 * γ星人にアイテムを渡してください＞orange
 *
 * γ星人：
 * ...ありがとガンマ。
 * ぶぶ漬けでもいかがガンマか？
 *
 */

package lesson06.challenge11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにGammalianクラスを記述する
class Gammalian {
	String item;
	boolean isGood;

	/**
	 * @return item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item
	 *            セットする item
	 */
	public void setItem(String item) {
		//【思考メモ】indexOf()で数字が含まれているか探す。なお、引数は単体のためfor文でローラー。
		//			　文字列から数字を探すため引数は文字列になる。if文で判定するため、判定時には
		//			　文字列からint型にし比較する必要がある。よってIntegerクラスを使用。APIによる
		//			  とtoString()により指定された整数で表されたStringオブジェクトを戻すことが可能。
		//			　numFlagでtrueならisGoodをtrueにする。
		boolean numFlag = false;
		for (int i = 0; i < 10; i++) {
			//★間違い箇所（数字判定について、indexOf()は指定した文字（列）が最初に現れる位置を返す
			//				だが、0以上は位置として使うため区別できる値が必要。よって、見つからない
			//				場合は「-1」を返すことになる。逆に-1でなければ見つかったことになる。
			//				なお、-2などでもエラーにならないがAPIの仕様上-1の使用が決めれらている。）
			if (item.indexOf(Integer.toString(i)) != -1) {
				numFlag = true;
				break;
			}
		}
		if (numFlag) {
			isGood = true;
		} else {
			isGood = false;
		}
		this.item = item;
	}

	public boolean isGood() {
		return isGood;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("γ星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Gammalian gammalian = new Gammalian();
		gammalian.setItem(present);
		boolean isGood = false;

		//ここに適切な処理を記述する
		isGood = gammalian.isGood();

		System.out.println("\nγ星人：");
		if (isGood) {
			System.out.println("こんな良いものをもらっていいガンマか！");
			System.out.println("ゆっくりしていくガンマ。");
		} else {
			System.out.println("...ありがとガンマ。");
			System.out.println("ぶぶ漬けでもいかがガンマか？");
		}
	}
}
