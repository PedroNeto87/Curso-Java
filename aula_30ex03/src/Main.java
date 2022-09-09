import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B, C, D, dif;
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor de A: ");
		A = sc.nextInt();
		System.out.print("Valor de B: ");
		B = sc.nextInt();
		System.out.print("Valor de C: ");
		C = sc.nextInt();
		System.out.print("Valor de D: ");
		D = sc.nextInt();
		dif = (A * B - C * D);
		System.out.printf("DIFERENÇA = " + dif);
		
		sc.close();
	}

}
