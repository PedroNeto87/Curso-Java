import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Código do item: ");
		int cod = sc.nextInt();
		System.out.print("Quantidade do item: ");
		int qtd = sc.nextInt();
		double tot;
		
		if(cod == 1) {
			tot = qtd * 4.0;
		}
		else if(cod == 2) {
			tot = qtd * 4.5;
		}
		else if(cod == 3) {
			tot = qtd * 5.0;
		}
		else if(cod == 4) {
			tot = qtd * 2.0;
		}
		else {
			tot = qtd * 1.5;
		}
		Locale.setDefault(Locale.US);
		System.out.printf("Total: R$ %.2f", tot);
		
		sc.close();
	}

}
