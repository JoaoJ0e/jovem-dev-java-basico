package aula1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		
//		Faça um programa que crie uma lista com 50 números
//		inteiros com valor máximo 20. Mostre a lista e, em
//		seguida, mostre apenas os números contidos na lista,
//		sem repetição. Não utilize nenhuma estrutura de
//		repetição para fazer essa tarefa.
//
//		Exemplo:
//		Original: 1 2 3 4 3 5 2 6 2 6
//		Sem repetição: 1 2 3 4 5 6

		List<Integer> lista = new ArrayList<>();
		Set<Integer> conjunto = new HashSet<>();
		Random r = new Random();

		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(20));
		}

		System.out.println(lista);
		conjunto.addAll(lista);
		System.out.println(conjunto);

	}

}
