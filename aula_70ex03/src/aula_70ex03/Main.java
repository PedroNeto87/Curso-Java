package aula_70ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do aluno: ");
		aluno.name = sc.nextLine();
		System.out.print("Nota 1º trimestre: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("Nota 2º trimestre: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("Nota 3º trimestre: ");
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f\n", aluno.resultado());
		if(aluno.resultado() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING " + String.format("%.2f", aluno.missingPoint())+ " POINTS");
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
