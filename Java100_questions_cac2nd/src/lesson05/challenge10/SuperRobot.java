package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {

	public void HeatTheFlyingPan() {
		System.out.println("①フライパンを温めます。");
	}

	public String CheckTheIngredients(int whiteFishNum, int cherryTomatoesNum, int bellPepperNum, int greenPepperNum,
			int mashroomNum, int clamsNum, int musselsNum, int garlicNum, int whiteWineNum, int waterNum,
			int oliveOilNum, int herbsNum) {

		int hasVegetables = (cherryTomatoesNum + bellPepperNum + greenPepperNum + mashroomNum);
		int hasShellfish = (clamsNum + musselsNum);

		//①アクアパッツァ
		if (whiteFishNum == 1 &&
				hasVegetables == 1 &&
				hasShellfish == 1 &&
				garlicNum == 1 &&
				whiteWineNum == 1 &&
				oliveOilNum == 1 &&
				herbsNum == 1) {
			return "アクアパッツァができました。";
		} else if (hasShellfish == 0) {
			return "アクアパッツァの代わりに魚の地中海風ソテーが作れます。";
		} else if (hasVegetables == 0) {
			return "アクアパッツァの代わりに魚介の白ワイン蒸しが作れます。";
		} else if (garlicNum == 0 && whiteWineNum == 1) {
			return "アクアパッツァの代わりに魚介のワイン煮が作れます。";
		} else if (whiteWineNum == 0 && oliveOilNum == 1) {
			return "アクアパッツァの代わりに魚介のオイル蒸しが作れます。";
		} else if (oliveOilNum == 0) {
			return "アクアパッツァの代わりに魚の白ワイン煮が作れます。";
		} else if (herbsNum == 0) {
			return "アクアパッツァの代わりに魚介のアクアパッツァ風が作れます。";
		} else if (waterNum == 0) {
			return "アクアパッツァの代わりに濃縮魚介ソテーが作れます。";
		} else if (whiteFishNum == 0) {
			return "アクアパッツァの代わりにラタトゥイユ風が作れます。";
		} else {
			return "食材を集めてください。";
		}
	}
}

public class SuperRobot {
	public static void main(String[] args) throws IOException {

		System.out.println("★★★アクアパッツァ作成ロボット★★★");
		System.out.println("※このロボットは食材を確認し、アクアパッツァを作ります。");
		System.out.println("※材料が足りない場合は代替料理を表示します。\n");

		System.out.print("材料を確認します。");
		System.out.print("手持ちに具材があるかどうかを入力してください（ある＞１、ない＞０）。\n");

		int whiteFishNum = 0;
		int cherryTomatoesNum = 0;
		int bellPepperNum = 0;
		int greenPepperNum = 0;
		int mashroomNum = 0;
		int clamsNum = 0;
		int musselsNum = 0;
		int garlicNum = 0;
		int whiteWineNum = 0;
		int waterNum = 0;
		int oliveOilNum = 0;
		int herbsNum = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.print("\n白身魚があるか入力してください＞");
			String whiteFishNumStr = br.readLine();
			whiteFishNum = Integer.parseInt(whiteFishNumStr);
			if (whiteFishNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\nミニトマトがあるか入力してください＞");
			String cherryTomatoesNumStr = br.readLine();
			cherryTomatoesNum = Integer.parseInt(cherryTomatoesNumStr);
			if (cherryTomatoesNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\nパプリカがあるか入力してください＞");
			String bellPepperNumStr = br.readLine();
			bellPepperNum = Integer.parseInt(bellPepperNumStr);
			if (bellPepperNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\nピーマンがあるか入力してください＞");
			String greenPepperNumStr = br.readLine();
			greenPepperNum = Integer.parseInt(greenPepperNumStr);
			if (greenPepperNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\nマッシュルームがあるか入力してください＞");
			String mashroomNumStr = br.readLine();
			mashroomNum = Integer.parseInt(mashroomNumStr);
			if (mashroomNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\nあさりがあるか入力してください＞");
			String clamsNumStr = br.readLine();
			clamsNum = Integer.parseInt(clamsNumStr);
			if (clamsNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\nムール貝があるか入力してください＞");
			String musselsNumStr = br.readLine();
			musselsNum = Integer.parseInt(musselsNumStr);
			if (musselsNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\nにんにくがあるか入力してください＞");
			String garlicNumStr = br.readLine();
			garlicNum = Integer.parseInt(garlicNumStr);
			if (garlicNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\n白ワインがあるか入力してください＞");
			String whiteWineNumStr = br.readLine();
			whiteWineNum = Integer.parseInt(whiteWineNumStr);
			if (whiteWineNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\n水の量があるか入力してください＞");
			String waterNumStr = br.readLine();
			waterNum = Integer.parseInt(waterNumStr);
			if (waterNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\nオリーブオイルがあるか入力してください＞");
			String oliveOilNumStr = br.readLine();
			oliveOilNum = Integer.parseInt(oliveOilNumStr);
			if (oliveOilNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("\nハーブの量があるか入力してください＞");
			String herbsNumStr = br.readLine();
			herbsNum = Integer.parseInt(herbsNumStr);
			if (herbsNum > 1) {
				System.out.println("正しい値を入力してください。");
			} else {
				break;
			}
		}

		Robot robot = new Robot();
		String cooking = robot.CheckTheIngredients(whiteFishNum, cherryTomatoesNum, bellPepperNum, greenPepperNum,
				mashroomNum,
				clamsNum, musselsNum, garlicNum, whiteWineNum, waterNum, oliveOilNum, herbsNum);

		System.out.println(cooking);
	}
}
