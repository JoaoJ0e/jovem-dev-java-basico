package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Desafio {

//	Utilize a classe Pessoa do exercício 4.
//	Em seguida, crie uma lista com 10 pessoas (não é necessário preencher
//	o telefone).
//	Mostre apenas os nomes que começam com vogal ou nasceram em ano
//	bissexto, em ordem alfabética decrescente (Z -> A) e separados por ponto e
//	vírgula.
	
	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<>();
		lista.add(new Pessoa("João", LocalDate.of(2004, 7, 1)));
		lista.add(new Pessoa("Johannes", LocalDate.of(1865, 5, 5)));
		lista.add(new Pessoa("Ojhn", LocalDate.of(2010, 10, 5)));
		lista.add(new Pessoa("Johnny", LocalDate.of(1889, 5, 5)));
		lista.add(new Pessoa("Johnson", LocalDate.of(1920, 7, 3)));
		
		lista.add(new Pessoa("Pedro", LocalDate.of(2004, 7, 1)));
		lista.add(new Pessoa("Peter", LocalDate.of(1807, 5, 5)));
		lista.add(new Pessoa("Petrus", LocalDate.of(2014, 10, 5)));
		lista.add(new Pessoa("Pietro", LocalDate.of(1886, 5, 5)));
		lista.add(new Pessoa("Pétur", LocalDate.of(1920, 7, 3)));
		
		System.out.println(
			lista.stream()
				.filter(Objects::nonNull)
				.filter(p -> p.getNome().startsWith("A") 
						|| p.getNome().startsWith("E") 
						|| p.getNome().startsWith("I") 
						|| p.getNome().startsWith("O") 
						|| p.getNome().startsWith("U")
						|| p.getDataNascimento().isLeapYear())
				.sorted(Comparator.comparing(Pessoa::getNome).reversed())
				.map(Pessoa::getNome)
				.collect(Collectors.joining("; "))
				);
		
	}
	
}
