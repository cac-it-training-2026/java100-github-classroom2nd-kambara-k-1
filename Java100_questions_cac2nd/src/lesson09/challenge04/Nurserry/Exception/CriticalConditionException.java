package lesson09.challenge04.Nurserry.Exception;

public class CriticalConditionException extends Exception {
	//★間違い箇所（Javaのシリアライズ（直列化）機構で使われるクラスのバージョン識別子を記述。
	//				付けておくのが慣習で、必須ではない。
	//				Exception は、内部的に Java Serializable を実装しているため、例外クラスも
	//				シリアライズ対象となる。これを踏まえ、書いておく理由としては以下の３つ。
	//				①Serializableなのに serialVersionUID が無いとして警告が出る。
	//				②将来的に例外がシリアライズされる可能性(キャッシュやログ保存)。
	//				③SerializableなクラスにはUIDを書くというお作法。
	//				なお、Serializable は、Javaでオブジェクトをバイト列に変換して保存・送信
	//				できるようにするための仕組み（インターフェース）。通常はオブジェクトは
	//				メモリ上にしか保存できないが、Serializableはファイル送信やネットワーク
	//				送信可能となる。）
	private static final long serialVersionUID = 1L;
}
