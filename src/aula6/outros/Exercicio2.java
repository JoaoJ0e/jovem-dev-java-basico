package aula6.outros;

import aula6.outros.util.Calculadora1Enum;

public class Exercicio2 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		int n1 = 10;
		int n2 = 5;
		
		sb.append("VALORES: ").append(n1).append(", ").append(n2);


		for (Calculadora1Enum op : Calculadora1Enum.values()) {
			sb.append(op).append(": ").append(op.calcula(n1, n2));
			sb.append("\n");
		}

		System.out.println(sb.toString());

	}

}
