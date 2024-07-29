package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		
//		Faça um programa que crie uma lista com 50 números
//		inteiros aleatórios e depois exiba-os ordenados do
//		menor para o maior
		
		List<Integer> lista = new ArrayList<>();
		Random r = new Random();
		
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(500));
		}
		
		//lista.sort(null);
		Collections.sort(lista);
		System.out.println(lista);
	}
	
}
