package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade dos produtos que deseja informar: ");
		int n = sc.nextInt();
		Product[] vetor = new Product[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			System.out.printf("%dº produto: ", i+1);
			String nome = sc.nextLine();
			System.out.print("Valor: ");
			double preco = sc.nextDouble();
			vetor[i] = new Product(nome, preco);
		}
		
		double soma = 0.0;
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / vetor.length;
		
		System.out.printf("A média dos preços dos produtos foi: R$%.2f", media);
		
		sc.close();
	}

}
