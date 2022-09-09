import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe valores para soma: [0-Stop]");
		int n = sc.nextInt();
		int s = 0;
		while(n != 0) {
			s += n;
			n = sc.nextInt();		
		}
		System.out.print("A soma dos valores digitados é: " + s);
		
		sc.close();
	}

}
