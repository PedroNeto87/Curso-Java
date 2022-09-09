import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu salário: R$ ");
		double sal = sc.nextDouble();
		double imp;
		
		if(sal <= 2000.0) {
			imp = 0.0;
		}
		else if(sal <= 3000.0) {
			imp = (sal - 2000) * 0.08;
		}
		else if(sal <= 4500.0) {
			imp = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imp = (sal - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if(imp == 0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$%.2f", imp);
		}
		
		
		sc.close();
	}

}
