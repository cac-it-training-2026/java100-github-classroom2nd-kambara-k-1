/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	abstract void learn();
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
class Retainer extends Samurai implements ICelebrity {

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

	@Override
	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}
}

//ここにRoninクラスを記述
class Ronin extends Samurai implements ICelebrity {
	void covered() {
		System.out.println("傘張りするよ～。");
	}

	void work() {
		System.out.println("傘張るよ～。");
	}

	public Ronin(String domain, String name) {
		this.name = name;
		this.domain = domain;
	}

	public Ronin() {
	}

	public String toString() {
		return "拙者は" + domain + "村の浪人、" + name + "ともうす。";
	}

	@Override
	public void learn() {
		System.out.println("塾を開くよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述
		Retainer retainer1 = new Retainer();
		retainer1.learn();

		System.out.println("\n浪人1：");

		//ここに適切な処理を記述
		Ronin ronin1 = new Ronin();
		ronin1.learn();

	}
}
