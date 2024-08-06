package aula6.outros.util;

public enum Calculadora1Enum implements CalculoInterface {
	SOMA("Soma", (n1, n2) -> n1 + n2),
	SUBTRACAO("Subtração", (n1, n2) -> n1 - n2),
	DIVISAO("Divisão", (n1, n2) -> n1 / n2),
	MULTIPLICACAO("Divisão", (n1, n2) -> n1 * n2);

	private String nomeAmigavel;
	final CalculoInterface calcula;
	
	private Calculadora1Enum(String nomeAmigavel, CalculoInterface calcula) {
		this.nomeAmigavel = nomeAmigavel;
		this.calcula = calcula;
	}
	
	

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}



	@Override
	public Integer calcula(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return null;
	}

}
