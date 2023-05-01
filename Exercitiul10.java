import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul10 {
	

	public static void main(String[] args) {
//		10.	Sa se scrie un program care sa sorteze (crescator sau descrescator) dupa lungime, un vector de string-uri dat.
//		Ex: {rosu, da, nu, poate, verde, albastru, azi, maine} =>
//		{da, nu, azi, rosu, poate, verde, maine, albastru}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti dimensiunea: ");
		int n = sc.nextInt();
		
		String[] cuv = new String[n];
		
		System.out.println("Introduceti elementele vectorului: ");
        for (int i = 0; i < n; i++) {
            cuv[i] = sc.next();
        }
        
        for(int i = 0;i<cuv.length-1;i++) {
        	for(int j = i+1;j<cuv.length;j++) {
        		if(cuv[i].length() > cuv[j].length()) {
        			String temp  = cuv[i];
        			cuv[i]= cuv[j];
        			cuv[j]= temp;
        		}
        	}
        }
		
        System.out.println(Arrays.toString(cuv));
		
//		
//		
		
		


	}

}
