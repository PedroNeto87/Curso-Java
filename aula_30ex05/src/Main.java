import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cod1, cod2, qtd1, qtd2;
		double vr1, vr2, vrt;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		vr1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		vr2 = sc.nextDouble();
		
		vrt = qtd1 * vr1 + qtd2 * vr2;
		
		System.out.printf("Valor a pagar: R$%.2f", vrt);
		
		sc.close();
	}

}
