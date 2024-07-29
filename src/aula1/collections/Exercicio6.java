package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		
//		Faça um programa que leia o nome de 5 alunos. Em
//		seguida, leia 3 notas de cada um dos 5 alunos.
//		Armazene esses dados em um mapa, cuja chave é o
//		nome do aluno. Quando o usuário terminar de digitar
//		as notas, exiba o nome do aluno, suas notas e a
//		média.

		Map<String, ArrayList<Double>> mapa = new HashMap<>();

		int qtdAlunos = 5;
		int qtdNotas = 3;
		
		for (int i = 0; i < qtdAlunos; i++) {
			String nome = JOptionPane.showInputDialog("Nome do aluno " + (i + 1));
			ArrayList<Double> notas = new ArrayList<>();
			for (int j = 0; j < qtdNotas; j++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Nota " + (j + 1) + " de " + nome));
				notas.add(nota);
			}

			mapa.put(nome, notas);
		}

		String msg = "";
		for (String nome : mapa.keySet()) {
			msg += "\nNome: " + nome
				+ "\nNotas: " + mapa.get(nome)
				+ "\nMédia: " + calculaMedia(mapa.get(nome))
				+ "\n\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

	public static double calculaMedia(ArrayList<Double> notas) {
		double soma = 0;
		for (Double nota : notas) {
			soma += nota;
		}

		return soma / notas.size();
	}
	
	
}
