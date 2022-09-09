import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, totmulheres, tothomens;
		double menoraltura, maioraltura, mediamulheres, totaltmulheres;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Altura da %dª pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);
		}
		
		menoraltura = altura[0];
		maioraltura = altura[0];
		
		for(int i=0; i<n; i++) {
			if(altura[i] < menoraltura) {
				menoraltura = altura[i];
			}
			if(altura[i] > maioraltura) {
				maioraltura = altura[i];
			}
		}
		
		totmulheres = 0;
		totaltmulheres = 0.0;
		tothomens = 0;

		for(int i=0; i<n; i++) {
			if(genero[i] == 'm' || genero[i] == 'M') {
				tothomens++;
			}
			else {
				totmulheres++;
				totaltmulheres += altura[i];
			}
		}
		
		mediamulheres = totaltmulheres / totmulheres;
		
		System.out.printf("Menor altura = %.2f\n", menoraltura);
		System.out.printf("Maior altura = %.2f\n", maioraltura);
		System.out.printf("Média altura das mulheres = %.2f\n", mediamulheres);
		System.out.printf("Número de homens = %d\n", tothomens);
		
		sc.close();
	}

}
