import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul11 {

	public static void main(String[] args) {
//		11.	Se da un vector de string-uri, Sa se afiseze toate acele elemente ale vectorului care contin un subsir dat.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti subsirul dat ");
		String subsir = sc.nextLine();
		
		System.out.println("Introduceti dimensiunea: ");
		int n = sc.nextInt();
		
		String[] str = new String[n];
		
		System.out.println("Introduceti elementele vectorului: ");
		for(int i = 0;i<str.length;i++) {
			str[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(str));
		
	
	
		
		
		
		for (String element : str) {
			if (element.contains(subsir)) {
                System.out.println("Elementele vectorului care contin subsirul dat sunt: " + element);
           }
		}
		


	}

}
