import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.print("Informe o valor de A: ");
		A = sc.nextInt();
		System.out.print("Informe o valor de B: ");
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("S�O MULTIPLOS");
		} else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		
		sc.close();
	}

}
