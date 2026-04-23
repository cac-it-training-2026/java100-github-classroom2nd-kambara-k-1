package lesson09.challenge02.Nurserry.logic;

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

	public void divide(int cakes, int childs) {

		//ここに適切な処理を記述
		//★入力されたの園児の人数が0の時はArithmeticExceptionをcatchして
		//「ケーキを食べる園児がいません。」と表示。それ以外は「1人○個になります。」と表示。
		try {
			System.out.println("\n1人" + cakes / childs + "個になります。");
		} catch (Exception e) {
			System.out.println("\nケーキを食べる園児がいません。");
		}

	}
}
