import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

	    System.out.print("Número do funcionário: ");
	    numero = sc.nextInt();
	    System.out.print("Horas trabalhadas: ");
	    horas = sc.nextInt();
	    System.out.print("Valor da hora trabalhada: ");
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}