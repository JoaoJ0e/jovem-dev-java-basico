package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import aula6.outros.Exercicio5;

class Exercicio5Aula6Test {

	Exercicio5 ex = new Exercicio5();
	
	@Test
	void deveRetornarRaio0796Metros() {
		assertEquals(BigDecimal.valueOf(0.796), ex.calculaRaio(5));
	}
	
	@Test
	void deveRetornarRaio0477Metros() {
		assertEquals(BigDecimal.valueOf(0.477), ex.calculaRaio(3));
	}
	
	@Test
	void deveRetornarRaio0318Metros() {
		assertEquals(BigDecimal.valueOf(0.318), ex.calculaRaio(2));
	}

}
