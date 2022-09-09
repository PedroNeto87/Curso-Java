package util;

public class CurrencyConverter {
	
	public static double tax = 1.06;
	
	public static double conversao(double price, double amount) {
		return price * amount * tax;
	}
	
}
