package aula2.poo.exercicio5;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Pedro");
		pessoa1.setDataNascimento(LocalDate.of(2004, 5, 17));
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("João");
		pessoa2.setDataNascimento(LocalDate.of(1978, 9, 1));
		
	}
	// metodo simples para resolver a questao
	public String maisVelha(Pessoa p1, Pessoa p2) {
		if (p1.getDataNascimento().compareTo(p2.getDataNascimento()))
	}
	
	
}
