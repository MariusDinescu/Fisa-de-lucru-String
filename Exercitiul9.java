import java.util.Scanner;

public class Exercitiul9 {
	

	public static void main(String[] args) {
//		9.	Sa se scrie o metoda care sa inlocuiasca toate aparitiile cuvantului “este” cu “nu este”
//		Ex: Afara este frumos. Maria este cu mama. => Afara nu este frumos. Maria nu este cu mama.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti textul: ");
		String sir = sc.nextLine();
		
		String cuv1  = "";
		
		for(int i = 0;i<sir.length();i++) {
			cuv1 = sir.replaceAll("este", "nu este");
			System.out.println(cuv1);
			break;
		}
		


	}

}
