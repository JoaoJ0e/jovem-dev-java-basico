package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		boolean fim = false;
		do {
			try {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
				JOptionPane.showMessageDialog(null, numero);
				fim = true;
				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido");
			}
		} while (!fim);
		
		
	}
	
}
