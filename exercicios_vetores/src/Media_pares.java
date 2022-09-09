import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter no vetor? ");
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		int par=0, soma=0;
		double media;
		for(int i=0; i<n; i++) {
			if(num[i]%2==0) {
				soma += num[i];
				par++;
			}
		}
		
		if(par == 0) {
			System.out.print("NENHUM NÚMERO É PAR");
		} 
		else {
			media = soma / par;
			System.out.printf("MÉDIA DOS PARES = %.1f", media);
		}
		
				
		sc.close();
	}
}
