import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto números vai digitar: ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite o %dº numero: ", i+1);
			numeros[i] = sc.nextDouble();
		}
		
		double maior = 0.0;
		int posmaior = 0;
		for(int i=0; i<n; i++) {
			if(numeros[i]>maior) {
				maior = numeros[i];
				posmaior = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posmaior);
		
		sc.close();
	}

}
