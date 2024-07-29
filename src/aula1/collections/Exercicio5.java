package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio5 {

	public static void main(String[] args) {
		
		
//		Crie dois sets com 10 números aleatórios entre 1 e 30.
//		Mostre os dois conjuntos e, em seguida, mostre apenas
//		os elementos que estiverem presentes em ambos os
//		conjuntos.
//
//		Exemplo:
//		Conjunto 1: 1, 2, 3, 4
//		Conjunto 2: 3, 4, 5, 6
//		Intersecção: 3, 4

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			set1.add(r.nextInt(30));
			set2.add(r.nextInt(30));
		}

		set3.addAll(set1);
		set3.retainAll(set2);

		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);

	}

}
