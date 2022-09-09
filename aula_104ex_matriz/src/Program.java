import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int [][] matriz = new int [m][n];
		
		for(int l=0; l<matriz.length; l++) {
			for(int c=0; c<matriz[l].length; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int l=0; l<matriz.length; l++) {
			for(int c=0; c<matriz[l].length; c++) {
				if(matriz[l][c] == x) {
					System.out.println("Position " + l + "," + c + ":");
					if(c>0) {
						System.out.println("Left: " + matriz[l][c-1]);
					}
					if(l>0) {
						System.out.println("Up: " + matriz[l-1][c]);
					}
					if(c<matriz[l].length-1) {
						System.out.println("Right: " + matriz[l][c+1]);
					}
					if(l<matriz.length-1) {
						System.out.println("Down: " + matriz[l+1][c]);
					}
				}
			}
		}
		
		sc.close();
	}

}
