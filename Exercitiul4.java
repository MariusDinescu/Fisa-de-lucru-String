import java.util.Scanner;

public class Exercitiul4 {

	public static void main(String[] args) {
//		4.	Sa se scrie o metoda care sa verifice daca un sir dat este anagrama a unui alt sir precizat (adica se obtine prin rearanjarea literelor sirului initial)
//		Ex: sir1:”adobe”, sir2: “bedoa” => DA
//		       sir1:”adobe”, sir2: “bedog” => NU

		
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Introduceti primul sir: ");
		String sir1 = sc.nextLine();
		System.out.println("Introduceti al doilea sir: ");
		String sir2= sc.nextLine();
		
		
		char[] sir3 = sir1.toCharArray();
		char[] sir4 = sir2.toCharArray();
		
		
		
		for(int i = 0;i< sir3.length;i++) {
			for(int j = i+1;j<sir3.length;j++) {
				if(sir3[i] > sir3[j]){
					
					char aux;
					aux = sir3[i];
					sir3[i] = sir3[j];
					sir3[j] =aux;
					
				}
			}
		}
		

		for(int i = 0;i< sir4.length;i++) {
			for(int j = i+1;j<sir4.length;j++) {
				if(sir4[i] > sir4[j]){
					
					char aux;
					aux = sir4[i];
					sir4[i] = sir4[j];
					sir4[j] =aux;
					
				}
			}
		}
		if (sir3.length != sir4.length)
			System.out.println("Nu este posibil");
		
		String cuvant1 = new String(sir3);
		String cuvant2 =  new String(sir4);
		
		System.out.println(cuvant1);
		System.out.println(cuvant2);
		
		if(cuvant1.contentEquals(cuvant2)) {
			System.out.println("Da");
		}
		else {
			System.out.println("NU");
		}
		
		
		
		}
		
	}

	

