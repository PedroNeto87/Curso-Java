import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		int pares = 0;
		for(int i=0; i<n; i++) {
			if(numeros[i]%2==0) {
				pares += 1;
				System.out.printf(numeros[i]+" ");
			}
		}
		
		System.out.println();
		System.out.print("QUANTIDADE DE PARES: " + pares);
		
		sc.close();
	}

}
