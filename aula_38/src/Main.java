import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantidade de minutos: ");
		int m = sc.nextInt();
		double c = 50.0;
		if(m > 100) {
			c += (m - 100) * 2.0;
		}
		System.out.printf("O valor a pagar: R$%.2f", c);
		
		sc.close();
	}

}
