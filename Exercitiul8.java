import java.util.Scanner;

public class Exercitiul8 {

	public static void main(String[] args) {
//		8.	Sa se scrie o metoda care sa returneze intr-un vector toate prefixele unui cuvant.
//		Ex: acasa => {a, ac, aca, acas, acasa}


		int[] vector = new int[128];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti cuvantul: ");
		String cuvant  = sc.nextLine();
		
		int n = cuvant.length();
	    String[] prefixes = new String[n];
	
		    for (int i = 0; i < n; i++) {
		        prefixes[i] = cuvant.substring(0, i+1);
		        System.out.println(prefixes[i]);
		    }
		
		
	}

}
