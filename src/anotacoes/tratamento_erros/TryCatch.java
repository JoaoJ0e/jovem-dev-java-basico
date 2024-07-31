package anotacoes.tratamento_erros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		
		// Pegando erro por erro, com uma mensagem para cada
		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (NullPointerException e) { // se o erro for pego, o programa nao para
			System.out.println("Erro: Variável nula");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: Outro coisa aconteceu");
		}
		
		// Usando multicatch para pegar varios erros por vez
		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (NullPointerException | IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
		// Englobando todos os erros
		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (Exception e) { // RuntimeException extends Exception
			System.out.println("Erro: pegando todos os erros");
		}
		
		// Englobando todos os erros, tratando alguns também
		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (NullPointerException e) {
			System.out.println("Erro: nullpointer");
		} catch (Exception e) {
			System.out.println("Erro: algum outro erro aconteceu");
		} 
			
		// Finally (fechar recursos)
		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (NullPointerException e) {
			System.out.println("Erro: nullpointer");
		} catch (Exception e) {
			System.out.println("Erro: algum outro erro aconteceu");
		} finally {
			System.out.println("Processo finalizado");
		}
			
		// Try with resourcers (finally, só que mais usado)
		// Fecha os recursos ao findar a execução
		try (FileReader f = 
				new FileReader("\"C:\\Users\\JOVEM DEV\\eclipse-workspace\\jovem-dev-java-basico\\src\\anotacoes\\Datas.java\"")){
			System.out.println("Arquivo Lido");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
		System.out.println("Programa continuando normalmente");
	}
}
