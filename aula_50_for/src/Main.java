import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o n� de repeti��es: ");
		int c = sc.nextInt();
		
		int soma = 0;
		for(int i=0; i<c; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.print("O valor da soma dos valores �: " + soma);
		
		
		sc.close();
	}

}
