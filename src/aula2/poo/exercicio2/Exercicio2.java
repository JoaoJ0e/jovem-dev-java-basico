package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
//		Faça um programa que peça ao usuário que digite
//		duas frases e depois diga a ele se as frases digitadas
//		são iguais. Informe ainda a quantidade de caracteres
//		de cada frase.

		String frase1 = JOptionPane.showInputDialog("Insira a primeira frase:");
		String frase2 = JOptionPane.showInputDialog("Insira a segunda frase:");
		
		JOptionPane.showMessageDialog(null, "Ambas as frases são iguais? -> " + (frase1.equals(frase2))
											+"\n Comprimento da frase 1: " + frase1.length()
											+ "\n Comprimento da frase 1: " + frase2.length());
		
	}

}
