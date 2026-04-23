/**
 * 第7章 武士のお仕事
 *
 * 問題15 インターフェースを拡張する
 *
 * 国家老インターフェースを作る。
 *
 * 勘定奉行インターフェースと文化人インターフェースを継承した
 * 国家老インターフェースIChiefRetainer（メソッドvoid stay）を作り、
 * 藩士クラスに実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 * 城で留守番するよ～。
 *
 */

package lesson07.challenge15;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	abstract void figure();
}

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	abstract void learn();
}

//ここにIChiefRetainerインターフェースを記述
interface IChiefRetainer {
	abstract void stay();
}

//ここにSamuraiクラスを記述
class Samurai {

	protected String name;
	protected String domain;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai implements IChiefTreasurer, ICelebrity, IChiefRetainer {

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public Retainer(String domain, String name) {
		this.name = name;
		this.domain = domain;
	}

	public Retainer() {
	}

	public boolean equals(Object object) {
		Retainer retainer = (Retainer) object;
		return this.domain.equals(retainer.domain);
	}

	public String toString() {
		return "拙者は" + domain + "藩士、" + name + "ともうす。";
	}

	public void figure() {
		System.out.println("藩の資産を計算するよ～。");
	}

	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}

	public void stay() {
		System.out.println("城で留守番するよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述;
		Retainer retainer1 = new Retainer();
		retainer1.figure();
		retainer1.learn();
		retainer1.stay();

	}
}
