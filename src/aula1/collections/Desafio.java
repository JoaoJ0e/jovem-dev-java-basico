package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		
//		Faça um programa que peça ao usuário para digitar
//		palavras e apertar enter. Ele deve continuar digitando
//		até digitar a palavra "fim". A seguir, crie um mapa
//		cujas chaves são as letras a, e, i, o, u. O valor desse
//		mapa é uma lista das palavras que contém as letras
//		correspondentes. No final, o programa deve mostrar,
//		para cada letra, a lista de palavras em ordem
//		crescente.

		ArrayList<String> listaPalavras = new ArrayList<>();

		String input = "";
		do {
			input = JOptionPane.showInputDialog("Digite uma palavra ('fim' para encerrar)").toLowerCase();
			if (!input.equals("fim")) {
				listaPalavras.add(input);
			}
		} while (!input.equals("fim"));

		Map<String, ArrayList<String>> mapa = new HashMap<>();

		mapa.put("a", null);
		mapa.put("e", null);
		mapa.put("i", null);
		mapa.put("o", null);
		mapa.put("u", null);

		
		String msg = "";

		for (String c : mapa.keySet()) {
			msg += "Chave: " + c + "\nPalavras que contêm " + c + ": \n";
			ArrayList<String> listaPut = new ArrayList<>();
			listaPut.clear();
			
			for (String p : listaPalavras) {
				if (p.contains(c)) {
					listaPut.add(p);
					msg += "-> " + p + "\n";
				}
			}
			mapa.put(c, listaPut);
			msg += "\n\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
