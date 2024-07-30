package aula2.poo.exercicio5;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Pedro");
		pessoa1.setDataNascimento(LocalDate.of(2004, 12, 9));

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("João");
		pessoa2.setDataNascimento(LocalDate.of(2004, 12, 9));

		JOptionPane.showMessageDialog(null, maisVelha(pessoa1, pessoa2));

	}

	// metodo simples para resolver a questao
	public static String maisVelha(Pessoa p1, Pessoa p2) {
		if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) < 0) {
			return p1.getNome() + " é a pessoa mais velha, com " + LocalDate.now().compareTo(p1.getDataNascimento())
					+ " anos de idade";
		} else if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) > 0) {
			return p2.getNome() + " é a pessoa mais velha, com " + LocalDate.now().compareTo(p2.getDataNascimento())
					+ " anos de idade";
		}
		return "Ambos possuem a mesma idade: " + LocalDate.now().compareTo(p1.getDataNascimento());

	}

}
