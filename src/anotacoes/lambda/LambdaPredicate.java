package anotacoes.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaPredicate {

	public static void main(String[] args) {
		
		// Predicate
		
		List<String> lista = new ArrayList<>();
		lista.add("abc");
		lista.add("def");
		lista.add("ghi");
		lista.add("jkl");
		lista.add("abobrinha");
		
		/* 
		 * Já percorre a lista, eliminando um
		 * item "s" se a condição depois da 
		 * flecha retornar verdadeiro
		 */
		lista.removeIf(s -> s.startsWith("a"));
		
		lista.forEach(System.out::println);
		
	}
	
}
