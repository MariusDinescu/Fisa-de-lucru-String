import java.util.Scanner;

public class Exercitiul7 {

	public static void main(String[] args) {
//		7.	Sa se scrie o metoda care elimina toate semnele de punctuatie dintr-un text dat
//		Ex: Daca afara este frig, mergem la sala? Daca nu este frig, putem merge la plimbare. 
//			Daca afara este frig mergem la sala Daca nu este frig putem merge la plimbare
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduceti textul: ");
		String sir = sc.nextLine();
		
		String[] cuv = sir.split("[ ,.;!?-]+");
		String concat = String.join(" ", cuv);
		
		System.out.println(concat);
		


	}

}
