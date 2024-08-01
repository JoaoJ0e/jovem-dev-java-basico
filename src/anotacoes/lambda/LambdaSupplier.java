package anotacoes.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class LambdaSupplier {

	public static void main(String[] args) {
		
		// Supplier
		
		List<String> lista = new ArrayList<>();
		lista.add("abc");
		lista.add("def");
		lista.add("ghi");
		
//		Supplier<String> supplier = () -> "abc";
//		String s = "abc"; // mesma coisa, porém

		/*
		 * Dessa forma, o programa só vai realizar a consulta
		 * na hora de dar o s.get(). (Lazy Loading). Usando 
		 * string normal, ele já carrega na hora de definir
		 * a variável.
		 */
		
		System.out.println("iniciando");
		Supplier<String> s = () -> consultaPesada();
		System.out.println("fazendo outras coisas");
		System.out.println("fazendo outras coisas");
		System.out.println("fazendo outras coisas");
		System.out.println("fazendo outras coisas");
		System.out.println("fazendo outras coisas");
		System.out.println("fazendo outras coisas");
		System.out.println("fazendo outras coisas");
		System.out.println(s.get());
		
		
	}

	public static String consultaPesada(){
		// vai no banco
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		return "1300 clientes";
	}
	
}
