import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();
		double vetor[] = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
			vetor[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		for(int i=0; i<n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		soma = 0.0;
		for(int i=0; i<n; i++) {
			soma = soma + vetor[i];
		}
		System.out.printf("\nSOMA = %.2f\n", soma);
		
		media = soma / n;
		System.out.printf("M�DIA = %.2f\n", media);
		
		
		sc.close();
	}

}
