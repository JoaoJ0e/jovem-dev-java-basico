package avaliacao.semana1.utils;

import javax.swing.JOptionPane;

import avaliacao.semana1.exceptions.QuantidadeInvalidaException;

public class Produto {

	private String nome;
	private Double preco;

	public Produto() {
	}
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco() {

		do {
			try {
				Double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço unitário do produto"));
				 if (preco <= 0) {
					 throw new QuantidadeInvalidaException();
				 }
				this.preco = preco;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: Preço não pode ser nulo (0) ou negativo!");
			}
		} while (this.preco == null || this.preco <= 0);
	}

}
