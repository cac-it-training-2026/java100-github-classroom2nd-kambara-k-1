package lesson09.challenge04.Nurserry.logic;

import lesson09.challenge04.Nurserry.Exception.CriticalConditionException;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//ここに適切な処理を記述
	//★間違い箇所（throws文により条件によっては例外を呼び出し元に投げることを宣言）
	public void takeTemperature(NurserySchoolChild child) throws CriticalConditionException {
		if (child.getTemperature() >= 38) {
			System.out.println("\n" + child.getName() + "は重体です。");
			//★間違い箇所（throw文により処理を中断して例外を発生させ、呼び出し元に戻る（38度以上のため））
			throw new CriticalConditionException();
		} else {
			System.out.println(child.getName() + "の体温は" + child.getTemperature() + "です。");
		}
	}
}
