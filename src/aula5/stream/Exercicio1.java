package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Exercicio1 {

//	Faça um programa que cria uma lista com 50 números
//	aleatórios de 1 a 100 e imprime a soma de todos os
//	números
	
	
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			lista.add(new Random().nextInt(100));
		}
		
		System.out.println("Soma dos números da lista: " + lista.stream()
																.filter(Objects::nonNull)										
																.mapToInt(i -> i)
																.sum()
																);
		
		
	}
	
}
