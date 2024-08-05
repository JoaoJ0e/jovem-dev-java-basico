package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio4 {

//	Crie uma classe chamada Pessoa contendo nome, telefone e
//	data de nascimento. A seguir, crie uma lista com 10 pessoas
//	e mostre todas as pessoas que nascidas em maio, ordenadas
//	por nome

	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<>();
		
		lista.add(new Pessoa("João", LocalDate.of(2004, 7, 1)));
		lista.add(new Pessoa("Johnny", LocalDate.of(1865, 5, 5)));
		lista.add(new Pessoa("John", LocalDate.of(2010, 10, 5)));
		lista.add(new Pessoa("Johannes", LocalDate.of(1884, 5, 5)));
		lista.add(new Pessoa("Johnson", LocalDate.of(1920, 7, 3)));


		System.out.println("Pessoas que nasceram em maio: ");

		lista.stream()
			.filter(p -> p.getDataNascimento().getMonthValue() == 5)
			.sorted(Comparator.comparing(Pessoa::getNome))
			.forEach(p -> System.out.println(p.getNome()));

	}

}
