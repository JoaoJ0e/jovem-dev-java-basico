package aula6.outros.util;

public enum Calculadora1Enum implements CalculoInterface {
	SOMA("Soma") {
		@Override
		public int calcula(int n1, int n2) {
			return n1 + n2;
		}
	},
	SUBTRACAO("Subtração") {
		@Override
		public int calcula(int n1, int n2) {
			return n1 - n2;
		}
	},
	DIVISAO("Divisão") {
		@Override
		public int calcula(int n1, int n2) {
			return n1 / n2;
		}
	},
	MULTIPLICACAO("Divisão") {
		@Override
		public int calcula(int n1, int n2) {
			return n1 * n2;
		}
	};

	private String nomeAmigavel;

	private Calculadora1Enum(String nomeAmigavel) {
		this.nomeAmigavel = nomeAmigavel;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

}
