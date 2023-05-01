import java.util.Scanner;

public class Exercitiul2 {
	
	 public static char[] convertesteInVector(String sir) {
	        return sir.toCharArray();
	    }

	public static void main(String[] args) {
//		2.	Sa se scrie o metoda care sa returneze un vector de caractere care are continutul unui sir de caractere precizat
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti sirul de caractere: ");
		String sir = sc.nextLine();
		
		char[] vect = convertesteInVector(sir);
		
		  for (int i = 0; i < vect.length; i++) {
	            System.out.print(vect[i] + " ");
	        }
	}

}
