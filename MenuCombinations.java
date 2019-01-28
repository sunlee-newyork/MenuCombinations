import java.io.*;
import java.util.*;

class MenuCombinations {
	public static void menu(double menu[], double budget, ArrayList ret, int i) {
		if (budget <= 0) {
			if (budget == 0) {
				System.out.println(ret);
			}

			return;
		}

		if (i == menu.length) {
			return;
		}

		ret.add(menu[i]);
		menu(menu, budget - menu[i], ret, i + 1);

		ret.remove(ret.size() - 1);
		menu(menu, budget, ret, i + 1);
	}

	public static void main(String[] args) {
		double menu[] = {6,2,3,4,5};
		double budget = 10;

		menu(menu, budget, new ArrayList(), 0);
	}
}