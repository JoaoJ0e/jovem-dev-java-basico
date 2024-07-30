package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
//		Faça um programa que peça ao usuário que digite um
//		número com vírgula e mostre a ele a representação
//		inteira do número (ou seja, sem a vírgula)

		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número com vírgula"));
		JOptionPane.showMessageDialog(null, numero + " sem vírgula = " + (int) numero);

	}

}
