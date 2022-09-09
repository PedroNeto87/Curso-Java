package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pessoas que deseja calcular a média de altura: ");
		int n = sc.nextInt();
		double[] vect = new double[n]; //Criar vetor em JAVA
		
		for(int i=0; i<n; i++) {
			System.out.printf("%dª altura: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		double sum=0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("A média entre as alturas digitadas foi de: %.2fMts", avg);
		
		
		sc.close();
	}

}
