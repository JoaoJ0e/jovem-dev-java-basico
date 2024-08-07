package aula6.outros;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExemploTest {

	
	private Exemplo exemplo = new Exemplo(25);
	
	@BeforeEach
	void setup() {
		exemplo = new Exemplo(50);
	}
	
	//@AfterEach
	
	// Nome de teste deve ser gigante mesmo
	@Test
	@DisplayName("Caso seja 0, deve retornar ZERO; Exceção caso contrário")
	void deveRetornarStringZeroQuandoNumeroIgualAZero() {
		int i = 0;

		String s = exemplo.verificaNumero(i);
		
		assertEquals("ZERO", s);
		
	}
	
	@Test
	void deveDispararExcecaoSeNumeroDiferenteDeZero() {
		int i = 2;
		
		//Exemplo exemplo = new Exemplo();
		
		assertThrows(IllegalArgumentException.class, () -> exemplo.verificaNumero(i));
	}

	@Test
	void deveDispararExcecaoSeNumeroDeSegurancaDiferenteDeCinquenta() {
		exemplo = new Exemplo(100);

		int i = 0;
		
		assertThrows(RuntimeException.class, () -> exemplo.verificaNumero(i));
		
	}
	
}
