package aula7.testes;

import java.util.List;

import aula7.testes.exceptions.ZeroBertoException;


public class Exercicio2 {

	
	public String pegaPrimeiroBerto(List<String> lista) {
		return lista.stream()
		.filter(elemento -> elemento.endsWith("berto"))
		.findFirst()
		.orElseThrow(ZeroBertoException::new);
	}
}
