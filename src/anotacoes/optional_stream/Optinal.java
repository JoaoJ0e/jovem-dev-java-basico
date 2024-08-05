package anotacoes.optional_stream;

import java.time.LocalDateTime;
import java.util.Optional;

public class Optinal {

	public static void main(String[] args) {
		
		String s = getString();
		
		Optional<String> optS = Optional.ofNullable(s);

		
		// Imprime o optS se for não nulo. *Se não* (orElse), imprima VV isso
		// Ajuda a evitar NUllPointerException, deixando o código legível
		
		System.out.println(optS.orElse("Não foi possível obter a string"));

		System.out.println(optS.orElseGet(() -> getValorPadrao()));
		
		System.out.println(optS.orElseThrow(() -> new IllegalArgumentException("Valor incorreto")));
		
	}
	
	private static String getValorPadrao() {
		System.out.println("ENTROU NO MÉTODO GETVALORPADRAO");
		return "Não foi possível obter a string";
	}
	
	
	private static String getString() {
		if (LocalDateTime.now().getSecond()% 2 == 0) {
			return "Retornou";
		}
		return null;
	}
	
}
