package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Exercicio3 {

//	Faça um programa que cria uma lista com 50 números
//	aleatórios de 1 a 100 e retorne quantos números "25" há na
//	lista.

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			lista.add(new Random().nextInt(100));
		}
		
		System.out.printf("O número 25 aparece " + lista.stream()
													.filter(Objects::nonNull)
													.filter(i -> i == 25)
													.count() 
													+ " vezes na lista");

	}

}
