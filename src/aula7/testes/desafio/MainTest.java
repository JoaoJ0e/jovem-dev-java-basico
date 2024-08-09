package aula7.testes.desafio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import aula6.outros.util.Evento;
import aula6.outros.util.TipoEventoEnum;

class MainTest {

	List<Evento> lista = new ArrayList<>();

//	Teste as seguintes situações:
//		- Usuário digitou um Evento inválido
//		- Usuário digitou um Evento que não está na lista
//		- Método retornando apenas eventos de uma categoria
//		- Método retornando eventos de ambas as categorias
	
	// Não está correto. Preciso refatorar o código fonte para melhor utilizar os métodos.
	// O jeito atual está muito desorganizado. 
	
	Main main = new Main();
	
	@Test
	void verificaEventoValido() {
		main.cadastraNovoEvento(lista);
	}
	
	@Test
	void verificaSeUsuarioDigitouUmEventoQueNaoEstaNaLista() {
		lista.add(new Evento("lazer1", LocalDateTime.of(2024, 8, 10, 12, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("lazer2", LocalDateTime.of(2024, 8, 3, 12, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("lazer3", LocalDateTime.of(2024, 8, 3, 12, 0), TipoEventoEnum.LAZER));
		main.organizaEvento(lista);
	}
	
	@Test
	void deveRetornarEventosPassadosEPendentes() {
		lista.add(new Evento("lazer1", LocalDateTime.of(2024, 8, 10, 12, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("lazer2", LocalDateTime.of(2024, 8, 3, 12, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("lazer3", LocalDateTime.of(2024, 8, 3, 12, 0), TipoEventoEnum.LAZER));
		
		main.mostraDados(main.organizaEvento(lista));
		
		
	}

}
