package aula6.outros;

import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import aula6.outros.util.Pessoa;

public class Exercicio4 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.setNome(JOptionPane.showInputDialog("Nome da pessoa 1"));
		p1.pedeDataNascimento();

		Pessoa p2 = new Pessoa();
		p2.setNome(JOptionPane.showInputDialog("Nome da pessoa 2"));
		p2.pedeDataNascimento();
		
		System.out.println(verificaMaisVelha(p1, p2));


	}
	// p1 > p2 = -
	// p1 < p2 = +
	// p1 = p2 = 0
	private static String verificaMaisVelha(Pessoa p1, Pessoa p2) {
		if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) < 0 ) {
			return p1.toString();
		} else if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) > 0 ) {
			return p2.toString();
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Ambos possuem a mesma idade!\nData de Nascimento de ambos: ")
			.append(p1.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		return sb.toString();
		
	}
}
