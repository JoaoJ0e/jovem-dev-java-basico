package aula6.outros.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private String telefone;
	private LocalDate dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void pedeDataNascimento() {
		boolean inputValido = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			String dtNascString = JOptionPane.showInputDialog("Insira a Data de Nascimento do Cliente (dd/MM/yyyy)");
			try {
				LocalDate dtNasc = LocalDate.parse(dtNascString, formatter);
				setDataNascimento(dtNasc);
				inputValido = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: Data inválida!");
			}
		} while (!inputValido);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ").append(nome).append("\nData de Nascimento: ").append(dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		return sb.toString();
	}
	
}
