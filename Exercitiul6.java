import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul6 {

	public static String aparitie(String sir) {
		String[] cuvinte = sir.split("\\s+");

		Arrays.sort(cuvinte);

		String celmaidesCuvant = "";
		int maxcount = 0;
		int count = 1;

		for (int i = 1; i < cuvinte.length; i++) {
			// numarare aparitii cuvant

			if (cuvinte[i].equals(cuvinte[i - 1])) {
				count++;

			} else {
				if (count > maxcount) {
					celmaidesCuvant = cuvinte[i - 1];
					maxcount = count;

				}

				count = 1;

			}

		}
		if (count > maxcount) {
			celmaidesCuvant = cuvinte[cuvinte.length - 1];
		}
		
		return celmaidesCuvant;

	}

	public static void main(String[] args) {
//		6.	Sa se scrie o metoda care sa returneze cuvantul care apare cel mai des intr-un text dat. Daca exista mai multe astfel de cuvinte, sa se returneze cel mai mic in ordine lexicografica.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduceti textul: ");
		String sir = sc.nextLine();

		
		
	
		
		System.out.println("Cuvantul "  + aparitie(sir) + " este cel mai des din sir");
		
	}

}
