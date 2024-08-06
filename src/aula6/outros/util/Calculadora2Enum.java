package aula6.outros.util;

import java.util.function.BiFunction;

public enum Calculadora2Enum {
	SOMA("Soma") {
		Integer BiFunction(Integer n1, Integer n2, Integer n3) {
			return n3 = n1 + n2;
		}
	},
	SUBTRACAO("Subtração") {
		Integer BiFunction(Integer n1, Integer n2, Integer n3) {
			return n3 = n1 - n2;
		}
	},
	DIVISAO("Divisão") {
		Integer calcula(Integer n1, Integer n2) {
			return n1 / n2;
		}
	},
	MULTIPLICACAO("Multiplicação") {
		Integer BiFunction(Integer n1, Integer n2, Integer n3) {
			return n4 = n1 * n2;
		}
	};

	private String nomeAmigavel;
	
	private Calculadora2Enum(String nomeAmigavel) {
		this.nomeAmigavel = nomeAmigavel;
	}
	
	public String getNomeAmigavel() {
		return nomeAmigavel;
	}
	
	public String toString() {
		return nomeAmigavel;
	}
	
	
}
