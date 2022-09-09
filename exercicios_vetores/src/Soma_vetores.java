import java.util.Locale;
import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorR = new int[n];
				
		System.out.println("Digite os valores para o vetor A:");
		for(int i=0; i<n; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores para o vetor B:");
		for(int i=0; i<n; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i=0; i<n; i++) {
			vetorR[i] = vetorA[i] + vetorB[i];
			System.out.printf("%d\n", vetorR[i]);
		}
		
		sc.close();
	}

}