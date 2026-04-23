/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {
	String item;

	//★末尾が数字が入っているものは英語表記に置き換える
	//【思考メモ】lastIndexOf()により指定された文字が最後に出現する位置のインデックスを返す。
	//			　switch文とreplaceでアルファベットにローラー変換.
	//★間違い箇所（lastIndexOf()では「位置」を返すのに「値」として扱ってしまっている。
	//				さらに、switch変換は合っていたが、用いるメソッドが異なる。replaceでは
	//				「最後の文字」ではなく「全部」を置換してしまうため当問には不適。
	//				よって、最後の文字のインデックスをlength() - 1で取得し、charAt() でその
	//				位置の1文字（char型）を取得。その1文字をswitchローラーでアルファベット
	//				変換する。これをsetterで行い、取得した最後の文字をswitch文で判定する。）
	private String changeLastChar(char ch) {
		String changeStr = null;
		switch (ch) {
		case '0':
			changeStr = "zero";
			break;
		case '1':
			changeStr = "one";
			break;
		case '2':
			changeStr = "two";
			break;
		case '3':
			changeStr = "three";
			break;
		case '4':
			changeStr = "four";
			break;
		case '5':
			changeStr = "five";
			break;
		case '6':
			changeStr = "six";
			break;
		case '7':
			changeStr = "seven";
			break;
		case '8':
			changeStr = "eight";
			break;
		case '9':
			changeStr = "nine";
			break;
		default:
			break;
		}
		return changeStr;
	}

	public void setItem(String item) {
		int lastIndex = item.length() - 1;
		char lastCh = item.charAt(lastIndex);
		String changeStr = changeLastChar(lastCh);

		//★間違い箇所（数字が指定された場合、内容を後から変更できる（可変）文字列を扱う
		//				StringBufferクラスによりitemの内容をもとに変更可能な文字列を作成。
		//				lastIndexからlastIndex + 1の手前まで（＝1文字分）を指定した後に
		//				changeStr（=別の文字列）置き換え、itemに文字列として代入する。
		//				置き換えが無ければそのまま代入する。）
		if (changeStr != null) {
			StringBuffer sb = new StringBuffer(item);
			sb.replace(lastIndex, lastIndex + 1, changeStr);
			this.item = new String(sb);
		} else {
			this.item = item;
		}
	}

	public String getItem() {
		return item;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);

		String item = null;

		//ここに適切な処理を記述する
		item = omegalian.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
