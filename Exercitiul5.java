import java.util.Scanner;

public class Exercitiul5 {

	public static void main(String[] args) {
//		5.	Sa se scrie o metoda care sa returneze caracterul care apare cel mai des intr-un sir dat
//		Ex: sir: “ana are cartea de programare” => ‘a’
//	       Sir: “test” => ‘t’
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Intrduceti sirul");
		String sir = sc.nextLine();
		
		
		int [] vect = new int[128]; // acoperim codurile asci
		
		for(int i = 0;i<sir.length();i++) {
			char caracter = sir.charAt(i);
			vect[(int)caracter]++;			
		}
		
		char CelMaiDesCaracter = ' ';
		int maxvect = 0;
		
		for (int i = 0; i < vect.length; i++) {
		    if (vect[i] > maxvect) {
		        CelMaiDesCaracter  = (char)i;
		        maxvect = vect[i];
		    }
		}
		
		System.out.printf("Cel mai des caracter in propozitie este '%c' si apare de %d ori.", CelMaiDesCaracter, maxvect);
		

	}

}
