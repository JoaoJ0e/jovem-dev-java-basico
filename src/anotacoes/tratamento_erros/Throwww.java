package anotacoes.tratamento_erros;

import javax.swing.JOptionPane;

public class Throwww {

	public static void main(String[] args) {
		System.out.println(leNota());
	}
	
	
	
	
	private static Double leNota() {
		try {
			String notaString = JOptionPane.showInputDialog("Digite a nota");
			Double d = Double.parseDouble(notaString);
			
			// Envia um erro com uma mensagem personalizada
			if (d < 0) {
				throw new IllegalArgumentException("Nota não pode ser negativa");
			} 
			if (d > 10) {
				throw new NotaMaximaException("Nota não pode ser maior que 10!");
			}
			
			
			return d;
		} catch (NotaMaximaException e) {
			 System.out.println("Erro ao ler nota: " + e.getMessage());
			 return leNota();
		} catch (Exception e) {
			System.out.println("Erro ao ler nota: " + e.getMessage());
			return null;
		}
	}
	
//	private static Double leNota() {
//		try {
//			String notaString = JOptionPane.showInputDialog("Digite a nota");
//			return Double.parseDouble(notaString);
//		} catch (Exception e) {
//			System.out.println("Erro ao ler nota " + e.getMessage());
//			return null;
//		}
//	}
	
}
