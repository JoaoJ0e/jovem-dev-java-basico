package aula2.poo.exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
//		Faça um programa que peça ao usuário para digitar
//		uma data (formato dd/MM/yyyy) e mostre o dia da
//		semana em que essa data caiu. Para os fins desse
//		programa, o dia da semana pode ser em inglês.

		String dataInput = JOptionPane.showInputDialog("Insira uma data (dd/MM/yyyy)");
		
		LocalDate data = LocalDate.parse(dataInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		JOptionPane.showMessageDialog(null, data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
				+ " -> " + data.getDayOfWeek());
		
	}

}
