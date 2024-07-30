package anotacoes.poo;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa{
	protected LocalDate idade;
	protected String cpf;
	protected Double altura;
	
	
	public LocalDate getIdade() {
		return idade;
	}
	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	
}
