package aula_70ex03;

public class Aluno {
	public String name;
	public double n1, n2, n3;
	
	public double resultado() {
		return n1 + n2 + n3;
	}
	
	public double missingPoint() {
		if(resultado() < 60.0) {
			return 60.0 - resultado();
		}
		else {
			return 0.0;
		}
	}
}
