package aula7.testes;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import aula5.stream.Pessoa;

public class Exercicio1 {

	public Exercicio1() {	}
	
	public List<String> mostraNomeSeVogalOuNasceuBissexto(List<Pessoa> lista) {
		return lista.stream()
		.filter(Objects::nonNull)
		.filter(p -> p.getNome().startsWith("A") 
				|| p.getNome().startsWith("E") 
				|| p.getNome().startsWith("I") 
				|| p.getNome().startsWith("O") 
				|| p.getNome().startsWith("U")
				|| p.getDataNascimento().isLeapYear())
		.sorted(Comparator.comparing(Pessoa::getNome).reversed())
		.map(Pessoa::getNome)
		.toList()
		;
	}
}
