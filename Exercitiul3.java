import java.util.Scanner;

public class Exercitiul3 {
	
	public static String eliminaSpatiile(String sir) {
		
		// eliminam spatiile din inceputul si sfarsitul sirului
		sir = sir.trim();
		//eliminam spatiile din mijlocul sirului
		sir = sir.replaceAll("\\s+" , " ");
		return sir;
	}
	
	


	public static void main(String[] args) {
//		3.	Sa se scrie o metoda care sa elimine toate spatiile extra dintr-un sir de caractere dat (de la inceput, sfarsit sau intermediare)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti sirul de caractere: ");
		String sir1 = sc.nextLine();
		
		String textfaraspatii = eliminaSpatiile(sir1);
		
		System.out.println(textfaraspatii);
		
		
		
		
		

	}

}
