package aula_103exmatriz;

import java.util.Scanner;

public class Matriz_bidimensional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] matriz = new int [n][n]; //Instanciar uma matriz (bidimensional)
		
		for(int l=0; l<matriz.length; l++) {
			for(int c=0; c<matriz[l].length; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		int count = 0;
		
		for(int l=0; l<matriz.length; l++) {
			for(int c=0; c<matriz[l].length; c++) {
				if(matriz[l][c] < 0) {
					count++;
				}
			}
		}
		System.out.print("Negative numbers= " + count);
		
		sc.close();
	}

}
