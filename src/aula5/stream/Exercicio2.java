package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Exercicio2 {

//	Faça um programa que cria uma lista com 50 números
//	aleatórios de 1 a 100 e mostre a média de todos os números
//	maiores que 50

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			lista.add(new Random().nextInt(100));
		}

		
		System.out.println("Média dos números maiores que 100: " + lista.stream()
																		.filter(Objects::nonNull)
																		.filter(i -> i >= 50)
																		.mapToInt(i -> i)
																		.average()
																		.orElse(0)
																		);
			
		
		
	}

}
