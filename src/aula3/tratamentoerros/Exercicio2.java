package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 0;
		do {

			try {
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));

				if (n2 == 0) {
					throw new ZeroException("Divisor não pode ser nulo (0)");
				}
			} catch (ZeroException e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
			}
		} while (n2 == 0);

		JOptionPane.showMessageDialog(null, n1 / n2);

	}

}
