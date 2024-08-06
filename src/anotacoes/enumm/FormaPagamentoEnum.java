package anotacoes.enumm;

import java.util.function.Supplier;

public enum FormaPagamentoEnum {
	CARTAO_DEBITO(1, "Cartão de Débito", () -> 0.0),
	CARTAO_CREDITO(2, "Cartão de Crédito", () -> 0.0),
	DINHEIRO(3, "Dinheiro", () -> {
		// faz calculos
		return 0.1;
	}) ,
	PIX(4, "PIX", () -> 0.1) ;
	
	private int numero;
	private String descricao;
	private Supplier<Double> desconto;
	
	
	private FormaPagamentoEnum(int numero, String descricao, Supplier<Double> desconto) {
		this.numero = numero;
		this.descricao = descricao;
		this.desconto = desconto;
	}


	//abstract double getDesconto();
	
	public int getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public Supplier<Double> getDesconto() {
		return desconto;
	}
	
	public String toString() {
		return String.format("%s - %s", numero, descricao);
	}
	
}
