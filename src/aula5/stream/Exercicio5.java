package aula5.stream;

import java.util.ArrayList;
import java.util.List;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 {

//	Faça um programa que cria uma lista com 10 nomes. Em
//	seguida, imprima o nome da primeira pessoa da lista que
//	possua o nome terminado com "berto". Se não houver, dispare
//	uma ZeroBertoException.
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Umberto");
		lista.add("Doisberto");
		lista.add("João");
		lista.add("Eduardo");
		lista.add("Mônica");
		lista.add("Gilberto");
		lista.add("Pedro");
		lista.add("Thiago");
		lista.add("placeholder1");
		lista.add("insira_nome_legal");
	
		System.out.println(lista.stream()
				.filter(elemento -> elemento.endsWith("berto"))
				.findFirst()
				.orElseThrow(ZeroBertoException::new));

	}

}
