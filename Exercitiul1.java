import java.util.Scanner;

public class Exercitiul1 {
	
	public static boolean incepeCu(String sir, String subsir) {
        if (sir.length() < subsir.length()) { // sirul este mai mic decat subsirul
            return false;
        }
        
        for (int i = 0; i < subsir.length(); i++) {
            if (sir.charAt(i) != subsir.charAt(i)) { // caractere diferite
                return false;
            }
        }
        
        return true; // toate caracterele au fost identice
    }

	public static void main(String[] args) {
//		1.	Sa se scrie o metoda care sa verifice daca un sir dat incepe cu un subsir precizat.
//		Ex: sir = “Cerul este senin”, subsir = cer => DA
//		       sir = “Cerul este albastru”, subsir = afara => NU
		
		

		Scanner sc = new Scanner(System.in);
		System.out.print ("Introduceti sirul de caractere ");
		String sirCaractere = sc.nextLine();
		System.out.print("Introduceti subisirul de caractere:  ");
		String subsir = sc.nextLine();
		
		
		if(incepeCu(sirCaractere.toLowerCase(),subsir.toLowerCase())) {
			System.out.println("Sirul incepe cu subisrul");
		}
		else {
			System.out.println("Sirul nu incepe cu subsirul");
		}
		
		

	}

}
