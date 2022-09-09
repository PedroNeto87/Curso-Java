package aula_97lacoforeach;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Alex", "Bob"};
		
		for(String names : vect) {
			System.out.println(names);
		}
	}

}
