import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double n1, n2, m;
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextDouble();
		m = (n1 + n2) / 2.0;
		System.out.printf("A média foi: %.1f", m);
				
		sc.close();
	}

}
