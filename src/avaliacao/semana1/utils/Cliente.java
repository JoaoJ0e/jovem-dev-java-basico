package avaliacao.semana1.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Cliente {

	private String nome;
	private LocalDate dataNascimento;
	
	public void pedeDataNascimento() {
		boolean inputValido = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			String dtNascString = JOptionPane.showInputDialog("Insira a Data de Nascimento do Cliente (dd/MM/yyyy)");
			try {
				LocalDate dtNasc = LocalDate.parse(dtNascString, formatter);
				this.dataNascimento = dtNasc;
				inputValido = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: Data inválida!");
			}
		} while (!inputValido);
	}
	
	public String mascaraNome() {
		
		String ast = "";
		for (int i = 1; i < nome.length(); i++) {
			if (nome.substring(i, i+1).equals(" ")) {
				ast += " ";
			} else {
				ast += "*";
			}
		}
		return nome.substring(0,1) + (nome.substring(1).replace(nome.substring(1), ast));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	

}
