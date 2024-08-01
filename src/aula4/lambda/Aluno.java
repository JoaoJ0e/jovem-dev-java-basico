package aula4.lambda;

import java.time.LocalDate;

public class Aluno {

	private String nome;
	private Integer numeroChamada;
	private LocalDate dataNascimento;

	public Aluno(String nome, int numeroChamada, LocalDate dataNasc) {
		this.nome = nome;
		this.numeroChamada = numeroChamada;
		this.dataNascimento = dataNasc;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome()
			+ "\nNumero na Chamada: " + this.getNumeroChamada()
			+ "\nData de Nascimento: " + this.getDataNascimento()
			+ "\n\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroChamada() {
		return numeroChamada;
	}

	public void setNumeroChamada(Integer numeroChamada) {
		this.numeroChamada = numeroChamada;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
