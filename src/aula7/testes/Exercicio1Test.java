package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import aula5.stream.Pessoa;

class Exercicio1Test {

	List<Pessoa> lista = new ArrayList<>();
	List<String> listaEsperada = new ArrayList<>();

	Exercicio1 ex = new Exercicio1();

	
	@Test
	void deveRetornarObadiasJohnnyAlberto() {
		lista.add(new Pessoa("Obadias", LocalDate.of(2004, 7, 1)));
		lista.add(new Pessoa("Alberto", LocalDate.of(1865, 5, 5)));
		lista.add(new Pessoa("João", LocalDate.of(2010, 10, 5)));
		lista.add(new Pessoa("Johnny", LocalDate.of(1884, 5, 5)));
		
		List<String> listaTeste = ex.mostraNomeSeVogalOuNasceuBissexto(lista);
		
		listaEsperada.add("Obadias");
		listaEsperada.add("Johnny");
		listaEsperada.add("Alberto");
		
		assertEquals(listaEsperada, listaTeste);
	}

	@Test
	void deveRetornarNadaPoisAmbasListasEstaoVazias() {
		
		assertEquals(listaEsperada, lista);
	}
	
}
