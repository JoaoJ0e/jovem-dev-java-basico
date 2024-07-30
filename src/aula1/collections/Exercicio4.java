package aula1.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
//		Faça um programa que peça para o usuário digitar
//		uma frase. Em seguida, mostre a quantidade de vezes
//		que cada caractere aparece na frase. Utilize a coleção
//		HashMap para esta tarefa.
//
//		Exemplo:
//		Frase: java basico
//		Resultado: j - 1, a - 3, v - 1, b - 1, s - 1, c - 1, o - 1, - 1

		Map<Character, Integer> mapa = new HashMap<>();

		String frase = JOptionPane.showInputDialog("Digite uma frase:").toLowerCase();

		// Primeira forma de fazer, deve ter um jeito melhor
		for (int i = 0; i < frase.length(); i++) {
			if (!mapa.containsKey(frase.charAt(i))) {
				int soma = 0;
				for (char c : frase.toCharArray()) {
					if (c == frase.charAt(i)) {
						soma++;
					}
				}
				mapa.put(frase.charAt(i), soma);
			}
		}

		
		System.out.println(mapa);
		
		// Método melhorado, estudar mais	
//		String frase = JOptionPane.showInputDialog("Insira uma frase");
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		for (int i = 0; i < frase.length(); i++) {
//			map.putIfAbsent(frase.charAt(i), 0);
//			map.computeIfPresent(frase.charAt(i), (key, val) -> val + 1);
//		}
//		JOptionPane.showMessageDialog(null, map);
		
		
		
	}

}
