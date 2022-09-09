package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("What is the dollar price? U$");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? U$");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.conversao(price, amount);
		
		System.out.printf("Amount to be paid in real: R$%.2f\n", result);		
		
		sc.close();
	}

}
