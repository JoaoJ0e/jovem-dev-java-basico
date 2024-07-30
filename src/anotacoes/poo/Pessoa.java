package anotacoes.poo;

public class Pessoa {
	protected String nome;

	
	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	
	// Protected = Só o pai e seus filhos
	// 			   podem ver
}
