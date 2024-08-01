package anotacoes.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaFunction {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("abc");
		lista.add("def");
		lista.add("ghi");
		lista.add("jkl");
		lista.add("abobrinha");
		
		lista.stream()
			.map(s -> s.toUpperCase())
			.forEach(System.out::println);

		lista.stream()
		.map(s -> s.length()) // Não altera a lista original
		.forEach(System.out::println);
		
	}
}
