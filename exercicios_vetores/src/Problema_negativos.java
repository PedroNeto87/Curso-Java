import java.util.Locale;
import java.util.Scanner;

public class Problema_negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voc� vai digitar: ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("N�meros Negativos: ");
		
		for(int i=0; i<n; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
