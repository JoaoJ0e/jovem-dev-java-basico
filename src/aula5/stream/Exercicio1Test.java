package aula5.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Exercicio1Test {

	@Test
	void test() {
		List<Integer> lista = new ArrayList<>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		
		List<Integer> listaVazia = new ArrayList<>();

		
		Exercicio1 ex = new Exercicio1();
		Integer resultado = ex.somaNumeros(lista);
		Integer resultadoListaVazia = ex.somaNumeros(listaVazia);

		
		assertEquals(60, resultado);
		assertEquals(0, resultadoListaVazia);
		
		/*
		 * assertEquals
		 * assertTrue
		 * assertNotNull
		 */
		
		// Prepara, executa, verifica!
		
		
	}

}
