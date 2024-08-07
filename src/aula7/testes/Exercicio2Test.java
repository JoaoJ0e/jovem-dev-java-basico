package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import aula7.testes.exceptions.ZeroBertoException;


class Exercicio2Test {

	Exercicio2 ex2 = new Exercicio2();
	List<String> lista = new ArrayList<>();

	@Test
	void deveRetornarUmberto() {
		lista.add("Umberto");
		lista.add("Doisberto");
		lista.add("João");
		lista.add("Eduardo");
		lista.add("Mônica");

		assertEquals(ex2.pegaPrimeiroBerto(lista), "Umberto");
	}

	@Test
	void deveRetornarDoisberto() {
		lista.add("João");
		lista.add("Eduardo");
		lista.add("Doisberto");
		lista.add("Mônica");

		assertEquals(ex2.pegaPrimeiroBerto(lista), "Doisberto");

	}
	
	@Test
	void deveRetornarZeroBertoException() {
		assertThrows(ZeroBertoException.class, () -> ex2.pegaPrimeiroBerto(lista));
		
		lista.add("Eduardo");
		lista.add("Mônica");
		lista.add("Pedro");
		lista.add("Thiago");
		
		assertThrows(ZeroBertoException.class, () -> ex2.pegaPrimeiroBerto(lista));
	}
}
