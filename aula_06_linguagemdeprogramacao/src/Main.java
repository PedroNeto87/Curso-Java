import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double n1, n2, m;
		System.out.print("Digite o primeiro n�mero: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		n2 = sc.nextDouble();
		m = (n1 + n2) / 2.0;
		System.out.printf("A m�dia foi: %.1f", m);
				
		sc.close();
	}

}
