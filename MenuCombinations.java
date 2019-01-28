import java.io.*;
import java.util.*;

class MenuCombinations {
	public static void menu(double menu[], double budget, ArrayList ret, int i) {
		System.out.println("");
		System.out.println("===> menu() called.");
        
        if (budget == 0) {
        	System.out.print("====== DONE ====== Final set: ");
            System.out.println(ret);

            return;
        }

        if (budget <= 0) {
        	System.out.println("NO MATCH. RETURNING.");
            return;
        }

        if (i == menu.length) {
        	System.out.println("MENU LENGTH DONE");
            return;
        }

        System.out.print("Adding menu item to ret: ");
        System.out.print(menu[i]);
        System.out.println("");
        ret.add(menu[i]);
        menu(menu, budget - menu[i], ret, i + 1);

        ret.remove(ret.size() - 1);
        System.out.print("Removing ret item: ");
        System.out.print(ret);
        System.out.println("");
        menu(menu, budget, ret, i + 1);
	}

	public static void main(String[] args) {
		double menu[] = {6,2,3,4,5};
		double budget = 10;

		menu(menu, budget, new ArrayList(), 0);
	}
}