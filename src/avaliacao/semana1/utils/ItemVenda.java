package avaliacao.semana1.utils;

import javax.swing.JOptionPane;

import avaliacao.semana1.exceptions.QuantidadeInvalidaException;

public class ItemVenda {

	private Produto produto;
	private int quantidade;

	
	public ItemVenda(Produto produto) {
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade() {
		do {
			try {
				
				this.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto"));
				
				if (this.quantidade <= 0 || this.quantidade > 50) {
					throw new QuantidadeInvalidaException();
				}
			} catch (QuantidadeInvalidaException e) {
				JOptionPane.showMessageDialog(null, "Erro: Quantidade do produto inválida!"
						+ "\nInsira uma quantidade entre 1 e 50.");
			}
		} while (this.quantidade <= 0 || this.quantidade > 50);
		
	}

}
