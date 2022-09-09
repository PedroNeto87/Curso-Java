import java.util.Locale;
import java.util.Scanner;


public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão informadas? ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();		
		}
		
		System.out.println();
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += alturas[i];
		}
		
		double media = soma / n;
		
		System.out.printf("Altura média: %.2f\n", media);
		
		int idadeMenor = 0;
		for(int i=0; i<n; i++) {
			if(idades[i]<16) {
				idadeMenor += 1;
			}
		}
		
		double porcentIdade = idadeMenor * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentIdade);
		
		for(int i=0; i<n; i++)
		if(idades[i]<16) {
			System.out.println(nomes[i]);
		}
		
		sc.close();
	}

}
