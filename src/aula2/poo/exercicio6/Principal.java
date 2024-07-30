package aula2.poo.exercicio6;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import aula2.poo.exercicio5.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Pedro");
		pessoa.setDataNascimento(LocalDate.of(2005, 5, 6));

		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("João");
		pessoaFisica.setDataNascimento(LocalDate.of(2004, 12, 9));
		pessoaFisica.setCpf("123.456.789-00");
		
		JOptionPane.showMessageDialog(null, achaMaisNova(pessoa, pessoaFisica));;
		
		
	}
	
	public static String mostraDados(Pessoa p) {
		return "Nome: " + p.getNome() 
		+ "\nIdade: " + LocalDate.now().compareTo(p.getDataNascimento());
	}
	
	public static String mostraDados(PessoaFisica p) {
		return "Nome: " + p.getNome() 
		+ "\nIdade: " + LocalDate.now().compareTo(p.getDataNascimento())
		+ "\nCPF: " + p.getCpf();
	}
	
	
	// ACHA PESSOA
	
	public static String achaMaisNova(Pessoa p1, Pessoa p2) {
		if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) > 0) {
			return mostraDados(p1);
		} else if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) < 0) {
			return mostraDados(p2);
		}
		return "Ambos tem a mesma idade! \n\n" + mostraDados(p1) + "\n\n" + mostraDados(p2);
	}
	
	public static String achaMaisNova(Pessoa p1, PessoaFisica p2) {
		if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) > 0) {
			return mostraDados(p1);
		} else if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) < 0) {
			return mostraDados(p2);
		}
		return "Ambos tem a mesma idade! \n\n" + mostraDados(p1) + "\n\n" + mostraDados(p2);
	}
	
	public static String achaMaisNova(PessoaFisica p1, PessoaFisica p2) {
		if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) > 0) {
			return mostraDados(p1);
		} else if (p1.getDataNascimento().compareTo(p2.getDataNascimento()) < 0) {
			return mostraDados(p2);
		}
		return "Ambos tem a mesma idade! \n\n" + mostraDados(p1) + "\n\n" + mostraDados(p2);
	}
}
