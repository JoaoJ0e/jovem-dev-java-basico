package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("ouro");
		lista.add("ferro");
		lista.add("cobalto");
		lista.add("aço");
		lista.add("cobre");
		
		Mostrador m = (s) -> s.toUpperCase();
		
		lista.forEach(s -> {
			System.out.println(m.mostra(s));
		});
		
	}
}
