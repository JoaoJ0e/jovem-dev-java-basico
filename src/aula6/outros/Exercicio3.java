package aula6.outros;

import aula6.outros.util.Calculadora2Enum;

public class Exercicio3 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();

		int n1 = 10;
		int n2 = 5;
		
		sb.append("VALORES: ").append(n1).append(", ").append(n2);
		
		for (Calculadora2Enum op : Calculadora2Enum.values()) {
			sb.append("\n").append(op).append(": ").append(op);
			
			//TODO: COMPLETAR
		}
		
	}
	
}
