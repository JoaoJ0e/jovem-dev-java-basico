package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class OperacaoListasTest {

	OperacaoListas opl = new OperacaoListas();
	List<Integer> lista = new ArrayList<>();

	@Test
	void deveRetornarSoma() {
		lista.add(10);
		lista.add(20);

		assertEquals(30, opl.somaNumeros(lista));
	}

	@Test
	void deveRetornarMediaDosNumerosMaioresQueCinquenta() {
		lista.add(25);
		lista.add(30);
		lista.add(50);
		lista.add(100);
		lista.add(75);

		assertEquals(75, opl.mediaNumerosMaioresQue50(lista));

	}

	@Test
	void deveRetornarQuantidadeDe25IgualATres() {
		lista.add(25);
		lista.add(25);
		lista.add(25);
		lista.add(50);

		assertEquals(3, opl.contaNumero25(lista));
		
	}
	
}
