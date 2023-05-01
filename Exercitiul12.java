import java.util.Scanner;

public class Exercitiul12 {

	public static void main(String[] args) {
//		12.	Se considera un string ce retine un text. Sa se creeze un alt string in care sa apara cuvintele in ordinea inversa.
//
//		Ex. “diseara ploua sigur” => “sigur ploua diseara”

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduceti textul: ");
		String text = sc.nextLine();

		String[] words = text.split("\\s");

		String invers = "";

		for (int i = words.length - 1; i >= 0; i--) {
			invers += words[i] + " ";
		}

		System.out.println("Propozitia inversata este: ");
		System.out.println(invers.trim());

	}

}
