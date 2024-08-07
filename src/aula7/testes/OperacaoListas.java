package aula7.testes;

import java.util.List;
import java.util.Objects;

public class OperacaoListas {

	public OperacaoListas() {
	}
	
	
	Integer somaNumeros(List<Integer> lista) {
		return lista.stream()
				.filter(Objects::nonNull)
				.mapToInt(i -> i)
				.sum();
	}
	
	Double mediaNumerosMaioresQue50(List<Integer> lista) {
		return lista.stream()
		.filter(Objects::nonNull)
		.filter(i -> i >= 50)
		.mapToInt(i -> i)
		.average()
		.orElse(0);
	}
	
	Integer contaNumero25(List<Integer> lista) {
		return (int) lista.stream()
		.filter(Objects::nonNull)
		.filter(i -> i == 25)
		.count();
	}
	
}
