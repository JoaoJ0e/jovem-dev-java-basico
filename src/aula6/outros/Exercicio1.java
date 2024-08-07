package aula6.outros;

import aula6.outros.util.DiaSemanaEnum;

public class Exercicio1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		for (DiaSemanaEnum d : DiaSemanaEnum.values()) {
			sb.append(d.toString());
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
	}
	
}
