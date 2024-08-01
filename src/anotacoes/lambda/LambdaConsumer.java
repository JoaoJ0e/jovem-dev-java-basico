package anotacoes.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {

	public static void main(String[] args) {
		
		// Consumer
		List<String> lista = new ArrayList<>();
		lista.add("abc");
		lista.add("def");
		lista.add("ghi");
		
		lista.forEach(/*String*/ s -> {	// Não precisa declarar o tipo, porque o tipo
			System.out.println(s);		// já foi declarado na criação da lista
		});
		
		// quando tiver só um comando para rodar
		
		lista.forEach(s -> System.out.println(s));
		
		// quando tiver só um comando pra rodar, e ele receber apenas o parametro passado
		// aka method reference
		
		lista.forEach(System.out::println);
		
		/*
		 * E isso é a versão reduzida dessa bagaça:
		 */
		
		lista.forEach(new Consumer<String> () {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}			
		});
		
		
		
		
		
	}

}
