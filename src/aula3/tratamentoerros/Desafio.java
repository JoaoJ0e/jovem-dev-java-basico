package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {

	public static void main(String[] args) {

		Venda venda = new Venda();

		try {
			venda.setNomeCliente(JOptionPane.showInputDialog("Nome do cliente:"));
			venda.setItens();
			JOptionPane.showMessageDialog(null, venda.geraCupomFiscal());
		} catch (VendaException e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}
	}

}
