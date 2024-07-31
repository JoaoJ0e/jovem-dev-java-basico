package aula3.tratamentoerros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {

	public static void main(String[] args) {
		
		Venda venda = new Venda();
		
		try {
			venda.setNomeCliente(JOptionPane.showInputDialog("Nome do cliente:"));
			ArrayList<Item> lista = pedeItens();
			venda.setItens(lista);
			JOptionPane.showMessageDialog(null, venda.geraCupomFiscal());
		} catch (VendaException e) {
			JOptionPane.showMessageDialog(null, "Erro: "+ e.getMessage());
		}
	}
		

	public static ArrayList<Item> pedeItens() throws VendaException {
		int qtdItens = validaQtdItens();
		String nome = "";
		double preco = 0;
			
		ArrayList<Item> listaItens = new ArrayList<>();
		
		for (int i = 0; i < qtdItens; i++) {
			nome = JOptionPane.showInputDialog("Insira o nome do " + (i+1) + "º item: ");
			preco = validaPreco();			
			Item item = new Item(nome, preco);
			listaItens.add(item);
		}
		
		return listaItens;
		
	}
	
	
	public static int validaQtdItens() throws VendaException {
		boolean continua = true;
		do {
			try {
				int qtdItens = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de itens:"));
				if (qtdItens <= 0 || qtdItens > 10) {
					throw new VendaException("Quantidade inválida: Insira uma quantidade de 1 à 10.");
				}
				continua = false;
				return qtdItens;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro: Valor inválido!");
			}
		} while (continua);
		return 0;
	}
	
	public static double validaPreco() {
		boolean continua = true;
		double preco = 0;		
		do { 
			try {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do  item: "));
				if (preco <= 0) {
					throw new PrecoIncorretoException("Valor não pode ser menor ou igual a zero.");
				}
				continua = false;
				return preco;
			} catch (PrecoIncorretoException | NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
			} 
		} while (continua);
		return preco;
	}
}

	

