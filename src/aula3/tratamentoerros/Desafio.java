package aula3.tratamentoerros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {

	public static void main(String[] args) {
		
		Venda venda = new Venda();
		venda.setNomeCliente(JOptionPane.showInputDialog("Nome do cliente:"));
		int qtdItens = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de itens:"));

		try {
			if (qtdItens <= 0 || qtdItens > 10) {
				throw new VendaException("Quantidade inválida: Insira uma quantidade de 1 à 10.");
			}
			String nome = "";
			double preco = 0;
			
			ArrayList<Item> listaItens = new ArrayList<>();
			
			for (int i = 0; i < qtdItens; i++) {
				nome = JOptionPane.showInputDialog("Insira o nome do " + (i+1) + "º item: ");
				do { 
					//Validação do preço do item
					try {
						preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do " + (i+1) + "º item: "));
						if (preco <= 0) {
							throw new PrecoIncorretoException("Valor não pode ser menor ou igual a zero.");
						}
					} catch (PrecoIncorretoException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
				} while (preco <= 0);
				
				Item item = new Item(nome, preco);
				listaItens.add(item);
				
			}
			venda.setItens(listaItens);
			JOptionPane.showMessageDialog(null, venda.geraCupomFiscal());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: "+ e.getMessage());;
		}
		
	}
		
}
