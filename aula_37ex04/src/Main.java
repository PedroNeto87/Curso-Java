import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		
		int tot;
		if(hi < hf) {
			tot = hf - hi;
		} else {
			tot = 24 - hi + hf;
		}
		
		System.out.printf("O JOGO DUROU " + tot + " HORA(S)");
		
		sc.close();
	}

}
