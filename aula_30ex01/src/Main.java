import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, s;
		System.out.print("Digite o primeiro valor: ");
		x = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		y = sc.nextInt();
		s = x + y;
		System.out.println("SOMA = " + s);
		
		sc.close();
	}

}
