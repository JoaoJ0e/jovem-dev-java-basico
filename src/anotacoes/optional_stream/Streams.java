package anotacoes.optional_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// Streams não são reutilizáveis! Usou, descarte; não recicle.
		//colletion(lista,conjunto ou mapa.entrySet()).stream() -> lista.stream();
		
		// Além disso, streams não alteram o conteúdo original da lista!
		// Também podes encadear vários métodos numa stream.
		
		List<String> lista = new ArrayList<>();	
		lista.add("a");
		lista.add("bb");
		lista.add("ddd");
		lista.add("eeee");
		lista.add("a");
		lista.add("a");
		
		
		
		/* CONVERTE OU FORMATA 
		lista.stream()
			.map(letra -> letra.toUpperCase()) // letra -> letra.length() 
			.forEach(System.out::println);
		*/
		
		/* FILTRA
		lista.stream()
			.filter(elemento -> elemento.startsWith("a"))
			.forEach(System.out::println);
		*/
		
		/* DEIXA OS DISTINTOS /|\/|\ ORDENA
		lista.stream()
			.distinct()
			.sorted()
			.forEach(System.out::println);
		*/
		
		/* LIMITA A QUANTIDADE DE ITENS
		lista.stream()
			.limit(2)
			.forEach(System.out::println);
		*/
		
		/*
		lista.add(null);
		lista.stream()
		 	.filter(Objects::nonNull) // Tira os elementos nulos
		 	.forEach(System.out::println);
		*/
		
		
		 // *******************************************************
		// Operações Terminais - Encerram o fluxo
	   // forEach, findAny, allMatch, etc
		
		/*
		System.out.println(lista.stream()
				.filter(Objects::nonNull)
				.filter(elemento -> elemento.startsWith("a"))
				.anyMatch(elemento -> elemento.length() == 1)
				);
		*/
		
		/*
		System.out.println(lista.stream()
				.filter(Objects::nonNull)
				.mapToInt(String::length) // troca o valor resultado de Integer para int (primitivo)
				.average()
				.orElse(0.0)						// libera métodos como max, sum, average etc
				);
		*/
		
		
		/*
		List<String> resultado = lista.stream()
				.filter(Objects::nonNull)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		*/
		
		/*
		Map<Integer, String> resultado = lista.stream()
				.filter(Objects::nonNull)
				.distinct()
				.collect(Collectors
						.toMap(s -> s.length(), s -> s));
		*/
		
		Map<Integer, List<String>> resultado = lista.stream()
				.filter(Objects::nonNull)
				.distinct()
				.collect(Collectors
						.groupingBy(s -> s.length())
						);
		
		// ver joining (transforma em string)
		
		System.out.println(lista);
		System.out.println(resultado);
		
		
	}
	
}
