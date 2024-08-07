package aula5.stream;

import java.util.List;
import java.util.Objects;

public class Exercicio1_Melhorado {

//	Faça um programa que cria uma lista com 50 números
//	aleatórios de 1 a 100 e imprime a soma de todos os
//	números

	public Exercicio1_Melhorado() {
	}

	Integer somaNumeros(List<Integer> lista) {
		return lista.stream().filter(Objects::nonNull).mapToInt(i -> i).sum();
	}

}
