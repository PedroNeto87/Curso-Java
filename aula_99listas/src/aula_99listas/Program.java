package aula_99listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("João");
		list.add(1, "José");
		list.add(0, "Antônia");
		list.add("Manuel");
		
		System.out.println(list.size());
		//list.remove(0);
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------");
		list.removeIf(x -> x.charAt(0) == 'M');//Função lambda; Predicado = retornar em V ou F.
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------");
		System.out.println("Index of Maria: " + list.indexOf("Maria"));
		
		System.out.println("----------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------");
		String name = list.stream().filter(x -> x.charAt(1) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
