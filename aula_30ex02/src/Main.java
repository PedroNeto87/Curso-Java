import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, area, pi = 3.14159;
		System.out.print("Informe o valor do RAIO DO CIRCULO: ");
		raio = sc.nextDouble();
		area = pi * (raio * raio);
		Locale.setDefault(Locale.US);
		System.out.printf("O valor total da ÁREA DO CIRCULO é: %.4f", area);
		
		sc.close();
	}

}
