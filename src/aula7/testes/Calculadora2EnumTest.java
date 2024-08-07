package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aula6.outros.util.Calculadora2Enum;

class Calculadora2EnumTest {

	int n1 = 10;
	int n2 = 5;
	
	@Test
	void deveRetornarQuinze() {
		assertEquals(15, Calculadora2Enum.SOMA.getCalculo().apply(n1, n2));
	}

	@Test
	void deveRetornarCinco() {
		assertEquals(5, Calculadora2Enum.SUBTRACAO.getCalculo().apply(n1, n2));
	}
	
	@Test
	void deveRetornarDois() {
		assertEquals(2, Calculadora2Enum.DIVISAO.getCalculo().apply(n1, n2));
	}
	
	@Test
	void deveRetornarCinquenta() {
		assertEquals(50, Calculadora2Enum.MULTIPLICACAO.getCalculo().apply(n1, n2));
	}
	
}
